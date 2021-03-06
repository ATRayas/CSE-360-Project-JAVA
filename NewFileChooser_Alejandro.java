import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakshamsaraswat
 */
public class NewFileChooser_Alejandro extends javax.swing.JFrame implements ActionListener {
	String justifier = "left";
	int spacing = 1;
	int lineLength = 80;

    /**
     * Creates new form NewFileChooser
     */
    public NewFileChooser_Alejandro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Left_Only_Group = new javax.swing.ButtonGroup();
        Right_Only_Group = new javax.swing.ButtonGroup();
        Full_Only_Group = new javax.swing.ButtonGroup();
        ALL_Only_Group = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        left_Justify_button = new javax.swing.JRadioButton();
        right_Justify_button = new javax.swing.JRadioButton();
        full_Justify_button = new javax.swing.JRadioButton();
        clear_Button = new javax.swing.JButton();
        output_File_button = new javax.swing.JButton();
        line_length_Text_Field = new javax.swing.JTextField();
        process_File_button = new javax.swing.JButton();
        single_Space_button = new javax.swing.JRadioButton();
        double_Space_button = new javax.swing.JRadioButton();
        
        ALL_Only_Group.add(right_Justify_button);
        ALL_Only_Group.add(full_Justify_button);
        ALL_Only_Group.add(left_Justify_button);
        
        Left_Only_Group.add(right_Justify_button);
        Left_Only_Group.add(full_Justify_button);
        
        Right_Only_Group.add(left_Justify_button);
        Right_Only_Group.add(full_Justify_button);
        
        Full_Only_Group.add(left_Justify_button);
        Full_Only_Group.add(right_Justify_button);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Open File...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        left_Justify_button.setText("Left justify");
        left_Justify_button.addActionListener(this);
        add(left_Justify_button);
        
        right_Justify_button.setText("Right justify");
        right_Justify_button.addActionListener(this);
        add(right_Justify_button);
        
        full_Justify_button.setText("Full justify");
        full_Justify_button.addActionListener(this);
        add(full_Justify_button);

        clear_Button.setText("Clear");
        clear_Button.addActionListener(this);

        output_File_button.setText("Download Output File");

        line_length_Text_Field.setText("Enter here");
        line_length_Text_Field.addActionListener(this);

        process_File_button.setText("Process File");
        process_File_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                process_File_buttonActionPerformed(evt);
            }
        });

        single_Space_button.setText("Single Space");
        single_Space_button.addActionListener(this);
        
        double_Space_button.setText("Double Space");
        double_Space_button.addActionListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(left_Justify_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(right_Justify_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(full_Justify_button)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(single_Space_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(double_Space_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(output_File_button))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clear_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(line_length_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(process_File_button, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear_Button)
                    .addComponent(jButton1)
                    .addComponent(line_length_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(process_File_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(output_File_button)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(single_Space_button)
                        .addComponent(double_Space_button)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(left_Justify_button)
                    .addComponent(right_Justify_button)
                    .addComponent(full_Justify_button))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MyFileOpenerClass myobj = new MyFileOpenerClass();
        
        try
        {
              
            myobj.pick_me();
            
            
        }catch(Exception e)
        {
            
            e.printStackTrace();
            
        }
        
       // jTextArea1.setText(myobj.sb.toString());
        
        
        // To calculate the number of words in a string.
        //String wordc = myobj.sb.toString();
         
        
        
        
       
   
        //To calculate the number of lines in a string
        //int count1 = wordc.split("[\n|\r]").length;
        //String str1;
        //str1 = Integer.toString(count1);
        
        
        
        
        
 
       
         
        
        
        jTextArea2.setText("# of words - " + myobj.getWords() 
                + "\n" + "# of lines - " + myobj.getLines()
                + "\n" + "Avg. words per line - " + (myobj.getWords()/myobj.getLines())
                + "\n" + "Avg. line Length - " + (myobj.getWords()/myobj.getLines())
                + myobj.getBlankLines());
        
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void process_File_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_process_File_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_process_File_buttonActionPerformed



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
            java.util.logging.Logger.getLogger(NewFileChooser_Alejandro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewFileChooser_Alejandro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewFileChooser_Alejandro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewFileChooser_Alejandro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewFileChooser_Alejandro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Left_Only_Group;
    private javax.swing.ButtonGroup ALL_Only_Group;
    private javax.swing.ButtonGroup Right_Only_Group;
    private javax.swing.ButtonGroup Full_Only_Group;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton clear_Button;
    private javax.swing.JButton output_File_button;
    private javax.swing.JButton process_File_button;
    private javax.swing.JRadioButton left_Justify_button;
    private javax.swing.JRadioButton right_Justify_button;
    private javax.swing.JRadioButton full_Justify_button;
    private javax.swing.JRadioButton single_Space_button;
    private javax.swing.JRadioButton double_Space_button;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField line_length_Text_Field;
    // End of variables declaration//GEN-END:variables
    
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String word = e.getActionCommand();
		//int number = e.getActionCommand();
		if(word.equals("Clear")) {
			justifier = "left";
			full_Justify_button.setSelected(false);
			right_Justify_button.setSelected(false);
			left_Justify_button.setSelected(false);
			//ALL_Only_Group.clearSelection();
			
		}
		else if(word.equals("Left justify")) {
			justifier = "left";
			full_Justify_button.setSelected(false);
			right_Justify_button.setSelected(false);
			//Left_Only_Group.clearSelection();
			
		}
		else if(word.equals("Right justify")) {
			justifier = "right";
			left_Justify_button.setSelected(false);
			full_Justify_button.setSelected(false);
			//Right_Only_Group.clearSelection();
		}
		else if(word.equals("Full justify")) {
			justifier = "full";
			right_Justify_button.setSelected(false);
			left_Justify_button.setSelected(false);
			//Full_Only_Group.clearSelection();
		}
		if(word.equals("Enter here")) {
			lineLength = 89;
		}
		else{
			lineLength = Integer.parseInt(word);
		}
		if(word.equals("Single Space")) {
			spacing = 1;
		}
		else if(word.equals("Double Space")) {
			spacing = 2;
		}
	}
}
