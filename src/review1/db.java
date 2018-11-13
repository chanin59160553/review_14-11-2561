/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author 59160929
 */
public class db {

    PreparedStatement pst;
    Connection connection;

       static String serverName = "sql12.freemysqlhosting.net";
    static String mydatabase = "sql12263901";
    static String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
    static String username = "sql12263901";
    static String password = "dsfYKSZBwz";
    
    
}
