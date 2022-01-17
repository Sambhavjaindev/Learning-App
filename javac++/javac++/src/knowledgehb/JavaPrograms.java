package knowledgehb;


public class JavaPrograms extends javax.swing.JFrame {

   connect c;
    public JavaPrograms(connect c) {
        initComponents();
        this.c=c;
        this.setLocationRelativeTo(null);
        this.setTitle("Java Programs");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpl1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtpn1 = new javax.swing.JTextPane();
        jpl2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxt1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HOT QUESTIONS");
        setFont(new java.awt.Font("Centaur", 3, 18)); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jpl1.setBackground(new java.awt.Color(255, 153, 204));
        jpl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Prime No");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("Vowel In a String");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setText(" Flyod's Triangle");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 255));
        jButton4.setText("Simple Calculator");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 153, 255));
        jButton5.setText("calculator");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 255));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 255));
        jButton6.setText("String is Anagram");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(204, 204, 255));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 255));
        jButton8.setText("Exception Handling");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(204, 204, 255));
        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 255));
        jButton10.setText("Singly Linked List");
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(204, 204, 255));
        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 255));
        jButton11.setText("Insertion sort");
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(204, 204, 255));
        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 0, 255));
        jButton12.setText("Binary search");
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 255));
        jButton7.setText("Wrapper Classes");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jtpn1);

        javax.swing.GroupLayout jpl2Layout = new javax.swing.GroupLayout(jpl2);
        jpl2.setLayout(jpl2Layout);
        jpl2Layout.setHorizontalGroup(
            jpl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpl2Layout.setVerticalGroup(
            jpl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton9.setBackground(new java.awt.Color(204, 204, 255));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 255));
        jButton9.setText("Threading");
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(204, 204, 255));
        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 0, 255));
        jButton13.setText("Multithreading ");
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(204, 204, 255));
        jButton14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 0, 255));
        jButton14.setText(" Collections Example");
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(204, 204, 255));
        jButton15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 0, 255));
        jButton15.setText("Regular Expression");
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(204, 204, 255));
        jButton16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 0, 255));
        jButton16.setText("Generics ");
        jButton16.setBorderPainted(false);
        jButton16.setContentAreaFilled(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(204, 204, 255));
        jButton17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(0, 0, 255));
        jButton17.setText("JDBC Connectivity");
        jButton17.setBorderPainted(false);
        jButton17.setContentAreaFilled(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpl1Layout = new javax.swing.GroupLayout(jpl1);
        jpl1.setLayout(jpl1Layout);
        jpl1Layout.setHorizontalGroup(
            jpl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpl1Layout.createSequentialGroup()
                .addGroup(jpl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpl1Layout.createSequentialGroup()
                        .addGroup(jpl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpl1Layout.setVerticalGroup(
            jpl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpl1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpl1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setForeground(new java.awt.Color(153, 153, 255));
        jPanel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

        jtxt1.setEditable(false);
        jtxt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 3));
        jtxt1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtxt1.setForeground(new java.awt.Color(0, 51, 153));
        jtxt1.setText("*****************WELCOME TO JAVA PROGRAMS*****************");
        jScrollPane1.setViewportView(jtxt1);
        jtxt1.getAccessibleContext().setAccessibleParent(jScrollPane2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpl1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     jButton1.setContentAreaFilled(true);
jButton2.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);
jButton12.setContentAreaFilled(false);
        jtxt1.setText("import java.util.Scanner;\n" +
"class PrimeCheck\n" +
"{\n" +
"   public static void main(String args[])\n" +
"   {		\n" +
"	int temp;\n" +
"	boolean isPrime=true;\n" +
"	Scanner scan= new Scanner(System.in);\n" +
"	System.out.println(\"Enter any number:\");\n" +
"	//capture the input in an integer\n" +
"	int num=scan.nextInt();\n" +
"        scan.close();\n" +
"	for(int i=2;i<=num/2;i++)\n" +
"	{\n" +
"           temp=num%i;\n" +
"	   if(temp==0)\n" +
"	   {\n" +
"	      isPrime=false;\n" +
"	      break;\n" +
"	   }\n" +
"	}\n" +
"	//If isPrime is true then the number is prime else not\n" +
"	if(isPrime)\n" +
"	   System.out.println(num + \" is a Prime Number\");\n" +
"	else\n" +
"	   System.out.println(num + \" is not a Prime Number\");\n" +
"   }\n" +
"}");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
jButton2.setContentAreaFilled(true);
jButton1.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);
jButton12.setContentAreaFilled(false);
        jtxt1.setText("class VowelsInaString\n" +
"{\n" +
"	public static void main(String[ ] arg)\n" +
"	{\n" +
"	String s;\n" +
"	char ch;\n" +
"	int i=0;\n" +
"	Scanner sc=new Scanner(System.in);\n" +
"	System.out.print(\"Enter a string : \");\n" +
"	s=sc.nextLine();	\n" +
"	System.out.println(\"Vowels in a string are\"); \n" +
"	for(int j=0;j<s.length();j++)\n" +
"	{\n" +
"	ch=s.charAt(j);	\n" +
"	switch(ch)\n" +
"	{\n" +
"	 case  'a' :\n" +
"	 case 'e'  :\n" +
"	 case 'i'   :\n" +
"	 case 'o'  :\n" +
"	 case 'u'  :\n" +
"	 case  'A' :\n" +
"	 case 'E'  :\n" +
"	 case 'I'   :\n" +
"	 case 'O'  :	\n" +
"	 case 'U'  :i=1;\n" +
"		System.out.println(ch); 			 \n" +
"	}	\n" +
"	}\n" +
"	if(i==0)\n" +
"		System.out.println(\"There are no vowels in a string\"); \n" +
"	\n" +
"	}\n" +
"}")   ;    
        jtxt1.setCaretPosition(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     jButton3.setContentAreaFilled(true);
jButton1.setContentAreaFilled(false);
jButton2.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);
jButton12.setContentAreaFilled(false);
        jtxt1.setText("This program will prompt user for number of rows and based on the input, it would print the Floyd’s triangle having the same number of rows.\n" +
"public class Pattern {\n" +
"    public static void main(String[] args) {\n" +
"        int rows = 4, number = 1;\n" +
"        for(int i = 1; i <= rows; i++) {\n" +
"            for(int j = 1; j <= i; j++) {\n" +
"                System.out.print(number + \" \");\n" +
"                ++number;\n" +
"            }\n" +
"            System.out.println();\n" +
"        }\n" +
"    }\n" +
"}");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setContentAreaFilled(true);
jButton1.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton2.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);
jButton12.setContentAreaFilled(false);
        jtxt1.setText("The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that normal flow of the application can be maintained.Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.Let's see an example of Java Exception Handling where we using a try-catch statement to handle the exception.\n" +
"\n" +
"public class JavaExceptionExample{  \n" +
"  public static void main(String args[]){  \n" +
"   try{  \n" +
"      //code that may raise exception  \n" +
"      int data=100/0;  \n" +
"   }catch(ArithmeticException e){System.out.println(e);}  \n" +
"   //rest code of the program   \n" +
"   System.out.println(\"rest of the code...\");  \n" +
"  }  \n" +
"}  \n"
                + "Output:\n" +
"\n" +
"Exception in thread main java.lang.ArithmeticException:/ by zero\n" +
"rest of the code...");
        jtxt1.setCaretPosition(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton10.setContentAreaFilled(true);
jButton1.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton2.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);
jButton12.setContentAreaFilled(false);
        jtxt1.setText("public class SinglyLinkedList {    \n" +
"    //Represent a node of the singly linked list    \n" +
"    class Node{    \n" +
"        int data;    \n" +
"        Node next;    \n" +
"            \n" +
"        public Node(int data) {    \n" +
"            this.data = data;    \n" +
"            this.next = null;    \n" +
"        }    \n" +
"    }    \n" +
"     \n" +
"    //Represent the head and tail of the singly linked list    \n" +
"    public Node head = null;    \n" +
"    public Node tail = null;    \n" +
"        \n" +
"    //addNode() will add a new node to the list    \n" +
"    public void addNode(int data) {    \n" +
"        //Create a new node    \n" +
"        Node newNode = new Node(data);    \n" +
"            \n" +
"        //Checks if the list is empty    \n" +
"        if(head == null) {    \n" +
"            //If list is empty, both head and tail will point to new node    \n" +
"            head = newNode;    \n" +
"            tail = newNode;    \n" +
"        }    \n" +
"        else {    \n" +
"            //newNode will be added after tail such that tail's next will point to newNode    \n" +
"            tail.next = newNode;    \n" +
"            //newNode will become new tail of the list    \n" +
"            tail = newNode;    \n" +
"        }    \n" +
"    }    \n" +
"        \n" +
"    //display() will display all the nodes present in the list    \n" +
"    public void display() {    \n" +
"        //Node current will point to head    \n" +
"        Node current = head;    \n" +
"            \n" +
"        if(head == null) {    \n" +
"            System.out.println(\"List is empty\");    \n" +
"            return;    \n" +
"        }    \n" +
"        System.out.println(\"Nodes of singly linked list: \");    \n" +
"        while(current != null) {    \n" +
"            //Prints each node by incrementing pointer    \n" +
"            System.out.print(current.data + \" \");    \n" +
"            current = current.next;    \n" +
"        }    \n" +
"        System.out.println();    \n" +
"    }    \n" +
"        \n" +
"    public static void main(String[] args) {    \n" +
"            \n" +
"        SinglyLinkedList sList = new SinglyLinkedList();    \n" +
"            \n" +
"        //Add nodes to the list    \n" +
"        sList.addNode(1);    \n" +
"        sList.addNode(2);    \n" +
"        sList.addNode(3);    \n" +
"        sList.addNode(4);    \n" +
"            \n" +
"        //Displays the nodes present in the list    \n" +
"        sList.display();    \n" +
"    }    \n" +
"}    ");
        jtxt1.setCaretPosition(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
jButton11.setContentAreaFilled(true);
jButton1.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton2.setContentAreaFilled(false);
jButton12.setContentAreaFilled(false);
        jtxt1.setText("public class InsertionSortExample {  \n" +
"    public static void insertionSort(int array[]) {  \n" +
"        int n = array.length;  \n" +
"        for (int j = 1; j < n; j++) {  \n" +
"            int key = array[j];  \n" +
"            int i = j-1;  \n" +
"            while ( (i > -1) && ( array [i] > key ) ) {  \n" +
"                array [i+1] = array [i];  \n" +
"                i--;  \n" +
"            }  \n" +
"            array[i+1] = key;  \n" +
"        }  \n" +
"    }  \n" +
"       \n" +
"    public static void main(String a[]){    \n" +
"        int[] arr1 = {9,14,3,2,43,11,58,22};    \n" +
"        System.out.println(\"Before Insertion Sort\");    \n" +
"        for(int i:arr1){    \n" +
"            System.out.print(i+\" \");    \n" +
"        }    \n" +
"        System.out.println();    \n" +
"            \n" +
"        insertionSort(arr1);//sorting array using insertion sort    \n" +
"           \n" +
"        System.out.println(\"After Insertion Sort\");    \n" +
"        for(int i:arr1){    \n" +
"            System.out.print(i+\" \");    \n" +
"        }    \n" +
"    }    \n" +
"}    ");       
        jtxt1.setCaretPosition(0);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       jButton12.setContentAreaFilled(true);
jButton1.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);
jButton2.setContentAreaFilled(false);
        jtxt1.setText("class BinarySearchExample{  \n" +
" public static void binarySearch(int arr[], int first, int last, int key){  \n" +
"   int mid = (first + last)/2;  \n" +
"   while( first <= last ){  \n" +
"      if ( arr[mid] < key ){  \n" +
"        first = mid + 1;     \n" +
"      }else if ( arr[mid] == key ){  \n" +
"        System.out.println(\"Element is found at index: \" + mid);  \n" +
"        break;  \n" +
"      }else{  \n" +
"         last = mid - 1;  \n" +
"      }  \n" +
"      mid = (first + last)/2;  \n" +
"   }  \n" +
"   if ( first > last ){  \n" +
"      System.out.println(\"Element is not found!\");  \n" +
"   }  \n" +
" }  \n" +
" public static void main(String args[]){  \n" +
"        int arr[] = {10,20,30,40,50};  \n" +
"        int key = 30;  \n" +
"        int last=arr.length-1;  \n" +
"        binarySearch(arr,0,last,key);     \n" +
" }  \n" +
"}  ");
        jtxt1.setCaretPosition(0);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      jButton5.setContentAreaFilled(true);
jButton1.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton2.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);
jButton12.setContentAreaFilled(false);
        jtxt1.setText("import java.util.Scanner;\n" +
"public class Calculator {\n" +
"    public static void main(String[] args) {\n" +
"        Scanner reader = new Scanner(System.in);\n" +
"        System.out.print(\"Enter two numbers: \");\n" +
"        // nextDouble() reads the next double from the keyboard\n" +
"        double first = reader.nextDouble();\n" +
"        double second = reader.nextDouble();\n" +
"        System.out.print(\"Enter an operator (+, -, *, /): \");\n" +
"        char operator = reader.next().charAt(0);\n" +
"        double result;\n" +
"        switch(operator)\n" +
"        {\n" +
"            case '+':\n" +
"                result = first + second;\n" +
"                break;\n" +
"            case '-':\n" +
"                result = first - second;\n" +
"                break;\n" +
"            case '*':\n" +
"                result = first * second;\n" +
"                break;\n" +
"            case '/':\n" +
"                result = first / second;\n" +
"                break;\n" +
"            // operator doesn't match any case constant (+, -, *, /)\n" +
"            default:\n" +
"                System.out.printf(\"Error! operator is not correct\");\n" +
"                return;\n" +
"        }\n" +
"        System.out.printf(\"%.1f %c %.1f = %.1f\", first, operator, second, result);\n" +
"    }\n" +
"}");
        jtxt1.setCaretPosition(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
jButton4.setContentAreaFilled(true);
jButton1.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton2.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);
jButton12.setContentAreaFilled(false);
        jtxt1.setText("In this Program we are making a simple calculator that performs addition, subtraction, multiplication and division based on the user input. The program takes the value of both the numbers (entered by user) and then user is asked to enter the operation (+, -, * and /), based on the input program performs the selected operation on the entered numbers using switch case.\n" +
"Example: Program to make a calculator using switch case in Java\n" +
"import java.util.Scanner;\n" +
"\n" +
"public class JavaExample {\n" +
"\n" +
"    public static void main(String[] args) {\n" +
"\n" +
"    	double num1, num2;\n" +
"        Scanner scanner = new Scanner(System.in);\n" +
"        System.out.print(\"Enter first number:\");\n" +
"\n" +
"        /* We are using data type double so that user\n" +
"         * can enter integer as well as floating point\n" +
"         * value\n" +
"         */\n" +
"        num1 = scanner.nextDouble();\n" +
"        System.out.print(\"Enter second number:\");\n" +
"        num2 = scanner.nextDouble();\n" +
"\n" +
"        System.out.print(\"Enter an operator (+, -, *, /): \");\n" +
"        char operator = scanner.next().charAt(0);\n" +
"\n" +
"        scanner.close();\n" +
"        double output;\n" +
"\n" +
"        switch(operator)\n" +
"        {\n" +
"            case '+':\n" +
"            	output = num1 + num2;\n" +
"                break;\n" +
"\n" +
"            case '-':\n" +
"            	output = num1 - num2;\n" +
"                break;\n" +
"\n" +
"            case '*':\n" +
"            	output = num1 * num2;\n" +
"                break;\n" +
"\n" +
"            case '/':\n" +
"            	output = num1 / num2;\n" +
"                break;\n" +
"\n" +
"            /* If user enters any other operator or char apart from\n" +
"             * +, -, * and /, then display an error message to user\n" +
"             * \n" +
"             */\n" +
"            default:\n" +
"                System.out.printf(\"You have entered wrong operator\");\n" +
"                return;\n" +
"        }\n" +
"\n" +
"        System.out.println(num1+\" \"+operator+\" \"+num2+\": \"+output);\n" +
"    }\n" +
"}");        
        jtxt1.setCaretPosition(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
jButton6.setContentAreaFilled(true);
jButton1.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton2.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);
jButton12.setContentAreaFilled(false);
        jtxt1.setText("Two string will be anagram to each other if and only if they contain the same number of characters, order of the characters doesn't matter. That is, if two strings are anagram to each other, then one string can be rearranged to form the other string. For Example:\n" +
"\n" +
"abc and cba are anagram.\n" +
"creative and reactive are also anagram\n" +
"Following Java program shows how to check for anagram\n" +
"import java.util.Arrays;  \n" +
"public class Anagram {  \n" +
"    public static void main (String [] args) {  \n" +
"        String str1=\"Brag\";  \n" +
"        String str2=\"Grab\";  \n" +
"  \n" +
"        //Converting both the string to lower case.  \n" +
"        str1 = str1.toLowerCase();  \n" +
"        str2 = str2.toLowerCase();  \n" +
"  \n" +
"        //Checking for the length of strings  \n" +
"        if (str1.length() != str2.length()) {  \n" +
"            System.out.println(\"Both the strings are not anagram\");  \n" +
"        }  \n" +
"        else {  \n" +
"            //Converting both the arrays to character array  \n" +
"            char[] string1 = str1.toCharArray();  \n" +
"            char[] string2 = str2.toCharArray();  \n" +
"  \n" +
"            //Sorting the arrays using in-built function sort ()  \n" +
"            Arrays.sort(string1);  \n" +
"            Arrays.sort(string2);  \n" +
"  \n" +
"            //Comparing both the arrays using in-built function equals ()  \n" +
"            if(Arrays.equals(string1, string2) == true) {  \n" +
"                System.out.println(\"Both the strings are anagram\");  \n" +
"            }  \n" +
"            else {  \n" +
"                System.out.println(\"Both the strings are not anagram\");  \n" +
"            }  \n" +
"        }  \n" +
"    }  \n" +
"}   ");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
jButton7.setContentAreaFilled(true);
jButton1.setContentAreaFilled(false);
jButton2.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);
jButton12.setContentAreaFilled(false);
        jtxt1.setText("The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.\n" +
"\n" +
"Since J2SE 5.0, autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically. The automatic conversion of primitive into an object is known as autoboxing and vice-versa unboxing.Java Program to convert all primitives into its corresponding   \n" +
"//wrapper objects and vice-versa  \n" +
"public class WrapperExample3{  \n" +
"public static void main(String args[]){  \n" +
"byte b=10;  \n" +
"short s=20;  \n" +
"int i=30;  \n" +
"long l=40;  \n" +
"float f=50.0F;  \n" +
"double d=60.0D;  \n" +
"char c='a';  \n" +
"boolean b2=true;  \n" +
"  \n" +
"//Autoboxing: Converting primitives into objects  \n" +
"Byte byteobj=b;  \n" +
"Short shortobj=s;  \n" +
"Integer intobj=i;  \n" +
"Long longobj=l;  \n" +
"Float floatobj=f;  \n" +
"Double doubleobj=d;  \n" +
"Character charobj=c;  \n" +
"Boolean boolobj=b2;  \n" +
"  \n" +
"//Printing objects  \n" +
"System.out.println(\"---Printing object values---\");  \n" +
"System.out.println(\"Byte object: \"+byteobj);  \n" +
"System.out.println(\"Short object: \"+shortobj);  \n" +
"System.out.println(\"Integer object: \"+intobj);  \n" +
"System.out.println(\"Long object: \"+longobj);  \n" +
"System.out.println(\"Float object: \"+floatobj);  \n" +
"System.out.println(\"Double object: \"+doubleobj);  \n" +
"System.out.println(\"Character object: \"+charobj);  \n" +
"System.out.println(\"Boolean object: \"+boolobj);  \n" +
"  \n" +
"//Unboxing: Converting Objects to Primitives  \n" +
"byte bytevalue=byteobj;  \n" +
"short shortvalue=shortobj;  \n" +
"int intvalue=intobj;  \n" +
"long longvalue=longobj;  \n" +
"float floatvalue=floatobj;  \n" +
"double doublevalue=doubleobj;  \n" +
"char charvalue=charobj;  \n" +
"boolean boolvalue=boolobj;  \n" +
"  \n" +
"//Printing primitives  \n" +
"System.out.println(\"---Printing primitive values---\");  \n" +
"System.out.println(\"byte value: \"+bytevalue);  \n" +
"System.out.println(\"short value: \"+shortvalue);  \n" +
"System.out.println(\"int value: \"+intvalue);  \n" +
"System.out.println(\"long value: \"+longvalue);  \n" +
"System.out.println(\"float value: \"+floatvalue);  \n" +
"System.out.println(\"double value: \"+doublevalue);  \n" +
"System.out.println(\"char value: \"+charvalue);  \n" +
"System.out.println(\"boolean value: \"+boolvalue);  \n" +
"}}  \n" +
"Output:\n" +
"\n" +
"---Printing object values---\n" +
"Byte object: 10\n" +
"Short object: 20\n" +
"Integer object: 30\n" +
"Long object: 40\n" +
"Float object: 50.0\n" +
"Double object: 60.0\n" +
"Character object: a\n" +
"Boolean object: true\n" +
"---Printing primitive values---\n" +
"byte value: 10\n" +
"short value: 20\n" +
"int value: 30\n" +
"long value: 40\n" +
"float value: 50.0\n" +
"double value: 60.0\n" +
"char value: a\n" +
"boolean value: true");        
        jtxt1.setCaretPosition(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setContentAreaFilled(true);
jButton1.setContentAreaFilled(false);
jButton2.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);
jButton12.setContentAreaFilled(false);
jButton13.setContentAreaFilled(false);
jButton14.setContentAreaFilled(false);
jButton15.setContentAreaFilled(false);
jButton16.setContentAreaFilled(false);
jButton17.setContentAreaFilled(false);
        jtxt1.setText("There are two ways to create a thread:\n" +
"\n" +
"By extending Thread class\n" +
"By implementing Runnable interface.\n" +
"Thread class:\n" +
"Thread class provide constructors and methods to create and perform operations on a thread.Thread class extends Object class and implements Runnable interface.  Runnable interface:\n" +
"The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread. Runnable interface have only one method named run().\n" +
"public void run(): is used to perform action for a thread.\n" +
"Starting a thread:\n" +
"start() method of Thread class is used to start a newly created thread. It performs following tasks:\n" +
"A new thread starts(with new callstack).\n" +
"The thread moves from New state to the Runnable state.\n" +
"When the thread gets a chance to execute, its target run() method will run.1) Java Thread Example by extending Thread class\n" +
"class Multi extends Thread{  \n" +
"public void run(){  \n" +
"System.out.println(\"thread is running...\");  \n" +
"}  \n" +
"public static void main(String args[]){  \n" +
"Multi t1=new Multi();  \n" +
"t1.start();  \n" +
" }  \n" +
"}2) Java Thread Example by implementing Runnable interface\n" +
"class Multi3 implements Runnable{  \n" +
"public void run(){  \n" +
"System.out.println(\"thread is running...\");  \n" +
"}  \n" +
"  \n" +
"public static void main(String args[]){  \n" +
"Multi3 m1=new Multi3();  \n" +
"Thread t1 =new Thread(m1);  \n" +
"t1.start();  \n" +
" }  \n" +
"}");
        jtxt1.setCaretPosition(0);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
  jButton13.setContentAreaFilled(true);
