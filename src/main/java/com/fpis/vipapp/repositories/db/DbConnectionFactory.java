/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isvip.repository.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Marko
 */
public class DbConnectionFactory {
    private static DbConnectionFactory instance;
    private Connection connection;
    
    private DbConnectionFactory(){
    }
    
    public static DbConnectionFactory getInstance(){
        if(instance == null)
            instance = new DbConnectionFactory();
        return instance;
    }
    
    public Connection getConnection() throws Exception{
        if(connection == null || connection.isClosed()){
            String url = "";
            String username = "root";
            String password = "";
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }
}
