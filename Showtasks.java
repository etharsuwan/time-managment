/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package soft;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.pool.OracleDataSource;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.TableModel;

/**
 *
 * @author ethar
 */
public class Showtasks extends javax.swing.JFrame {
static Object[] data = new Object[3];   
    static int total = 0;
        public static boolean flag2=false;
    public static String category;
 static String descr;
 static String categ;

 static String tot = "";
    /*
     * Creates new form Showtasks
     */
     
    public Showtasks() {
        initComponents();
//show all tasks done on friday

        
        ArrayList<tasksList>list=Tasks.TableGenerator();
        
        
        Object rowData[]=new Object[2];
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        DefaultTableCellRenderer Render =new DefaultTableCellRenderer();
        Render.setHorizontalAlignment(JLabel.CENTER);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(Render);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(Render);
     
               

        
        
         model.setRowCount(0);
        for(int i=0;i<list.size();i++){
            rowData[0]=list.get(i).getTASKNAME();
                       rowData[1]=list.get(i).getTASKDATE();
 
            
           
           model.addRow(rowData);
           jTable1.setRowHeight(50);
           jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
           
        }
     
     
     
  

      
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 153));
        jPanel1.setLayout(null);

        jButton2.setText("Show");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(190, 40, 59, 23);

        jTable1.setFont(new java.awt.Font("arial", 0, 20));
        // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

                "Task Title", "Deadline"

            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class,java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(10);

        jTable1.setSelectionBackground(new java.awt.Color(188, 135, 147));

        jTable1.getTableHeader().setReorderingAllowed(false);

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });

        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(110, 90, 510, 360);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 153));
        jLabel1.setText("My Tasks");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(34, 19, 161, 24);

        jTextField1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jTextField1.setText("category Name");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(350, 30, 140, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 153));
        jLabel3.setText("Tasks");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(288, 80, 39, 17);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 750, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
EditTask edit= new EditTask();
    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        edit.setVisible(true);
        edit.pack();
        edit.setLocationRelativeTo(null);
        this.setVisible(false);
       
           OracleDataSource ods;
    try {
      ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
           ods.setUser("system");
          ods.setPassword("0780");
            Connection conn=ods.getConnection();
          Statement st1=conn.createStatement();
             int selectedRow=jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
          
     
        String name=model.getValueAt(selectedRow,0).toString();
        String date=model.getValueAt(selectedRow,1).toString();
     
               
        edit.jTextField1.setText(name);
        edit.jTextField3.setText(date);
       ResultSet r=st1.executeQuery("select * from tasks where TASKNAME='"+name+"' ");
             while (r.next()){
descr = r.getString("TASKDESCRIPTION");
   categ=r.getString("CATEGORYNAME");
        


             }  edit.jTextArea1.setText(descr);
             edit.jTextField4.setText(categ);
      
            
    }catch(Exception ex){
        
    }  
     
        
            }//GEN-LAST:event_jTable1MousePressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
flag2=true;        

ArrayList<tasksList>list=Tasks.TableGenerator();
        
        
        Object rowData[]=new Object[2];
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        DefaultTableCellRenderer Render =new DefaultTableCellRenderer();
        Render.setHorizontalAlignment(JLabel.CENTER);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(Render);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(Render);
     
               

        
        
         model.setRowCount(0);
        for(int i=0;i<list.size();i++){
            rowData[0]=list.get(i).getTASKNAME();
                       rowData[1]=list.get(i).getTASKDATE();
 
            
           
           model.addRow(rowData);
           jTable1.setRowHeight(50);
           jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
           
        }
     
     
     
  

      
        
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Showtasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Showtasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Showtasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Showtasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
Showtasks st=new Showtasks();
st.setLocationRelativeTo(null);
 st.setVisible(true);
        st.pack();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}