jButton2.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);
jButton12.setContentAreaFilled(false);
jButton1.setContentAreaFilled(false);
jButton14.setContentAreaFilled(false);
jButton15.setContentAreaFilled(false);
jButton16.setContentAreaFilled(false);
jButton17.setContentAreaFilled(false);
         jtxt1.setText("Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU. Each part of such program is called a thread. So, threads are light-weight processes within a process.\n" +
"\n" +
"Threads can be created by using two mechanisms :\n" +
"1. Extending the Thread class\n" +
"2. Implementing the Runnable Interface\n" +
"\n" +
" \n" +
"Thread creation by extending the Thread class\n" +
"\n" +
"We create a class that extends the java.lang.Thread class. This class overrides the run() method available in the Thread class. A thread begins its life inside run() method. We create an object of our new class and call start() method to start the execution of a thread. Start() invokes the run() method on the Thread object.class MultithreadingDemo extends Thread \n" +
"{ \n" +
"    public void run() \n" +
"    { \n" +
"        try\n" +
"        { \n" +
"            // Displaying the thread that is running \n" +
"            System.out.println (\"Thread \" + \n" +
"                  Thread.currentThread().getId() + \n" +
"                  \" is running\"); \n" +
"  \n" +
"        } \n" +
"        catch (Exception e) \n" +
"        { \n" +
"            // Throwing an exception \n" +
"            System.out.println (\"Exception is caught\"); \n" +
"        } \n" +
"    } \n" +
"} \n" +
"  \n" +
"// Main Class \n" +
"public class Multithread \n" +
"{ \n" +
"    public static void main(String[] args) \n" +
"    { \n" +
"        int n = 8; // Number of threads \n" +
"        for (int i=0; i<8; i++) \n" +
"        { \n" +
"            MultithreadingDemo object = new MultithreadingDemo(); \n" +
"            object.start(); \n" +
"        } \n" +
"    } \n" +
"} ");  
         jtxt1.setCaretPosition(0);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
  jButton14.setContentAreaFilled(true);
