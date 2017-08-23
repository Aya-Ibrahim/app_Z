/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zedler.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author yoka
 */
public class FollowShipService {
    @POST
    @Path("/register")
    @Consumes("application/json")
    @Produces("application/json")
   public String addFollowShip()
   {
   return null;
   }
}
