package knowledgehb;



import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class ResetPass extends javax.swing.JFrame{
    
    connect c;
    String langident;
String username="admin";
     public ResetPass(connect c,String str) {
        
         this.langident=str;
         this.c=c;
         initComponents();
         this.setTitle("Administrator Password Reset");
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jNewPas = new javax.swing.JPasswordField();
        jLogin = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jConfirmPass = new javax.swing.JPasswordField();
        jOldPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Old Password");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("New Password");

        jNewPas.setToolTipText("Enter Password.");
        jNewPas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jNewPasKeyPressed(evt);
            }
        });

        jLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button.png"))); // NOI18N
        jLogin.setToolTipText("Submit");
        jLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLoginMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Confirm Password");

        jConfirmPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jConfirmPassKeyPressed(evt);
            }
        });

        jOldPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jOldPassKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jNewPas, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(jConfirmPass)
                                    .addComponent(jOldPass)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLogin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNewPas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLogin)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(230, 130, 300, 210);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin_login.jpeg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 710, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLoginMouseClicked
        chk();
    }//GEN-LAST:event_jLoginMouseClicked

    private void jNewPasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNewPasKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            jConfirmPass.requestFocus();
    }//GEN-LAST:event_jNewPasKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new AdminHomePage(c,langident).setVisible(true);
        
    }//GEN-LAST:event_formWindowClosing

    private void jConfirmPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jConfirmPassKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            chk();
    }//GEN-LAST:event_jConfirmPassKeyPressed

    private void jOldPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jOldPassKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            jNewPas.requestFocus();
    }//GEN-LAST:event_jOldPassKeyPressed

    private void chk(){
       // this.dispose();
      
            
      String oldpass1 = String.valueOf(jOldPass.getPassword());//jOldPass.getText();
        String newpass1 =String.valueOf(jNewPas.getPassword()); //jNewPas.getText();
        String confirmpass1= String.valueOf(jConfirmPass.getPassword());//jConfirmPass.getText();
            if( oldpass1.equals("") ||  newpass1.equals("") || confirmpass1.equals(""))
            {
                
                    JOptionPane.showMessageDialog(null, "Please fill the blanks");
                }
            else if(!newpass1.equals(confirmpass1))
                {
                        JOptionPane.showMessageDialog(null, "new password and confirm password are not same");
                       jNewPas.setText("");
                        jConfirmPass.setText("");
                            jNewPas.requestFocus();
                    }
           else
            {
              try
            {
        c.st=c.conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
  String str="select * from login where user_name='"+username+"' and password='"+oldpass1+"'";
            c.rs=c.st.executeQuery(str);
            if(c.rs.next())
            {
               String str1= "update login set password='"+newpass1+"' where user_name='"+username+"'";
                c.ps=c.conn.prepareStatement(str1);
                int i=c.ps.executeUpdate();
                if(i==1)
                {
               // JOptionPane.showMessageDialog(rootPane,"Password has been changed succesfully", );
                 JOptionPane.showMessageDialog(null,"Password has been changed succesfully","Message Box",1);
                dispose();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane,"Wrong old password");
                jOldPass.setText("");
                jNewPas.setText("");
              jConfirmPass.setText("");
               jOldPass.requestFocus();
            }
            }

        
        
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel error;
    private javax.swing.JPasswordField jConfirmPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLogin;
    private javax.swing.JPasswordField jNewPas;
    private javax.swing.JPasswordField jOldPass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
