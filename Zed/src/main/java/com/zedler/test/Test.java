/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zedler.test;

import com.zedler.entity.User;
import com.zedler.sessionHandling.SessionHandler;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author yoka
 */
public class Test {
  SessionHandler shandler = new SessionHandler();

    public Test() {
         Session  session = shandler.openAndGetSession(); 
          List<User> usrs = session.createQuery("from User").list();
     for(User usr:usrs)
              System.out.println("usr "+usr.getUserName());
     
    }
       
      public  static void main(String []args)
      {
            Test t=new Test();
            
//      List<User> usrs = session.createQuery("from User").list();
//      for(User usr:usrs)
//              System.out.println("usr "+usr.getUserName());
      }
}
