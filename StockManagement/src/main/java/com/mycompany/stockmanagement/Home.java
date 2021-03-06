/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stockmanagement;





import EasyXLS.Constants.DataType;
import EasyXLS.ExcelDocument;
import EasyXLS.ExcelTable;
import EasyXLS.ExcelWorksheet;
import java.awt.*;
import java.io.FileInputStream;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;







public class Home extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Home() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        DataGrid = new javax.swing.JTable();
        btnBestellingen = new javax.swing.JButton();
        btnKlanten = new javax.swing.JButton();
        btnGenerateReport = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        btnProducten = new javax.swing.JButton();
        btnLeveranciers = new javax.swing.JButton();
        btnDatabeheer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Overzicht");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );

        DataGrid.setAutoCreateRowSorter(true);
        DataGrid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bestelling ID", "DatumOpgemaakt", "Klant ID"
            }
        ));
        DataGrid.setPreferredSize(new java.awt.Dimension(450, 450));
        DataGrid.setRowHeight(40);
        DataGrid.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(DataGrid);

        btnBestellingen.setBackground(new java.awt.Color(51, 153, 0));
        btnBestellingen.setText("Bestellingen");
        btnBestellingen.setToolTipText("");
        btnBestellingen.setMaximumSize(new java.awt.Dimension(69, 23));
        btnBestellingen.setMinimumSize(new java.awt.Dimension(69, 23));
        btnBestellingen.setPreferredSize(new java.awt.Dimension(69, 23));
        btnBestellingen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBestellingenActionPerformed(evt);
            }
        });

        btnKlanten.setBackground(new java.awt.Color(51, 153, 0));
        btnKlanten.setText("Klanten");
        btnKlanten.setAlignmentX(0.5F);
        btnKlanten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKlantenActionPerformed(evt);
            }
        });

        btnGenerateReport.setBackground(new java.awt.Color(51, 153, 0));
        btnGenerateReport.setText("Generate Report");
        btnGenerateReport.setMaximumSize(new java.awt.Dimension(69, 23));
        btnGenerateReport.setPreferredSize(new java.awt.Dimension(69, 23));
        btnGenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateReportActionPerformed(evt);
            }
        });

        jLayeredPane1.setBackground(new java.awt.Color(51, 153, 0));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLayeredPane1.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setAlignmentX(0.0F);
        jLayeredPane1.setAlignmentY(0.0F);
        jLayeredPane1.setOpaque(true);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        jLayeredPane2.setBackground(new java.awt.Color(51, 153, 0));
        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLayeredPane2.setOpaque(true);
        jLayeredPane2.setPreferredSize(new java.awt.Dimension(146, 21));

        jLabel1.setText("Overzicht");

        jLayeredPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(38, 38, 38))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        btnProducten.setBackground(new java.awt.Color(51, 153, 0));
        btnProducten.setText("Producten");
        btnProducten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductenActionPerformed(evt);
            }
        });

        btnLeveranciers.setBackground(new java.awt.Color(51, 153, 0));
        btnLeveranciers.setText("Leveranciers");
        btnLeveranciers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeveranciersActionPerformed(evt);
            }
        });

        btnDatabeheer.setBackground(new java.awt.Color(51, 153, 0));
        btnDatabeheer.setText("Databeheer");
        btnDatabeheer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatabeheerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(btnBestellingen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKlanten, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenerateReport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProducten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLeveranciers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDatabeheer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBestellingen, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKlanten)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProducten)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLeveranciers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGenerateReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(btnDatabeheer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBestellingenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBestellingenActionPerformed
DataGrid.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {

    },
    new String [] {
        "Bestelling ID", "DatumOpgemaakt", "Klant ID"
    }
));
           
      try {
          Connection con = null;
         Class.forName("com.mysql.cj.jdbc.Driver");
           
      String userName = "root";
               String password = "Sanuuit126#";
               String url = "jdbc:mysql://localhost:3306/stock_management_database";
      
         con = DriverManager.getConnection(url, userName, password);
        String query = "SELECT * FROM bestellingen";
         Statement st = con.createStatement();
           ResultSet rs = st.executeQuery(query);
            while (rs.next())
      {
        String ID = rs.getString("BestellingID");
        String datumOpgemaakt = rs.getString("DatumOpgemaakt");
        String KlantID = rs.getString("KlantID");
        JOptionPane.showMessageDialog(rootPane, "ID:" + ID   + "\n" + "datumOpgemaakt:" +datumOpgemaakt + "\n" + "KlantID:" + KlantID);
      String[]tbData = {ID,datumOpgemaakt,KlantID};
      DefaultTableModel tblModel = (DefaultTableModel)DataGrid.getModel();
      tblModel.addRow(tbData);
        }
            
      st.close();
      con.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
      
    }//GEN-LAST:event_btnBestellingenActionPerformed

    private void btnKlantenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKlantenActionPerformed
