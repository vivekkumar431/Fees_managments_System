package fees_managments_system;
public class Welcome extends javax.swing.JFrame {
    public Welcome() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Loading = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 627));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Loading.setForeground(new java.awt.Color(255, 255, 153));
        Loading.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoadingMouseClicked(evt);
            }
        });
        jPanel1.add(Loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 1010, 30));

        jLabel2.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 153));
        jLabel2.setText("LUCKNOW NO ONE COLLEGE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 340, 50));

        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 153));
        jLabel4.setText("WELCOME TO BNCET COLLEGE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 550, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Bncet1.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1080, 627));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoadingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadingMouseClicked

    }//GEN-LAST:event_LoadingMouseClicked

    public static void main(String args[]) {
          Welcome wel=new Welcome();
              wel.setVisible(true);
              Login login=new Login();
              try{
                  for(int i=0;i<100;i++){
                      Thread.sleep(20);
                      wel.Loading.setValue(i);
                  }
              }
                  catch(Exception e){
                      e.printStackTrace();
                          }
              wel.setVisible(false);
               new Login().setVisible(true);
              wel.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Loading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
