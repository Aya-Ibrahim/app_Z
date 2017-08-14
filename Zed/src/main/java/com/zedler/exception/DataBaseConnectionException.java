/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zedler.exception;

/**
 *
 * @author yoka
 */
public class DataBaseConnectionException extends Exception {

    public DataBaseConnectionException(String simpleName) {
        System.err.println("error in fetching "+ simpleName);
    }
}
