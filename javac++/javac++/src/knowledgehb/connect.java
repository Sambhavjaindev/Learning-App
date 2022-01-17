
package knowledgehb;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class connect {
    Connection conn;
   PreparedStatement ps;
  ResultSet rs;
    Statement st;
   public connect()
           {
               try
               {
              Class.forName("com.mysql.cj.jdbc.Driver");
               conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseknhb","root","Sj_12345");
               //in above line local host means database is on local machine ;3306 is mysql port no;database1 is 
               //name of schema created in mysql in which your table is present
                  
                   
               }
               catch(Exception e)
               {
                   System.out.println("error......."+e.getMessage());
               }
           }    
}

