package knowledgehb;


import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class HotQueShowAdmin extends javax.swing.JFrame {

    /**
     * Creates new form hotquestionshow
     */
    connect c;
    int ans[],rand,flag,indinit=0,last_row_id,first_row_id,count=0;
    int p,row;
    String option[],qtype;
     ButtonGroup bgroup;
     String langident;
    public HotQueShowAdmin(connect c,String str) {
        try {
            langident=str;
            this.c=c;
            
            p=1;
            //initComponents();
           
            
           
           c.ps=c.conn.prepareStatement("select hotquestionid from `hotquestions"+langident+"`");
            c.rs=c.ps.executeQuery();
            if(c.rs.next())
            {
                first_row_id=c.rs.getInt("hotquestionid");
               // System.out.println("a");
            c.rs.last();
            row=c.rs.getRow();
            last_row_id=c.rs.getInt("hotquestionid");
             initComponents();
                if(c.rs.getRow()==1)
                {
                    nxt.setVisible(false);
                }
                setVisible(true);
              
               option=new String[5];
            bgroup= new ButtonGroup();
            bgroup.add(opt1);
            bgroup.add(opt2);
            bgroup.add(opt3);
            bgroup.add(opt4);
        
            opt1.setVisible(false);
            opt2.setVisible(false);
            opt3.setVisible(false);
            opt4.setVisible(false);
    
            prev.setVisible(false);
           // jTextArea2.setVisible(false);
            jPanel2.setVisible(false);
            
            ans=new int[last_row_id];
            display("Next");
            this.setLocationRelativeTo(null);
           this.setTitle(langident+" Hot Questions View");
            }
            else //means zero questions to show
            {
                JOptionPane.showMessageDialog(null,"No "+langident+" Hot Questions available\nAdd some Questions");
               // new AdminHomePage(c,langident).setVisible(true);
                
            }
           
            
        //    que=new int[row];
            
        } catch (SQLException ex) {
            Logger.getLogger(hotquestionshow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        showans = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        opt1 = new javax.swing.JRadioButton();
        opt2 = new javax.swing.JRadioButton();
        opt3 = new javax.swing.JRadioButton();
        opt4 = new javax.swing.JRadioButton();
        nxt = new javax.swing.JButton();
        prev = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        showans.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        showans.setForeground(new java.awt.Color(0, 0, 255));
        showans.setText("Show Answer");
        showans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showansActionPerformed(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);

        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        opt1.setBackground(new java.awt.Color(0, 0, 153));
        opt1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        opt1.setForeground(new java.awt.Color(0, 0, 153));
        opt1.setContentAreaFilled(false);
        opt1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opt1StateChanged(evt);
            }
        });

        opt2.setBackground(new java.awt.Color(0, 0, 0));
        opt2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        opt2.setForeground(new java.awt.Color(0, 0, 153));
        opt2.setContentAreaFilled(false);
        opt2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opt2StateChanged(evt);
            }
        });

        opt3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        opt3.setForeground(new java.awt.Color(0, 0, 153));
        opt3.setContentAreaFilled(false);
        opt3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opt3StateChanged(evt);
            }
        });

        opt4.setBackground(new java.awt.Color(0, 0, 153));
        opt4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        opt4.setForeground(new java.awt.Color(0, 0, 153));
        opt4.setContentAreaFilled(false);
        opt4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opt4StateChanged(evt);
            }
        });

        nxt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        nxt.setForeground(new java.awt.Color(0, 0, 153));
        nxt.setText("Next");
        nxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtActionPerformed(evt);
            }
        });

        prev.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        prev.setForeground(new java.awt.Color(0, 0, 153));
        prev.setText("Previous");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(null);

        jTextArea2.setEditable(false);
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("REMOVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opt3)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opt1))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opt4)
                            .addComponent(opt2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(prev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                        .addComponent(showans)
                        .addGap(210, 210, 210)
                        .addComponent(nxt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(opt1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(opt4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(opt2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(opt3, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nxt)
                    .addComponent(prev)
                    .addComponent(showans))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
  
    private String rbmultilinedisplay(String origoption)
    {
        String st="";
        int indfinal;
         indinit=0;
         indfinal=origoption.indexOf("\n",indinit);
         System.out.println(indinit+" "+indfinal);
  
         while(indfinal!=-1)
         {System.out.println("before "+st);
         
         st+=origoption.substring(indinit,indfinal)+"<br>";
         origoption=origoption.substring(indfinal+1);
         
         System.out.println("bef "+st+" left origoption "+origoption);
        // st=st.concat("<br>");
             System.out.println("aft "+st);
             System.out.println(indinit +" "+indfinal);
//        indinit=indfinal+1;
        indfinal=origoption.indexOf("\n",indinit);
         }
         if(indfinal==-1)
         {
             st=st+origoption;
             System.out.println("final "+st);
         }
         return st;
    }
    private void display(String prevornext)
    {
        
        try{          
            c.ps=c.conn.prepareStatement("select questionscol,optionscol,questiontype,correctans from `hotquestions"+langident+"` where hotquestionid=?");
           /* if(que[p-1]==0)
            {
                duplicaycheck();
                que[p-1]=rand;
            //c.ps.setString(1,Integer.toString(rand));
            }
            else
            {
              //means there is already a value in que[p-1]
                //useful when previous button calls display
            }*/
             c.ps.setString(1,Integer.toString(p));
            c.rs=c.ps.executeQuery();
            if(c.rs.next())
            {
                
                
                qtype=c.rs.getString("questiontype");
                switch (qtype) {
                    case "Topic":
                        showans.setVisible(false);
                        break;
                    case "Program":
                        showans.setText("Show Explanation");
                        showans.setVisible(true);
                        break;
                    case "Question":
                        showans.setText("Show Answer");
                        showans.setVisible(true);
                       
                        break;
                }
                jTextArea1.setText(qtype+"\n\n");
                System.out.println("question "+p+" "+c.rs.getString("questionscol"));
                jTextArea1.append(c.rs.getString("questionscol"));
                jTextArea1.setCaretPosition(0);
                
                //if options exist then only fetched
                if(!(c.rs.getString("optionscol").equals("Write options(each ending with !!)")))
                        {
                String str=c.rs.getString("optionscol");
                int index_initial=0;
                int index_final=str.indexOf("!!",index_initial);
                            
                //System.out.println("opt1"+index_initial+"   "+index_final);
                
                if(index_final!=-1)
                {
                     option[0]=str.substring(index_initial,index_final);
                    opt1.setText("<html>"+rbmultilinedisplay(option[0])+"</html>");
                    
                  //  System.out.println("opt1 "+index_initial+"   "+index_final);
                    
                    opt1.setVisible(true);
                    index_initial=index_final;
                index_final=str.indexOf("!!",(index_initial+3));
                }
                
                 //  System.out.println("opt2"+index_initial+"   "+index_final); 
                if(index_final!=-1)
                {
                    option[1]=str.substring((index_initial+3),index_final);
                    //opt2.setText(option[1]);
                    opt2.setText("<html>"+rbmultilinedisplay(option[1])+"</html>");
                    //System.out.println("opt2"+index_initial+"   "+index_final);
                    opt2.setVisible(true);
                    index_initial=index_final;
                index_final=str.indexOf("!!",(index_initial+3));
                }
                
               // System.out.println("opt3"+index_initial+"   "+index_final);    
                if(index_final!=-1)
                {
                    option[2]=str.substring((index_initial+3),index_final);
                    opt3.setText("<html>"+rbmultilinedisplay(option[2])+"</html>");
                    //System.out.println("opt3"+index_initial+"   "+index_final);
                    opt3.setVisible(true);
                    index_initial=index_final;
                index_final=str.indexOf("!!",(index_initial+3));
                }
                
                //System.out.println("opt4"+index_initial+"   "+index_final);    
                if(index_final!=-1)
                {
                    option[3]=str.substring((index_initial+3),index_final);
                    opt4.setText("<html>"+rbmultilinedisplay(option[3])+"</html>");
                    //System.out.println("opt4"+index_initial+"   "+index_final);
                    opt4.setVisible(true);
              //      index_initial=index_final;
              //  index_final=str.indexOf("!!",(index_initial+3));
                }
                
               // System.out.println("opt5"+index_initial+"   "+index_final);    
               /* if(index_final!=-1)
                {
                    option[4]=str.substring((index_initial+3),index_final);
                    opt5.setText("<html>"+rbmultilinedisplay(option[4])+"</html>");
                    // System.out.println("opt5"+index_initial+"   "+index_final);
                    opt5.setVisible(true);
                }*/
                        }
            }
            else
            {
                /*if(p>last_row_id)
                {
                    JOptionPane.showMessageDialog(null,"Question Removed\nReOpen to see changes");
                    new AdminHomePage(c,langident).setVisible(true);
                    this.dispose();
                }
                else
                {*/
                    if(prevornext.equals("Next"))
                    {
                    nextbuttonlogic("Next");
                    }
                    else
                    {
                        prevbuttonlogic("Previous");
                    }
                //}
            }
            System.out.println("display p value="+p);
        } catch (SQLException ex) {
            Logger.getLogger(TestQueShow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void showansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showansActionPerformed
        
        if(evt.getActionCommand().equals("Show Answer"))
        {
        try {
            c.ps=c.conn.prepareStatement("select correctans,explanation from `hotquestions"+langident+"` where hotquestionid=?");
            c.ps.setString(1,Integer.toString(p));
            c.rs=c.ps.executeQuery();
            if(c.rs.next())
            {
                jTextArea2.setText("Ans: Option "+c.rs.getString("correctans")+"\nExplanation: "+c.rs.getString("explanation"));
                jTextArea2.setCaretPosition(0);
                //jScrollPane2.setVisible(true);
        /*jTextArea2.setVisible(true);
        jScrollPane2.setVisible(true);*/
        jPanel2.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(hotquestionshow.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else if(evt.getActionCommand().equals("Show Explanation"))
        {
            System.out.println("khjhjhkjhjkhjhj");
            try {
            c.ps=c.conn.prepareStatement("select explanation from `hotquestions"+langident+"` where hotquestionid=?");
            c.ps.setString(1,Integer.toString(p));
            c.rs=c.ps.executeQuery();
            if(c.rs.next())
            { System.out.println("in show exp c.rs.nxt");
                jTextArea2.setText("Explanation: "+c.rs.getString("explanation"));
                jTextArea2.setCaretPosition(0);
                //jScrollPane2.setVisible(true);
      /* jTextArea2.setVisible(true);
        jScrollPane2.setVisible(true);*/
      jPanel2.setVisible(true);
                System.out.println("explanatio should be visible");
            }
        } catch (SQLException ex) {
            Logger.getLogger(hotquestionshow.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_showansActionPerformed

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
       prevbuttonlogic(evt.getActionCommand());
       
    }//GEN-LAST:event_prevActionPerformed

    void prevbuttonlogic(String bt_text)
    {
        p--;
      
        bgroup.clearSelection();
        opt1.setVisible(false);
        opt2.setVisible(false);
        opt3.setVisible(false);
        opt4.setVisible(false);
        
    jPanel2.setVisible(false);
        display(bt_text);
        switch (ans[p-1]) {//wwhen user returns back to question his answer should be there
            case 1:
            opt1.setSelected(true);

            break;
            case 2:

            opt2.setSelected(true);

            break;
            case 3:

            opt3.setSelected(true);

            break;
            case 4:

            opt4.setSelected(true);

            break;
           
        }

        if(p<=first_row_id)
        {
            prev.setVisible(false);
            //here was correct1--
        }
        if(p<last_row_id)
        {
            //nxt.setText("Next");
            nxt.setVisible(true);
        }
        System.out.println("prev p value="+p);
    }
    private void nxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtActionPerformed
        nextbuttonlogic(evt.getActionCommand());
    }//GEN-LAST:event_nxtActionPerformed

    void nextbuttonlogic(String bt_text)
    {
         p++;
            opt1.setVisible(false);
            opt2.setVisible(false);
            opt3.setVisible(false);
            opt4.setVisible(false);
            
            bgroup.clearSelection();
        /*    jTextArea2.setVisible(false);
            jScrollPane2.setVisible(false);*/
        jPanel2.setVisible(false);
            display(bt_text);
            
            switch (ans[p-1]) {//wwhen user returns back to question his answer should be there
            case 1:
            opt1.setSelected(true);

            break;
            case 2:

            opt2.setSelected(true);

            break;
            case 3:

            opt3.setSelected(true);

            break;
            case 4:

            opt4.setSelected(true);

            break;
           
        }
            
            if(p>=last_row_id)
            {
                nxt.setVisible(false);
                //here was nxt.setText("Submit");
            }
            if(p>first_row_id)
            {
                prev.setVisible(true);
            }
            System.out.println("nxt p value="+p);
    }
    private void opt1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_opt1StateChanged
        if(opt1.isSelected())
        {
            ans[p-1]=1;
        }
    }//GEN-LAST:event_opt1StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int i=JOptionPane.showConfirmDialog(jPanel1,"Do you really want to Remove this Question?", "Confirmation",0);
                if(i==0)
                {
                
        try {
            c.ps=c.conn.prepareStatement("delete from `hotquestions"+langident+"` where hotquestionid="+p);
            if(c.ps.executeUpdate()==1)
            {
                System.out.println("question removed");
            
                 if(p==first_row_id)
                {
                    c.ps=c.conn.prepareStatement("select hotquestionid from `hotquestions"+langident+"`");
                    c.rs=c.ps.executeQuery();
                    if(c.rs.next())
                    {
                        first_row_id=c.rs.getInt("hotquestionid");
                    }
                }
        ///////////////////////////////////////////////////////
        //on removal of present question next question should be displayed
        ///////////////////////////////////////////////////////
            p++;
            if(p>last_row_id)
            {System.out.println("lastatuys");
                    JOptionPane.showMessageDialog(null,"Question Removed\nReOpen to see changes");
                    //new AdminHomePage(c,langident).setVisible(true);
                    this.dispose();       
            }
            else
            {System.out.println("asdgfdagsdgda");
            p--;//this is to compensate incrementation in p
            nextbuttonlogic("Next");
            }
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(TestQueShowAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }   
                }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // new AdminHomePage(c,langident).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void opt4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_opt4StateChanged
        if(opt2.isSelected())
        {
            ans[p-1]=2;
        }
    }//GEN-LAST:event_opt4StateChanged

    private void opt2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_opt2StateChanged
        if(opt3.isSelected())
        {
            ans[p-1]=3;
        }
    }//GEN-LAST:event_opt2StateChanged

    private void opt3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_opt3StateChanged
        if(opt4.isSelected())
        {
            ans[p-1]=4;
        }
    }//GEN-LAST:event_opt3StateChanged

    /*public static void main(String[] args) {
        new HotQueShowAdmin("java").setVisible(true);
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton nxt;
    private javax.swing.JRadioButton opt1;
    private javax.swing.JRadioButton opt2;
    private javax.swing.JRadioButton opt3;
    private javax.swing.JRadioButton opt4;
    private javax.swing.JButton prev;
    private javax.swing.JButton showans;
    // End of variables declaration//GEN-END:variables
}
