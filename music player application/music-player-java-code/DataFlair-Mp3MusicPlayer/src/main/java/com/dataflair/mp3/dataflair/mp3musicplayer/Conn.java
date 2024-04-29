package com.dataflair.mp3.dataflair.mp3musicplayer;

import java.sql.*;

public class Conn {
	
	Connection c;
	Statement s;
    
  

    Conn () 
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///musicplayer", "root", "8445501402");
            s = c.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
