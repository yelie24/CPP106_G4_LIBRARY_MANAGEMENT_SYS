package com.mycompany.librarymanagementsystem;

//For reading data from files
import java.io.BufferedReader;
import java.io.FileReader;

//For writing data to files
import java.io.BufferedWriter;
import java.io.FileWriter;

//For handling IO exception that may occur during file operations
import java.io.IOException;

//To be able to display dialog boxes(error/message box)
import javax.swing.JOptionPane;

public class Add_Book extends javax.swing.JInternalFrame {

    public Add_Book() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        booknameTF = new javax.swing.JTextField();
        booknumTF = new javax.swing.JTextField();
        pubyearTF = new javax.swing.JTextField();
        publisherTF = new javax.swing.JTextField();
        addNewBook = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        jLabel7.setText("ADD NEW BOOK DETAILS");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Book Name:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Book ID:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Publisher Year:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Publisher:");

        booknameTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        booknumTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        booknumTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booknumTFActionPerformed(evt);
            }
        });

        pubyearTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        pubyearTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pubyearTFActionPerformed(evt);
            }
        });

        publisherTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        addNewBook.setBackground(new java.awt.Color(191, 215, 240));
        addNewBook.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        addNewBook.setText("ADD");
        addNewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(addNewBook)
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
                        .addComponent(booknameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(addNewBook, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
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

    private void addNewBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewBookActionPerformed
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

        // Validation for Publisher Year: Check if it contains only numbers (0-9)
        if (!yearPublished.matches("\\d+")) { // Only digits
            JOptionPane.showMessageDialog(this, "Publisher Year must contain only numbers!", "INPUT ERROR!", JOptionPane.ERROR_MESSAGE);
            return; // Stop further processing
        }

        // Validation for Name: Check if it contains only letters (A-Z, a-z)
        if (!bookName.matches("[a-zA-Z ]+")) { // Allow spaces for multi-word names
            JOptionPane.showMessageDialog(this, "Name must contain only letters!", "INPUT ERROR!", JOptionPane.ERROR_MESSAGE);
            return; // Stop further processing
        }

    try {
    // Check if book number is numeric
    if (!bookNumber.matches("\\d+")) {
        throw new NumberFormatException("Book number must be numeric.");
    }

    boolean bookNumberExists = false;

    try (BufferedReader reader = new BufferedReader(new FileReader("LibraryManagementSystem.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            // Split the line by colon (:) to match the stored format
            if (line.startsWith("Book ID:")) { // Correct the field name to match
                String existingBookNumber = line.split(":")[1].trim(); // Extract the book number
                if (existingBookNumber.equals(bookNumber)) {
                    bookNumberExists = true;
                    break;
                }
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error reading from file!", "FILE ERROR!", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method on read error
    }

    // If the book number already exists, show an error message
    if (bookNumberExists) {
        JOptionPane.showMessageDialog(this, "Error: Book number already exists!", "DUPLICATE FILE!", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method to prevent saving duplicate data
    }

    // Open the file to append the book data
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("LibraryManagementSystem.txt", true))) {
        // Write the book details to the file
        writer.write("Book ID: " + bookNumber + "\n");
        writer.write("Book Name: " + bookName + "\n");
        writer.write("Publisher Year: " + yearPublished + "\n");
        writer.write("Publisher: " + bookPublisher + "\n"); // Correct publisher field
        writer.write("-----------------------------\n");  // Add a separator between records
        }
    
        // Show a success message after saving the information
        JOptionPane.showMessageDialog(this, "New book details saved successfully!", "SUCCESS!", JOptionPane.INFORMATION_MESSAGE);

    } catch (NumberFormatException e) {
        // Show an error message if the book number is not numeric
        JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR!", JOptionPane.ERROR_MESSAGE);
    } catch (IOException e) {
        // Show an error message if there is an issue with saving the file
        JOptionPane.showMessageDialog(this, "Error saving new book details.", "ERROR!", JOptionPane.ERROR_MESSAGE);
    }

        // Clear the fields after saving
        booknameTF.setText("");
        booknumTF.setText("");
        pubyearTF.setText("");
        publisherTF.setText("");
    
    }//GEN-LAST:event_addNewBookActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewBook;
    private javax.swing.JTextField booknameTF;
    private javax.swing.JTextField booknumTF;
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