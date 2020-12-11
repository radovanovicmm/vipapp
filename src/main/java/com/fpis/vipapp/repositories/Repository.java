/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.vipapp.repositories;

import java.util.List;

/**
 *
 * @author Marko
 */
public interface Repository<T> {
    public void connect() throws Exception;
    public void disconnect() throws Exception;
    public void add(T param) throws Exception;
    public List<T> getAll() throws Exception;
    public void save(T param) throws Exception;
    public void delete(T param) throws Exception;
    public T get(int id) throws Exception;
}
