package com.mydb;
/*
 * Develop a program to update internal with I and External with E
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCUpdateEg {
    public static void main(String arg[])
    {
        Connection connection = null;
        try {
        	//load Driver class
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
          //connect to DB server
			//db name,db url,db port,jbdc string
            connection = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/sep2",
                "root", "pass@word1");
 
            // mydb is database
            // mydbuser is name of database
            // mydbuser is password of database
            
          //prepare the statement
            PreparedStatement ps = connection.prepareStatement("update messages set ptype=? where ptype=?");
          //set required fields in above prepared statement
            ps.setString(1, "I");
            ps.setString(2, "Internal");
        	//5- Execute preparedStatement
            int nrecs = ps.executeUpdate();
            System.out.println("Update "+ nrecs+" successfully");
          //set required fields in above prepared statement
            ps.setString(1, "E");
            ps.setString(2, "ptype");
        	//5- Execute preparedStatement
            nrecs = ps.executeUpdate();
            System.out.println("Update "+ nrecs+" successfully");
            //close statement
            ps.close();
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    } // function ends

}