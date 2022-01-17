package knowledgehb;

public class CplusPrograms extends javax.swing.JFrame {

    connect c;
    public CplusPrograms(connect c) {
        initComponents();
        this.c=c;
        this.setLocationRelativeTo(null);
        this.setTitle("C++ Programs");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpn1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HOT QUESTIONS");
        setBackground(new java.awt.Color(51, 51, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(102, 102, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 153, 204));
        jPanel3.setForeground(new java.awt.Color(0, 255, 255));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Print Natural Nos Without Using Semicolon");
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
        jButton2.setText("GCD of  Two Nos Using Recursion");
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
        jButton3.setText("Fibonacci Series");
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
        jButton4.setText("String is Palindrome or Not");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 255));
        jButton5.setText("Armstrong No");
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
        jButton6.setText("Add Two Matrices");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 255));
        jButton7.setText("Implement Singly Linked List");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(204, 204, 255));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 255));
        jButton8.setText("Selection Sort");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(204, 204, 255));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 255));
        jButton9.setText("Linear Search");
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(204, 204, 255));
        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 255));
        jButton10.setText("Reading and Writing On a File");
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
        jButton11.setText("Print Number Triangle");
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));
        jPanel4.setForeground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setForeground(new java.awt.Color(102, 255, 51));

        jtpn1.setEditable(false);
        jtpn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 2));
        jtpn1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtpn1.setForeground(new java.awt.Color(0, 51, 153));
        jtpn1.setText("         *************WELCOME TO C++ PROGRAMS************\n                 CLICK ON BUTTONS TO SEE THE PROGRAMS\n\n");
        jtpn1.setCaretColor(new java.awt.Color(0, 0, 204));
        jtpn1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jtpn1.setName("C++ PROGRAMS"); // NOI18N
        jScrollPane1.setViewportView(jtpn1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
jButton8.setContentAreaFilled(true);
jButton2.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton1.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);

        jtpn1.setText("One of the simplest techniques is a selection sort. As the name suggests, selection sort is the selection of an element and keeping it in sorted order. In selection sort, the strategy is to find the smallest number in the array and exchange it with the value in first position of array. Now, find the second smallest element in the remainder of array and exchange it with a value in the second position, carry on till you have reached the end of array. Now all the elements have been sorted in ascending order.\n" +
" \n Code For Selection Sort is:\n#include<iostream.h>\n" +
"\n#include<conio.h>\n" +
"void main()\n" +
"{\n" +
"	clrscr();\n" +
"	int size, arr[50], i, j, temp;\n" +
"	cout<<\"Enter Array Size : \";\n" +
"	cin>>size;\n" +
"	cout<<\"Enter Array Elements : \";\n" +
"	for(i=0; i<size; i++)\n" +
"	{\n" +
"		cin>>arr[i];\n" +
"	}\n" +
"	cout<<\"Sorting array using selection sort...\\n\";\n" +
"	for(i=0; i<size; i++)\n" +
"	{\n" +
"		for(j=i+1; j<size; j++)\n" +
"		{\n" +
"			if(arr[i]>arr[j])\n" +
"			{\n" +
"				temp=arr[i];\n" +
"				arr[i]=arr[j];\n" +
"				arr[j]=temp;\n" +
"			}\n" +
"		}\n" +
"	}\n" +
"	cout<<\"Now the Array after sorting is :\\n\";\n" +
"	for(i=0; i<size; i++)\n" +
"	{\n" +
"		cout<<arr[i]<<\" \";\n" +
"	}\n" +
"	getch();\n" +
"}");       
         jtpn1.setCaretPosition(0);
    }//GEN-LAST:event_jButton8ActionPerformed

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
        jtpn1.setText("\n#include<iostream> \n" +
"  \n" +
"using namespace std; \n" +
"int N = 10; \n" +
"  \n" +
"int main() \n" +
"{ \n" +
"  static int x = 1; \n" +
"  if (cout << x << \" \" && x++ < N && main()) \n" +
"  { } \n" +
"  return 0; \n" +
"}");        
 jtpn1.setCaretPosition(0);
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

