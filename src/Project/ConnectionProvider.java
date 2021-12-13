/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pankaj
 */
public class ConnectionProvider {
    public static Connection getCon()

     {
      try
         {

          String sql="select * from lms";
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","Pankajkr31@");

          return con;

         }

         catch (ClassNotFoundException | SQLException e)
        {
        System.out.println(e);
        return null;
       }
   }
}
