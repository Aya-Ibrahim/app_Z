/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zedler.dao;

import com.zedler.entity.User;
import com.zedler.exception.DataBaseConnectionException;
import java.util.List;
import org.hibernate.Session;

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

    public boolean validateLogin(User u, Session session) throws DataBaseConnectionException {
        try {
            List<User> usrs = session.createQuery("from User u where u.userName = '" + u.getUserName()
                    + "' and u.userPassword ='" + u.getUserPassword()+"'").list();
            return (usrs.size() > 0);

        } catch (Exception ex) {
            ex.printStackTrace();
            throw new DataBaseConnectionException(u.getClass().getSimpleName());
        }
    }

}
