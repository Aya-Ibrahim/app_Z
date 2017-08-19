/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zedler.validator;

import com.zedler.entity.User;

/**
 *
 * @author yoka
 */
public class UserValidator {

    private static UserValidator userValidator;
    public static String PASS = "pass";
    public static String FAIL = "fail";

    private UserValidator() {
    }

    public static UserValidator getInstance() {
        if (userValidator == null) {
            userValidator = new UserValidator();
        }
        return userValidator;
    }

    public String validate(User u) {
        String res = PASS;
        if (u.getUserFirstName() == null || u.getUserFirstName().trim().isEmpty()) {
            res = FAIL + "fname";
        } else if (!EmailValidator.getInstance().validate(u.getUserMail())) {
            res = FAIL + "mail";
        } else if (u.getUserSecondName() == null || u.getUserSecondName().trim().isEmpty()) {
            res = FAIL + "sname";
        } else if (u.getUserPassword() == null || u.getUserPassword().length() < 6) {
            res = FAIL + "password";
        }
        return res;
    }
}
