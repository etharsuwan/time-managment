/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oracle.jdbc.pool.OracleDataSource;

import static soft.Showtasks.flag2;

import soft.tasksList;
/**
 *
 * @author user
 */
public class Tasks {
    
  public static void insertIntoShowTasks(String name,String desc,String date,int done){
      try{
          //int proId,
            OracleDataSource  ods=new OracleDataSource();
            ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
            ods.setUser("system");
            ods.setPassword("0780");
            Connection con=ods.getConnection();         
          PreparedStatement ps=con.prepareStatement("INSERT INTO Tasks( TASKNAME, TASKDESCRIPTION, TASKDATE, DONE)VALUES(?,?,?,?)");
         
          ps.setString(1,name);
          ps.setString(2,desc);
          ps.setString(3, date);
          ps.setInt(4,done);
      
          if(ps.executeUpdate()==1)JOptionPane.showMessageDialog(null,"Added Successfuly!");
          
          
          
      }
      catch(Exception ex){
            JOptionPane.showMessageDialog(null,"ERROR!");

      }
      
      
  }
  
 /* public static ArrayList<tasksList> TableGenerator(){
          ArrayList<tasksList>list=new ArrayList<>();
          try{
         
           DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	   Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system","0780");


            Statement ps=con.createStatement();
            ResultSet result=ps.executeQuery("SELECT TASKNAME,TASKDATE,DONE FROM TASKS ORDER BY TASKDATE ");
            tasksList ls;
            while (result.next()){
                if(!result.getBoolean("DONE")){
            ls=new tasksList( result.getString("TASKNAME"),result.getDate("TASKDATE"));
                list.add(ls);
                }
            }
            con.close();
              
          }
          catch(SQLException ex){
            Logger.getLogger(Tasks.class.getName()).log(Level.SEVERE, null, ex);

              
          }
          return list;
      }*/
  
   public static ArrayList<tasksList> TableGenerator(){
          ArrayList<tasksList>list=new ArrayList<>();
          if(flag2==false){
              try{
         
           DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	   Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system","0780");


            Statement ps=con.createStatement();
         ResultSet    result=ps.executeQuery("SELECT TASKNAME,TASKDATE,DONE FROM TASKS ORDER BY TASKDATE ");
            tasksList ls;
            while (result.next()){
               
                if(!result.getBoolean("DONE")){
                    
            ls=new tasksList( result.getString("TASKNAME"),result.getDate("TASKDATE"));
                list.add(ls);
                }
            }
                
                  
                
            con.close();
              
          }
          catch(SQLException ex){
            Logger.getLogger(Tasks.class.getName()).log(Level.SEVERE, null, ex);

              
          }
          return list;
}
 else{
            
          try{
              
         Showtasks show= new Showtasks();
           DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	   Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system","0780");

            Statement ps=con.createStatement();
            ResultSet result=ps.executeQuery("SELECT TASKNAME,TASKDATE,DONE ,CATEGORYNAME FROM TASKS ORDER BY TASKDATE  ");
            tasksList ls;
            while (result.next()){
               
                if(!result.getBoolean("DONE")){
                
            ls=new tasksList( result.getString("TASKNAME"),result.getDate("TASKDATE"));
                list.add(ls);
                 }
                 
                
            }
                
                                   
            con.close();
              
          }
          catch(SQLException ex){
            Logger.getLogger(Tasks.class.getName()).log(Level.SEVERE, null, ex);

              
          }
          return list;    

 }
      }
}
