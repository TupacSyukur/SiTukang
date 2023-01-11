/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package situkang;

import javax.swing.DefaultListModel;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class HomepageWorker extends javax.swing.JFrame {

    /**
     * Creates new form HomepageWorker
     */
    public static Worker workerHomepage;
    public ArrayList<Work> work_list = new ArrayList<Work>();
    Connection connection;
    DefaultListModel listTask = new DefaultListModel();
    public HomepageWorker() {
        initComponents();
        int id;
        double fees;
        String name;
        String category;
        int estimation;
        String description;
        Work w;
        String query = "select * from work";
        try {
            this.connection = DatabaseConnection.getConnection();
            PreparedStatement st = connection.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                id = rs.getInt(1);
                name = rs.getString(2);
                fees = rs.getDouble(3);
                category = rs.getString(4);
                estimation = rs.getInt(5);
                description = rs.getString(6);
                w = new Work(id, fees, name, category, estimation, description);
                work_list.add(w);
                listTask.addElement(w.getName());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.username_worker.setText(workerHomepage.getName());
        tasks.setModel(listTask);
    }
    
//    public void getWorker(String name) {
//        int id;
//        int phone_number;
//        String address;
//        String sex;
//        int age;
//        String expertise;
//        int fees;
//        String experience;
//        double rating;
//        String query = "'select * from worker where name="+name+"'";
//        try {
//            this.connection = DatabaseConnection.getCon();
//            PreparedStatement st = connection.prepareStatement(query);
//            ResultSet rs = st.executeQuery(query);
//            while (rs.next()) {
//                id = rs.getInt(1);
//                phone_number = rs.getInt(2);
//                address = rs.getString(3);
//                sex = rs.getString(4);
//                age = rs.getInt(5);
//                expertise = rs.getString(6);
//                fees = rs.getInt(7);
//                experience = rs.getString(8);
//                rating = rs.getDouble(9);
//                Worker w1 = new Worker(expertise, fees, experience, rating, id, name ,phone_number, address, sex, age);
//                w1.addWorkList();
//                this.w = w1;
//            }
//        } catch(SQLException e) {
//            e.printStackTrace();
//        }
//    }
    
    public String findDesc(String name) {
        String desc = "None";
//        System.out.print("Name: ");
//        System.out.println(name);
        String query = "select description from work where nameWr='"+name+"'";
        try {
            this.connection = DatabaseConnection.getConnection();
            PreparedStatement st = connection.prepareStatement(query);
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                desc = rs.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return desc;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tasks = new javax.swing.JList<>();
        desc = new javax.swing.JLabel();
        accept = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        home_button = new javax.swing.JButton();
        task_list = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        username_worker = new javax.swing.JLabel();
        profile = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Incoming Booking");

        tasks.setBorder(null);
        tasks.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                tasksValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(tasks);

        desc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        accept.setText("Accept");
        accept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceptMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(67, 67, 67));

        home_button.setBackground(new java.awt.Color(67, 67, 67));
        home_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/situkang/resource/icons8-home-page-60.png"))); // NOI18N
        home_button.setBorder(null);

        task_list.setBackground(new java.awt.Color(67, 67, 67));
        task_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/situkang/resource/icons8-bullet-list-60.png"))); // NOI18N
        task_list.setBorder(null);
        task_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                task_listMouseClicked(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Home");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Task List");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(task_list, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(home_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(task_list))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12))
        );

        jPanel3.setBackground(new java.awt.Color(255, 217, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Welcome Back");

        username_worker.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        username_worker.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username_worker.setText("<username>");

        profile.setBackground(new java.awt.Color(255, 217, 102));
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/situkang/resource/icons8-user-30.png"))); // NOI18N
        profile.setBorder(null);
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(username_worker)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profile)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(profile))
                .addGap(18, 18, 18)
                .addComponent(username_worker)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(accept)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(accept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acceptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptMouseClicked
        //Work w;
        for (Work i : work_list) {
            if (i.getName().equals(tasks.getSelectedValue())) {
                if (workerHomepage.getWork_list().isEmpty()) {
                    workerHomepage.addWorkList(i);
                    JOptionPane.showMessageDialog(null, "Success to add "+i.getName());
                } else if (workerHomepage.getWork_list().contains(i)) {
                    JOptionPane.showMessageDialog(null, "Work Already Exist!");
                } else {
                    workerHomepage.addWorkList(i);
                    JOptionPane.showMessageDialog(null, "Success to add "+i.getName());
                }
            }
            System.out.println(i.getName());
        }
        //System.out.println(workerHomepage.getWork_list().get(0).getName());
    }//GEN-LAST:event_acceptMouseClicked

    private void tasksValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_tasksValueChanged
//        String test = tasks.getSelectedValue();
//        System.out.println(test);
        String d = findDesc(tasks.getSelectedValue());
        this.desc.setText("<html>"+d+"</html>");
    }//GEN-LAST:event_tasksValueChanged

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        this.setVisible(false);
        ProfileWorker.workerProfile = workerHomepage;
        ProfileWorker p = new ProfileWorker();
        p.setVisible(true);
    }//GEN-LAST:event_profileMouseClicked

    private void task_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_task_listMouseClicked
        TaskList.workerTaskList = workerHomepage;
        TaskList ts = new TaskList();
        this.setVisible(false);
        ts.setVisible(true);
    }//GEN-LAST:event_task_listMouseClicked

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
            java.util.logging.Logger.getLogger(HomepageWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomepageWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomepageWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomepageWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomepageWorker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accept;
    private javax.swing.JLabel desc;
    private javax.swing.JButton home_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton profile;
    private javax.swing.JButton task_list;
    private javax.swing.JList<String> tasks;
    private javax.swing.JLabel username_worker;
    // End of variables declaration//GEN-END:variables
}