jButton2.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);
jButton12.setContentAreaFilled(false);
jButton13.setContentAreaFilled(false);
jButton1.setContentAreaFilled(false);
jButton15.setContentAreaFilled(false);
jButton16.setContentAreaFilled(false);
jtxt1.setText("to print a collection by using tMap.keySet(), tMap.values() and tMap.firstKey() methods of Java Util class.\n" +
"import java.util.*;\n" +
"\n" +
"public class TreeExample{\n" +
"   public static void main(String[] args) {\n" +
"      System.out.println(\"Tree Map Example!\\n\");\n" +
"      TreeMap <Integer, String>tMap = new TreeMap<Integer, String>();\n" +
"      tMap.put(1, \"Sunday\");\n" +
"      tMap.put(2, \"Monday\");\n" +
"      tMap.put(3, \"Tuesday\");\n" +
"      tMap.put(4, \"Wednesday\");\n" +
"      tMap.put(5, \"Thursday\");\n" +
"      tMap.put(6, \"Friday\");\n" +
"      tMap.put(7, \"Saturday\");\n" +
"      System.out.println(\"Keys of tree map: \" + tMap.keySet());\n" +
"      System.out.println(\"Values of tree map: \" + tMap.values());\n" +
"      System.out.println(\"Key: 5 value: \" + tMap.get(5)+ \"\\n\");\n" +
"      System.out.println(\n" +
"         \"First key: \" + tMap.firstKey() + \" Value: \" + tMap.get(tMap.firstKey()) + \"\\n\");\n" +
"      System.out.println(\n" +
"         \"Last key: \" + tMap.lastKey() + \" Value: \"+ tMap.get(tMap.lastKey()) + \"\\n\");\n" +
"      System.out.println(\"Removing first data: \" + tMap.remove(tMap.firstKey()));\n" +
"      System.out.println(\"Now the tree map Keys: \" + tMap.keySet());\n" +
"      System.out.println(\"Now the tree map contain: \" + tMap.values() + \"\\n\");\n" +
"      System.out.println(\"Removing last data: \" + tMap.remove(tMap.lastKey()));\n" +
"      System.out.println(\"Now the tree map Keys: \" + tMap.keySet());\n" +
"      System.out.println(\"Now the tree map contain: \" + tMap.values());\n" +
"   }\n" +
"}"
        + "");