DataGrid.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {

    },
    new String [] {
        "Klant ID", "Voornaam", "Achternaam", "Straatnaam", "Huisnummer", "Bus", "Postcode", "Gemeente", "Teleffoonnummer", "Emailadres", "DatumOpgemaakt", "Opmerking"
    }
));
        try {
          Connection con = null;
         Class.forName("com.mysql.cj.jdbc.Driver");
           
      String userName = "root";
               String password = "Sanuuit126#";
               String url = "jdbc:mysql://localhost:3306/stock_management_database";
      
         con = DriverManager.getConnection(url, userName, password);
        String query = "SELECT * FROM Klanten";
         Statement st = con.createStatement();
           ResultSet rs = st.executeQuery(query);
            while (rs.next())
      {
        String ID = rs.getString("idKlant");
        String Voornaam = rs.getString("Voornaam");
        String Achternaam = rs.getString("Achternaam");
        String Straatnaam =  rs.getString("Straatnaam");
        String Huisnummer = rs.getString("Huisnummer");
        String Bus = rs.getString("Bus");
        String Postcode = rs.getString("Postcode");
        String Gemeente = rs.getString("Gemeente");
        String Teleffoonnummer = rs.getString("Teleffoonnummer");
        String Emailadres = rs.getString("Emailadres");
        String DatumOpgemaakt = rs.getString("DatumOpgemaakt");
        String Opmerking = rs.getString("Opmerking");     
               
                
      String[]tbData = {ID,Voornaam,Achternaam,Straatnaam,Huisnummer,Bus,Postcode,Gemeente,Teleffoonnummer,Emailadres,DatumOpgemaakt,Opmerking};
      DefaultTableModel tblModel = (DefaultTableModel)DataGrid.getModel();
      tblModel.addRow(tbData);
        }
            
      st.close();
      con.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
    }//GEN-LAST:event_btnKlantenActionPerformed

    private void btnGenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateReportActionPerformed
      
// Create an instance of the class that exports XLSX file, having multiple sheets
ExcelDocument workbook = new ExcelDocument(2);

// Set the sheet names
workbook.easy_getSheetAt(0).setSheetName("First tab");
workbook.easy_getSheetAt(1).setSheetName("Second tab");

// Get the table of the first worksheet that will keep the data
ExcelTable xlsFirstTable = 
        ((ExcelWorksheet)workbook.easy_getSheetAt(0)).easy_getExcelTable();




// Add data to cells
for (int row=0; row<DataGrid.getRowCount(); row++)
{
    for (int column=0; column<DataGrid.getColumnCount(); column++)
    {
        xlsFirstTable.easy_getCell(row +1,column).setValue(
                (String)DataGrid.getValueAt(row,column));
         
        xlsFirstTable.easy_getCell(row,column).setDataType(DataType.AUTOMATIC);
    }
}
// Add data to header
for (int column=0; column<DataGrid.getColumnCount(); column++)
{
  
    xlsFirstTable.easy_getCell(0,column).setValue(DataGrid.getColumnName(column));
    xlsFirstTable.easy_getCell(0,column).setDataType(DataType.STRING);
}



// Export XLSX file
workbook.easy_WriteXLSXFile("C:\\Samples\\Export to Excel.xlsx");

