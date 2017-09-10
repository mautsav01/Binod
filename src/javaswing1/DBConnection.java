/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author vabz grg
 */
public class DBConnection {

    public static Statement statementObject() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
        } catch (Exception e) {
            System.out.println("Error loading Driver" + e);

        }
        Connection contodb = null;
        try {
            contodb = DriverManager.getConnection("jdbc:mysql://localhost:3306/instdb", "root", "");
            System.out.println("Connected to Database");
        } catch (Exception e) {

            System.out.println("Connection to database unsuccessful" + e);

        }
        Statement st = null;
        try {
            st = contodb.createStatement();

        } catch (Exception e) {

            System.out.println("not excuted");
        }
        return st;
    }
}
