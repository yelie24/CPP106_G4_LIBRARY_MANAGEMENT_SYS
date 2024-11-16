package com.mycompany.librarymanagementsystem;

//For reading data from files
import java.io.BufferedReader;
import java.io.FileReader;

//For writing data to files
import java.io.BufferedWriter;
import java.io.FileWriter;

//For working with file and directory paths
import java.io.File;

//For handling IO exception that may occur during file operations
import java.io.IOException;

//To be able to display dialog boxes(error/message box)
import javax.swing.JOptionPane;

public class Edit_Book_Details extends javax.swing.JInternalFrame {
   
    public Edit_Book_Details() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        booknameTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        booknumTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pubyearTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        publisherTF = new javax.swing.JTextField();
        editNewBook = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        jLabel7.setText("EDIT BOOK DETAILS");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Book Name:");

        booknameTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        booknameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booknameTFActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Book ID:");

        booknumTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        booknumTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booknumTFActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Publisher Year:");

        pubyearTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        pubyearTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pubyearTFActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Publisher:");

        publisherTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        editNewBook.setBackground(new java.awt.Color(191, 215, 240));
        editNewBook.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        editNewBook.setText("EDIT");
        editNewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNewBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 63, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(editNewBook)
                                .addGap(208, 208, 208))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)
                                .addComponent(pubyearTF, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(publisherTF, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(booknumTF, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(booknameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(booknameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(booknumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pubyearTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publisherTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(editNewBook, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
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

    private void booknumTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booknumTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_booknumTFActionPerformed

    private void pubyearTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pubyearTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pubyearTFActionPerformed

    private void editNewBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNewBookActionPerformed
        //Retrieve input from text field
        String bookNumber = booknumTF.getText();
        String bookName = booknameTF.getText();
        String bookPublisher = publisherTF.getText();
        String yearPublished = pubyearTF.getText();
        
        // Validation: Check if any field is empty
        if (bookNumber.isEmpty() || bookName.isEmpty() || bookPublisher.isEmpty() || yearPublished.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled!", "MISSING INPUT!", JOptionPane.ERROR_MESSAGE);
            return; // Stop further processing
        }

        // Validation for Book ID: Check if it contains only numbers (0-9)
        if (!bookNumber.matches("\\d+")) { // Only digits
            JOptionPane.showMessageDialog(this, "Book ID must contain only numbers!", "INPUT ERROR!", JOptionPane.ERROR_MESSAGE);
            return; // Stop further processing
        }

        // Validation for Publisher Year: Check if it contains only numbers (0-9)
        if (!yearPublished.matches("\\d+")) { // Only digits
            JOptionPane.showMessageDialog(this, "Publisher Year must contain only numbers!", "INPUT ERROR!", JOptionPane.ERROR_MESSAGE);
            return; // Stop further processing
        }
  
        File inputFile = new File("LibraryManagementSystem.txt");
        File tempFile = new File("temp_LibraryManagementSystem.txt");

        boolean isUpdated = false;

    try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
         BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            // If the line starts with the book number, replace it
            if (currentLine.startsWith("Book ID: " + bookNumber)) {
                // Write the updated student details
                writer.write("Book ID: " + bookNumber);
                writer.newLine();
                writer.write("Book Name: " + bookName);
                writer.newLine();
                writer.write("Publisher Year: " + yearPublished);
                writer.newLine();
                writer.write("Publisher: " + bookPublisher);
                writer.newLine();
                writer.write("--------------------------");
                writer.newLine();
                isUpdated = true;

                // Skip the next 4 lines ( Book Name, Publisher Year, publisher, and Separator) as they're being replaced
                reader.readLine();
                reader.readLine();
                reader.readLine();
                reader.readLine();
                
            } else {
                // For all other lines, write them without modification
                writer.write(currentLine);
                writer.newLine();
            }
        }

         if (!isUpdated) {
            //Notify the user that the book ID does not exist
            JOptionPane.showMessageDialog(this, "Book ID not found. Update aborted.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            //Cleanup and stop further process
            tempFile.delete();
            return;
        }

        JOptionPane.showMessageDialog(this,"Book details updated successfully!", "SUCCESS!", JOptionPane.INFORMATION_MESSAGE);

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error updating book details: " + e.getMessage(), "ERROR!", JOptionPane.ERROR_MESSAGE);
    }

    // Replace the old file with the updated file
    if (!inputFile.delete() || !tempFile.renameTo(inputFile)) {
        JOptionPane.showMessageDialog(this, "Error finalizing the update.", "ERROR!", JOptionPane.ERROR_MESSAGE);
    }
        // Clear the fields after saving
        booknameTF.setText("");
        booknumTF.setText("");
        pubyearTF.setText("");
        publisherTF.setText("");
    }//GEN-LAST:event_editNewBookActionPerformed

    private void booknameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booknameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_booknameTFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField booknameTF;
    private javax.swing.JTextField booknumTF;
    private javax.swing.JButton editNewBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField publisherTF;
    private javax.swing.JTextField pubyearTF;
    // End of variables declaration//GEN-END:variables
}