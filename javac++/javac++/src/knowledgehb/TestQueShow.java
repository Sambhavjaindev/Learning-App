package knowledgehb;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class TestQueShow extends javax.swing.JFrame implements ActionListener,Runnable{

    /**
     * Creates new form questionshow
     */
    connect c;
    int que[],user_ans[],h,total_rows_db,correct_ans[],bmarkcheck[],rand,flag,indinit;
    int p,row,correct1;
    String option[];
     ButtonGroup bgroup;
     Thread th;
     String langident;
    public TestQueShow(connect c,String str) {
        try {
            this.langident=str;
    
            this.c=c;
            p=1;
            
            
            c.ps=c.conn.prepareStatement("select questionid from `questions"+langident+"`");
            c.rs=c.ps.executeQuery();
            if(c.rs.next())
            {
                
                initComponents();
            c.rs.last();
            total_rows_db=c.rs.getInt("questionid");
            row=c.rs.getRow();//do not do row=0 as row determines no of questions in test
                if(row==1)
                {
                //System.out.println("row 1");
                nxt.setText("Submit");
                //System.out.println("row 2");
                }
            ////////you can apecify no of questions in test by changing value of row variable
            setVisible(true);
            this.setLocationRelativeTo(null);
            this.setTitle(langident+" Test");
            
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
//        opt5.setVisible(false);
            prev.setVisible(false);
                que=new int[row];
            user_ans=new int[row];
            correct_ans=new int[row];
            bmarkcheck=new int[row];
                th=new Thread(this);
                display();
                th.start();
            }
            else//row in database==0
            {
                JOptionPane.showMessageDialog(null,"No "+langident+" Test Questions available");
                 
            }
            
            
            
            
            
            
            //Arrays.fill(correct_ans,42);//if this not done then: if user leaves question unattempted then:
            //correct_ans and user_Ans both will have value 0 (score will get decremented) as correct_ans gets filled(in calcscore method) when
            //some option is selected
            // above line initialises array with 42 rather than 0 avoiding above situation
            
            
            
            /*if(row==0)
            {
                JOptionPane.showMessageDialog(null,"No Test Questions available");
                 if(langident.equals("C++"))
                    {
                        new c(c,langident).setVisible(true);
                        this.setVisible(false);
                    }
                else
                    {
                        new j(c,langident).setVisible(true);
                        this.setVisible(false);
                    }
            }
            else
            {
                //////////////////////////////////
                //yeh isliye kiya taaki hamara timer and display tabhi chale jab koi question ho 
                display();
                th.start();
            }*/
            
        } 
        catch (Exception ex) {
            Logger.getLogger(TestQueShow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run()
	{
		while(th!=null)
		{
			try
			{
			process();
			th.sleep(1000);
		//	l1.setVisible(false);
			}
			catch(Exception E)
			{
				System.out.println("error");
			}
		}	

	}
    int counta=0,countb=10,countc=30;
	void process()
	{	
		//countc--;
                 if(counta>0)
                {
                    if(countb==0)
                    {
                        counta--;
                        countb=59;
                    }
                    else
                    {
                        countb--;
                    }
                }   
            
                if(countb>0)
                {
                    if(countc==0)
                    {
                        countb--;
                        countc=59;
                    }
                    else
                    {
                        countc--;
                    }
                }
                else
                {
                    countc--;
                }
//method 1
		//l1.setVisible(true);
		l1.setText(counta+"  : "+countb+"  :  "+countc);
		//l1.setBounds(50,20,100,60);
                
                if(counta==0 && countb==0 && countc==0)
                {
                    if(this.isShowing())
                    {
                    String k="<html><b>Time Out!!</b></html>\nYou got "+correct1+" questions correct out of "+row;
                    
                JOptionPane.showMessageDialog(null,k);
                this.setVisible(false);
                    }
                }
        }
    void duplicaycheck()
    {
        try{
        int max = total_rows_db; 
        int min = 1; 
        int range = max - min + 1;
        c.ps=c.conn.prepareStatement("select questionid from `questions"+langident+"` where questionid=?");
        do
        {
        // generate random numbers within 1 to 10 
            
            flag=0;
            
            rand = (int)(Math.random() * range) + min; 
           
            
                
                
                c.ps.setString(1,Integer.toString(rand));
                c.rs=c.ps.executeQuery();
                
                if(c.rs.next())
                {System.out.println("question exists for rand="+rand);
                    for(int lr=0;lr<p-1;lr++)
                    {
                        System.out.println("entered loop");
                        if(que[lr]==rand)
                        {
                        flag=1;
                        System.out.println("repeated que");
                        break;
                        
                        }
                       
                    }
                }
                else
                {
                    flag=1;
                    System.out.println("question doesn't exists for rand="+rand);
                }
                
            
            
        } while(flag==1);
        
        System.out.println("final rand="+rand);
        }
            catch(SQLException e)
            {
                System.out.println("errror in duplicacy check "+ e.getMessage());
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
    
    private void display()
    {    
        try{          
            
           
            
            if(que[p-1]==0)
            {
                System.out.println("dupl");
                duplicaycheck();     
                que[p-1]=rand;
                System.out.println("dupl out "+rand);
            //c.ps.setString(1,Integer.toString(rand));
            }
            else
            {
              //means there is already a value in que[p-1] 
            }
    
             c.ps=c.conn.prepareStatement("select questionscol,optionscol from `questions"+langident+"` where questionid="+que[p-1]);
             //c.ps.setString(1,Integer.toString(que[p-1]));
            c.rs=c.ps.executeQuery();
           //     System.out.println("que[p-1]="+que[p-1]+" rand="+rand+" p="+p);         
            if(c.rs.next())
            {
                jTextArea1.setText("Question #"+p+" Of "+row+"\n\n");
                System.out.println("question "+p+" "+c.rs.getString("questionscol"));
                System.out.println("Options " +c.rs.getString("optionscol"));
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
                    index_initial=index_final;
                index_final=str.indexOf("!!",(index_initial+3));
                }
                
               // System.out.println("opt5"+index_initial+"   "+index_final);    
                if(index_final!=-1)
                {
                    option[4]=str.substring((index_initial+3),index_final);
//                    opt5.setText("<html>"+rbmultilinedisplay(option[4])+"</html>");
                    // System.out.println("opt5"+index_initial+"   "+index_final);
 //                   opt5.setVisible(true);
                }
                        }
            }
           // System.out.println("display p value="+p);
        } catch (Exception ex) {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        prev.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        prev.setText("Previous");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });

        nxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nxt.setForeground(new java.awt.Color(0, 0, 255));
        nxt.setText("Next");
        nxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtActionPerformed(evt);
            }
        });

        bkmark.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bkmark.setForeground(new java.awt.Color(255, 0, 0));
        bkmark.setText("Bookmark");
        bkmark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkmarkActionPerformed(evt);
            }
        });

        opt1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        opt1.setText("jRadioButton1");
        opt1.setContentAreaFilled(false);
        opt1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opt1StateChanged(evt);
            }
        });

        opt2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        opt2.setText("jRadioButton2");
        opt2.setContentAreaFilled(false);
        opt2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opt2StateChanged(evt);
            }
        });

        opt3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        opt3.setText("jRadioButton3");
        opt3.setContentAreaFilled(false);
        opt3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opt3StateChanged(evt);
            }
        });

        opt4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        opt4.setText("jRadioButton4");
        opt4.setContentAreaFilled(false);
        opt4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opt4StateChanged(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
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
                .addContainerGap(451, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("TIMER:");

        l1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(prev)
                .addGap(145, 145, 145)
                .addComponent(bkmark)
                .addGap(138, 138, 138)
                .addComponent(nxt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opt4)
                            .addComponent(opt3)
                            .addComponent(opt2)
                            .addComponent(opt1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
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
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prev)
                            .addComponent(bkmark)
                            .addComponent(nxt))))
                .addGap(52, 52, 52))
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void calcscore()
    {
            try {
               // int optno = -1;
                c.ps=c.conn.prepareStatement("select correctans from `questions"+langident+"` where questionid="+que[p-1]);
                // c.ps.setString(1,Integer.toString(que[p-1]));
                c.rs=c.ps.executeQuery();
                
                if(c.rs.next())
                {//System.out.println("1");
                   
                    //if(opt1.isSelected())
                    //{
                      //  user_ans[p-1]=1;
                        //System.out.println("Aselected");
                        //System.out.println("correct ans="+c.rs.getString("correctans"));
                        if(c.rs.getString("correctans").equals("a") || c.rs.getString("correctans").equals("A") || c.rs.getString("correctans").equals("1"))
                        {
                            //System.out.println("Amatched");
                            //correct1++;
                            correct_ans[p-1]=1;
                        }
                    //}
                    //else if(opt2.isSelected())
                    //{
                      //  user_ans[p-1]=2;
                        //System.out.println("Bselected");
                    //System.out.println("correct ans="+c.rs.getString("correctans"));
                        if(c.rs.getString("correctans").equals("b") || c.rs.getString("correctans").equals("B") || c.rs.getString("correctans").equals("2"))
                        {//System.out.println("Bmatched");
                            //correct1++;
                            correct_ans[p-1]=2;
                        }
                    //}
                    //else if(opt3.isSelected())
                    //{
                      //  user_ans[p-1]=3;
                        //System.out.println("Cselected");
                    //System.out.println("correct ans="+c.rs.getString("correctans"));
                        if(c.rs.getString("correctans").equals("c") || c.rs.getString("correctans").equals("C") || c.rs.getString("correctans").equals("3"))
                        {//System.out.println("Cmatched");
                            //correct1++;
                            correct_ans[p-1]=3;
                        }
                    //}
                    //else if(opt4.isSelected())
                    //{
                      //  user_ans[p-1]=4;
                        //System.out.println("Dselected");
                    //System.out.println("correct ans="+c.rs.getString("correctans"));
                        if(c.rs.getString("correctans").equals("d") || c.rs.getString("correctans").equals("D") || c.rs.getString("correctans").equals("4"))
                        {//System.out.println("Dmatched");
                           // correct1++;
                            correct_ans[p-1]=4;
                        }
                    //}
                    //else if(opt5.isSelected())
                    //{
                     //   user_ans[p-1]=5;
                        //System.out.println("Eselected");
                    //System.out.println("correct ans="+c.rs.getString("correctans"));
                        if(c.rs.getString("correctans").equals("e") || c.rs.getString("correctans").equals("E") || c.rs.getString("correctans").equals("5"))
                        {//System.out.println("Ematched");
                         ///   correct1++;
                            correct_ans[p-1]=5;
                        }
                    //}
                    if(correct_ans[p-1]==user_ans[p-1])
                    { 
                        correct1++;
                    }
                }
                
            } catch (Exception ex) {
                Logger.getLogger(TestQueShow.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    private void nxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtActionPerformed
       //System.out.println("user_ans[p-1]="+user_ans[p-1]+" correct_ans[p-1]="+correct_ans[p-1]+" p="+p);
         //       System.out.println("7");
                calcscore();
           //     System.out.println("8");
    
                if(evt.getActionCommand().equals("Next"))
                {
            
             //   System.out.println("score in next="+correct1);
                    p++;
                opt1.setVisible(false);
                opt2.setVisible(false);
                    opt3.setVisible(false);
                opt4.setVisible(false);
//                opt5.setVisible(false);
                  bgroup.clearSelection();
                display();
                switch (user_ans[p-1]) {//wwhen user returns back to question his answer should be there
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
                if(p==row)
                {
            //nxt.setVisible(false);
                nxt.setText("Submit");
                }
                if(p>1)
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
               // System.out.println("nxt p value="+p);
            
            
            }
            else
            {
            
                //System.out.println("score in submit="+correct1);
                String k="You got "+correct1+" questions correct out of "+row;
                int i=JOptionPane.showConfirmDialog(jPanel1,"Do you really want to Finish Test?", "Confirmation",0);
                if(i==0)
                {
                JOptionPane.showMessageDialog(null,k);
                if(langident.equals("C++"))
                {
                         new c(c,langident).setVisible(true);
                            this.setVisible(false);
                }
                else
                {
                        new j(c,langident).setVisible(true);
                        this.setVisible(false);
                }
                
                }
            
            }
       
        
    }//GEN-LAST:event_nxtActionPerformed

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
        //System.out.println("user_ans[p-1]="+user_ans[p-1]+" correct_ans[p-1]="+correct_ans[p-1]+" p="+p);
        p--;
        
       // System.out.println("score in prev="+correct1);
        bgroup.clearSelection();
        opt1.setVisible(false);
        opt2.setVisible(false);
        opt3.setVisible(false);
        opt4.setVisible(false);
//        opt5.setVisible(false);
        display();
        switch (user_ans[p-1]) {//wwhen user returns back to question his answer should be there
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
        
        if(user_ans[p-1]==correct_ans[p-1])
        {
            correct1--;
        }
        
        if(p==1)
        {
            prev.setVisible(false);
            //correct1--;//to remove points for first que
        }
        if(p<row)
        {
            nxt.setText("Next");
        }
        if(bmarkcheck[p-1]==0)
                {
                    bkmark.setVisible(true);
                }
        else
                {
                    bkmark.setVisible(false);
                }
        //System.out.println("prev p value="+p);
    }//GEN-LAST:event_prevActionPerformed

    private void bkmarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkmarkActionPerformed
          
        JButton bmarkshow=new JButton("Question "+p);
        
           bmarkshow.setBounds(0,30+(30*h),100,30);
             
           jPanel2.add(bmarkshow);
            // bmarkshow.setVisible(true);
           //Math.sqrt(36-45);
           bkmark.setVisible(false);
         //  jPanel2.requestFocus();
             
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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      if(langident.equals("C++"))
      {
           new c(c,langident).setVisible(true);
        this.setVisible(false);
      }
      else
      {
          new j(c,langident).setVisible(true);
      this.setVisible(false);
      }
    }//GEN-LAST:event_formWindowClosing

    @Override
    public void actionPerformed(ActionEvent evt)
    {
        ((JButton)evt.getSource()).setEnabled(false);
        String btinfo=evt.getActionCommand();
        int btno=Integer.parseInt(btinfo.substring(9));
        p=btno;
        //System.out.println("bmaaction1");   
        display();
        prev.setVisible(true);
        nxt.setText("Next");
        if(p==1)
        {
            prev.setVisible(false);
        }
        if(p==row)
        {
            nxt.setText("Submit");
        }
        //System.out.println("bmaction2");   
        bkmark.setVisible(false);
    }
    //////////////////self study book


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bkmark;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
