/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zedler.managment;

import com.zedler.entity.Entity;
import java.util.List;

/**
 *
 * @author yoka
 * @param <E>
 */
public abstract class AbstractManager<E extends Entity> {
    public abstract List<E> find();
}
