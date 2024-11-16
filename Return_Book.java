package com.mycompany.librarymanagementsystem;

// For reading data from files
import java.io.BufferedReader;  
import java.io.FileReader;      

// For writing data to files
import java.io.FileWriter;   
import java.io.BufferedWriter;  

// For handling input/output exceptions that may occur during file operations
import java.io.IOException;   

// For displaying dialog boxes (error messages or user notifications)
import javax.swing.JOptionPane;  

// For working with lists (a dynamic array-like structure)
import java.util.ArrayList;   
import java.util.List;        

public class Return_Book extends javax.swing.JInternalFrame {
    
     private boolean isSearchPerformed = false; // Tracks whether the search has been performed
    
    public Return_Book() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        booknumTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        studnumTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        returnBook = new javax.swing.JButton();
        search = new javax.swing.JButton();
        issuedateTF = new javax.swing.JTextField();
        duedateTF = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        jLabel7.setText("RETURN BOOK");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Book ID:");

        booknumTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Student ID:");

        studnumTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Issue Date:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText(" Due Date:");

        returnBook.setBackground(new java.awt.Color(191, 215, 240));
        returnBook.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        returnBook.setText("RETURN");
        returnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBookActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(191, 215, 240));
        search.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        issuedateTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        issuedateTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuedateTFActionPerformed(evt);
            }
        });

        duedateTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(booknumTF, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                            .addComponent(studnumTF))
                                        .addGap(30, 30, 30)
                                        .addComponent(search))
                                    .addComponent(issuedateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(duedateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(returnBook)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(booknumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(studnumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(issuedateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(duedateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(returnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
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
    
    private void returnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBookActionPerformed
        String book_id = booknumTF.getText();      // Get Book ID input
        String student_id = studnumTF.getText(); // Get Student ID input
        String returnBook = "Yes";

        
        // Check if the Search Button was pressed first
        if (!isSearchPerformed) {
            JOptionPane.showMessageDialog(this, 
                "Please search for the book and student IDs first.", 
                "Action Required", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if Issue Date and Due Date are displayed
        String issueDate = issuedateTF.getText().trim();
        String dueDate = duedateTF.getText().trim();

        if (issueDate.isEmpty() || dueDate.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Please search and confirm the book's Issue Date and Due Date before returning.", 
                "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if Book ID and Student ID are input
        if (book_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Book ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (student_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Student ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Initialize variables for processing the return
        boolean bookExists = false;
        boolean studentExists = false;
        boolean bookReturned = false;

        List<String> fileLines = new ArrayList<>();

        try {
            // Read the file and check for Book ID, Student ID, and Return Status
            BufferedReader reader = new BufferedReader(new FileReader("LibraryManagementSystem.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                fileLines.add(line);

                if (line.trim().equalsIgnoreCase("Book ID: " + book_id)) {
                    bookExists = true;
                }
                if (bookExists && line.trim().equalsIgnoreCase("Student ID: " + student_id)) {
                    studentExists = true;
                }
                if (bookExists && studentExists && line.trim().startsWith("Return Status:")) {
                    String returnStatus = line.trim().substring("Return Status:".length()).trim();
                    if ("Yes".equalsIgnoreCase(returnStatus)) {
                        bookReturned = true;
                    }
                    break;
                }
            }
            reader.close();

            // Process return if both IDs are valid
            if (bookExists && studentExists) {
                if (bookReturned) {
                    JOptionPane.showMessageDialog(this, 
                        "This book has already been returned.", 
                        "Return Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Update the return status in the file
                    for (int i = 0; i < fileLines.size(); i++) {
                        if (fileLines.get(i).trim().equalsIgnoreCase("Book ID: " + book_id)) {
                            for (int j = i + 1; j < fileLines.size(); j++) {
                                if (fileLines.get(j).trim().startsWith("Return Status:")) {
                                    fileLines.set(j, "Return Status: " + returnBook);
                                    break;
                                }
                            }
                            break;
                        }
                    }

                    // Write the updated content back to the file
                    BufferedWriter writer = new BufferedWriter(new FileWriter("LibraryManagementSystem.txt"));
                    for (String updatedLine : fileLines) {
                        writer.write(updatedLine);
                        writer.newLine();
                    }
                    writer.close();

                    // Notify the user of the successful return
                    JOptionPane.showMessageDialog(this, "The book has been successfully returned!");
                }
            } else {
                // Display specific errors if either Book ID or Student ID is not valid
                if (!bookExists) {
                    JOptionPane.showMessageDialog(this, "Incorrect Book ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                if (!studentExists) {
                    JOptionPane.showMessageDialog(this, "Incorrect Student ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_returnBookActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
        isSearchPerformed = true; // Check if the Search button is perform
        String book_id = booknumTF.getText();      // Get Book ID input
        String student_id = studnumTF.getText(); // Get Student ID input

        // Validate if Book ID and Student ID are input
        if (book_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Book ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (student_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Student ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean bookExists = false;
        boolean studentExists = false;
        String issue_date = null;
        String due_date = null;

    try {
        // Open the file and search for Book ID and Student ID
        BufferedReader reader = new BufferedReader(new FileReader("LibraryManagementSystem.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            // Check if the Book ID matches
            if (line.trim().equalsIgnoreCase("Book ID: " + book_id)) {
                bookExists = true;
                // Search for Issue Date and Due Date following the Book ID
                while ((line = reader.readLine()) != null) {
                    if (line.trim().startsWith("Issue Date:")) {
                        issue_date = line.trim().substring("Issue Date:".length()).trim();
                        } else if (line.trim().startsWith("Due Date:")) {
                            due_date = line.trim().substring("Due Date:".length()).trim();
                        }
                    // If both dates are found, break the loop
                    if (issue_date != null && due_date != null) {
                    break;
                    }
                }
            }

            // Check if the Student ID matches
            if (line.trim().equalsIgnoreCase("Student ID: " + student_id)) {
                studentExists = true;
             }
            
            // If both Book and Student are found, break the loop
            if (bookExists && studentExists) {
                break;
                }
            }
            reader.close();

            // Display results if both Book ID and Student ID exist
            if (bookExists && studentExists) {
                // Display Issue and Due Date if found
                if (issue_date != null && due_date != null) {
                    issuedateTF.setText(issue_date);
                    duedateTF.setText(due_date);
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Issue Date and Due Date not found.", 
                            "Data Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                // Show error messages if Book ID or Student ID is not found
                if (!bookExists) {
                    JOptionPane.showMessageDialog(this, "Incorrect Book ID.", "ERROR!", JOptionPane.ERROR_MESSAGE);
                }
                if (!studentExists) {
                    JOptionPane.showMessageDialog(this, "Incorrect Student ID.", "ERROR!", JOptionPane.ERROR_MESSAGE);
                }
            }

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error reading from file: " + e.getMessage(), "FILE ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void issuedateTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuedateTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_issuedateTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField booknumTF;
    private javax.swing.JTextField duedateTF;
    private javax.swing.JTextField issuedateTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton returnBook;
    private javax.swing.JButton search;
    private javax.swing.JTextField studnumTF;
    // End of variables declaration//GEN-END:variables
}