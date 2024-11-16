package com.mycompany.librarymanagementsystem;
//for creating and managing the swing components(GUI)
import javax.swing.*;

//for creating and managing table models
import javax.swing.table.DefaultTableModel;

//for reading data from files
import java.io.BufferedReader;
import java.io.FileReader;

//for dynamic array storage(like tables)
import java.util.Vector;

public class Book_Activity_Tracker extends javax.swing.JInternalFrame {

    // Table model for jTable1
    private DefaultTableModel tableModel;
    
    public Book_Activity_Tracker() {
        initComponents();
        initializeTable();   // Initialize the table model
        displayFileInTable(); // Load and display data from file
    }
      // Initialize the table model for jTable1
    private void initializeTable() {
        // Set column names for the table
        String[] columns = { "Book ID", "Book Name", "Status", "Issue Date", "Due Date", "Student ID" };
        
        // Create a table model with the column headers and no rows initially
        tableModel = new DefaultTableModel(columns, 0);
        
        // Set the model for jTable1
        jTable1.setModel(tableModel);
    }

    private void displayFileInTable() {
    try (BufferedReader reader = new BufferedReader(new FileReader("LibraryManagementSystem.txt"))) {
        String line;
        String book_id = "";
        String book_name = "";
        String student_id = "";
        String issue_date = "";
        String due_date = "";
        boolean isBorrowed = false;

        // Read the file line by line
        while ((line = reader.readLine()) != null) {
            // Check for Book ID and extract book details
            if (line.trim().startsWith("Book ID: ")) {
                book_id = line.trim().substring("Book ID: ".length()).trim();
            } else if (line.trim().startsWith("Book Name: ")) {
                book_name = line.trim().substring("Book Name: ".length()).trim();
            } else if (line.trim().startsWith("Student ID: ")) {
                student_id = line.trim().substring("Student ID: ".length()).trim();
            } else if (line.trim().startsWith("Issue Date: ")) {
                issue_date = line.trim().substring("Issue Date: ".length()).trim();
                isBorrowed = true; // If Issue Date exists, it's a borrowed book
            } else if (line.trim().startsWith("Due Date: ")) {
                due_date = line.trim().substring("Due Date: ".length()).trim();
            } else if (line.trim().startsWith("Return Status: ")) {
                String returnStatus = line.trim().substring("Return Status: ".length()).trim();
                String status = isBorrowed ? "Borrowed" : "Available";
                
                // Add the book details as a row in the table
                Vector<String> row = new Vector<>();
                row.add(book_id);
                row.add(book_name);
                row.add(status);
                row.add(issue_date);
                row.add(due_date);
                row.add(student_id);
                
                // Add the row to the table model
                tableModel.addRow(row);
                
                // Reset for the next book entry
                isBorrowed = false;
                book_id = "";
                book_name = "";
                student_id = "";
                issue_date = "";
                due_date = "";
            }
        }

    } catch (Exception e) {
        // Display error message
        JOptionPane.showMessageDialog(this, "Error reading file!", "File Error", JOptionPane.ERROR_MESSAGE);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        jLabel7.setText("BOOK ACTIVITY TRACKER ");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 153));

        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
