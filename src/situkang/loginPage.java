package situkang;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author afrie
 */
public class loginPage extends javax.swing.JFrame {
    Connection conn = null;
    Statement st = null;
    /**
     * Creates new form loginPage
     */
    public loginPage(java.awt.Frame parent, boolean modal) {
        initComponents();
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/situkang", "root","");
            st = conn.createStatement();
            JOptionPane.showMessageDialog(null, "Directing to Login Page");
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Failed directing to Login Page" + ex);
        }
    }
    
    private void loginCheck(){
        try {
            if (worker_login.isSelected()) {
                if(logUsername.getText().equals("")||logPassword.getPassword().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Field can't be empty", "Message",
                    JOptionPane.ERROR_MESSAGE);
                    logUsername.requestFocus();
                    closeScreen();
                } else {
                    st = conn.createStatement();
                    String sql = ("SELECT * FROM worker WHERE username = '"+logUsername.getText()
                            +"' AND password ='"+String.valueOf(logPassword.getPassword())+"'");
                    ResultSet rs = st.executeQuery(sql);
                    if(rs.next()){
                        int id = rs.getInt(1);
                        String name = rs.getString(3);
                        String pn = rs.getString(4);
                        String address = rs.getString(5);
                        HomepageWorker.workerHomepage = new Worker(
//                                rs.getString(7),
//                                rs.getDouble(8),
                                id,
                                name,
                                pn,
                                address
                        );
                        this.dispose();
                        HomepageWorker h = new HomepageWorker();
                        h.setVisible(true);
    //                    new homepage.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Username or Password Wrong\nAccount not registered", 
                                "Message", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                if(logUsername.getText().equals("")||logPassword.getPassword().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Field can't be empty", "Message",
                    JOptionPane.ERROR_MESSAGE);
                    logUsername.requestFocus();
                    closeScreen();
                } else {
                    st = conn.createStatement();
                    String sql = ("SELECT * FROM customer WHERE username = '"+logUsername.getText()
                            +"' AND password ='"+String.valueOf(logPassword.getPassword())+"'");
                    ResultSet rs = st.executeQuery(sql);
                    if (rs.next()) {
                        int id = rs.getInt(1);
                        String name = rs.getString(3);
                        String pn = rs.getString(4);
                        String address = rs.getString(5);
                        HomepageCustomer.customerHomepage = new Customer(
                                id,
                                name,
                                pn,
                                address
                        );
                        this.dispose();
                        HomepageCustomer h = new HomepageCustomer();
                        h.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Username or Password Wrong\nAccount not registered", 
                                "Message", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void closeScreen(){
        logUsername.setText("");
        logUsername.setEnabled(true);
        logPassword.setText("");
        logPassword.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        account_type = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        regPanelFIeld = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        logUsername = new javax.swing.JTextField();
        logPassword = new javax.swing.JPasswordField();
        logLoginBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        logSignupBTN = new javax.swing.JButton();
        worker_login = new javax.swing.JRadioButton();
        customer_login = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 217, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 217, 102));

        regPanelFIeld.setBackground(new java.awt.Color(255, 255, 255));
        regPanelFIeld.setPreferredSize(new java.awt.Dimension(310, 460));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setText("Username");

        logUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        logLoginBTN.setBackground(new java.awt.Color(67, 67, 67));
        logLoginBTN.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        logLoginBTN.setForeground(new java.awt.Color(255, 255, 255));
        logLoginBTN.setText("Login");
        logLoginBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logLoginBTNMouseClicked(evt);
            }
        });
        logLoginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logLoginBTNActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setText("Password");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Login");

        jLabel7.setText("Don't have an account?");

        logSignupBTN.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        logSignupBTN.setText("Sign up");
        logSignupBTN.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        logSignupBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logSignupBTNActionPerformed(evt);
            }
        });

        account_type.add(worker_login);
        worker_login.setText("Worker");

        account_type.add(customer_login);
        customer_login.setText("Customer");

        javax.swing.GroupLayout regPanelFIeldLayout = new javax.swing.GroupLayout(regPanelFIeld);
        regPanelFIeld.setLayout(regPanelFIeldLayout);
        regPanelFIeldLayout.setHorizontalGroup(
            regPanelFIeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regPanelFIeldLayout.createSequentialGroup()
                .addGroup(regPanelFIeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regPanelFIeldLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel3))
                    .addGroup(regPanelFIeldLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(regPanelFIeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(logLoginBTN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logSignupBTN)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(regPanelFIeldLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(regPanelFIeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regPanelFIeldLayout.createSequentialGroup()
                        .addGroup(regPanelFIeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(regPanelFIeldLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel5))
                            .addGroup(regPanelFIeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(regPanelFIeldLayout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(jLabel6)
                                    .addGap(30, 30, 30))
                                .addComponent(logPassword)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(regPanelFIeldLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(worker_login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customer_login)
                        .addGap(57, 57, 57))))
        );
        regPanelFIeldLayout.setVerticalGroup(
            regPanelFIeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regPanelFIeldLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(regPanelFIeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(worker_login)
                    .addComponent(customer_login))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logLoginBTN)
                .addGap(18, 18, 18)
                .addGroup(regPanelFIeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(logSignupBTN))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Welcome to");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("SiTukang");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("All in one repairing service");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("  in the palm of your hand");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(regPanelFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(jLabel1))))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(regPanelFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logLoginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logLoginBTNActionPerformed
        // TODO add your handling code here:
        loginCheck();
    }//GEN-LAST:event_logLoginBTNActionPerformed

    private void logSignupBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logSignupBTNActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new registrationPage().setVisible(true);
    }//GEN-LAST:event_logSignupBTNActionPerformed

    private void logLoginBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logLoginBTNMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logLoginBTNMouseClicked

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
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                loginPage dialog = new loginPage(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter(){
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e){
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup account_type;
    private javax.swing.JRadioButton customer_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logLoginBTN;
    private javax.swing.JPasswordField logPassword;
    private javax.swing.JButton logSignupBTN;
    private javax.swing.JTextField logUsername;
    private javax.swing.JPanel regPanelFIeld;
    private javax.swing.JRadioButton worker_login;
    // End of variables declaration//GEN-END:variables
}
