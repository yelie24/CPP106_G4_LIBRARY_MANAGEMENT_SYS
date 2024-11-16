package com.mycompany.librarymanagementsystem;

// For formatting dates in a specified pattern
import java.text.SimpleDateFormat;  

// For reading data from files
import java.io.BufferedReader; 
import java.io.FileReader;     

// For writing data to files
import java.io.FileWriter;      
import java.io.BufferedWriter; 

// For handling IO exceptions that may occur during file operations
import java.io.IOException;    

// To display dialog boxes (for error messages or user prompts)
import javax.swing.JOptionPane;  

public class Issue_Book extends javax.swing.JInternalFrame {
   
    public Issue_Book() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        booknumTF = new javax.swing.JTextField();
        studnumTF = new javax.swing.JTextField();
        issuedateTF = new com.toedter.calendar.JDateChooser();
        duedateTF = new com.toedter.calendar.JDateChooser();
        issueBook = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        jLabel7.setText("ISSUE BOOK");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Book ID:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Student ID:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Issue Date:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText(" Due Date:");

        booknumTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        studnumTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        issueBook.setBackground(new java.awt.Color(191, 215, 240));
        issueBook.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        issueBook.setText("ISSUE");
        issueBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(booknumTF)
                                .addComponent(studnumTF)
                                .addComponent(issuedateTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(duedateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(issueBook)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(booknumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(studnumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(issuedateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(duedateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(issueBook, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void issueBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBookActionPerformed
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");

        String book_id = booknumTF.getText();
        String student_id = studnumTF.getText();
        String due_date = dFormat.format(duedateTF.getDate());
        String issue_date = dFormat.format(issuedateTF.getDate());
        String returnBook = "No";
    
        if (book_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Book ID.", "MISSING INPUT!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (student_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Student ID.", "MISSING INPUT!", JOptionPane.ERROR_MESSAGE);
            return;
        }   
        if (issue_date == null || due_date == null) {
            JOptionPane.showMessageDialog(this, "Please select date for Issue Date and Due Date.", "MISSING INPUT!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        boolean bookExists = false;
        boolean studentExists = false;

        try {
            // Check if the book ID exists
            BufferedReader bookReader = new BufferedReader(new FileReader("LibraryManagementSystem.txt"));
            String line;
            while ((line = bookReader.readLine()) != null) {
                if (line.trim().equalsIgnoreCase("Book ID: " + book_id)) {
                    bookExists = true;
                    break;
                }
            }
            bookReader.close();

            // Check if the student ID exists
            BufferedReader studentReader = new BufferedReader(new FileReader("LibraryManagementSystem.txt"));
            while ((line = studentReader.readLine()) != null) {
                if (line.trim().equalsIgnoreCase("Student ID: " + student_id)) {
                    studentExists = true;
                    break;
                }
            }
            studentReader.close();

            // Proceed if both IDs exist
            if (bookExists && studentExists) {
                // Log the issue details in the file
                BufferedWriter writer = new BufferedWriter(new FileWriter("LibraryManagementSystem.txt", true));
                writer.write("Book ID: " + book_id);
                writer.newLine();
                writer.write("Student ID: " + student_id);
                writer.newLine();
                writer.write("Issue Date: " + issue_date);
                writer.newLine();
                writer.write("Due Date: " + due_date);
                writer.newLine();
                writer.write("Return Status: " + returnBook);
                writer.newLine();
                writer.write("--------------------------");
                writer.newLine();
                writer.close();

                JOptionPane.showMessageDialog(null, "The book has been successfully issued!");
            } else {
                if (!bookExists) {
                    JOptionPane.showMessageDialog(this, "Incorrect Book ID.", "ERROR!", JOptionPane.ERROR_MESSAGE);
                }
                if (!studentExists) {
                    JOptionPane.showMessageDialog(this, "Incorrect Student ID.", "ERROR!", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "FILE ERROR!", JOptionPane.ERROR_MESSAGE);
        }
            //Clearing input fields
            booknumTF.setText("");
            studnumTF.setText("");
            duedateTF.setDate(null);
            issuedateTF.setDate(null);
    }//GEN-LAST:event_issueBookActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField booknumTF;
    private com.toedter.calendar.JDateChooser duedateTF;
    private javax.swing.JButton issueBook;
    private com.toedter.calendar.JDateChooser issuedateTF;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField studnumTF;
    // End of variables declaration//GEN-END:variables
}
