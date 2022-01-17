package knowledgehb;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class TestQueShowAdmin extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form questionshow
     */
    connect c;
    int que[],user_ans[],last_row_id,first_row_id,h,total_rows_db,bmarkcheck[],rand,flag,indinit;
    int p,row,correct1,count=0;
    String option[];
     ButtonGroup bgroup;
    
     String langident;
    public TestQueShowAdmin(connect c,String str) {
        try {
            langident=str;
            this.c=c;
            
            p=1;
           
            
            c.ps=c.conn.prepareStatement("select questionid from `questions"+langident+"`");
            c.rs=c.ps.executeQuery();
            if(c.rs.next())
            {
                first_row_id=c.rs.getInt("questionid");
            c.rs.last();
            row=c.rs.getRow();
            last_row_id=c.rs.getInt("questionid");
            
                initComponents();
                if(c.rs.getRow()==1)
                {
                    nxt.setVisible(false);
                }
            
                if(p<=first_row_id)
                {
                    prev.setVisible(false);
                }
                setVisible(true);
                
                
                this.setLocationRelativeTo(null);
                this.setTitle(langident+" Test Questions");
                option=new String[5];
                bgroup= new ButtonGroup();
        bgroup.add(opt1);
        bgroup.add(opt2);
        bgroup.add(opt3);
        bgroup.add(opt4);
//        bgroup.add(opt5);
        opt1.setVisible(false);
        opt2.setVisible(false);
        opt3.setVisible(false);
        opt4.setVisible(false);
  //      opt5.setVisible(false);
            prev.setVisible(false);    
            //que=new int[row];
            user_ans=new int[last_row_id];
            
            bmarkcheck=new int[last_row_id];
            
            //Arrays.fill(correct_ans,42);//if this not done then: if user leaves question unattempted then:
            //correct_ans and user_Ans both will have value 0 (score will get decremented) as correct_ans gets filled(in calcscore method) when
            //some option is selected
            // above line initialises array with 42 rather than 0 avoiding above situation
            
            display("Next");
            }
            else //means zero questions to show
            {
                JOptionPane.showMessageDialog(null,"No "+langident+" Test Questions available\nAdd some Questions");
                //new AdminHomePage(c,langident).setVisible(true);
                //this.dispose();
            }
            
            
            
            
          } catch (SQLException ex) {
            Logger.getLogger(TestQueShow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
     
    private String rbmultilinedisplay(String origoption)
    {
        String st="";
        int indfinal;
         indinit=0;
         indfinal=origoption.indexOf("\n",indinit);
         //System.out.println(indinit+" "+indfinal);
  
         while(indfinal!=-1)
         {//System.out.println("before "+st);
         
         st+=origoption.substring(indinit,indfinal)+"<br>";
         origoption=origoption.substring(indfinal+1);
         
         //System.out.println("bef "+st+" left origoption "+origoption);
        // st=st.concat("<br>");
           //  System.out.println("aft "+st);
            // System.out.println(indinit +" "+indfinal);
//        indinit=indfinal+1;
        indfinal=origoption.indexOf("\n",indinit);
         }
         if(indfinal==-1)
         {
             st=st+origoption;
             //System.out.println("final "+st);
         }
         return st;
    }
    
    private void display(String nextorprev)
    {    
        try{  
            //////////////////////////////////////
            //only change done is here
            //no need of que array and que[p-1]
            ////////////////////////////////////
            c.ps=c.conn.prepareStatement("select questionscol,optionscol,correctans from `questions"+langident+"` where questionid=?");

            
          /*  if(que[p-1]==0)
            {
                duplicaycheck();     
                que[p-1]=rand;
            //c.ps.setString(1,Integer.toString(rand));
            }
            else
            {
              //means there is already a value in que[p-1] 
            }*/
            
          ////////////////////////////////////////////////////////////////////
          //instead of que[p-1] we are using p
          ////////////////////////////////////////////////////////////////////
             c.ps.setString(1,Integer.toString(p));
             System.out.println("display value p="+p);
            c.rs=c.ps.executeQuery();
           //     System.out.println("que[p-1]="+que[p-1]+" rand="+rand+" p="+p);         
            if(c.rs.next())
            {
                if(nextorprev.equals("Next"))
                {
                    count++;
                }
                else
                {
                    count--;
                }
                jTextArea1.setText("Question #"+count+" Of "+row+"\n\n");
             //   System.out.println("question "+p+" "+c.rs.getString("questionscol"));
               // System.out.println("Options " +c.rs.getString("optionscol"));
                jTextArea1.append(c.rs.getString("questionscol"));
                jTextArea1.setCaretPosition(0);
                
                String str=c.rs.getString("optionscol");
                //if options exist then only fetched
                if(!(c.rs.getString("optionscol").equals("Write options(each ending with !!)")))
                        {
                
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
    //for opt5                index_initial=index_final;
    //for opt5            index_final=str.indexOf("!!",(index_initial+3));
                }
                
               // System.out.println("opt5"+index_initial+"   "+index_final);    
            /*  for opt5  if(index_final!=-1)
                {
                    option[4]=str.substring((index_initial+3),index_final);
//                    opt5.setText("<html>"+rbmultilinedisplay(option[4])+"</html>");
                    // System.out.println("opt5"+index_initial+"   "+index_final);
  //                  opt5.setVisible(true);
                }*/
                        }
                
                ////showing correct ans
                jLabel3.setText("Correct Option is Option "+c.rs.getString("correctans"));
            }
            else
            {
                if(nextorprev.equals("Next"))
                {
                    nextbuttonlogic("Next");
                }
                else
                {
                    prevbuttonlogic("Previous");
                }
            }
           // System.out.println("display p value="+p);
        } catch (SQLException ex) {
            Logger.getLogger(TestQueShow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        prev = new javax.swing.JButton();
        nxt = new javax.swing.JButton();
        bkmark = new javax.swing.JButton();
        opt1 = new javax.swing.JRadioButton();
        opt2 = new javax.swing.JRadioButton();
        opt3 = new javax.swing.JRadioButton();
        opt4 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        prev.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        prev.setText("Previous");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });

        nxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nxt.setForeground(new java.awt.Color(255, 0, 0));
        nxt.setText("Next");
        nxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtActionPerformed(evt);
            }
        });

        bkmark.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bkmark.setForeground(new java.awt.Color(0, 0, 255));
        bkmark.setText("Bookmark");
        bkmark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkmarkActionPerformed(evt);
            }
        });

        opt1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        opt1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opt1StateChanged(evt);
            }
        });

        opt2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        opt2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opt2StateChanged(evt);
            }
        });

        opt3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        opt3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opt3StateChanged(evt);
            }
        });

        opt4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        opt4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opt4StateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Bookmarks");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(455, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("TIMER:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("REMOVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opt2)
                    .addComponent(opt4)
                    .addComponent(opt3)
                    .addComponent(opt1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(prev)
                        .addGap(172, 172, 172)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bkmark)
                                .addGap(171, 171, 171)
                                .addComponent(nxt)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(l1))
                    .addComponent(jButton1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addComponent(opt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opt2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opt3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opt4)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prev, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bkmark, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
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
//                opt5.setVisible(false);
                  bgroup.clearSelection();
                display(bt_text);
                switch (user_ans[count-1]) {//wwhen user returns back to question his answer should be there
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
            case 5:
        
//                opt5.setSelected(true);
                break;
            default:
                break;
        }
                if(p>=last_row_id)
                {
                nxt.setVisible(false);
            //    nxt.setText("Submit");
                }
                if(p>first_row_id)
                {
                 prev.setVisible(true);
                }
                if(bmarkcheck[p-1]==0)
                {
                    bkmark.setVisible(true);
                }
                else
                {
                    bkmark.setVisible(false);
                }
                System.out.println("value in next="+p);
    }
    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
        //System.out.println("user_ans[p-1]="+user_ans[p-1]+" correct_ans[p-1]="+correct_ans[p-1]+" p="+p);
        prevbuttonlogic(evt.getActionCommand());
        //System.out.println("prev p value="+p);
    }//GEN-LAST:event_prevActionPerformed

    void prevbuttonlogic(String bt_text)
    {
        p--;
        
       // System.out.println("score in prev="+correct1);
        bgroup.clearSelection();
        opt1.setVisible(false);
        opt2.setVisible(false);
        opt3.setVisible(false);
        opt4.setVisible(false);
//        opt5.setVisible(false);
        display(bt_text);
        switch (user_ans[count-1]) {//wwhen user returns back to question his answer should be there
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
            case 5:
        
//                opt5.setSelected(true);
                break;
            default:
                break;
        }
        
        
        
        if(p<=first_row_id)
        {
            prev.setVisible(false);
            //correct1--;//to remove points for first que
        }
        if(p<last_row_id)
        {
            //nxt.setText("Next");
            nxt.setVisible(true);
        }
        if(bmarkcheck[p-1]==0)
                {
                    bkmark.setVisible(true);
                }
        else
                {
                    bkmark.setVisible(false);
                }
        System.out.println("value in prev="+p);
    }
    private void bkmarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkmarkActionPerformed
          
        JButton bmarkshow=new JButton("Question ID "+p);
        
           bmarkshow.setBounds(0,30+(30*h),150,30);
             
           jPanel2.add(bmarkshow);
            // bmarkshow.setVisible(true);
           //Math.sqrt(36-45);
           bkmark.setVisible(false);
           //jPanel2.requestFocus();
             
           bmarkcheck[p-1]=1;
             
           bmarkshow.addActionListener(this);
             
           h++;
            jPanel2.setVisible(false);
            jPanel2.setVisible(true);
    }//GEN-LAST:event_bkmarkActionPerformed

    private void opt1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_opt1StateChanged
        if(opt1.isSelected())
        {
            user_ans[p-1]=1;
        }
    }//GEN-LAST:event_opt1StateChanged

    private void opt2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_opt2StateChanged
       if(opt2.isSelected())
        {
            user_ans[p-1]=2;
        } // TODO add your handling code here:
    }//GEN-LAST:event_opt2StateChanged

    private void opt3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_opt3StateChanged
       if(opt3.isSelected())
        {
            user_ans[p-1]=3;
        } // TODO add your handling code here:
    }//GEN-LAST:event_opt3StateChanged

    private void opt4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_opt4StateChanged
        if(opt4.isSelected())
        {
            user_ans[p-1]=4;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opt4StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                  int i=JOptionPane.showConfirmDialog(jPanel1,"Do you really want to Remove this Question?", "Confirmation",0);
                if(i==0)
                {
                
        try {
            c.ps=c.conn.prepareStatement("delete from `questions"+langident+"` where questionid="+p);
            if(c.ps.executeUpdate()==1)
            {
                System.out.println("question removed");
            
                if(p==first_row_id)
                {
                    c.ps=c.conn.prepareStatement("select questionid from `questions"+langident+"`");
                    c.rs=c.ps.executeQuery();
                    if(c.rs.next())
                    {
                        first_row_id=c.rs.getInt("questionid");
                    }
                }
            ///////////////////////////////////////////////////////
            //on removal of present question next question should be displayed
            ///////////////////////////////////////////////////////
            row--;
            count--;
            p++;
            if(p>last_row_id)
            {
                
                System.out.println("lastatuys");
                   JOptionPane.showMessageDialog(null,"Last Question Removed\nReOpen to see changes");
                    //new AdminHomePage(c,langident).setVisible(true);
                    this.dispose();       
            }
            else
            {   System.out.println("asdgfdagsdgda");
                p--;//this is to compensate incrementation in p
                //System.out.println("");
                nextbuttonlogic("Next");
            }
            }
        } catch (SQLException ex) {
            Logger.getLogger(TestQueShowAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
                }
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       //new AdminHomePage(c,langident).setVisible(true);
       this.dispose();
    }//GEN-LAST:event_formWindowClosing

    @Override
    public void actionPerformed(ActionEvent evt)
    {
        ((JButton)evt.getSource()).setEnabled(false);
        String btinfo=evt.getActionCommand();
        int btno=Integer.parseInt(btinfo.substring(12));
        p=btno;
        
        try {
            //System.out.println("bmaaction1");
            c.ps=c.conn.prepareStatement("select count(questionid) from `questions"+langident+"` where questionid<=?");
            c.ps.setString(1,Integer.toString(p));
            c.rs=c.ps.executeQuery();
            if(c.rs.next())
            {
                count=c.rs.getInt(1);
                //this count tells row no of bookmarked que in database
            }
        } catch (SQLException ex) {
            Logger.getLogger(TestQueShowAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        count--;
        //this done so because in display count will be incremented showing true row no of bookmarked que in database
        display("Next");
        prev.setVisible(true);
        nxt.setText("Next");
        nxt.setVisible(true);
        if(p<=first_row_id)
        {
            prev.setVisible(false);
        }
        if(p>=last_row_id)
        {
            nxt.setVisible(false);
        }
        //System.out.println("bmaction2");   
        bkmark.setVisible(false);
    }
    //////////////////self study book
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bkmark;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel l1;
    private javax.swing.JButton nxt;
    private javax.swing.JRadioButton opt1;
    private javax.swing.JRadioButton opt2;
    private javax.swing.JRadioButton opt3;
    private javax.swing.JRadioButton opt4;
    private javax.swing.JButton prev;
    // End of variables declaration//GEN-END:variables
}
