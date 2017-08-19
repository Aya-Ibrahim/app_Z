/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zedler.service;

import com.zedler.entity.TestEntity;
import com.zedler.entity.User;
import com.zedler.exception.DataBaseConnectionException;
import com.zedler.managment.UserManager;
import com.zedler.sessionHandling.SessionHandler;
import com.zedler.validator.UserValidator;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.hibernate.Session;

/**
 *
 * @author yoka
 */
@Path("user")
public class UserService {

    @GET
    @Path("test")
    public String test() {
        return "x";
    }

    @POST
    @Path("/login")
    @Consumes("application/json")
    @Produces("application/json")
    public String login(User u) {
        SessionHandler shandler = new SessionHandler();
        Session session = shandler.openAndGetSession();
        String result = "{\"result\":\"";

        try {

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

    @POST
    @Path("/register")
    @Consumes("application/json")
    @Produces("application/json")
    public String register(User u) {
        SessionHandler shandler = new SessionHandler();
        Session session = shandler.openAndGetSession();
        String result = "{\"result\":\"";

        try {
            String validationRes = UserValidator.getInstance().validate(u);
            if (validationRes.equals(UserValidator.PASS)) {
                if (UserManager.getInstance().register(u, session)) {
                    result += "Pass \"}";
                } else {
                    result += "Fail\"}";
                }
            } else {
                result+="\"Fail "+validationRes.substring(validationRes.indexOf(UserValidator.FAIL))+"\"}";
            }
        } catch (DataBaseConnectionException ex) {
            result += " DB connect Fail\"}";
        }
        catch (Exception ex)
        {
        result+=" "+ex.getMessage()+"\"}";
        }
        return result;
    }
}
