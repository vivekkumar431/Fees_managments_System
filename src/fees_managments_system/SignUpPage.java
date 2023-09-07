package fees_managments_system;

import DATABASE.DBCON;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class SignUpPage extends javax.swing.JFrame {

    public SignUpPage() {
        initComponents();
    }
      String fname,lname,uname,password,con_pass,cont;
        Date dob;
        int id=0;
          
    public int getId(){
    try{
        DBCON db=new DBCON();
        String st="select max(id) from signup";
        db.stmt=db.con.createStatement();
        db.rst=db.stmt.executeQuery(st);
        while(db.rst.next()){
   
        id=db.rst.getInt(1);
             ++id;
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }
    return id;
    }
    
    boolean Validation(){
      
        fname=txt_FirstName.getText();
        lname=txt_LastName.getText();
        uname=txt_UserName.getText();
        password=txt_Password.getText();
        con_pass=txt_ConfirmPassword.getText();
        dob=txt_DOB.getDate();
        cont=txt_Contact.getText();
        if(fname.equals("")){
            JOptionPane.showMessageDialog(this,"please Enter FirstName");
             return false;
        }
           if(lname.equals("")){
            JOptionPane.showMessageDialog(this,"please Enter LastName");
             return false;
        }
              if(uname.equals("")){
            JOptionPane.showMessageDialog(this,"please Enter UserName");
             return false;
        }
                 if(password.equals("")){
            JOptionPane.showMessageDialog(this,"please Enter Password");
             return false;
        }
                    if(con_pass.equals("")){
            JOptionPane.showMessageDialog(this,"please Enter Confirm the Password");
             return false;
        }
                       if(dob.equals("")){
            JOptionPane.showMessageDialog(this,"please Enter DateOF Birth");
             return false;
        }
                          if(cont.equals("")){
            JOptionPane.showMessageDialog(this,"please Enter The Phone Number");
             return false;
        }
                          if(!password.equals(con_pass)){
                          JOptionPane.showMessageDialog(this,"password not match");
                          return false;
                          }
                        
                         return true;
    }
    public void CheckPassword(){
         password=txt_Password.getText();
        if(password.length()<8){
            lab_Password_error1.setText("psw should be 8 digit");
        }
        else
            lab_Password_error1.setText("");
    }
    public void ConfirmCheckPassword(){
         con_pass=txt_ConfirmPassword.getText();
          if((con_pass.length())<8){
              lab_Password_error.setText("psw should be 8 digit");
          }
          else
              lab_Password_error.setText("");
    }
    public void CheckContect(){
         cont=txt_Contact.getText();
         if((cont.length())==10){
            lab_cont_error.setText("");
         }
         else{
             
              lab_cont_error.setText("Contect should be 10 digit");
         }
    }
       void  insertDetails(){
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        String mydob=format.format(dob);
        try{
    DBCON db=new DBCON();
    db.pstmt=db.con.prepareStatement("insert into signup values(?,?,?,?,?,?,?)");
    db.pstmt.setInt(1,getId());
    db.pstmt.setString(2, fname);
    db.pstmt.setString(3,lname);
    db.pstmt.setString(4,uname);
    db.pstmt.setString(5,con_pass);
    db.pstmt.setString(6,mydob);
    db.pstmt.setString(7, cont);
    int i=db.pstmt.executeUpdate();
    if(i>0)
        JOptionPane.showMessageDialog(this,"Record inserted");
    else
        JOptionPane.showMessageDialog(this, "Record not Inserted");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lab_Password_error = new javax.swing.JLabel();
        lab_Password_error1 = new javax.swing.JLabel();
        txt_LastName = new javax.swing.JTextField();
        txt_UserName = new javax.swing.JTextField();
        txt_Contact = new javax.swing.JTextField();
        txt_FirstName = new javax.swing.JTextField();
        txt_ConfirmPassword = new javax.swing.JPasswordField();
        txt_Password = new javax.swing.JPasswordField();
        txt_DOB = new com.toedter.calendar.JDateChooser();
        btn_SignUp = new javax.swing.JButton();
        btn_Login = new javax.swing.JButton();
        lab_cont_error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SignUp");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 13, 164, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LastName");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 125, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FirstName");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 56, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 248, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ConfirmPassword");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 315, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("D..O.B");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 390, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("UserName");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact No");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 461, -1, -1));

        lab_Password_error.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lab_Password_error.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(lab_Password_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 312, 260, 35));

        lab_Password_error1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lab_Password_error1.setForeground(new java.awt.Color(255, 51, 51));
        lab_Password_error1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lab_Password_error1KeyPressed(evt);
            }
        });
        jPanel2.add(lab_Password_error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 252, 260, 35));

        txt_LastName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(txt_LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 122, 257, -1));

        txt_UserName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(txt_UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 177, 257, -1));

        txt_Contact.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_Contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ContactKeyPressed(evt);
            }
        });
        jPanel2.add(txt_Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 458, 257, -1));

        txt_FirstName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(txt_FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 56, 257, -1));

        txt_ConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_ConfirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ConfirmPasswordKeyPressed(evt);
            }
        });
        jPanel2.add(txt_ConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 312, 257, -1));

        txt_Password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_PasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_PasswordKeyReleased(evt);
            }
        });
        jPanel2.add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 245, 257, -1));

        txt_DOB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(txt_DOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 390, 257, 40));

        btn_SignUp.setBackground(new java.awt.Color(0, 204, 204));
        btn_SignUp.setForeground(new java.awt.Color(51, 51, 51));
        btn_SignUp.setText("SignUp");
        btn_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SignUpActionPerformed(evt);
            }
        });
        jPanel2.add(btn_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 559, 113, 49));

        btn_Login.setBackground(new java.awt.Color(0, 255, 204));
        btn_Login.setForeground(new java.awt.Color(51, 51, 51));
        btn_Login.setText("Login");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 559, 134, 49));

        lab_cont_error.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lab_cont_error.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(lab_cont_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 458, 244, 35));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 102, 810, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SignUpActionPerformed
       if(Validation()){
      insertDetails();
       }
    }//GEN-LAST:event_btn_SignUpActionPerformed

    private void txt_PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PasswordKeyPressed
       CheckPassword();
    }//GEN-LAST:event_txt_PasswordKeyPressed

    private void txt_PasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PasswordKeyReleased
        CheckPassword();
    }//GEN-LAST:event_txt_PasswordKeyReleased

    private void lab_Password_error1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lab_Password_error1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lab_Password_error1KeyPressed

    private void txt_ContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ContactKeyPressed
       CheckContect();
    }//GEN-LAST:event_txt_ContactKeyPressed

    private void txt_ConfirmPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ConfirmPasswordKeyPressed
      ConfirmCheckPassword();
    }//GEN-LAST:event_txt_ConfirmPasswordKeyPressed

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
   Login l=new Login();
   l.show();
   this.dispose();
    }//GEN-LAST:event_btn_LoginActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_SignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lab_Password_error;
    private javax.swing.JLabel lab_Password_error1;
    private javax.swing.JLabel lab_cont_error;
    private javax.swing.JPasswordField txt_ConfirmPassword;
    private javax.swing.JTextField txt_Contact;
    private com.toedter.calendar.JDateChooser txt_DOB;
    private javax.swing.JTextField txt_FirstName;
    private javax.swing.JTextField txt_LastName;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_UserName;
    // End of variables declaration//GEN-END:variables
}
