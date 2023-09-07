package DATABASE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBCON
{
public PreparedStatement pstmt;
public ResultSet  rst;
public Connection con;
public Statement stmt;
  public DBCON(){ 
   try{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fees_managment","root","root");
  }
  catch(Exception e){
    e.printStackTrace();
   }
     
  }
}
