/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author FAWZAN
 */
public class ResetSecurityQ extends javax.swing.JFrame {

    private final String id;
    private String user;
    /**
     * Creates new form ResetSecurityQ
     * @param id
     */
    public ResetSecurityQ(String id) {
        initComponents();
        this.id = id;
        
        try  
        {  
            BufferedReader data;
            data = new BufferedReader(new FileReader("files/users.txt"));
            String line;
            data.readLine(); // Read the header row
            while((line = data.readLine()) != null)
            {
                if(this.id.compareTo(line.split("\t")[0]) == 0)
                {
                    this.user = line;
                    break;
                }

            }
            
            
            jTextField1.setText(line.split("\t")[8]);                         //Show security Q
            jTextField2.setText(line.split("\t")[9]);
            data.close();
        }  
        catch(IOException e)  
        {  
           
            e.printStackTrace();  
        }
    }

    private ResetSecurityQ() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 150));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reset Security Question");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 650, -1));

        jTextField1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 296, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Security Answer:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jTextField2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 296, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 125, 45));

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Done");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 230, 125, 45));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Security Question:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 140, 650, 310));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/z.japanese noodle.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        EditPersonalDetails epdf = new EditPersonalDetails(this.user.split("\t")[0]);
        epdf.setLocation(this.getLocation());
        epdf.setResizable(false);
        epdf.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String securityQ = jTextField1.getText();
        String securityAns = jTextField2.getText();
        
        
        if(securityQ.length() == 0)
        {
            JOptionPane.showMessageDialog(this, "Must provide security Question", "Security Question Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(securityAns.length() == 0)
        {
            JOptionPane.showMessageDialog(this, "Must provide security Answer", "Security Answer Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try  
        {  
            
            BufferedReader data;
            data = new BufferedReader(new FileReader("files/users.txt"));
            StringBuilder inputBuffer = new StringBuilder();
            String line;
            line = data.readLine(); // Read the header row
            inputBuffer.append(line).append("\n");
            
            
            
            
                
            while((line = data.readLine()) != null)
            {
                if(this.id.compareTo(line.split("\t")[0]) == 0)
                {
                    this.user = line;
                    line = line.split("\t")[0] + "\t"+ line.split("\t")[1] + "\t"+ line.split("\t")[2] + "\t" + line.split("\t")[3] + "\t" +  line.split("\t")[4] + "\t" + line.split("\t")[5] + "\t" + line.split("\t")[6] + "\t" + line.split("\t")[7] + "\t" + securityQ + "\t" + securityAns;
                    
                }
                
                inputBuffer.append(line).append("\n");
                
            }
            data.close();

            JOptionPane.showMessageDialog(this, "Security Question has been reset successfully", "Security Question Update", JOptionPane.INFORMATION_MESSAGE);
            
            FileOutputStream fileOut;
            fileOut = new FileOutputStream("files/users.txt");
            fileOut.write(inputBuffer.toString().getBytes());
            fileOut.close();

            this.setVisible(false);
            EditPersonalDetails epdf = new EditPersonalDetails(this.user.split("\t")[0]);
            epdf.setLocation(this.getLocation());
            epdf.setResizable(false);
            epdf.setVisible(true);

            
        }  
        catch(IOException e)  
        {  
           
            e.printStackTrace();  
        }
        
        
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
            java.util.logging.Logger.getLogger(ResetSecurityQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetSecurityQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetSecurityQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetSecurityQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResetSecurityQ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
