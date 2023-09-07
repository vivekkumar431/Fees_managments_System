package fees_managments_system;
import DATABASE.DBCON;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
public class Print_Receipt extends javax.swing.JFrame {
    public Print_Receipt() {
        initComponents();
        getRecords();
        Container c=getContentPane();
        c.setBackground(new Color(0,153,153));
    }
    
    public void getRecords(){
       try{
           DBCON db=new DBCON();
           db.pstmt=db.con.prepareStatement("select * from fees_details order by receipt_no desc limit 1");
           db.rst=db.pstmt.executeQuery();
           if(db.rst.next()){
           jLabel19.setText(db.rst.getString("receipt_no"));
           String PaymentMode=db.rst.getString("payment_mode");
           jLabel24.setText(PaymentMode);
           
           if(PaymentMode.equals("DD")||PaymentMode.equals("Cheque")){
           jLabel29.setText(db.rst.getString("dd_no"));
            jLabel30.setText(db.rst.getString("bank_no"));
           }
           else if(PaymentMode.equals("Card")){
           lbl_chequeno.setText(" ");
            jLabel29.setText(" ");
            jLabel30.setText(db.rst.getString("bank_no"));
           }
           else{
            lbl_chequeno.setText(" ");
            jLabel29.setText(" ");
               jLabel30.setText(" ");
           }
               
             jLabel32.setText(db.rst.getString("date"));
               jLabel31.setText(db.rst.getString("student_name"));
              jLabel33.setText(db.rst.getString("gstin"));
                jLabel34.setText(db.rst.getString("year1"));
                  jLabel35.setText(db.rst.getString("year2"));
                    jLabel17.setText(db.rst.getString("course_name"));
                      jLabel6.setText(db.rst.getString("amount"));
                        jLabel7.setText(db.rst.getString("cgst"));
                          jLabel14.setText(db.rst.getString("sgst"));
                            jLabel15.setText(db.rst.getString("total_amount"));
                              jLabel18.setText(db.rst.getString("total_in_words"));
                              jLabel37.setText(db.rst.getString("roll_no"));
                              jLabel39.setText(db.rst.getString("remark"));
           }
           
       }
        catch(Exception e){
        e.printStackTrace();
        }
    }
    
    
    
