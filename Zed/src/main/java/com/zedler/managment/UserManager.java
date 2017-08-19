/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zedler.managment;

import com.zedler.dao.UserDao;
import com.zedler.entity.User;
import com.zedler.exception.DataBaseConnectionException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author yoka
 */
public class UserManager extends AbstractManager<User> {

    private static UserManager userManager;

    @Override
    public List<User> find() {
        return null;
    }

    public boolean login(User u, Session session) throws DataBaseConnectionException {
        return UserDao.getInstance().validateLogin(u, session);
    }

    public static UserManager getInstance() {
        if (userManager == null) {
            userManager = new UserManager();
        }
        return userManager;
    }

    public boolean register(User u, Session session)throws DataBaseConnectionException {
         return UserDao.getInstance().register(u, session);
      }
}