// Confirm generation
if (workbook.easy_getError().equals(""))
    System.out.println("File successfully created.");
else
    System.out.println("Error encountered: " + workbook.easy_getError());

        
       
    }//GEN-LAST:event_btnGenerateReportActionPerformed

    private void btnProductenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductenActionPerformed
       DataGrid.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {

    },
    new String [] {
        "Product ID", "Naam", "Inkopprijs", "Marge", "Eenheid", "BTW", "LeverancierID", "CategorieID"
    }
));
        try {
          Connection con = null;
         Class.forName("com.mysql.cj.jdbc.Driver");
           
      String userName = "root";
               String password = "Sanuuit126#";
               String url = "jdbc:mysql://localhost:3306/stock_management_database";
      
         con = DriverManager.getConnection(url, userName, password);
        String query = "SELECT * FROM Producten";
         Statement st = con.createStatement();
           ResultSet rs = st.executeQuery(query);
            while (rs.next())
      {
        String ID = rs.getString("ProductID");
        String Naam = rs.getString("Naam");
        String Inkopprijs = rs.getString("Inkopprijs");
        String Marge =  rs.getString("Marge");
        String Eenheid = rs.getString("Eenheid");
        String BTW = rs.getString("BTW");
        String LeverancierID = rs.getString("LeverancierID");
        String CategorieID = rs.getString("CategorieID");
           
               
                
      String[]tbData = {ID,Naam,Inkopprijs,Marge,Eenheid,BTW,LeverancierID,CategorieID};
      DefaultTableModel tblModel = (DefaultTableModel)DataGrid.getModel();
      tblModel.addRow(tbData);
        }
            
      st.close();
      con.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
                                           
    }//GEN-LAST:event_btnProductenActionPerformed

    private void btnLeveranciersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeveranciersActionPerformed
        DataGrid.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {

    },
    new String [] {
        "Leverancier ID", "Contactpersoon", "Telefoonnummer", "Emailadres", "Straatnaam", "Huisnummer", "Bus", "Postcode", "Gemeente"
    }
));
        try {
          Connection con = null;
         Class.forName("com.mysql.cj.jdbc.Driver");
           
      String userName = "root";
               String password = "Sanuuit126#";
               String url = "jdbc:mysql://localhost:3306/stock_management_database";
      
         con = DriverManager.getConnection(url, userName, password);
        String query = "SELECT * FROM Leveranciers";
         Statement st = con.createStatement();
           ResultSet rs = st.executeQuery(query);
            while (rs.next())
      {
        String LeverancierID = rs.getString("LeverancierID");
        String Contactpersoon = rs.getString("Contactpersoon");
        String Telefoonnummer = rs.getString("Telefoonnummer");
        String Emailadres =  rs.getString("Emailadres");
        String Straatnaam = rs.getString("Straatnaam");
        String Huisnummer = rs.getString("Huisnummer");
        String Bus = rs.getString("Bus");
        String Postcode = rs.getString("Postcode");
        String Gemeente = rs.getString("Gemeente");
           
               
                
      String[]tbData = {LeverancierID,Contactpersoon,Telefoonnummer,Emailadres,Straatnaam,Huisnummer,Bus,Postcode,Gemeente};
      DefaultTableModel tblModel = (DefaultTableModel)DataGrid.getModel();
      tblModel.addRow(tbData);
        }
            
      st.close();
      con.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
                                           
                                            
    }//GEN-LAST:event_btnLeveranciersActionPerformed

    private void btnDatabeheerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatabeheerActionPerformed
        Databeheer databeheer = new Databeheer();
        databeheer.show();
    }//GEN-LAST:event_btnDatabeheerActionPerformed

    /**
     * @param args the command line arguments
     */
        
   
    public static void main(String args[]) {
     
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DataGrid;
    private javax.swing.JButton btnBestellingen;
    private javax.swing.JButton btnDatabeheer;
    private javax.swing.JButton btnGenerateReport;
    private javax.swing.JButton btnKlanten;
    private javax.swing.JButton btnLeveranciers;
    private javax.swing.JButton btnProducten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
