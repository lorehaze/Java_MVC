package com.login.DBconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
  public static Connection getConn() {
    Connection con = null;
    String loadDriver = "com.mysql.jdbc.Driver";
    String dbURL = "jdbc:mysql://localhost:3306/registration_form";
    String dbUSERNAME = "root";
    String dbPASSWORD = "Loppollop1998!";
    try {
      Class.forName(loadDriver);
      con = DriverManager.getConnection(dbURL, dbUSERNAME, dbPASSWORD);
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return con;
  }
}