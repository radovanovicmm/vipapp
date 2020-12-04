/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isvip.repository.db;

import com.isvip.repository.Repository;

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