jtpn1.setText("The Greatest Common Divisor (GCD) of two numbers is the largest number that divides both of them.\n" +
"\n" +
"For example: Let’s say we have following two numbers: 63 and 42\n" +
"\n" +
"63 = 7 * 3 * 3\n" +
"42 = 7 * 3 * 2\n" +
"So, the GCD of 63 and 42 is 21\n" +
"A program to find the GCD of two numbers using recursion is given as follows.\n\n#include<iostream>\n" +
"using namespace std;\n" +
"int gcd(int a, int b) { \n" +
"   if (a == 0 || b == 0) \n" +
"      return 0; \n" +
"   else if (a == b) \n" +
"      return a; \n" +
"   else if (a > b) \n" +
"      return gcd(a-b, b); \n" +
"   else return gcd(a, b-a); \n" +
"}   \n" +
"int main() { \n" +
"   int a = 63, b = 42; \n" +
"   cout<<\"GCD of \"<< a <<\" and \"<< b <<\" is \"<< gcd(a, b); \n" +
"   return 0; \n" +
"}");   
 jtpn1.setCaretPosition(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
jButton3.setContentAreaFilled(true);
jButton2.setContentAreaFilled(false);
jButton1.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);

        jtpn1.setText("The Fibonacci sequence is a series where the next term is the sum of pervious two terms. The first two terms of the Fibonacci sequence is 0 followed by 1.\n" +
"\n" +
"The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21\n\n#include <iostream>\n" +
"using namespace std;\n" +
"int main()\n" +
"{\n" +
"    int n, t1 = 0, t2 = 1, nextTerm = 0;\n" +
"    cout << \"Enter the number of terms: \";\n" +
"    cin >> n;\n" +
"    cout << \"Fibonacci Series: \";\n" +
"    for (int i = 1; i <= n; ++i)\n" +
"    {\n" +
"        // Prints the first two terms.\n" +
"        if(i == 1)\n" +
"        {\n" +
"            cout << \" \" << t1;\n" +
"            continue;\n" +
"        }\n" +
"        if(i == 2)\n" +
"        {\n" +
"            cout << t2 << \" \";\n" +
"            continue;\n" +
"        }\n" +
"        nextTerm = t1 + t2;\n" +
"        t1 = t2;\n" +
"        t2 = nextTerm;\n" +
"        \n" +
"        cout << nextTerm << \" \";\n" +
"    }\n" +
"    return 0;\n" +
"}");        
 jtpn1.setCaretPosition(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
jButton4.setContentAreaFilled(true);
jButton2.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton1.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);

        jtpn1.setText("Palindrome is a string, which when read in both forward and backward way is same.\n" +
"\n" +
"Example: lol, pop, radar, rubber, madam etc.\nLets see the Code for String is Palindrome or Not:\n#include <iostream>\n" +
"using namespace std;\n" +
"\n" +
"int main(){\n" +
"    char string1[20];\n" +
"    int i, length;\n" +
"    int flag = 0;\n" +
"    \n" +
"    cout << \"Enter a string: \"; cin >> string1;\n" +
"    \n" +
"    length = strlen(string1);\n" +
"    \n" +
"    for(i=0;i < length ;i++){\n" +
"        if(string1[i] != string1[length-i-1]){\n" +
"            flag = 1;\n" +
"            break;\n" +
"   }\n" +
"}\n" +
"    \n" +
"    if (flag) {\n" +
"        cout << string1 << \" is not a palindrome\" << endl; \n" +
"    }    \n" +
"    else {\n" +
"        cout << string1 << \" is a palindrome\" << endl; \n" +
"    }\n" +
"    system(\"pause\");\n" +
"    return 0;\n" +
"}");       
         jtpn1.setCaretPosition(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
jButton5.setContentAreaFilled(true);
jButton2.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton1.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);

        jtpn1.setText("Armstrong Number in c++: A positive number is called armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.\n" +
"\n" +
"Let's try to understand why 153 is an Armstrong number.\n" +
"\n" +
"\n" +
"153 = (1*1*1)+(5*5*5)+(3*3*3)  \n" +
"where:  \n" +
"(1*1*1)=1  \n" +
"(5*5*5)=125  \n" +
"(3*3*3)=27  \n" +
"So:  \n" +
"1+125+27=153  \nLet's see the c++ program to check Armstrong Number.\n#include <iostream>\n" +
"using namespace std;\n" +
"int main()\n" +
"{\n" +
"  int origNum, num, rem, sum = 0;\n" +
"  cout << \"Enter a positive  integer: \";\n" +
"  cin >> origNum;\n" +
"  num = origNum;\n" +
"  while(num != 0)\n" +
"  {\n" +
"      rem = num % 10;\n" +
"      sum += rem * rem * rem;\n" +
"      num /= 10;\n" +
"  }\n" +
"  if(sum == origNum)\n" +
"    cout << origNum << \" is an Armstrong number.\";\n" +
"  else\n" +
"    cout << origNum << \" is not an Armstrong number.\";\n" +
"  return 0;\n" +
"}");        
         jtpn1.setCaretPosition(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
jButton6.setContentAreaFilled(true);
jButton2.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton1.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);

        jtpn1.setText("#include <iostream>\n" +
"using namespace std;\n" +
"  \n" +
"int main(){\n" +
"    int rows, cols, i, j;\n" +
"    int one[50][50], two[50][50], sum[50][50];\n" +
"     \n" +
"    cout <<\"Enter Rows and Columns of Matrix\\n\";\n" +
"    cin >> rows >> cols;\n" +
"      \n" +
"    cout <<\"Enter first Matrix of size \"<<rows<<\" X \"<<cols;\n" +
"    //  Input first matrix*/\n" +
"    for(i = 0; i < rows; i++){\n" +
"        for(j = 0; j < cols; j++){\n" +
"            cin >> one[i][j];\n" +
"        }\n" +
"    }\n" +
"    //  Input second matrix\n" +
"    cout <<\"\\nEnter second Matrix of size \"<<rows<<\" X \"<<cols;\n" +
"    for(i = 0; i < rows; i++){\n" +
"        for(j = 0; j < cols; j++){\n" +
"            cin >> two[i][j];\n" +
"        }\n" +
"    }\n" +
"    /* adding corresponding elements of both matrices \n" +
"       sum[i][j] = one[i][j] + two[i][j] */\n" +
"    for(i = 0; i < rows; i++){\n" +
"        for(j = 0; j < cols; j++){\n" +
"            sum[i][j] = one[i][j] + two[i][j];\n" +
"        }\n" +
"    }\n" +
"      \n" +
"    cout <<\"Sum Matrix\\n\";\n" +
"    for(i = 0; i < rows; i++){\n" +
"        for(j = 0; j < cols; j++){\n" +
"            cout << sum[i][j] << \" \";\n" +
"        }\n" +
"        cout << \"\\n\";\n" +
"    }\n" +
" \n" +
"    return 0;\n" +
"}");       
         jtpn1.setCaretPosition(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
jButton7.setContentAreaFilled(true);
jButton2.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton1.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);

        jtpn1.setText("Singly linked list is a type of data structure that is made up of nodes that are created using self referential structures. Each of these nodes contain two parts, namely the data and the reference to the next list node. Only the reference to the first list node is required to access the whole linked list. This is known as the head. The last node in the list points to nothing so it stores NULL in that part.\n" +
"\n" +
"A program to implement singly linked list is given as follows.\n#include <iostream>\n" +
"#include<conio.h>\n" +
"#include<stdlib.h>\n" +
"#include<stdio.h>\n" +
"\n" +
"using namespace std;\n" +
"\n" +
"struct node {\n" +
"    int value;\n" +
"    struct node *next;\n" +
"};\n" +
"\n" +
"void insert();\n" +
"void display();\n" +
"void delete_node();\n" +
"int count();\n" +
"\n" +
"typedef struct node DATA_NODE;\n" +
"\n" +
"DATA_NODE *head_node, *first_node, *temp_node = 0, *prev_node, next_node;\n" +
"int data;\n" +
"\n" +
"int main() {\n" +
"    int option = 0;\n" +
"\n" +
"    cout << \"Singly Linked List C++ Example - All Operations\\n\";\n" +
"\n" +
"    while (option < 5) {\n" +
"\n" +
"        cout << \"\\nOptions\\n\";\n" +
"        cout << \"1 : Insert into Linked List \\n\";\n" +
"        cout << \"2 : Delete from Linked List \\n\";\n" +
"        cout << \"3 : Display Linked List\\n\";\n" +
"        cout << \"4 : Count Linked List\\n\";\n" +
"        cout << \"Others : Exit()\\n\";\n" +
"        cout << \"Enter your option:\";\n" +
"        scanf(\"%d\", &option);\n" +
"        switch (option) {\n" +
"            case 1:\n" +
"                insert();\n" +
"                break;\n" +
"            case 2:\n" +
"                delete_node();\n" +
"                break;\n" +
"            case 3:\n" +
"                display();\n" +
"                break;\n" +
"            case 4:\n" +
"                count();\n" +
"                break;\n" +
"            default:\n" +
"                break;\n" +
"        }\n" +
"    }\n" +
"\n" +
"    return 0;\n" +
"}\n" +
"\n" +
"void insert() {\n" +
"    cout << \"\\nEnter Element for Insert Linked List : \\n\";\n" +
"    scanf(\"%d\", &data);\n" +
"\n" +
"    temp_node = (DATA_NODE *) malloc(sizeof (DATA_NODE));\n" +
"\n" +
"    temp_node->value = data;\n" +
"\n" +
"    if (first_node == 0) {\n" +
"        first_node = temp_node;\n" +
"    } else {\n" +
"        head_node->next = temp_node;\n" +
"    }\n" +
"    temp_node->next = 0;\n" +
"    head_node = temp_node;\n" +
"    fflush(stdin);\n" +
"}\n" +
"\n" +
"void delete_node() {\n" +
"    int countvalue, pos, i = 0;\n" +
"    countvalue = count();\n" +
"    temp_node = first_node;\n" +
"    cout << \"\\nDisplay Linked List : \\n\";\n" +
"\n" +
"    cout << \"\\nEnter Position for Delete Element : \\n\";\n" +
"    scanf(\"%d\", &pos);\n" +
"\n" +
"    if (pos > 0 && pos <= countvalue) {\n" +
"        if (pos == 1) {\n" +
"            temp_node = temp_node -> next;\n" +
"            first_node = temp_node;\n" +
"            cout << \"\\nDeleted Successfully \\n\\n\";\n" +
"        } else {\n" +
"            while (temp_node != 0) {\n" +
"                if (i == (pos - 1)) {\n" +
"                    prev_node->next = temp_node->next;\n" +
"                    if (i == (countvalue - 1)) {\n" +
"                        head_node = prev_node;\n" +
"                    }\n" +
"                    cout << \"\\nDeleted Successfully \\n\\n\";\n" +
"                    break;\n" +
"                } else {\n" +
"                    i++;\n" +
"                    prev_node = temp_node;\n" +
"                    temp_node = temp_node -> next;\n" +
"                }\n" +
"            }\n" +
"        }\n" +
"    } else\n" +
"        cout << \"\\nInvalid Position \\n\\n\";\n" +
"}\n" +
"\n" +
"void display() {\n" +
"    int count = 0;\n" +
"    temp_node = first_node;\n" +
"    cout << \"\\nDisplay Linked List : \\n\";\n" +
"    while (temp_node != 0) {\n" +
"        cout << \"# \" << temp_node->value;\n" +
"        count++;\n" +
"        temp_node = temp_node -> next;\n" +
"    }\n" +
"    cout << \"\\nNo Of Items In Linked List : %d\" << count;\n" +
"}\n" +
"\n" +
"int count() {\n" +
"    int count = 0;\n" +
"    temp_node = first_node;\n" +
"    while (temp_node != 0) {\n" +
"        count++;\n" +
"        temp_node = temp_node -> next;\n" +
"    }\n" +
"    cout << \"\\nNo Of Items In Linked List : %d\" << count;\n" +
"    return count;\n" +
"}");        
         jtpn1.setCaretPosition(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
jButton9.setContentAreaFilled(true);
jButton2.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton1.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);

        jtpn1.setText("Linear search is a very simple search algorithm. In this type of search, a sequential search is made over all items one by one. Every item is checked and if a match is found then that particular item is returned, otherwise the search continues till the end of the data collection.\n" +
"\n#include<iostream>\n" +
" \n" +
"using namespace std;\n" +
" \n" +
"int main()\n" +
"{\n" +
"	int a[20],n,x,i,flag=0;\n" +
"	cout<<\"How many elements?\";\n" +
"	cin>>n;\n" +
"	cout<<\"\\nEnter elements of the array\\n\";\n" +
"	\n" +
"	for(i=0;i<n;++i)\n" +
"		cin>>a[i];\n" +
"	\n" +
"	cout<<\"\\nEnter element to search:\";\n" +
"	cin>>x;\n" +
"	\n" +
"	for(i=0;i<n;++i)\n" +
"	{\n" +
"		if(a[i]==x)\n" +
"		{\n" +
"			flag=1;\n" +
"			break;\n" +
"		}\n" +
"	}\n" +
"	\n" +
"	if(flag)\n" +
"		cout<<\"\\nElement is found at position \"<<i+1;\n" +
"	else\n" +
"		cout<<\"\\nElement not found\";\n" +
"		\n" +
"	return 0;\n" +
"}");       
         jtpn1.setCaretPosition(0);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
