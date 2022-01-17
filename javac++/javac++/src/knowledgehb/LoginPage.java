package knowledgehb;


public class LoginPage extends javax.swing.JFrame {

    connect c;
    public LoginPage() {
        this.setUndecorated(true);
        initComponents();
        c=new connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        AdminButton = new javax.swing.JButton();
        OthersB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Exit");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(870, 500, 60, 30);

        AdminButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AdminButton.setForeground(new java.awt.Color(255, 255, 255));
        AdminButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logimg.png"))); // NOI18N
        AdminButton.setText("Admin");
        AdminButton.setBorderPainted(false);
        AdminButton.setContentAreaFilled(false);
        AdminButton.setFocusPainted(false);
        AdminButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AdminButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AdminButton);
        AdminButton.setBounds(370, 100, 110, 130);

        OthersB.setBackground(new java.awt.Color(51, 153, 255));
        OthersB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OthersB.setForeground(new java.awt.Color(255, 255, 255));
        OthersB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logimg.png"))); // NOI18N
        OthersB.setText("Others");
        OthersB.setBorderPainted(false);
        OthersB.setContentAreaFilled(false);
        OthersB.setFocusPainted(false);
        OthersB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OthersB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        OthersB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OthersBActionPerformed(evt);
            }
        });
        jPanel1.add(OthersB);
        OthersB.setBounds(370, 290, 110, 129);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void AdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminButtonActionPerformed
      new AdminLogin(c,evt.getActionCommand()).setVisible(true);
      this.setVisible(false);
      
    }//GEN-LAST:event_AdminButtonActionPerformed

    private void OthersBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OthersBActionPerformed
        new home(c,evt.getActionCommand()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_OthersBActionPerformed
public static void main(String arg[])
{
    new LoginPage().setVisible(true);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminButton;
    private javax.swing.JButton OthersB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