jtxt1.setCaretPosition(0);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
  jButton15.setContentAreaFilled(true);
jButton2.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);
jButton12.setContentAreaFilled(false);
jButton13.setContentAreaFilled(false);
jButton14.setContentAreaFilled(false);
jButton1.setContentAreaFilled(false);
jButton16.setContentAreaFilled(false);
jButton17.setContentAreaFilled(false);
jtxt1.setText("Java provides the java.util.regex package for pattern matching with regular expressions. Java regular expressions are very similar to the Perl programming language and very easy to learn.\n" +
"\n" +
"A regular expression is a special sequence of characters that helps you match or find other strings or sets of strings, using a specialized syntax held in a pattern. They can be used to search, edit, or manipulate text and data.\n" +
"\n" +
"The java.util.regex package primarily consists of the following three classes −\n" +
"\n" +
"Pattern Class − A Pattern object is a compiled representation of a regular expression. The Pattern class provides no public constructors. To create a pattern, you must first invoke one of its public static compile() methods, which will then return a Pattern object. These methods accept a regular expression as the first argument.\n" +
"\n" +
"Matcher Class − A Matcher object is the engine that interprets the pattern and performs match operations against an input string. Like the Pattern class, Matcher defines no public constructors. You obtain a Matcher object by invoking the matcher() method on a Pattern object.\n" +
"\n" +
"PatternSyntaxException − A PatternSyntaxException object is an unchecked exception that indicates a syntax error in a regular expression pattern.Following example illustrates how to find a digit string from the given alphanumeric string −\n" +
"\n"  +
"import java.util.regex.Matcher;\n" +
"import java.util.regex.Pattern;\n" +
"\n" +
"public class RegexMatches {\n" +
"\n" +
"   public static void main( String args[] ) {\n" +
"      // String to be scanned to find the pattern.\n" +
"      String line = \"This order was placed for QT3000! OK?\";\n" +
"      String pattern = \"(.*)(\\\\d+)(.*)\";\n" +
"\n" +
"      // Create a Pattern object\n" +
"      Pattern r = Pattern.compile(pattern);\n" +
"\n" +
"      // Now create matcher object.\n" +
"      Matcher m = r.matcher(line);\n" +
"      if (m.find( )) {\n" +
"         System.out.println(\"Found value: \" + m.group(0) );\n" +
"         System.out.println(\"Found value: \" + m.group(1) );\n" +
"         System.out.println(\"Found value: \" + m.group(2) );\n" +
"      }else {\n" +
"         System.out.println(\"NO MATCH\");\n" +
"      }\n" +
"   }\n" +
"}");
jtxt1.setCaretPosition(0);
           
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
jButton16.setContentAreaFilled(true);
jButton2.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);
jButton12.setContentAreaFilled(false);
jButton13.setContentAreaFilled(false);
jButton14.setContentAreaFilled(false);
jButton15.setContentAreaFilled(false);
jButton1.setContentAreaFilled(false);
jButton17.setContentAreaFilled(false);
 jtxt1.setText("The Java Generics programming is introduced in J2SE 5 to deal with type-safe objects. It makes the code stable by detecting the bugs at compile time.\n" +
"\n" +
"Before generics, we can store any type of objects in the collection, i.e., non-generic. Now generics force the java programmer to store a specific type of objects.Full Example of Generics in Java\n" +
"Here, we are using the ArrayList class, but you can use any collection class such as ArrayList, LinkedList, HashSet, TreeSet, HashMap, Comparator etc.\n" +
"\n" +
"import java.util.*;  \n" +
"class TestGenerics1{  \n" +
"public static void main(String args[]){  \n" +
"ArrayList<String> list=new ArrayList<String>();  \n" +
"list.add(\"rahul\");  \n" +
"list.add(\"jai\");  \n" +
"//list.add(32);//compile time error  \n" +
"  \n" +
"String s=list.get(1);//type casting is not required  \n" +
"System.out.println(\"element is: \"+s);  \n" +
"  \n" +
"Iterator<String> itr=list.iterator();  \n" +
"while(itr.hasNext()){  \n" +
"System.out.println(itr.next());  \n" +
"}  \n" +
"}  \n" +
"}  ");
 jtxt1.setCaretPosition(0);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