  Color clr=new Color(0,153,153);
  Color clr1=new Color(0,103,103);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelSideBar = new javax.swing.JPanel();
        PanelHome8 = new javax.swing.JPanel();
        btn_Edit = new javax.swing.JLabel();
        PanelHome7 = new javax.swing.JPanel();
        btn_Print = new javax.swing.JLabel();
        PanelHome6 = new javax.swing.JPanel();
        btn_Logout = new javax.swing.JLabel();
        PanelHome5 = new javax.swing.JPanel();
        btn_Back = new javax.swing.JLabel();
        PanelHome4 = new javax.swing.JPanel();
        btn_Allrecord = new javax.swing.JLabel();
        PanelHome3 = new javax.swing.JPanel();
        btn_CourseList = new javax.swing.JLabel();
        PanelHome2 = new javax.swing.JPanel();
        btn_EditCourse = new javax.swing.JLabel();
        PanelHome1 = new javax.swing.JPanel();
        btn_SearchRecord = new javax.swing.JLabel();
        PanelHome = new javax.swing.JPanel();
        btn_Home = new javax.swing.JLabel();
        Panel_Print = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_chequeno = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_BankName = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelSideBar.setBackground(new java.awt.Color(0, 102, 102));
        PanelSideBar.setPreferredSize(new java.awt.Dimension(540, 1040));
        PanelSideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelHome8.setBackground(new java.awt.Color(0, 102, 102));
        PanelHome8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelHome8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Edit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_Edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit2.png"))); // NOI18N
        btn_Edit.setText("      Edit");
        btn_Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_EditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_EditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_EditMouseExited(evt);
            }
        });
        PanelHome8.add(btn_Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, -1));

        PanelSideBar.add(PanelHome8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 860, 330, 70));

        PanelHome7.setBackground(new java.awt.Color(0, 102, 102));
        PanelHome7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelHome7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Print.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_Print.setForeground(new java.awt.Color(255, 255, 255));
        btn_Print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/printer-.png"))); // NOI18N
        btn_Print.setText("       Print");
        btn_Print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PrintMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_PrintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_PrintMouseExited(evt);
            }
        });
        PanelHome7.add(btn_Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 70));

        PanelSideBar.add(PanelHome7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 770, 330, 70));

        PanelHome6.setBackground(new java.awt.Color(0, 102, 102));
        PanelHome6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelHome6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Logout.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_Logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logout.png"))); // NOI18N
        btn_Logout.setText("       LogOut");
        btn_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_LogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LogoutMouseExited(evt);
            }
        });
        PanelHome6.add(btn_Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, -1));

        PanelSideBar.add(PanelHome6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 330, 70));

        PanelHome5.setBackground(new java.awt.Color(0, 102, 102));
        PanelHome5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelHome5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Back.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_Back.setForeground(new java.awt.Color(255, 255, 255));
        btn_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/left-arrow.png"))); // NOI18N
        btn_Back.setText("       Back");
        btn_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_BackMouseExited(evt);
            }
        });
        PanelHome5.add(btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, -1));

        PanelSideBar.add(PanelHome5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 330, 70));

        PanelHome4.setBackground(new java.awt.Color(0, 102, 102));
        PanelHome4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelHome4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Allrecord.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_Allrecord.setForeground(new java.awt.Color(255, 255, 255));
        btn_Allrecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/view all record.png"))); // NOI18N
        btn_Allrecord.setText("    View All Record");
        btn_Allrecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AllrecordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_AllrecordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_AllrecordMouseExited(evt);
            }
        });
        PanelHome4.add(btn_Allrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, -1));

        PanelSideBar.add(PanelHome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 330, 70));

        PanelHome3.setBackground(new java.awt.Color(0, 102, 102));
        PanelHome3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelHome3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_CourseList.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_CourseList.setForeground(new java.awt.Color(255, 255, 255));
        btn_CourseList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/list.png"))); // NOI18N
        btn_CourseList.setText("       Course List");
        btn_CourseList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CourseListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CourseListMouseExited(evt);
            }
        });
        PanelHome3.add(btn_CourseList, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, -1));

        PanelSideBar.add(PanelHome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 330, 70));

        PanelHome2.setBackground(new java.awt.Color(0, 102, 102));
        PanelHome2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelHome2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_EditCourse.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_EditCourse.setForeground(new java.awt.Color(255, 255, 255));
        btn_EditCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit2.png"))); // NOI18N
        btn_EditCourse.setText("       Edit Courses");
        btn_EditCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_EditCourseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_EditCourseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_EditCourseMouseExited(evt);
            }
        });
        PanelHome2.add(btn_EditCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, -1));

        PanelSideBar.add(PanelHome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 330, 70));

        PanelHome1.setBackground(new java.awt.Color(0, 102, 102));
        PanelHome1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelHome1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_SearchRecord.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_SearchRecord.setForeground(new java.awt.Color(255, 255, 255));
        btn_SearchRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search2.png"))); // NOI18N
        btn_SearchRecord.setText("     Search Record");
        btn_SearchRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SearchRecordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SearchRecordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SearchRecordMouseExited(evt);
            }
        });
        PanelHome1.add(btn_SearchRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 70));

        PanelSideBar.add(PanelHome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 330, 70));

        PanelHome.setBackground(new java.awt.Color(0, 102, 102));
        PanelHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Home.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_Home.setForeground(new java.awt.Color(255, 255, 255));
        btn_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home.png"))); // NOI18N
        btn_Home.setText("         HOME");
        btn_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_HomeMouseExited(evt);
            }
        });
        PanelHome.add(btn_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 70));

        PanelSideBar.add(PanelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 330, 70));

        getContentPane().add(PanelSideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 1030));

        Panel_Print.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Print.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel9.setText("  ABDUL KALAM TECHNICAL UNIVERSITY,LUCKNOW");
        Panel_Print.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 860, 40));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel10.setText("Sitapur Road ,Near IIM Teraha ,Bakashi KA Talab Lucknow ,Utter Pradesh");
        Panel_Print.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 600, 40));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel11.setText("B. N College Of Engineering And Technology");
        Panel_Print.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 960, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bncet.png"))); // NOI18N
        Panel_Print.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 220, 210));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1180, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Panel_Print.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 1180, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Receipt NO : SOC");
        Panel_Print.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 190, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Mode Of Payment:");
        Panel_Print.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 200, 40));

        lbl_chequeno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_chequeno.setText("Cheque_DD NO:");
        Panel_Print.add(lbl_chequeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 190, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Date :");
        Panel_Print.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 70, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("GST NO:");
        Panel_Print.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 120, 40));

        lbl_BankName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_BankName.setText("Bank Name");
        Panel_Print.add(lbl_BankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 140, 40));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel13.setText("the Following paymente in the college office for the year");
        Panel_Print.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 620, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText(" to");
        Panel_Print.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 480, 40, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("Recever Signature");
        Panel_Print.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 870, 250, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setText("Amount Words:");
        Panel_Print.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 800, 170, 50));

        jSeparator4.setForeground(java.awt.Color.black);
        Panel_Print.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 730, 270, 10));

        jSeparator2.setForeground(java.awt.Color.black);
        Panel_Print.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 1210, 10));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setText("Amount");
        Panel_Print.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 530, 90, 50));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setText("Sr NO");
        Panel_Print.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 90, 40));

        jSeparator1.setForeground(java.awt.Color.black);
        Panel_Print.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 1210, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel25.setText("Roll Number   :");
        Panel_Print.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 180, 40));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel26.setText("Head");
        Panel_Print.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 90, 40));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setText("CGST 9%");
        Panel_Print.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 620, 160, 50));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel27.setText("SGST 9%");
        Panel_Print.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 680, 120, 50));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel28.setText("Total Amount");
        Panel_Print.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 740, 150, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Panel_Print.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 590, 190, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Panel_Print.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 650, 190, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Panel_Print.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 690, 190, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Panel_Print.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 740, 190, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(java.awt.Color.magenta);
        Panel_Print.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 590, 190, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Panel_Print.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 810, 590, 40));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Panel_Print.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 190, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Panel_Print.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 190, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Panel_Print.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 190, 30));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Panel_Print.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 190, 30));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Panel_Print.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, 190, 30));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Panel_Print.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 260, 190, 30));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 102, 255));
        Panel_Print.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 190, 260, 40));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Panel_Print.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, 100, 30));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Panel_Print.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 480, 120, 30));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel36.setText("Received Form Name :");
        Panel_Print.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 250, 40));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Panel_Print.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 320, 190, 30));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel38.setText("Remark                    :");
        Panel_Print.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 850, -1, 50));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Panel_Print.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 860, 190, 30));

        getContentPane().add(Panel_Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 1230, 920));
        Panel_Print.getAccessibleContext().setAccessibleName("");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Print Receipt");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, -1, -1));

        setSize(new java.awt.Dimension(1918, 1060));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogoutMouseClicked
        Login l=new Login();
        l.show();
        this.dispose();
    }//GEN-LAST:event_btn_LogoutMouseClicked

    private void btn_LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogoutMouseEntered
        PanelHome6.setBackground(clr);
    }//GEN-LAST:event_btn_LogoutMouseEntered

    private void btn_LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogoutMouseExited
        PanelHome6.setBackground(clr1);
    }//GEN-LAST:event_btn_LogoutMouseExited

    private void btn_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BackMouseClicked
        AddFees AD=new AddFees();
        AD.show();
        this.dispose();
    }//GEN-LAST:event_btn_BackMouseClicked

    private void btn_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BackMouseEntered
        PanelHome5.setBackground(clr);
    }//GEN-LAST:event_btn_BackMouseEntered

    private void btn_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BackMouseExited
        PanelHome5.setBackground(clr1);
    }//GEN-LAST:event_btn_BackMouseExited

    private void btn_AllrecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AllrecordMouseEntered
        PanelHome4.setBackground(clr);
    }//GEN-LAST:event_btn_AllrecordMouseEntered

    private void btn_AllrecordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AllrecordMouseExited
        PanelHome4.setBackground(clr1);
    }//GEN-LAST:event_btn_AllrecordMouseExited

    private void btn_CourseListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CourseListMouseEntered
        PanelHome3.setBackground(clr);
    }//GEN-LAST:event_btn_CourseListMouseEntered

    private void btn_CourseListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CourseListMouseExited
        PanelHome3.setBackground(clr1);
    }//GEN-LAST:event_btn_CourseListMouseExited

    private void btn_EditCourseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditCourseMouseEntered
        PanelHome2.setBackground(clr);
    }//GEN-LAST:event_btn_EditCourseMouseEntered

    private void btn_EditCourseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditCourseMouseExited
        PanelHome2.setBackground(clr1);
    }//GEN-LAST:event_btn_EditCourseMouseExited

    private void btn_SearchRecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchRecordMouseEntered
        PanelHome1.setBackground(clr);
    }//GEN-LAST:event_btn_SearchRecordMouseEntered

    private void btn_SearchRecordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchRecordMouseExited
        PanelHome1.setBackground(clr1);
    }//GEN-LAST:event_btn_SearchRecordMouseExited

    private void btn_HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMouseEntered
        PanelHome.setBackground(clr);
    }//GEN-LAST:event_btn_HomeMouseEntered

    private void btn_HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMouseExited
        PanelHome.setBackground(clr1);
    }//GEN-LAST:event_btn_HomeMouseExited

    private void btn_PrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PrintMouseClicked
      try
        {
            PrinterJob pj=PrinterJob.getPrinterJob();
        pj.setJobName("Print Date");
        pj.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf,int pageNum){
            pf.setOrientation(PageFormat.LANDSCAPE);
            if(pageNum >0){
                return Printable.NO_SUCH_PAGE;
            }
            Graphics2D g2=(Graphics2D)pg;
            g2.translate(pf.getImageableX(),pf.getImageableY());
            g2.scale(0.47,0.47);
            Panel_Print.print(g2);
            return Printable.PAGE_EXISTS;
            }
    });
        boolean ok=pj.printDialog();
        if(ok)
            pj.print();
    }
        catch(Exception e){
                e.printStackTrace();
                }
        
    }//GEN-LAST:event_btn_PrintMouseClicked

    private void btn_PrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PrintMouseEntered
       PanelHome7.setBackground(clr);
    }//GEN-LAST:event_btn_PrintMouseEntered

    private void btn_PrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PrintMouseExited
     PanelHome7.setBackground(clr1);
    }//GEN-LAST:event_btn_PrintMouseExited

    private void btn_EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditMouseClicked
      UpdateFees_Details ud=new UpdateFees_Details();
      ud.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btn_EditMouseClicked

    private void btn_EditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditMouseEntered
      PanelHome8.setBackground(clr);
    }//GEN-LAST:event_btn_EditMouseEntered

    private void btn_EditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditMouseExited
       PanelHome8.setBackground(clr1);
    }//GEN-LAST:event_btn_EditMouseExited

    private void btn_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMouseClicked
       HomePage  hm=new HomePage();
       hm.show();
      this.dispose();
    }//GEN-LAST:event_btn_HomeMouseClicked

    private void btn_SearchRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchRecordMouseClicked
          SearchRecord sr=new SearchRecord();
          sr.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_btn_SearchRecordMouseClicked

    private void btn_EditCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditCourseMouseClicked
       EditCourse ed=new EditCourse();
    ed.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btn_EditCourseMouseClicked

    private void btn_AllrecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AllrecordMouseClicked
           ViewAllRecord var=new ViewAllRecord();
       var.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btn_AllrecordMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Print_Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Print_Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Print_Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Print_Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Print_Receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelHome;
    private javax.swing.JPanel PanelHome1;
    private javax.swing.JPanel PanelHome2;
    private javax.swing.JPanel PanelHome3;
    private javax.swing.JPanel PanelHome4;
    private javax.swing.JPanel PanelHome5;
    private javax.swing.JPanel PanelHome6;
    private javax.swing.JPanel PanelHome7;
    private javax.swing.JPanel PanelHome8;
    private javax.swing.JPanel PanelSideBar;
    private javax.swing.JPanel Panel_Print;
    private javax.swing.JLabel btn_Allrecord;
    private javax.swing.JLabel btn_Back;
    private javax.swing.JLabel btn_CourseList;
    private javax.swing.JLabel btn_Edit;
    private javax.swing.JLabel btn_EditCourse;
    private javax.swing.JLabel btn_Home;
    private javax.swing.JLabel btn_Logout;
    private javax.swing.JLabel btn_Print;
    private javax.swing.JLabel btn_SearchRecord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbl_BankName;
    private javax.swing.JLabel lbl_chequeno;
    // End of variables declaration//GEN-END:variables
}
