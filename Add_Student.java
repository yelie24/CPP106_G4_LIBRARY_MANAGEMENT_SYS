package com.mycompany.librarymanagementsystem;

//for reading data from files
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

//for writing data to files
import java.io.FileWriter;

// For handling IO exceptions that may occur during file operations
import java.io.IOException;

//to be able to display dialog boxes(error or message box)
import javax.swing.JOptionPane;

public class Add_Student extends javax.swing.JInternalFrame {

    public Add_Student() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        givenTF = new javax.swing.JTextField();
        lastTF = new javax.swing.JTextField();
        programTF = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        studnumTF = new javax.swing.JTextField();
        addStudentBorrower = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("Delete Student");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 153));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Given Name:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Last Name:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Student No.:");

        givenTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        givenTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                givenTFActionPerformed(evt);
            }
        });

        lastTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lastTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastTFActionPerformed(evt);
            }
        });

        programTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        programTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "BS in Computer Programming Engineering", "BS in Industrial Engineering", "BS in Electronics Computing Engineering", "BSED Major in English" }));
        programTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programTFActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        jLabel7.setText("ADD STUDENT BORROWER");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 153));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setText("Program:");

        studnumTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        studnumTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studnumTFActionPerformed(evt);
            }
        });

        addStudentBorrower.setBackground(new java.awt.Color(191, 215, 240));
        addStudentBorrower.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        addStudentBorrower.setText("ADD");
        addStudentBorrower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentBorrowerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 71, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(44, 44, 44))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(44, 44, 44)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lastTF)
                                        .addComponent(studnumTF)
                                        .addComponent(programTF, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(136, 136, 136)
                                    .addComponent(addStudentBorrower)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(givenTF, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(givenTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studnumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(programTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addComponent(addStudentBorrower)
                .addContainerGap(130, Short.MAX_VALUE))
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

    private void givenTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_givenTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_givenTFActionPerformed

    private void lastTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastTFActionPerformed

    private void addStudentBorrowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentBorrowerActionPerformed
        // For getting the information from the text fields
        String firstName = givenTF.getText();
        String lastName = lastTF.getText();
        String studentNumber = studnumTF.getText();

        // For getting the selected program from combo box
        String collegeProgram = programTF.getSelectedItem().toString();

        // Check if any field is empty or if no program is selected
        if (firstName.isEmpty() || lastName.isEmpty() || studentNumber.isEmpty() || collegeProgram.equals("Select")) {
            // Will show an error message if any field is empty
            JOptionPane.showMessageDialog(this, "Please fill in all the fields.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;  
        }

    try {
        // Check if student number is numeric
        if (!studentNumber.matches("\\d+")) {
            throw new NumberFormatException("Student number must be numeric.");
        }
        
        boolean studentNumberExists = false;
        
        try (BufferedReader reader = new BufferedReader(new FileReader("LibraryManagementSystem.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            // Split the line by colon (:) to match the stored format
            if (line.startsWith("Student ID:")) {
                String existingStudentNumber = line.split(":")[1].trim(); // Extract the student number
                if (existingStudentNumber.equals(studentNumber)) {
                    studentNumberExists = true;
                    break;
                }
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error reading from file!", "FILE ERROR!", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method on read error
    }

    // If the student number already exists, show an error message
    if (studentNumberExists) {
        JOptionPane.showMessageDialog(this, "Error: Student number already exists!", "DUPLICATE FILE!", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method to prevent saving duplicate data
    }
        // Open the file to append the student data
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("LibraryManagementSystem.txt", true))) {
            // Write the student information to the file
            writer.write("Student ID: " + studentNumber + "\n");
            writer.write("First Name: " + firstName + "\n");
            writer.write("Last Name: " + lastName + "\n");
            writer.write("College Program: " + collegeProgram + "\n");
            writer.write("-----------------------------\n");  // separates between records
        }

        // Show a success message after saving the information
        JOptionPane.showMessageDialog(this, "Student information saved successfully!", "SUCESS!", JOptionPane.INFORMATION_MESSAGE);
    } catch (NumberFormatException e) {
        // Show an error message if the student number is not numeric
        JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR!", JOptionPane.ERROR_MESSAGE);
    } catch (IOException e) {
        // Show an error message if there is an issue with saving the file
        JOptionPane.showMessageDialog(this, "Error saving student information.", "ERROR!", JOptionPane.ERROR_MESSAGE);
    }
    
    
        // Clear the fields after saving
        givenTF.setText("");
        lastTF.setText("");
        studnumTF.setText("");
        programTF.setSelectedIndex(0);

    }//GEN-LAST:event_addStudentBorrowerActionPerformed

    private void programTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_programTFActionPerformed

    private void studnumTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studnumTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studnumTFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentBorrower;
    private javax.swing.JTextField givenTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField lastTF;
    private javax.swing.JComboBox<String> programTF;
    private javax.swing.JTextField studnumTF;
    // End of variables declaration//GEN-END:variables
}
