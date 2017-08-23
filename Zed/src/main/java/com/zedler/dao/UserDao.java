/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zedler.dao;

import com.zedler.entity.Followship;
import com.zedler.entity.Friendship;
import com.zedler.entity.Settings;
import com.zedler.entity.User;
import com.zedler.exception.DataBaseConnectionException;
import com.zedler.sessionHandling.HibernateUtilCLass;
import com.zedler.sessionHandling.SessionHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author yoka
 */
public class UserDao {

	private static UserDao userDao;

	public static UserDao getInstance() {
		if (userDao == null) {
			userDao = new UserDao();
		}
		return userDao;
	}

	public User validateLogin(User u, Session session) throws DataBaseConnectionException {
		try {
			List<User> usrs = session.createQuery("from User u where u.userName = '" + u.getUserName()
					+ "' and u.userPassword ='" + u.getUserPassword() + "'").list();
			User loginUser = null;
			if (usrs.size() > 0) {
				loginUser = usrs.get(0);
				applyOnUser(loginUser);
			}

			return loginUser;

		} catch (Exception ex) {
			ex.printStackTrace();
			throw new DataBaseConnectionException(u.getClass().getSimpleName());
		} finally {
			session.close();
		}
	}

	private void applyOnUser(User loginUser) {
		Set<Friendship> friendsto = loginUser.getFriendshipsForUserTo();
		for (Friendship friend : friendsto)
			friend.setStatus(null);
		Set<Friendship> friendsfrom = loginUser.getFriendshipsForUserFrom();
		for (Friendship friend : friendsfrom)
			friend.setStatus(null);
	}

	public User register(User u, Session session) throws DataBaseConnectionException {
		try {
			session.persist(u);
			session.getTransaction().commit();
			return validateLogin(u, session);
		} catch (Exception e) {
			e.printStackTrace();
			if (session.getTransaction() != null) {
				session.getTransaction().rollback();

			}
			throw e;
		} finally {
			if (session.isOpen())
				session.close();
		}
	}

	public boolean validateUniqueUserName(String userName, Session session) throws DataBaseConnectionException {
		try {
			List<User> usrs = session.createQuery("from User u where u.userName = '" + userName + "'").list();
			return (usrs.size() == 0);

		} catch (Exception ex) {
			ex.printStackTrace();
			session.close();
			throw new DataBaseConnectionException(User.class.getSimpleName());

		}
	}
}
