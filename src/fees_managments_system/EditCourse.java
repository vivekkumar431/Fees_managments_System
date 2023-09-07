package fees_managments_system;
import DATABASE.DBCON;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class EditCourse extends javax.swing.JFrame {
    public EditCourse() {
        initComponents();
        SetDataToTable();
    }
        DefaultTableModel model;
       public void clearTable(){
    model=(DefaultTableModel)Table_Data1.getModel();
    model.setRowCount(0);
    }
    public void addCourse(int id,String cname,double cost){
    try{
        DBCON db=new DBCON();
        db.pstmt=db.con.prepareStatement("insert into course values(?,?,?)");
        db.pstmt.setInt(1,id);
        db.pstmt.setString(2, cname);
        db.pstmt.setDouble(3,cost);
        int i=db.pstmt.executeUpdate();
        if(i == 1){
        JOptionPane.showMessageDialog(this,"Course Add Successfully");
         clearTable();
         SetDataToTable();
        }
      else
            JOptionPane.showMessageDialog(this,"Course Not Added");
            }
    
    catch(Exception e){
        JOptionPane.showMessageDialog(this,"Course AddExcepiton Failed");
    e.printStackTrace();
    }
    }
    public void UpdateCourse(int id,String cname,double cost){
    try{
        DBCON db=new DBCON();
        db.pstmt=db.con.prepareStatement("update course set cname=?,cost=? where id=?");
        db.pstmt.setString(1, cname);
        db.pstmt.setDouble(2,cost);
        db.pstmt.setInt(3,id);
        int i=db.pstmt.executeUpdate();
        if(i == 1){
        JOptionPane.showMessageDialog(this,"Updated Successfully");
         clearTable();
         SetDataToTable();
        }
      else
            JOptionPane.showMessageDialog(this,"Course Not Updated");
            }
    
    catch(Exception e){
        JOptionPane.showMessageDialog(this,"Course UpdateExcepiton Failed");
    e.printStackTrace();
    }
    }
    public void DeleteCourse(int id){
    try{
        DBCON db=new DBCON();
        db.pstmt=db.con.prepareStatement("delete from course where id=?");
        db.pstmt.setInt(1,id);
        int i=db.pstmt.executeUpdate();
        if(i == 1){
        JOptionPane.showMessageDialog(this,"Deleted Successfully");
         clearTable();
         SetDataToTable();
        }
      else
            JOptionPane.showMessageDialog(this,"Course Not Deleted");
            }
    
    catch(Exception e){
        JOptionPane.showMessageDialog(this,"Course DeleteExcepiton Failed");
    e.printStackTrace();
    }
    }  

   public void SetDataToTable(){
   try{
       DBCON db=new DBCON();
       db.pstmt=db.con.prepareStatement("select * from course");
       db.rst=db.pstmt.executeQuery();
       while(db.rst.next()){
       String course_id=db.rst.getString("id");
       String course_name=db.rst.getString("cname");
       String course_amount=db.rst.getString("cost");
        Object[] obj={course_id,course_name,course_amount};
              model=(DefaultTableModel)Table_Data1.getModel();
                model.addRow(obj);
       }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Data1 = new javax.swing.JTable();
        txt_courseid = new javax.swing.JTextField();
        txt_coursename = new javax.swing.JTextField();
        txt_coursecost = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Back = new javax.swing.JLabel();

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

        getContentPane().add(PanelSideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 0, 370, 1000));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table_Data1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Table_Data1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course_Id", "CourseName", "Amount"
            }
        ));
        Table_Data1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_Data1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Data1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 890, 780));

        txt_courseid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txt_courseid, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 300, 60));

        txt_coursename.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txt_coursename, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 300, 60));

        txt_coursecost.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txt_coursecost, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 300, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("Coursr ID  :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 210, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 255));
        jLabel2.setText("Coursr NAME  :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 250, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 255));
        jLabel3.setText("Coursr Prices :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 250, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 255));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 650, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 255));
        jButton2.setText("   Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 650, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 255));
        jButton3.setText("   Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 650, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edit Course Details");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 360, 50));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setMinimumSize(new java.awt.Dimension(2, 2));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 360, 10));

        Back.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back-button.png"))); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 120, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 1000));

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

    private void btn_EditCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditCourseMouseClicked
    EditCourse ed=new EditCourse();
    ed.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btn_EditCourseMouseClicked

    private void Table_Data1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_Data1MouseClicked
        int rowNo=Table_Data1.getSelectedRow();
        TableModel model=Table_Data1.getModel();
        
        txt_courseid.setText(model.getValueAt(rowNo, 0).toString());
         txt_coursename.setText(model.getValueAt(rowNo, 1).toString());
         txt_coursecost.setText(model.getValueAt(rowNo, 2).toString());
       
    }//GEN-LAST:event_Table_Data1MouseClicked
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int id=Integer.parseInt(txt_courseid.getText());
        String coursename=txt_coursename.getText();
        double cost=Double.parseDouble(txt_coursecost.getText());
        addCourse(id,coursename,cost);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int id=Integer.parseInt(txt_courseid.getText());
        String coursename=txt_coursename.getText();
        double cost=Double.parseDouble(txt_coursecost.getText());
        UpdateCourse(id,coursename,cost);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      int id=Integer.parseInt(txt_courseid.getText());
      DeleteCourse(id);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
       HomePage hm=new HomePage();
       hm.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void btn_AllrecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AllrecordMouseClicked
           ViewAllRecord var=new ViewAllRecord();
       var.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btn_AllrecordMouseClicked

   
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
            java.util.logging.Logger.getLogger(EditCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JPanel PanelHome;
    private javax.swing.JPanel PanelHome1;
    private javax.swing.JPanel PanelHome2;
    private javax.swing.JPanel PanelHome3;
    private javax.swing.JPanel PanelHome4;
    private javax.swing.JPanel PanelHome5;
    private javax.swing.JPanel PanelHome6;
    private javax.swing.JPanel PanelSideBar;
    private javax.swing.JTable Table_Data1;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txt_coursecost;
    private javax.swing.JTextField txt_courseid;
    private javax.swing.JTextField txt_coursename;
    // End of variables declaration//GEN-END:variables
}
