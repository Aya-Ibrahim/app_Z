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
import com.zedler.validator.UserValidator;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.codehaus.jackson.map.ObjectMapper;
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
		String result = "{\"result\":";

		try {
			User user = UserManager.getInstance().login(u, session);
			if (user != null) {
				ObjectMapper mapper = new ObjectMapper();
				result += mapper.writeValueAsString(user) + "}";
			} else {
				result += "\" invalid username/password\"}";
			}
		} catch (DataBaseConnectionException ex) {
			result += "\" DB connect Fail\"}";
		} catch (IOException ex) {
			Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
		}
		System.out.println(result);
		return result;
	}

	@POST
	@Path("/register")
	@Consumes("application/json")
	@Produces("application/json")
	public String register(User u) {
		SessionHandler shandler = new SessionHandler();
		Session session = shandler.openAndGetSession();
		String result = "{\"result\":";

		try {
			String validationRes = UserValidator.getInstance().validate(u, session);
			if (validationRes.equals(UserValidator.PASS)) {
				User registeredUser= UserManager.getInstance().register(u, session);
				if (registeredUser!=null) {
					ObjectMapper mapper = new ObjectMapper();
					result += mapper.writeValueAsString(registeredUser) + "}";
				} else {
					result += "\" register failed\"}";
				}
			} else {
				result += validationRes.substring(validationRes.indexOf(UserValidator.FAIL)) + "\"}";
			}
		} catch (DataBaseConnectionException ex) {
			result += "\" DB connect Fail\"}";
		} catch (Exception ex) {
			result += " " + ex.getMessage() + "\"}";
		}
		return result;
	}
}
