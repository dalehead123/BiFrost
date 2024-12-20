
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blake
 */
public class CommentBoard extends javax.swing.JFrame {

    
    
    public ArrayList<String> comments = new ArrayList<>();
    public ArrayList<String> commentors = new ArrayList<>();
    public ArrayList<String> ratings = new ArrayList<>();
    public int currentIndex = 0;
    public Main main;
    
    public recipe rec;
    
    /**
     * Creates new form CommentBoard
     * @param rec,main
     * @return none
     */
    public CommentBoard(recipe rec, Main main) {
        this.main = main;
        this.rec = rec;
        initComponents();
        recipeNameLabel.setText(rec.getDishName());
        
        // HARD CODING FOR EXAMPLE COMMENTS
        comments.add("This recipe is one of my absolute favorites!");
        comments.add("We have this for family dinner all the time now!");
        commentors.add("James");
        commentors.add("Robert");
        ratings.add("10");
        ratings.add("7");
        //
        commentLabel.setText("Comment from " + commentors.get(0));
        textArea.setText(comments.get(0));
        rateField.setText(ratings.get(0));
        
        if (this.main.currentUser.isModerator) {
            deleteCommentButton.setVisible(true);
        } else {
            deleteCommentButton.setVisible(false);
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

        jPanel1 = new javax.swing.JPanel();
        recipeNameLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        nextCommentButton = new javax.swing.JButton();
        prevCommentButton = new javax.swing.JButton();
        commentLabel = new javax.swing.JLabel();
        closeBox = new javax.swing.JCheckBox();
        commentButton = new javax.swing.JButton();
        deleteCommentButton = new javax.swing.JButton();
        rateField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Recipe"); // NOI18N
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        recipeNameLabel.setBackground(new java.awt.Color(204, 204, 204));
        recipeNameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        recipeNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recipeNameLabel.setText("Recipe Name Here");
        recipeNameLabel.setOpaque(true);

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        nextCommentButton.setText(">");
        nextCommentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextCommentButtonActionPerformed(evt);
            }
        });

        prevCommentButton.setText("<");
        prevCommentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevCommentButtonActionPerformed(evt);
            }
        });

        commentLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        commentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        commentLabel.setText("Comment from whomever");

        closeBox.setText("close");
        closeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBoxActionPerformed(evt);
            }
        });

        commentButton.setText("Comment");
        commentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commentButtonActionPerformed(evt);
            }
        });

        deleteCommentButton.setText("Delete Comment");
        deleteCommentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCommentButtonActionPerformed(evt);
            }
        });

        rateField.setEditable(false);
        rateField.setText("Leave a Rating");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(606, Short.MAX_VALUE)
                .addComponent(closeBox)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(commentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(prevCommentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextCommentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rateField)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(commentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(recipeNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(63, 63, 63))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteCommentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(closeBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recipeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteCommentButton)
                .addGap(2, 2, 2)
                .addComponent(commentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nextCommentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prevCommentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(rateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(commentButton))
                    .addComponent(jScrollPane2))
                .addContainerGap())
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
    
    /**
     * this method closes the Comment Board box for the recipe
     * @param evt
     * @return none
     */
    private void closeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBoxActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeBoxActionPerformed
    
    /**
     * this method allows a user to add a comment to the comment board
     * or submit their comment through a BUTTON
     * @param evt
     * @return none
     */
    private void commentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commentButtonActionPerformed
        if (nextCommentButton.isVisible()) {
            textArea.setText("Write Text Here");
            commentLabel.setText("Comment from " + main.currentUser.getFirstName());
            nextCommentButton.setVisible(false);
            prevCommentButton.setVisible(false);
            commentButton.setText("Submit");  
            deleteCommentButton.setVisible(false);
            rateField.setEditable(true);
            rateField.setText("Leave a rating from 1-10. Just type #'s");
        } else {
            nextCommentButton.setVisible(true);
            prevCommentButton.setVisible(true);
            comments.add(textArea.getText());
            commentors.add(this.main.currentUser.getFirstName());
            ratings.add(rateField.getText());
            textArea.setText(comments.get(0));
            commentLabel.setText("Comment from " + commentors.get(0));
            rateField.setText(ratings.get(0));
            currentIndex = 0;
            commentButton.setText("Comment");
            if (this.main.currentUser.isModerator) {
                deleteCommentButton.setVisible(true);
            }
            rateField.setEditable(false);
            
        }
        
    }//GEN-LAST:event_commentButtonActionPerformed
    /**
     * this method opens up the next comment in the comment board
     * @param evt
     * @return none
     */
    private void nextCommentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextCommentButtonActionPerformed
        if (currentIndex < comments.size() - 1) {
            textArea.setText(comments.get(currentIndex + 1));
            commentLabel.setText("Comment from " + commentors.get(currentIndex + 1));
            rateField.setText(ratings.get(currentIndex + 1));
            currentIndex++;
        }
    }//GEN-LAST:event_nextCommentButtonActionPerformed
     /**
     * this method opens the previous comment in the comment board
     * @param evt
     * @return none
     */
    private void prevCommentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevCommentButtonActionPerformed
        if (currentIndex > 0) {
            textArea.setText(comments.get(currentIndex - 1)); 
            commentLabel.setText("Comment from " + commentors.get(currentIndex - 1));
            rateField.setText(ratings.get(currentIndex - 1));
            currentIndex--;
        }
        
    }//GEN-LAST:event_prevCommentButtonActionPerformed
    /**
     * this method allows a moderator or admin to delete a comment from the comment board
     * @param evt
     * @return none
     */
    private void deleteCommentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCommentButtonActionPerformed
        if (this.main.currentUser.isModerator) {
           comments.remove(currentIndex);
           JOptionPane.showMessageDialog(null, "Comment from " + commentors.get(currentIndex) +  " has been deleted", "Deletion Complete", JOptionPane.INFORMATION_MESSAGE);  
           commentors.remove(currentIndex);
           ratings.remove(currentIndex);
           
           if (comments.size() > 0) {
            textArea.setText(comments.get(0));
            commentLabel.setText("Comment from " + commentors.get(0));
            rateField.setText(ratings.get(0));
            currentIndex = 0;    
           } else {
               currentIndex = -1;
               textArea.setText("No one has commented on this recipe yet!");
               commentLabel.setText("Be the First to Comment!");
               rateField.setText("You can rate here too!");
           }
           
           
        }
    }//GEN-LAST:event_deleteCommentButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox closeBox;
    private javax.swing.JButton commentButton;
    private javax.swing.JLabel commentLabel;
    private javax.swing.JButton deleteCommentButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nextCommentButton;
    private javax.swing.JButton prevCommentButton;
    private javax.swing.JTextField rateField;
    private javax.swing.JLabel recipeNameLabel;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
