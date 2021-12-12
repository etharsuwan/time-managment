/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft;

import java.util.Date;


/**
 *
 * @author user
 */
public class tasksList {
     private String TASKNAME;
    private Date TASKDATE;
    private String TaskDESCRIPTION;
    private int SERIALNUMBER; 
    private int CATEGORYID;
    private int DONE;
    public tasksList(String TASKNAME,Date TASKDATE){
        
        this.TASKNAME=TASKNAME;
        
        this.TaskDESCRIPTION=TaskDESCRIPTION;
        this.TASKDATE=TASKDATE;
       this.DONE=DONE;
       
        
    }
    
    public int getSERIALNUMBER(){
        return SERIALNUMBER;
                
    }
    
    
     
      public Date getTASKDATE(){
        return TASKDATE;
                
    }
     
      public void setTASKDATE(Date TASKDATE){
       this.TASKDATE= TASKDATE;
                
    }
      
      
     public String getTASKNAME(){
        return TASKNAME;
                
    }
     
      public void setTASKNAME(String TASKNAME){
       this.TASKNAME= TASKNAME;
                
    }
    

    
   
    
     public String getTaskDESCRIPTION(){
        return TaskDESCRIPTION;
                
    }
     
     
    public void setTaskDESCRIPTION(String TaskDESCRIPTION){
        this.TaskDESCRIPTION=TaskDESCRIPTION;
    }
    
     public int getCATEGORYID(){
        return CATEGORYID;
                
    }
     
     
 
    
    public int getDONE(){
        return DONE;
                
    }
    
    public void setDONE(int DONE){
        this.DONE=DONE;
    }
    
    
    
    
}
