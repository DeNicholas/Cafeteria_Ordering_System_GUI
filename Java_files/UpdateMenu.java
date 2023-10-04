/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author FAWZAN
 */
public class UpdateMenu extends javax.swing.JFrame {
    DefaultTableModel table;
    /**
     * Creates new form ItemWiseReport2
     */
    public UpdateMenu() {
        initComponents();
        fileToTable();
    }

//    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 150));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Tender Grilled Chicken", "20.00", "Available"},
                {"Steak with Fries", "25.00", "Available"},
                {"Fried Salmon", "22.00", "Available"},
                {"Japanese Bento Rice", "13.00", "Available"},
                {"Salad", "12.00", "Available"},
                {"Strawberry Smoothie", "9.00", "Available"},
                {"Beef Burger", "12.50", "Available"},
                {"Beef Noodle", "14.00", "Available"},
                {"Japanese Noodle", "10.00", "Available"},
                {"Kimchi", "8.00", "Available"},
                {"Lasagna", "15.00", "Available"},
                {"Coffee", "7.00", "Available"},
                {"Fruit Juice", "7.00", "Available"},
                {"Spaghetti", "11.50", "Available"},
                {"Water", "1.00", "Available"},
                {"Avacado Slice", "7.50", "Available"},
                {"Edamame", "4.00", "Available"},
                {"Chicken Chop", "17.00", "Available"},
                {"Fried Rice", "8.00", "Available"},
                {"Curry Rice", "8.50", "Available"},
                {"Steamed Fish", "28.00", "Available"},
                {"Bowl of Strawberries", "7.50", "Available"},
                {"Sushi", "10.00", "Available"}
            },
            new String [] {
                "Item Name", "Unit Price", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Unit Price");
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 930, 400));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Menu");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1050, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 520, 125, 45));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Availability:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 125, 45));

        jTextField3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField3.setText("0.00");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 90, -1));

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Not Available" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 60, 1050, 600));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/zz.nasi_lemak.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedRow;
        double newPrice;
        table = (DefaultTableModel) jTable1.getModel();
        try
        {
            
            selectedRow = jTable1.getSelectedRow();
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Select an item!", "Selection Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try
        {
            
            newPrice = Double.parseDouble(jTextField3.getText());
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid new price", "Price Error", JOptionPane.ERROR_MESSAGE);
            return;
        }


        String newAvail = jComboBox1.getSelectedItem().toString();
        
        table.setValueAt(String.format("%.2f", newPrice), selectedRow, 1);
        table.setValueAt(newAvail, selectedRow, 2);
        tableToFile();
        
        

    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void tableToFile()
    {

        try 
        {
            
            File file = new File("files/menu-items.txt");

            if (file.exists()){
                
//                FileWriter fw;
//                fw = new FileWriter("files/menu-items.txt", true);
                FileOutputStream fileOut;
                fileOut = new FileOutputStream(file);
//                fw.write("Item Name\tPrice\tAvailability\n");
                fileOut.write("Item Name\tPrice\tAvailability\n".getBytes());
                table = (DefaultTableModel) jTable1.getModel();
                for (int i = 0; i < table.getRowCount(); i++)
                {
                    
                    String itemName = table.getValueAt(i, 0).toString();
                    String price = table.getValueAt(i, 1).toString();
                    String avail = table.getValueAt(i, 2).toString();
//                    fw.write(itemName + "\t" + price + "\t" + avail + "\n");
                    fileOut.write((itemName + "\t" + price + "\t" + avail + "\n").getBytes());
                }
                
                
            
            fileOut.close();
//                fw.close();
            }
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }

        
    }
    private void fileToTable()
    {
        try
        {
            File file = new File("files/menu-items.txt");
            if (file.exists())
            {
                
                BufferedReader data;
                data = new BufferedReader(new FileReader(file));
                String line;
                data.readLine(); // Read the header row
                table = (DefaultTableModel) jTable1.getModel();
                table.setRowCount(0);
                while((line = data.readLine()) != null)
                {
                    
                   
                    String itemName = line.split("\t")[0];
                    String price = line.split("\t")[1];
                    String avail = line.split("\t")[2];
                    table.insertRow(table.getRowCount(), new Object[] {itemName, price, avail});
                }
                data.close();
            }
            else
            {
                try 
                {
                    File folder = new File("files");
                    if(!folder.exists())
                        folder.mkdir();


                    //File file = new File("files/menu-items.txt");

                    if (file.createNewFile()){
                        FileWriter fw;
                        fw = new FileWriter("files/menu-items.txt", true);

                        fw.write("Item Name\tPrice\tAvailability\n");
                        
                        fw.write("Tender Grilled Chicken\t20.00\tAvailable\n");
                        fw.write("Steak with Fries\t25.00\tAvailable\n");
                        fw.write("Fried Salmon\t22.00\tAvailable\n");
                        fw.write("Japanese Bento Rice\t13.00\tAvailable\n");
                        fw.write("Salad\t12.00\tAvailable\n");
                        fw.write("Strawberry Smoothie\t9.00\tAvailable\n");
                        fw.write("Beef Burger\t12.50\tAvailable\n");
                        fw.write("Beef Noodle\t14.00\tAvailable\n");
                        fw.write("Japanese Noodle\t10.00\tAvailable\n");
                        fw.write("Kimchi\t8.00\tAvailable\n");
                        fw.write("Lasagna\t15.00\tAvailable\n");
                        fw.write("Coffee\t7.00\tAvailable\n");
                        fw.write("Fruit Juice\t7.00\tAvailable\n");
                        fw.write("Spaghetti\t11.50\tAvailable\n");
                        fw.write("Water\t1.00\tAvailable\n");
                        fw.write("Avacado Slice\t7.50\tAvailable\n");
                        fw.write("Edamame\t4.00\tAvailable\n");
                        fw.write("Chicken Chop\t17.00\tAvailable\n");
                        fw.write("Fried Rice\t8.00\tAvailable\n");
                        fw.write("Curry Rice\t8.50\tAvailable\n");
                        fw.write("Steamed Fish\t28.00\tAvailable\n");
                        fw.write("Bowl of Strawberries\t7.50\tAvailable\n");
                        fw.write("Sushi\t10.00\tAvailable\n");
                        
                        
                        fw.close();
                    }
                }
                catch (IOException e) 
                {
                    e.printStackTrace();
                }
            }
        }
        catch(IOException e)  
        {  
            
            e.printStackTrace();  
        }
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        jTable1.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        jTable1.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        ManagerDashboard md = new ManagerDashboard();
        md.setLocation(this.getLocation());
        md.setResizable(false);
        md.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        table = (DefaultTableModel) jTable1.getModel();
        try
        {
            
            int selectedRow = jTable1.getSelectedRow();
            
            String price = jTable1.getValueAt(selectedRow, 1).toString();
            String avail = jTable1.getValueAt(selectedRow, 2).toString();
            
            jTextField3.setText(price);
            jComboBox1.setSelectedItem(avail);
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Select an item!", "Selection Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
    }//GEN-LAST:event_jTable1MouseReleased

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
            java.util.logging.Logger.getLogger(UpdateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
