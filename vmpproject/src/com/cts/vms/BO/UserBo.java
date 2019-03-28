package com.cts.vms.BO;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.cts.vms.model.User;
import com.mysql.jdbc.Statement;



public class UserBo {

       public static Connection getConnection() {
        Properties props = new Properties();
        //FileInputStream fis = null;
        Connection con = null;
        try {
          //  fis = new FileInputStream("src/db.properties");
             
             
             InputStream fis = UserBo.class.getClassLoader().getResourceAsStream("/db.properties");
            props.load(fis);
            
            Class.forName(props.getProperty("DB_DRIVER_CLASS"));

   
            con = DriverManager.getConnection(props.getProperty("DB_URL"),
                      props.getProperty("DB_USERNAME"),
                      props.getProperty("DB_PASSWORD"));
   //   } catch (IOException | ClassNotFoundException | SQLException e) {
        }catch(Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
   }
       
       public boolean insertUser(User u) throws Exception {
              boolean b=false;
               Connection c=null;
               try {
                   c=getConnection();
                   PreparedStatement ps=c.prepareStatement("insert into user values(?,?,?,?,?,?,?,?,?)");
                 
                  ps.setString(1, u.getEmpid());
                  ps.setString(2, u.getFirstname());
                  ps.setString(3, u.getLastname());
                  ps.setInt(4, u.getAge());
                  ps.setString(5,u.getGender());
                  ps.setString(6, u.getContact());
                  ps.setString(7, u.getEmail());
                  ps.setString(8, u.getPassword());
                  ps.setString(9, u.getBranch());
                  
                  
                   boolean b1=ps.execute();
                  // System.out.println(b1);
                   b=true;
               }
               catch(Exception e) {
                   b=false;
                   System.out.println(e);
               }
               finally {
                   c.close();
               }
               return b;
       }
       public ArrayList<User> viewAllMembers() throws Exception{
           ArrayList<User> us=new ArrayList<User>();
     Connection con=null;
     try {
     con=getConnection();
     Statement s=(Statement) con.createStatement();
     ResultSet rs=s.executeQuery("select * from user");
     while(rs.next()) {
         us.add(new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)));
     }
     }
     catch(Exception e) {System.out.println(e);}
     finally {
         con.close();
     }
    return (ArrayList<User>) us;
       }
       
       
}

