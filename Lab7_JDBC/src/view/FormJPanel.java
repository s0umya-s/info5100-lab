/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.CardLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.User;
import utility.DatabaseConnector;

/**
 *
 * @author soumyasingh
 */
public class FormJPanel extends javax.swing.JPanel {
    
    JPanel bottomPanel;
    ImageIcon picture;

    /**
     */
    public FormJPanel() {
        initComponents();
    }
    
    public FormJPanel(JPanel bottomPanel){
        initComponents();
        this.bottomPanel = bottomPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        collegeLabel = new javax.swing.JLabel();
        collegejComboBox = new javax.swing.JComboBox<>();
        ageField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        hobbiesLabel = new javax.swing.JLabel();
        hobbiesField = new javax.swing.JTextField();
        submitButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));
        setPreferredSize(new java.awt.Dimension(705, 450));

        jLabel1.setBackground(java.awt.Color.blue);
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Registration");

        nameLabel.setText("Name");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        collegeLabel.setText("College");

        collegejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "College of Engineering", "College of Professional Studies", "College of Science" }));
        collegejComboBox.setSelectedIndex(-1);
        collegejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collegejComboBoxActionPerformed(evt);
            }
        });

        ageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFieldActionPerformed(evt);
            }
        });

        ageLabel.setText("Age");

        hobbiesLabel.setText("Hobbies");

        hobbiesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hobbiesFieldActionPerformed(evt);
            }
        });

        submitButton1.setText("Submit");
        submitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(collegeLabel)
                            .addComponent(nameLabel)
                            .addComponent(ageLabel)
                            .addComponent(hobbiesLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(collegejComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                            .addComponent(ageField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hobbiesField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submitButton1)
                        .addGap(36, 36, 36)))
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(collegeLabel)
                    .addComponent(collegejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hobbiesLabel)
                    .addComponent(hobbiesField, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton1)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void collegejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collegejComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_collegejComboBoxActionPerformed

    private void ageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFieldActionPerformed

    private void hobbiesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hobbiesFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hobbiesFieldActionPerformed

    private void submitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButton1ActionPerformed
        // TODO add your handling code here:
        try {
            User userObject = new User();

            userObject.setName(this.nameField.getText());
            userObject.setCollege(this.collegejComboBox.getSelectedItem().toString());
            userObject.setAge(Integer.parseInt(this.ageField.getText()));
            userObject.setHobby(this.hobbiesField.getText());
            userObject.setPicture(this.picture);

            System.out.println(userObject.getName());
            System.out.println(userObject.getCollege());
            System.out.println(userObject.getAge());
            System.out.println(userObject.getHobby());
            System.out.println(userObject);

            if(userObject.getName().isBlank()){
                JOptionPane.showMessageDialog(this, "Please enter your name", "Oops!", HEIGHT);
               
            } else if(userObject.getCollege().isBlank()){
                JOptionPane.showMessageDialog(this, "Please enter your college", "Oops!", HEIGHT);
             
            } else {
                
                DatabaseConnector.addUser(userObject);
                System.out.println("Added user into the database");
                
                JOptionPane.showMessageDialog(this, userObject, "Success!", HEIGHT, this.picture);
                // "Welcome " + <name> + " to "+ <college>
                ViewJPanel viewJPanelObject = new ViewJPanel(userObject);
                this.bottomPanel.add(viewJPanelObject);
                CardLayout layout = (CardLayout) this.bottomPanel.getLayout();
                layout.next(bottomPanel);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter your age correctly ", "Oops!", HEIGHT);
    
        } catch (HeadlessException e){
            JOptionPane.showMessageDialog(this, "Oops, something went wrong! ", "Failed!", HEIGHT);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An unexpected error occured:" + e.getMessage());
        }
    }//GEN-LAST:event_submitButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel collegeLabel;
    private javax.swing.JComboBox<String> collegejComboBox;
    private javax.swing.JTextField hobbiesField;
    private javax.swing.JLabel hobbiesLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton submitButton1;
    // End of variables declaration//GEN-END:variables
}
