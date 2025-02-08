    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try{
        // try to execute the code
        // 1. Get the user details (name & college)
        // initializing object of User class
        User userObject = new User();
        // get the name trom the text field:
        // name = this.nameTextField.getTextO:
        userObject.setName(this.nameTextField.getText());
        // get the name of the college from the selected combo-box:
        //college = this.collegeComboBox.getSelectedItem().toString();
        userObject.setCollege(this.collegeComboBox.getSelectedItem().toString());
        //int age;
        //age = Integer.parseInt(this.ageTextField.getText());
        // Integer.parseInt(< pass a string value which is a number >)
        // "28"-> 28
        // "kug" —> NumberFormatException
        // string> number
        userObject.setAge(Integer.parseInt(this.ageTextField.getText()));

        // hobbies = this.hobbiesTextArea.getText();
        userObject.setHobby(this.hobbyTextArea.getText());

        // 2. Display that same information back to the user (as a popup)
        // Printing to the output
        System.out.println(userObject.getName());
        System.out.println(userObject.getCollege());
        System.out.println(userObject.getAge());
        System.out.println(userObject.getHobby());
        System.out.println(userObject);
            if(userObject.getName().isBlank()){
                JOptionPane.showMessageDialog(rootPane, "Please enter your name.", "Oops!", HEIGHT);
            } else{
                if(userObject.getName().isBlank()){
                JOptionPane.showMessageDialog (rootPane,
                "Please enter your name.", "Oops!", HEIGHT);
                // Creating a popup
                // JOptionPane.showMessageDialog(rootPane,<message>,<title>, HEIGHT);
                JOptionPane.showMessageDialog(rootPane, userobject, "Success!", HEIGHT);
                //"Welcome + <name> +" to"+ ‹college >
                // Welcome Rish to COE
            }

        } catch (NullPointerException ne) {
            // when the user does not select the college radio buttons
            JOptionPane.showMessageDialog(rootPane, "Please select your college.", "Oops!", HEIGHT);
            System.out.println(ne.getMessage());
            ne-printStackTrace();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Please enter your age correctly.", "Oops!", HEIGHT);

        } catch (Exception e){
        JOptionPane.showMessageDialog(rootPane, "Oops, something went wrong!", "Failed!", HEIGHT);
        System.out.println(e.getMessage());
        e-printStackTrace();
        }
    }
/**
* @param args the command line arguments
* */

public static void main(String args[]) {
/* Set the Nimbus look and feel 
    Look and feel setting code (optional)
//</editor-fold>
/* Create and display the form */
        java. awt.EventQueue. invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true):
            }
        });