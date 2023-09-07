package fees_managments_system;

import DATABASE.DBCON;
import java.awt.Color;
import java.io.File;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GenerateReport extends javax.swing.JFrame {
    public GenerateReport() {
        initComponents();
        fillComboBox();
    }
       public void clearTable(){
    model=(DefaultTableModel)Table_Data3.getModel();
    model.setRowCount(0);
    }
       public void fillComboBox(){
    try{
        DBCON db=new DBCON();
        db.pstmt=db.con.prepareStatement("select * from course");
        db.rst=db.pstmt.executeQuery();
        while(db.rst.next()){
            Combo_Course.addItem(db.rst.getString("cname"));
        }
    }
    catch(Exception e){
    e.printStackTrace();
    }
    }
       DefaultTableModel model;
     public void SetDataToTable(){
   try{
         Float amount=0.0f;
       String cname=Combo_Course.getSelectedItem().toString();
     SimpleDateFormat formatdate=new SimpleDateFormat("YYYY-MM-dd");
     String fromDate=formatdate.format(jDateChooser2.getDate());  
     String toDate=formatdate.format(jDateChooser1.getDate());  
 
     DBCON db=new DBCON();
       db.pstmt=db.con.prepareStatement("select * from fees_details where date between ? and ? and course_name=? ");
           db.pstmt.setString(1, fromDate);
        db.pstmt.setString(2, toDate);
          db.pstmt.setString(3, cname);
       db.rst=db.pstmt.executeQuery();
       while(db.rst.next()){
       String receipt_no=db.rst.getString("receipt_no");
       String roll_no=db.rst.getString("roll_no");
       String student_name=db.rst.getString("student_name");
       String course_name=db.rst.getString("course_name");
       String total_amount=db.rst.getString("total_amount");
       String remark=db.rst.getString("remark");
        
       float amo=Float.parseFloat(total_amount);
       amount+=amo;
       
        Object[] obj={receipt_no,roll_no,student_name,course_name,total_amount,remark};
              model=(DefaultTableModel)Table_Data3.getModel();
                model.addRow(obj);
               
       }
       lbl_course.setText(cname);
           lbl_amount.setText(amount.toString());
        lbl_totalamountinwords.setText(NumTOWordConverter.convert(amount.intValue()));
   }
   catch(Exception e){
   e.printStackTrace();
   }
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelSideBar = new javax.swing.JPanel();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Combo_Course = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_filePath = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Data3 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lbl_totalamountinwords = new javax.swing.JLabel();
        lbl_course = new javax.swing.JLabel();
        lbl_amount = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelSideBar.setBackground(new java.awt.Color(0, 102, 102));
        PanelSideBar.setPreferredSize(new java.awt.Dimension(540, 1040));
        PanelSideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(PanelSideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 1000));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Course :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 280, -1));

        Combo_Course.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(Combo_Course, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 400, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Date   :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 270, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 210, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("From Date :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 230, -1));
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 210, 50));

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("    Export to Excel");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 300, 60));

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 160, 60));

        txt_filePath.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jPanel1.add(txt_filePath, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 410, 50));

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("   Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 160, 60));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setText("Browser");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 160, 60));

        Table_Data3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ReceiptNo", "RollNo", "StudenntName", "CourseName", "Amount", "Remark"
            }
        ));
        jScrollPane1.setViewportView(Table_Data3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 1370, 610));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_totalamountinwords.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_totalamountinwords.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lbl_totalamountinwords, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 480, 50));

        lbl_course.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_course.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lbl_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 180, -1));

        lbl_amount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_amount.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lbl_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 230, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Amount in Words  :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 240, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total Amount Collected :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 230, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Course Selected :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 520, 300));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("To Date :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 1530, 1000));

        setSize(new java.awt.Dimension(1918, 1047));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
         Color clr=new Color(0,153,153);
          Color clr1=new Color(0,103,103);
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
        HomePage hm=new HomePage();
        hm.show();
        this.dispose();
    }//GEN-LAST:event_btn_BackMouseClicked

    private void btn_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BackMouseEntered
        PanelHome5.setBackground(clr);
    }//GEN-LAST:event_btn_BackMouseEntered

    private void btn_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BackMouseExited
        PanelHome5.setBackground(clr1);
    }//GEN-LAST:event_btn_BackMouseExited

    private void btn_AllrecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AllrecordMouseClicked
        ViewAllRecord var=new ViewAllRecord();
        var.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_AllrecordMouseClicked

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

    private void btn_EditCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditCourseMouseClicked
        EditCourse ed=new EditCourse();
        ed.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_EditCourseMouseClicked

    private void btn_EditCourseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditCourseMouseEntered
        PanelHome2.setBackground(clr);
    }//GEN-LAST:event_btn_EditCourseMouseEntered

    private void btn_EditCourseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditCourseMouseExited
        PanelHome2.setBackground(clr1);
    }//GEN-LAST:event_btn_EditCourseMouseExited

    private void btn_SearchRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchRecordMouseClicked
        SearchRecord sr=new SearchRecord();
        sr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_SearchRecordMouseClicked

    private void btn_SearchRecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchRecordMouseEntered
        PanelHome1.setBackground(clr);
    }//GEN-LAST:event_btn_SearchRecordMouseEntered

    private void btn_SearchRecordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchRecordMouseExited
        PanelHome1.setBackground(clr1);
    }//GEN-LAST:event_btn_SearchRecordMouseExited

    private void btn_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMouseClicked
        HomePage hm=new HomePage();
        hm.show();
        this.dispose();
    }//GEN-LAST:event_btn_HomeMouseClicked

    private void btn_HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMouseEntered
        PanelHome.setBackground(clr);
    }//GEN-LAST:event_btn_HomeMouseEntered

    private void btn_HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMouseExited
        PanelHome.setBackground(clr1);
    }//GEN-LAST:event_btn_HomeMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       clearTable();
        SetDataToTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       SimpleDateFormat Date_Format=new SimpleDateFormat("YYYY-MM-dd");
       String datefrom=Date_Format.format(jDateChooser2.getDate());
       String dateto=Date_Format.format(jDateChooser1.getDate());
       MessageFormat header=new MessageFormat("Report From"+datefrom+"To"+dateto);
        MessageFormat footer=new MessageFormat("page{0,number,interger}");
        try{
            Table_Data3.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       JFileChooser fileChooser=new JFileChooser();
          fileChooser.showOpenDialog(this);    
          SimpleDateFormat   dateFormat=new SimpleDateFormat("YYYY-MM-dd");
          String date=dateFormat.format(new Date());
          try{
              File f=fileChooser.getSelectedFile();
              String path=f.getAbsolutePath();
              
              path=path+"_"+date+".xlsx";
              txt_filePath.setText(path);
          }
          catch(Exception e){
          e.printStackTrace();
          }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(GenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Combo_Course;
    private javax.swing.JPanel PanelHome;
    private javax.swing.JPanel PanelHome1;
    private javax.swing.JPanel PanelHome2;
    private javax.swing.JPanel PanelHome3;
    private javax.swing.JPanel PanelHome4;
    private javax.swing.JPanel PanelHome5;
    private javax.swing.JPanel PanelHome6;
    private javax.swing.JPanel PanelSideBar;
    private javax.swing.JTable Table_Data3;
    private javax.swing.JLabel btn_Allrecord;
    private javax.swing.JLabel btn_Back;
    private javax.swing.JLabel btn_CourseList;
    private javax.swing.JLabel btn_EditCourse;
    private javax.swing.JLabel btn_Home;
    private javax.swing.JLabel btn_Logout;
    private javax.swing.JLabel btn_SearchRecord;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_amount;
    private javax.swing.JLabel lbl_course;
    private javax.swing.JLabel lbl_totalamountinwords;
    private javax.swing.JTextField txt_filePath;
    // End of variables declaration//GEN-END:variables
}
