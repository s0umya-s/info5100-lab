private void submitButtonActionPerformed (java.awt.event.ActionEvent evt) {
// TODO add your handling code here:

    try{
    // try to execute the code
    // 1. Get the user details (name & college)
    // initializing variables
    String name;
    String college;
    // get the name from the text field:
    name = this.nameTextField-getText();
    // get the name of the college from the selected button group:
    college = this.collegeButtonGroup.getSelection().getActionCommand ();
    // 2. Display that same information back to the user (as a popup)
    // Printing to the output
    System.out.println(name);
    System.out.println(college);

    if(name.isBlank()){
        JOptionPane.showMessageDialog(rootPane, "Please enter your name.", "Oops!", HEIGHT);
    }else{
        // Creating a popup
        // JOptionPane.showMessageDialog (rootPane, ‹message>,<title>, HEIGHT);
        JOptionPane. showMessageDialog(rootPane, "Welcome " +name +" to "+college, "Success!", HEIGHT);
        // "Welcome + ‹name> +" to "+ <college >
        // Welcome Rish to COE
    }
    } catch (NullPointerException ne) {
        // when the user does not select the college radio buttons
        JOptionPane.showMessageDialog(rootPane, "Please select your college.", "Oops!", HEIGHT);
    } catch (Exception e){
        JOptionPane.showMessageDialog(rootPane, "Oops, something went wrong!", "Failed!", HEIGHT);
    }
}