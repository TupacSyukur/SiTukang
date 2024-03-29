package Form;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author afrie
 */
public class registrationPage extends javax.swing.JFrame {
    Connection conn = null;
    Statement st = null;
    /**
     * Creates new form registrationPage
     */
    public registrationPage() {
        initComponents();
    }
    private void closeScreen(){
        regUsername.setText("");
        regName.setText("");
        regContact.setText("");
        regAddress.setText("");
        regPassword.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        regPanelFIeld = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        regUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        regName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        regContact = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        regAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        regGender = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        regPassword = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        regAccType = new javax.swing.JComboBox<>();
        regSignupBTN = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        regLoginBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 217, 102));

        regPanel.setBackground(new java.awt.Color(255, 217, 102));
        regPanel.setToolTipText("");
        regPanel.setPreferredSize(new java.awt.Dimension(390, 750));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Welcome to");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("SiTukang");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("Let's Get Started");

        jLabel4.setText("Create an account to continue");

        regPanelFIeld.setBackground(new java.awt.Color(255, 255, 255));
        regPanelFIeld.setPreferredSize(new java.awt.Dimension(310, 460));

        jLabel5.setText("Username");

        regUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel6.setText("Name");

        jLabel7.setText("Phone number");

        jLabel8.setText("Address");

        jLabel9.setText("Gender");

        regGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        regGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regGenderActionPerformed(evt);
            }
        });

        jLabel10.setText("Password");

        jLabel11.setText("Account type");

        regAccType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Worker", " " }));
        regAccType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regAccTypeActionPerformed(evt);
            }
        });

        regSignupBTN.setBackground(new java.awt.Color(67, 67, 67));
        regSignupBTN.setForeground(new java.awt.Color(255, 255, 255));
        regSignupBTN.setText("Sign up");
        regSignupBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regSignupBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout regPanelFIeldLayout = new javax.swing.GroupLayout(regPanelFIeld);
        regPanelFIeld.setLayout(regPanelFIeldLayout);
        regPanelFIeldLayout.setHorizontalGroup(
            regPanelFIeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regPanelFIeldLayout.createSequentialGroup()
                .addGroup(regPanelFIeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regPanelFIeldLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel10))
                    .addGroup(regPanelFIeldLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(regPanelFIeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(regAddress)
                            .addComponent(regContact)
                            .addComponent(regName)
                            .addComponent(regUsername)
                            .addComponent(regGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(regPassword)
                            .addComponent(regAccType, 0, 270, Short.MAX_VALUE)
                            .addGroup(regPanelFIeldLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(regPanelFIeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addGroup(regPanelFIeldLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel6))))))
                    .addGroup(regPanelFIeldLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(regSignupBTN)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        regPanelFIeldLayout.setVerticalGroup(
            regPanelFIeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regPanelFIeldLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regAccType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regSignupBTN)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel12.setText("Already have an account?");

        regLoginBTN.setBackground(new java.awt.Color(255, 217, 102));
        regLoginBTN.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        regLoginBTN.setText("Login");
        regLoginBTN.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        regLoginBTN.setBorderPainted(false);
        regLoginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regLoginBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout regPanelLayout = new javax.swing.GroupLayout(regPanel);
        regPanel.setLayout(regPanelLayout);
        regPanelLayout.setHorizontalGroup(
            regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(155, 155, 155))
            .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(regPanelFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(regPanelLayout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(regLoginBTN)))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(regPanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.CENTER, regPanelLayout.createSequentialGroup()
                            .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.CENTER))
                            .addGap(96, 96, 96))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regPanelLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(41, 41, 41)))))
        );
        regPanelLayout.setVerticalGroup(
            regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(regPanelFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(regLoginBTN))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        regPanelFIeld.getAccessibleContext().setAccessibleParent(regPanelFIeld);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(regPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(regPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regGenderActionPerformed

    private void regAccTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regAccTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regAccTypeActionPerformed

    private void regSignupBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regSignupBTNActionPerformed
        // TODO add your handling code here:
        try {
            if(regUsername.getText().equals("") || regName.getText().equals("") ||
                    regContact.getText().equals("") || regAddress.getText().equals("") || regPassword.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Form can't be empty", "Message", JOptionPane.ERROR_MESSAGE);
            closeScreen();
            } else {
//                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/situkang","root","");
                    st = conn.createStatement();
                    String save = "insert into customer(username, name, phone_number, address, password) values ('"+regUsername.getText()+"','"
                            + regName.getText()+"','"+regContact.getText()+"','"+regAddress.getText()+"','"
                            +String.valueOf(regPassword.getPassword())+"')";
                    System.out.println(save);
                    st = conn.createStatement();
                    int SA = st.executeUpdate(save);
                    JOptionPane.showMessageDialog(this, "Congratulations, your account\nhas been successfully created");
                    this.setVisible(false);
                    new loginPage(new javax.swing.JFrame(), true).setVisible(true);
            }          
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Account already exist", "Message", JOptionPane.WARNING_MESSAGE);
            closeScreen();
        }
    }//GEN-LAST:event_regSignupBTNActionPerformed

    private void regLoginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regLoginBTNActionPerformed
        // TODO add your handling code here:
        this.setVisible(true);
        new loginPage(null, true).setVisible(true);
    }//GEN-LAST:event_regLoginBTNActionPerformed

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
            java.util.logging.Logger.getLogger(registrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new registrationPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> regAccType;
    private javax.swing.JTextField regAddress;
    private javax.swing.JTextField regContact;
    private javax.swing.JComboBox<String> regGender;
    private javax.swing.JButton regLoginBTN;
    private javax.swing.JTextField regName;
    private javax.swing.JPanel regPanel;
    private javax.swing.JPanel regPanelFIeld;
    private javax.swing.JPasswordField regPassword;
    private javax.swing.JButton regSignupBTN;
    private javax.swing.JTextField regUsername;
    // End of variables declaration//GEN-END:variables
}