jButton10.setContentAreaFilled(true);
jButton2.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton1.setContentAreaFilled(false);
jButton11.setContentAreaFilled(false);

        jtpn1.setText("#include <iostream>\n" +
"#include <fstream>\n" +
"\n" +
"using namespace std;\n" +
"\n" +
"int main(){\n" +
"\n" +
"  char text[200];\n" +
"\n" +
"  fstream file;\n" +
"  file.open (\"example.txt\", ios::out | ios::in );\n" +
"\n" +
"  cout << \"Write text to be written on file.\" << endl;\n" +
"  cin.getline(text, sizeof(text));\n" +
"\n" +
"  // Writing on file\n" +
"  file << text << endl;\n" +
"\n" +
"  // Reding from file\n" +
"  file >> text;\n" +
"  cout << text << endl;\n" +
"\n" +
"  //closing the file\n" +
"  file.close();\n" +
"  return 0;\n" +
"}");        
         jtpn1.setCaretPosition(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
jButton11.setContentAreaFilled(true);
jButton2.setContentAreaFilled(false);
jButton3.setContentAreaFilled(false);
jButton4.setContentAreaFilled(false);
jButton5.setContentAreaFilled(false);
jButton6.setContentAreaFilled(false);
jButton7.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);
jButton9.setContentAreaFilled(false);
jButton10.setContentAreaFilled(false);
jButton1.setContentAreaFilled(false);

        jtpn1.setText("Like alphabet triangle, we can write the c++ program to print the number triangle. The number triangle can be printed in different ways.\n" +
"\n" +
   "Let's see the c++ example to print number triangle.\n#include <iostream>  \n" +
"using namespace std;  \n" +
"int main()  \n" +
"{  \n" +
"int i,j,k,l,n;    \n" +
"cout<<\"Enter the Range=\";    \n" +
"cin>>n;    \n" +
"for(i=1;i<=n;i++)    \n" +
"{    \n" +
"for(j=1;j<=n-i;j++)    \n" +
"{    \n" +
"cout<<\" \";    \n" +
"}    \n" +
"for(k=1;k<=i;k++)    \n" +
"{    \n" +
"cout<<k;    \n" +
"}    \n" +
"for(l=i-1;l>=1;l--)    \n" +
"{    \n" +
"cout<<l;    \n" +
"}    \n" +
"cout<<\"\\n\";    \n" +
"}    \n" +
"return 0;  \n" +
"}");        
        jtpn1.setCaretPosition(0);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new c(c,"C++").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jtpn1;
    // End of variables declaration//GEN-END:variables
}
