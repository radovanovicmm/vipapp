/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.vipapp.repositories.db;

import com.fpis.vipapp.repositories.Repository;

/**
 *
 * @author Marko
 */
public interface DbRepository<T> extends Repository<T>{

    @Override
    public default void connect() throws Exception {
        DbConnectionFactory.getInstance();
    }

    @Override
    public default void disconnect() throws Exception {
    }
}
