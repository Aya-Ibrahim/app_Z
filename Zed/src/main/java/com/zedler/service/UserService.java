/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zedler.service;

import com.zedler.entity.User;
import com.zedler.exception.DataBaseConnectionException;
import com.zedler.managment.UserManager;
import com.zedler.sessionHandling.SessionHandler;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.hibernate.Session;

/**
 *
 * @author yoka
 */
@Path("user")
public class UserService {

    @GET
    @Path("test")
    public String test()
    {
    return "x";
    }
    @GET
    @Path("/login/{username}/{password}")
    @Produces("application/json")
    public String login(@PathParam("username") String userName, @PathParam("password") String password) {
        SessionHandler shandler = new SessionHandler();
        Session session = shandler.openAndGetSession();
        String result = "{\"result\":\"";

        try {
            User u = new User();
            u.setUserName(userName);
            u.setUserPassword(password);
            if (UserManager.getInstance().login(u, session)) {
                result += "Pass \"}";
            } else {
                result += "Fail\"}";
            }

        } catch (DataBaseConnectionException ex) {
            result += " DB connect Fail\"}";
        }
        return result;
    }

}