jButton17.setContentAreaFilled(true);
jButton1.setContentAreaFilled(false);
jButton2.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);
jButton12.setContentAreaFilled(false);
jButton13.setContentAreaFilled(false);
jButton14.setContentAreaFilled(false); 
jButton15.setContentAreaFilled(false);
jButton16.setContentAreaFilled(false);
jtxt1.setText("This chapter provides an example of how to create a simple JDBC application. This will show you how to open a database connection, execute a SQL query, and display the results.\n" +
"\n" +
"All the steps mentioned in this template example, would be explained in subsequent chapters of this tutorial.\n" +
"\n" +
"Creating JDBC Application\n" +
"There are following six steps involved in building a JDBC application −\n" +
"\n" +
"Import the packages: Requires that you include the packages containing the JDBC classes needed for database programming. Most often, using import java.sql.* will suffice.\n" +
"\n" +
"Register the JDBC driver: Requires that you initialize a driver so you can open a communication channel with the database.\n" +
"\n" +
"Open a connection: Requires using the DriverManager.getConnection() method to create a Connection object, which represents a physical connection with the database.\n" +
"\n" +
"Execute a query: Requires using an object of type Statement for building and submitting an SQL statement to the database.\n" +
"\n" +
"Extract data from result set: Requires that you use the appropriate ResultSet.getXXX() method to retrieve the data from the result set.\n" +
"\n" +
"Clean up the environment: Requires explicitly closing all database resources versus relying on the JVM's garbage collection.\n" +
"\n" +
"Sample Code\n" +
"This sample example can serve as a template when you need to create your own JDBC application in the future.\n" +
"\n" +
"This sample code has been written based on the environment and database setup done in the previous chapter.\n" +
"\n" +
"Copy and paste the following example in FirstExample.java, compile and run as follows −\n" +
"\n" +
"//STEP 1. Import required packages\n" +
"import java.sql.*;\n" +
"\n" +
"public class FirstExample {\n" +
"   // JDBC driver name and database URL\n" +
"   static final String JDBC_DRIVER = \"com.mysql.jdbc.Driver\";  \n" +
"   static final String DB_URL = \"jdbc:mysql://localhost/EMP\";\n" +
"\n" +
"   //  Database credentials\n" +
"   static final String USER = \"username\";\n" +
"   static final String PASS = \"password\";\n" +
"   \n" +
"   public static void main(String[] args) {\n" +
"   Connection conn = null;\n" +
"   Statement stmt = null;\n" +
"   try{\n" +
"      //STEP 2: Register JDBC driver\n" +
"      Class.forName(\"com.mysql.jdbc.Driver\");\n" +
"\n" +
"      //STEP 3: Open a connection\n" +
"      System.out.println(\"Connecting to database...\");\n" +
"      conn = DriverManager.getConnection(DB_URL,USER,PASS);\n" +
"\n" +
"      //STEP 4: Execute a query\n" +
"      System.out.println(\"Creating statement...\");\n" +
"      stmt = conn.createStatement();\n" +
"      String sql;\n" +
"      sql = \"SELECT id, first, last, age FROM Employees\";\n" +
"      ResultSet rs = stmt.executeQuery(sql);\n" +
"\n" +
"      //STEP 5: Extract data from result set\n" +
"      while(rs.next()){\n" +
"         //Retrieve by column name\n" +
"         int id  = rs.getInt(\"id\");\n" +
"         int age = rs.getInt(\"age\");\n" +
"         String first = rs.getString(\"first\");\n" +
"         String last = rs.getString(\"last\");\n" +
"\n" +
"         //Display values\n" +
"         System.out.print(\"ID: \" + id);\n" +
"         System.out.print(\", Age: \" + age);\n" +
"         System.out.print(\", First: \" + first);\n" +
"         System.out.println(\", Last: \" + last);\n" +
"      }\n" +
"      //STEP 6: Clean-up environment\n" +
"      rs.close();\n" +
"      stmt.close();\n" +
"      conn.close();\n" +
"   }catch(SQLException se){\n" +
"      //Handle errors for JDBC\n" +
"      se.printStackTrace();\n" +
"   }catch(Exception e){\n" +
"      //Handle errors for Class.forName\n" +
"      e.printStackTrace();\n" +
"   }finally{\n" +
"      //finally block used to close resources\n" +
"      try{\n" +
"         if(stmt!=null)\n" +
"            stmt.close();\n" +
"      }catch(SQLException se2){\n" +
"      }// nothing we can do\n" +
"      try{\n" +
"         if(conn!=null)\n" +
"            conn.close();\n" +
"      }catch(SQLException se){\n" +
"         se.printStackTrace();\n" +
"      }//end finally try\n" +
"   }//end try\n" +
"   System.out.println(\"Goodbye!\");\n" +
"}//end main\n" +
"}//end FirstExample");
jtxt1.setCaretPosition(0);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new j(c,"Java").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpl1;
    private javax.swing.JPanel jpl2;
    private javax.swing.JTextPane jtpn1;
    private javax.swing.JTextPane jtxt1;
    // End of variables declaration//GEN-END:variables
}
