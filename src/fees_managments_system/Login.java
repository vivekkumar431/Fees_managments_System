package fees_managments_system;

import DATABASE.DBCON;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
  
    public Login(){
        initComponents();
    }
        void UserVerification(String username,String pass) throws SQLException{
            DBCON db=new DBCON();
        db.pstmt=db.con.prepareStatement("select * from signup where uname=? and password=?");
         db.pstmt.setString(1, username);
         db.pstmt.setString(2,pass);
         db.rst=db.pstmt.executeQuery();
         if(db.rst.next()){
             HomePage hm=new HomePage();
             hm.show();
             this.dispose();
         }
         else
             JOptionPane.showMessageDialog(this,"Wrong UserName And Password");
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_UserName = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_signup = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        lbl_Error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 125, 125));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/admin.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 13, 69, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Login");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 13, -1, 74));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 100));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Enter UserName");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 62, -1, 71));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Enter Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 164, -1, 74));

        txt_UserName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(txt_UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 62, 356, 65));

        txt_password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 177, 356, 57));

        btn_signup.setBackground(new java.awt.Color(0, 0, 0));
        btn_signup.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_signup.setForeground(new java.awt.Color(153, 255, 255));
        btn_signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/signup.png"))); // NOI18N
        btn_signup.setText("SignUp");
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        jPanel2.add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 378, 150, 75));

        btn_exit.setBackground(new java.awt.Color(0, 0, 0));
        btn_exit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(153, 255, 255));
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exit.png"))); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel2.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 378, 150, 75));

        btn_login.setBackground(new java.awt.Color(0, 0, 0));
        btn_login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(204, 255, 255));
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/login.png"))); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel2.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 370, 150, 75));

        lbl_Error.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_Error.setForeground(new java.awt.Color(255, 51, 102));
        jPanel2.add(lbl_Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 245, 696, 78));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 880, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
       try{
           String user=txt_UserName.getText();
       
         String pass=txt_password.getText();
         if(user.trim().equals("")||pass.trim().equals("")){
         lbl_Error.setText("Please Enter UserName and Password");
         }
         else{
             UserVerification(user,pass);
         }
       }
    catch(Exception e){
          e.printStackTrace();
          }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        try{
            SignUpPage sp=new SignUpPage();
            sp.show();
            this.dispose();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_signupActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
      System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_Error;
    private javax.swing.JTextField txt_UserName;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables
}
