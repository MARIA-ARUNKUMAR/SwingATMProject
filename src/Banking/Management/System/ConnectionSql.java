package Banking.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class ConnectionSql {
	    Connection c;
	    Statement s;
	   // getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "12345");
	    public ConnectionSql() {
	        try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	        	c = DriverManager. getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "12345");
	            s = c.createStatement();
	            
	        }
	        catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}

