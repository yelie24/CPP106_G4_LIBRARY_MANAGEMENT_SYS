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

public class Edit_Student_Information extends javax.swing.JInternalFrame {

    public Edit_Student_Information() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        givenTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lastTF = new javax.swing.JTextField();
        studnumTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        programTF = new javax.swing.JComboBox<>();
        editStudentBorrower = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        jLabel7.setText("EDIT STUDENT BORROWER DETAILS");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Given Name:");

        givenTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        givenTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                givenTFActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Last Name:");

        lastTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lastTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastTFActionPerformed(evt);
            }
        });

        studnumTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        studnumTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studnumTFActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Student No.:");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setText("Program:");

        programTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        programTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "BS in Computer Programming Engineering", "BS in Industrial Engineering", "BS in Electronics Computing Engineering", "BSED Major in English" }));
        programTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programTFActionPerformed(evt);
            }
        });

        editStudentBorrower.setBackground(new java.awt.Color(191, 215, 240));
        editStudentBorrower.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        editStudentBorrower.setText("EDIT");
        editStudentBorrower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStudentBorrowerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(editStudentBorrower))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21)
                            .addComponent(givenTF, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(41, 41, 41)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lastTF)
                                .addComponent(studnumTF)
                                .addComponent(programTF, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(154, 154, 154))
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
                    .addComponent(givenTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel5)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lastTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(studnumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(programTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(editStudentBorrower)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void givenTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_givenTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_givenTFActionPerformed

    private void lastTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastTFActionPerformed

    private void studnumTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studnumTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studnumTFActionPerformed

    private void programTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_programTFActionPerformed

    private void editStudentBorrowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStudentBorrowerActionPerformed
        // Start of Program
        String firstName = givenTF.getText();
        String lastName = lastTF.getText();
        String studentNumber = studnumTF.getText();
        String collegeProgram = programTF.getSelectedItem().toString();

        // Check if any field is empty or if no program is selected
        if (firstName.isEmpty() || lastName.isEmpty() || studentNumber.isEmpty() || collegeProgram.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please fill in all the fields.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;  
        }

        File inputFile = new File("LibraryManagementSystem.txt");
        File tempFile = new File("temp_LibraryManagementSystem.txt");

        boolean isUpdated = false;

    try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
         BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            // If the line starts with the student number, replace it
            if (currentLine.startsWith("Student ID: " + studentNumber)) {
                // Write the updated student details
                writer.write("Student ID: " + studentNumber);
                writer.newLine();
                writer.write("First Name: " + firstName);
                writer.newLine();
                writer.write("Last Name: " + lastName);
                writer.newLine();
                writer.write("College Program: " + collegeProgram);
                writer.newLine();
                writer.write("--------------------------");
                writer.newLine();
                isUpdated = true;

                // Skip the next 4 lines (First Name, Last Name, Program Name, and Separator) as they're being replaced
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
            //Notify the user that the student ID does not exist
            JOptionPane.showMessageDialog(this, "Student ID not found. Update aborted.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            //Cleanup and stop further process
            tempFile.delete();
            return;
        }

        JOptionPane.showMessageDialog(this,"Student information updated successfully!", "SUCCESS!", JOptionPane.INFORMATION_MESSAGE);

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error updating student information: " + e.getMessage(), "ERROR!", JOptionPane.ERROR_MESSAGE);
    }

    // Replace the old file with the updated file
    if (!inputFile.delete() || !tempFile.renameTo(inputFile)) {
        JOptionPane.showMessageDialog(this, "Error finalizing the update.", "ERROR!", JOptionPane.ERROR_MESSAGE);
    }
        
        // Clear the fields after saving
        givenTF.setText("");
        lastTF.setText("");
        studnumTF.setText("");
        programTF.setSelectedIndex(0);

    }//GEN-LAST:event_editStudentBorrowerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editStudentBorrower;
    private javax.swing.JTextField givenTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField lastTF;
    private javax.swing.JComboBox<String> programTF;
    private javax.swing.JTextField studnumTF;
    // End of variables declaration//GEN-END:variables
}