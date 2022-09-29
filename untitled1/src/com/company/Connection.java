package com.company;

import java.sql.DriverManager;
import java.sql.SQLException;


public class Connection{
    public void Connection(String username, String password, String jdbcURL){

        try { //попытаться

            java.sql.Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Подключился к серверу postgresql.");
            connection.close();
        } catch (SQLException e) {  //поймать ошибку (если ошибка)
            System.out.println("Ошибка подключения к серверу postgresql");
            e.printStackTrace();
        }
    }
}
