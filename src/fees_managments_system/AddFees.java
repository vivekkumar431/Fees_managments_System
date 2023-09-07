package fees_managments_system;
import DATABASE.DBCON;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class AddFees extends javax.swing.JFrame {
    public AddFees() {
        initComponents();
        displayCashFirst();
        fillComboBox();
         int receiptNo=getReceiptNo();
          txt_Receipt.setText(Integer.toString(receiptNo));
    }
     
    public void displayCashFirst(){
      lbl_ddNo.setVisible(false);
       txt_ddNo.setVisible(false)
               ;
      lbl_chequeno.setVisible(false);
       txt_chequeno.setVisible(false);
       
         lbl_BankName.setVisible(false);
      txt_bankName.setVisible(false);
      
    }
     
    public boolean validation(){
        if(txt_RollNo.getText().equals("")){
           JOptionPane.showMessageDialog(this,"Please Enter ReceivedForm");
            return false;
        }
        if(dateChooser.getDate()== null){
         JOptionPane.showMessageDialog(this,"Please Selector Date");
            return false;
        }
           if(txt_amount.getText().equals("")||txt_amount.getText().matches("[0-9]+")== false){
         JOptionPane.showMessageDialog(this,"Please Enter AMount in number");
            return false;
        }
        if(Combo_paymentMode.getSelectedItem().toString().equalsIgnoreCase("Cheque"))
        {
            if(txt_chequeno.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter chequeNumber");
            return false;
            }
             if(txt_bankName.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter Bank Name");
            return false;
            }
        }
            if(Combo_paymentMode.getSelectedItem().toString().equalsIgnoreCase("DD"))
        {
             if(txt_ddNo.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter DDNo");
            return false;
            }
             if(txt_bankName.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter Bank Name");
            return false;
            }
        }
    if(Combo_paymentMode.getSelectedItem().toString().equalsIgnoreCase("Card"))
    {
             if(txt_bankName.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter Bank Name");
            return false;
            }
        }
            return true;
    }
    
    public void fillComboBox(){
    try{
        DBCON db=new DBCON();
        db.pstmt=db.con.prepareStatement("select * from course");
        db.rst=db.pstmt.executeQuery();
        while(db.rst.next()){
            Combo_course.addItem(db.rst.getString("cname"));
        }
    }
    catch(Exception e){
    e.printStackTrace();
    }
    }
    public int getReceiptNo(){
        int receiptNo=0;
        try{
            DBCON db=new DBCON();
            db.pstmt=db.con.prepareStatement("select max(receipt_no) from fees_details");
             db.rst=db.pstmt.executeQuery();
             if(db.rst.next()){
                 receiptNo=db.rst.getInt(1);
             }
        }
        catch(Exception e){
        e.printStackTrace();
        }
        return receiptNo+1;
    }
    
    public String inserData(){
        String status="";
    int receiptno=Integer.parseInt(txt_Receipt.getText());
     String studentname=txt_ReceivedForm1.getText();
     int rollno=Integer.parseInt(txt_RollNo.getText());
     String paymentmode=Combo_paymentMode.getSelectedItem().toString();
     String chequeno=txt_chequeno.getText();
     String bankname=txt_bankName.getText();
     String ddno=txt_ddNo.getText();
     String coursename=Combo_course.getSelectedItem().toString();
     String gstin=txt_GSTNo.getText();
     float  totalamount=Float.parseFloat(txt_total.getText());
     SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
     String date=dateFormat.format(dateChooser.getDate()); 
     float initialamount=Float.parseFloat(txt_amount.getText());
     float cgst=Float.parseFloat(txt_cgst.getText());
     float sgst=Float.parseFloat(txt_sgst.getText());
     String totalinwords=txt_mark.getText();
     String remark=txt_Remark.getText();
     int year1=Integer.parseInt(txt_year1.getText());
     int year2=Integer.parseInt(txt_year2.getText());
     try{
         DBCON db=new DBCON();
         db.pstmt=db.con.prepareStatement("insert into fees_details values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
         db.pstmt.setInt(1,receiptno);
         db.pstmt.setString(2, studentname);
         db.pstmt.setInt(3, rollno);
         db.pstmt.setString(4, paymentmode);
         db.pstmt.setString(5, chequeno);
         db.pstmt.setString(6, bankname);
         db.pstmt.setString(7, ddno);
         db.pstmt.setString(8, coursename);
         db.pstmt.setString(9, gstin);
         db.pstmt.setFloat(10, totalamount);
         db.pstmt.setString(11, date);
         db.pstmt.setFloat(12, initialamount);
         db.pstmt.setFloat(13, cgst);
         db.pstmt.setFloat(14, sgst);
         db.pstmt.setString(15, totalinwords);
         db.pstmt.setString(16, remark);
         db.pstmt.setInt(17, year1);
         db.pstmt.setInt(18, year2);
       int i=db.pstmt.executeUpdate();
         
       if(i == 1){
              status="Success";
       }
       else
           status="failed";
      
     }
     catch(Exception e){
     e.printStackTrace();
     }
     return status;
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
        PanelParent = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_ddNo = new javax.swing.JLabel();
        lbl_chequeno = new javax.swing.JLabel();
        lbl_BankName = new javax.swing.JLabel();
        txt_GSTNo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_Receipt = new javax.swing.JTextField();
        Combo_paymentMode = new javax.swing.JComboBox();
        txt_chequeno = new javax.swing.JTextField();
        txt_ddNo = new javax.swing.JTextField();
        txt_bankName = new javax.swing.JTextField();
        dateChooser = new com.toedter.calendar.JDateChooser();
        PanelChild = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_year2 = new javax.swing.JTextField();
        txt_year1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Combo_course = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_mark = new javax.swing.JTextField();
        txt_couseName = new javax.swing.JTextField();
        txt_amount = new javax.swing.JTextField();
        txt_cgst = new javax.swing.JTextField();
        txt_sgst = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txt_total = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Remark = new javax.swing.JTextArea();
        btn_Print = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_RollNo = new javax.swing.JTextField();
        txt_ReceivedForm1 = new javax.swing.JTextField();

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

        getContentPane().add(PanelSideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 1030));

        PanelParent.setBackground(new java.awt.Color(0, 153, 153));
        PanelParent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Receipt NO : SOC");
        PanelParent.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 190, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Mode Of Payment:");
        PanelParent.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 200, 40));

        lbl_ddNo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_ddNo.setText("DD no:");
        PanelParent.add(lbl_ddNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 190, 40));

        lbl_chequeno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_chequeno.setText("Cheque NO:");
        PanelParent.add(lbl_chequeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 190, 40));

        lbl_BankName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_BankName.setText("Bank Name");
        PanelParent.add(lbl_BankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 190, 40));

        txt_GSTNo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_GSTNo.setText("23456776543");
        PanelParent.add(txt_GSTNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 180, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Date :");
        PanelParent.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 70, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("GST NO:");
        PanelParent.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 120, 40));

        txt_Receipt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PanelParent.add(txt_Receipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 260, 50));

        Combo_paymentMode.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Combo_paymentMode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "DD", "Cheque", "Cash", "Card" }));
        Combo_paymentMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_paymentModeActionPerformed(evt);
            }
        });
        PanelParent.add(Combo_paymentMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 260, 50));

        txt_chequeno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PanelParent.add(txt_chequeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 260, 50));

        txt_ddNo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PanelParent.add(txt_ddNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 260, 50));

        txt_bankName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PanelParent.add(txt_bankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 260, 50));

        dateChooser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PanelParent.add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 300, 60));

        PanelChild.setBackground(new java.awt.Color(0, 153, 153));
        PanelChild.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText(" to");
        PanelChild.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 40, 40));

        jLabel10.setFont(new java.awt.Font("Bodoni MT Black", 0, 18)); // NOI18N
        jLabel10.setText("the Following paymente in the college office for the year");
        PanelChild.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 520, 30));

        txt_year2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PanelChild.add(txt_year2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, 100, 40));

        txt_year1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PanelChild.add(txt_year1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 100, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Roll NO");
        PanelChild.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 90, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Received Form Name:");
        PanelChild.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 260, 40));

        Combo_course.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Combo_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_courseActionPerformed(evt);
            }
        });
        PanelChild.add(Combo_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 260, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Recever Signature");
        PanelChild.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 540, 250, -1));

        jSeparator1.setForeground(java.awt.Color.black);
        PanelChild.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 1210, 10));

        jSeparator2.setForeground(java.awt.Color.black);
        PanelChild.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 1210, 10));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Course");
        PanelChild.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 90, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Remark :");
        PanelChild.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 140, 50));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("Head");
        PanelChild.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 90, 50));

        txt_mark.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PanelChild.add(txt_mark, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 490, 50));

        txt_couseName.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        PanelChild.add(txt_couseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 240, 50));

        txt_amount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_amountActionPerformed(evt);
            }
        });
        PanelChild.add(txt_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 250, 260, 40));

        txt_cgst.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PanelChild.add(txt_cgst, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 260, 40));

        txt_sgst.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PanelChild.add(txt_sgst, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, 260, 40));

        jSeparator3.setForeground(java.awt.Color.black);
        PanelChild.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, 270, -1));

        txt_total.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PanelChild.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 260, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Sr NO");
        PanelChild.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 90, 50));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setText("SGST 9%");
        PanelChild.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 120, 50));

        jSeparator4.setForeground(java.awt.Color.black);
        PanelChild.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 540, 270, 10));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setText("Amount");
        PanelChild.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, 90, 50));

        txt_Remark.setColumns(20);
        txt_Remark.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txt_Remark.setRows(5);
        jScrollPane1.setViewportView(txt_Remark);

        PanelChild.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 360, 90));

        btn_Print.setBackground(new java.awt.Color(204, 204, 255));
        btn_Print.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Print.setText("Print");
        btn_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PrintActionPerformed(evt);
            }
        });
        PanelChild.add(btn_Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 610, 120, 50));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setText("Total In Mark :");
        PanelChild.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 160, 50));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setText("CGST 9%");
        PanelChild.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 160, 50));

        txt_RollNo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PanelChild.add(txt_RollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 260, 50));

        txt_ReceivedForm1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PanelChild.add(txt_ReceivedForm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 260, 50));

        PanelParent.add(PanelChild, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 1330, 690));

        getContentPane().add(PanelParent, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 1650, 1030));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  Color clr=new Color(0,153,153);
  Color clr1=new Color(0,103,103);
    private void btn_HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMouseEntered
    PanelHome.setBackground(clr);
    }//GEN-LAST:event_btn_HomeMouseEntered

    private void btn_HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMouseExited
        PanelHome.setBackground(clr1);
    }//GEN-LAST:event_btn_HomeMouseExited

    private void btn_SearchRecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchRecordMouseEntered
       PanelHome1.setBackground(clr);
    }//GEN-LAST:event_btn_SearchRecordMouseEntered

    private void btn_SearchRecordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchRecordMouseExited
        PanelHome1.setBackground(clr1);
    }//GEN-LAST:event_btn_SearchRecordMouseExited

    private void btn_EditCourseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditCourseMouseEntered
       PanelHome2.setBackground(clr);
    }//GEN-LAST:event_btn_EditCourseMouseEntered

    private void btn_EditCourseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditCourseMouseExited
     PanelHome2.setBackground(clr1);
    }//GEN-LAST:event_btn_EditCourseMouseExited

    private void btn_CourseListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CourseListMouseEntered
       PanelHome3.setBackground(clr);
    }//GEN-LAST:event_btn_CourseListMouseEntered

    private void btn_CourseListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CourseListMouseExited
       PanelHome3.setBackground(clr1);
    }//GEN-LAST:event_btn_CourseListMouseExited

    private void btn_AllrecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AllrecordMouseEntered
           PanelHome4.setBackground(clr);
    }//GEN-LAST:event_btn_AllrecordMouseEntered

    private void btn_AllrecordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AllrecordMouseExited
        PanelHome4.setBackground(clr1);
    }//GEN-LAST:event_btn_AllrecordMouseExited

    private void btn_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BackMouseEntered
       PanelHome5.setBackground(clr);
    }//GEN-LAST:event_btn_BackMouseEntered

    private void btn_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BackMouseExited
       PanelHome5.setBackground(clr1);
    }//GEN-LAST:event_btn_BackMouseExited

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

    private void btn_LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogoutMouseClicked
         Login l=new Login();
         l.show();
         this.dispose();
    }//GEN-LAST:event_btn_LogoutMouseClicked

    private void Combo_paymentModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_paymentModeActionPerformed
             if(Combo_paymentMode.getSelectedIndex() == 1){
                lbl_ddNo.setVisible(true);
                txt_ddNo.setVisible(true);
                 lbl_chequeno.setVisible(false);
                txt_chequeno.setVisible(false);
                lbl_BankName.setVisible(true);
                txt_bankName.setVisible(true);
             }
             else if(Combo_paymentMode.getSelectedIndex() == 2){
              lbl_ddNo.setVisible(false);
                txt_ddNo.setVisible(false);
                 lbl_chequeno.setVisible(true);
                txt_chequeno.setVisible(true);
                lbl_BankName.setVisible(true);
                txt_bankName.setVisible(true);
             }
                else if(Combo_paymentMode.getSelectedIndex() == 4){
              lbl_ddNo.setVisible(false);
                txt_ddNo.setVisible(false);
                 lbl_chequeno.setVisible(false);
                txt_chequeno.setVisible(false);
                lbl_BankName.setVisible(true);
                txt_bankName.setVisible(true);
             }
                else 
                      displayCashFirst(); 
    }//GEN-LAST:event_Combo_paymentModeActionPerformed

    private void btn_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PrintActionPerformed
       if(validation()== true){
           String result=inserData();
             if(result.equals("Success")){
              JOptionPane.showMessageDialog(this,"Record inserted Successfully");
              Print_Receipt pr=new Print_Receipt();
              pr.show();
              this.dispose();
                  }
       else
             JOptionPane.showMessageDialog(this,"Record Not inserted Successfully");
       }
    }//GEN-LAST:event_btn_PrintActionPerformed

    private void txt_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_amountActionPerformed
        float amount=Float.parseFloat(txt_amount.getText());
        float cgst=(amount*(0.09F));
        float sgst=(amount*(0.09F));
        txt_cgst.setText(Float.toString(cgst));
        txt_sgst.setText(String.valueOf(sgst));
        float total=amount+cgst+sgst;
        txt_total.setText(String.valueOf(total));
        txt_mark.setText(NumTOWordConverter.convert((int)total)+" only");
    }//GEN-LAST:event_txt_amountActionPerformed

    private void Combo_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_courseActionPerformed
        txt_couseName.setText(Combo_course.getSelectedItem().toString());
    }//GEN-LAST:event_Combo_courseActionPerformed

    private void btn_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMouseClicked
        HomePage hm=new HomePage();
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
            java.util.logging.Logger.getLogger(AddFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Combo_course;
    private javax.swing.JComboBox Combo_paymentMode;
    private javax.swing.JPanel PanelChild;
    private javax.swing.JPanel PanelHome;
    private javax.swing.JPanel PanelHome1;
    private javax.swing.JPanel PanelHome2;
    private javax.swing.JPanel PanelHome3;
    private javax.swing.JPanel PanelHome4;
    private javax.swing.JPanel PanelHome5;
    private javax.swing.JPanel PanelHome6;
    private javax.swing.JPanel PanelParent;
    private javax.swing.JPanel PanelSideBar;
    private javax.swing.JLabel btn_Allrecord;
    private javax.swing.JLabel btn_Back;
    private javax.swing.JLabel btn_CourseList;
    private javax.swing.JLabel btn_EditCourse;
    private javax.swing.JLabel btn_Home;
    private javax.swing.JLabel btn_Logout;
    private javax.swing.JButton btn_Print;
    private javax.swing.JLabel btn_SearchRecord;
    private com.toedter.calendar.JDateChooser dateChooser;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbl_BankName;
    private javax.swing.JLabel lbl_chequeno;
    private javax.swing.JLabel lbl_ddNo;
    private javax.swing.JLabel txt_GSTNo;
    private javax.swing.JTextField txt_Receipt;
    private javax.swing.JTextField txt_ReceivedForm1;
    private javax.swing.JTextArea txt_Remark;
    private javax.swing.JTextField txt_RollNo;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_bankName;
    private javax.swing.JTextField txt_cgst;
    private javax.swing.JTextField txt_chequeno;
    private javax.swing.JTextField txt_couseName;
    private javax.swing.JTextField txt_ddNo;
    private javax.swing.JTextField txt_mark;
    private javax.swing.JTextField txt_sgst;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_year1;
    private javax.swing.JTextField txt_year2;
    // End of variables declaration//GEN-END:variables
}
