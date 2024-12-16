import java.util.ArrayList;
import javax.swing.JOptionPane;




public class LogInPage extends javax.swing.JFrame {
    
    /**
     * An arrayList to hold the users arrayList from the main
     */
    private ArrayList<User> users = new ArrayList<>();
    
    /**
     * A Main object to hold the Main that was passed through during construction
     */
    public Main main;
    
    /**
     * A boolean to determine which type of LogIn the user is performing. Indicates a User is logging in.
     */
    public boolean userLoginActive = true;
    
    /**
     * A boolean to determine which type of LogIn the user is performing. Indicates an Admin is logging in.
     */
    public boolean adminLoginActive = false;
    
    /**
     * A boolean to determine which type of LogIn the user is performing. Indicates a Moderator is logging in.
     */
    public boolean moderatorLoginActive = false;

    /**
     * Creates new form LogInPage with a parameter Main to pass through recipe and user data
     * . The LogInPage gives access to other pages for registered Users.
     */
    public LogInPage(Main main) {
        // passes the users from main to the loginpage
        this.main = main;
        this.users = main.getUsers();
         
        // Calls the NETBEANS generated code
        initComponents();
        
        // Titles the JFRAME
        this.setTitle("User Log In");
        
        // Initializes the user type log in settings (userLoginActive = true)

        firstnameField.setVisible(false);
        firstnameLabel.setVisible(false);   
        userLoginActive = true; 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        firstnameLabel = new javax.swing.JLabel();
        firstnameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        newAccountButton = new javax.swing.JButton();
        orLab = new javax.swing.JLabel();
        orLab1 = new javax.swing.JLabel();
        guestButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Andhrimnir: Asgard's Finest Recipe Book");
        jLabel1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        loginLabel.setBackground(new java.awt.Color(204, 204, 204));
        loginLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("User Log in");
        loginLabel.setOpaque(true);

        firstnameLabel.setText("Enter your firstname");

        firstnameField.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Enter your username");

        usernameField.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("Enter your password");

        passwordField.setBackground(new java.awt.Color(204, 204, 204));

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        newAccountButton.setText("Create New Account");
        newAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAccountButtonActionPerformed(evt);
            }
        });

        orLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orLab.setText("OR");

        orLab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orLab1.setText("OR");

        guestButton.setText("Continue as a Guest");
        guestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestButtonActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 51, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText("Password must contain:\nOne capital letter\nOne special character\n\nPassword must not contain:\nThe following character(s): ,\n\n");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 52, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(firstnameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(orLab1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(orLab, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(newAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(guestButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firstnameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orLab1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newAccountButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orLab, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guestButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(669, 669, 669)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1097, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1031, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Performs the necessary duties when the logIn button is clicked. This is the same button used
     * when a user clicks create in the createAccount menu.
     * This ensures credentials are correct before logging in the user.
     * @param evt 
     */
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        if (userLoginActive) {
            boolean foundUsername = false;
            User suspectedUser = new User("NULL", "NULL");
            for (User u : users) {
                if (u.getUsername().equals(usernameField.getText())) {
                    foundUsername = true;
                    suspectedUser = u;
                    break;
                }
            }
            // If the username was found and the password is correct
            if (foundUsername && suspectedUser.getPassword().equals(passwordField.getText())) {
                userLogin(suspectedUser);
                System.out.println("Loggedin");

            // If the username was not found
            } else if (!foundUsername) {
                JOptionPane.showMessageDialog(null, "The username was not found in the system","ERROR", JOptionPane.ERROR_MESSAGE);  

            // if the username was found, but the password is incorrect
            } else if (foundUsername && !suspectedUser.getPassword().equals(passwordField.getText())) {
                JOptionPane.showMessageDialog(null, "The password is incorrect for the given username","ERROR", JOptionPane.ERROR_MESSAGE);  
            }    
        } else if (adminLoginActive) {
            boolean foundUsername = false;
            User suspectedUser = new User("NULL", "NULL");
            for (User u : users) {
                if (u.getUsername().equals(usernameField.getText())) {
                    foundUsername = true;
                    suspectedUser = u;
                    break;
                }
            }
            // If the username was found and the password is correct
            if (foundUsername && !suspectedUser.isAdmin) {
                JOptionPane.showMessageDialog(null, "This user is not an admin", "ERROR", JOptionPane.ERROR_MESSAGE);  
            }
            else if (foundUsername && suspectedUser.getPassword().equals(passwordField.getText())) {
                adminLogin(suspectedUser);
                System.out.println("Loggedin");

            // If the username was not found
            } else if (!foundUsername) {
                JOptionPane.showMessageDialog(null, "The username was not found in the system","ERROR", JOptionPane.ERROR_MESSAGE);  

            // if the username was found, but the password is incorrect
            } else if (foundUsername && !suspectedUser.getPassword().equals(passwordField.getText())) {
                JOptionPane.showMessageDialog(null, "The password is incorrect for the given username","ERROR", JOptionPane.ERROR_MESSAGE);  
            }   
        } else if (moderatorLoginActive) {
            boolean foundUsername = false;
            User suspectedUser = new User("NULL", "NULL");
            for (User u : users) {
                if (u.getUsername().equals(usernameField.getText())) {
                    foundUsername = true;
                    suspectedUser = u;
                    break;
                }
            }
            // If the username was found and the password is correct
            if (foundUsername && !suspectedUser.isModerator) {
                JOptionPane.showMessageDialog(null, "This user is not an admin", "ERROR", JOptionPane.ERROR_MESSAGE);  
            }
            else if (foundUsername && suspectedUser.getPassword().equals(passwordField.getText())) {
                moderatorLogin(suspectedUser);
                System.out.println("Loggedin");

            // If the username was not found
            } else if (!foundUsername) {
                JOptionPane.showMessageDialog(null, "The username was not found in the system","ERROR", JOptionPane.ERROR_MESSAGE);  

            // if the username was found, but the password is incorrect
            } else if (foundUsername && !suspectedUser.getPassword().equals(passwordField.getText())) {
                JOptionPane.showMessageDialog(null, "The password is incorrect for the given username","ERROR", JOptionPane.ERROR_MESSAGE);  
            } 
        // IF NONE are active this implies that the individual is currently making a new account
        } else {
            // Create a new user with the given information
            User u = new User(usernameField.getText(), passwordField.getText());
            u.setFirstName(firstnameField.getText());
            users.add(u);
            main.saveUsers();
            
            // Give the user feedback that their account has been created
            JOptionPane.showMessageDialog(null, "Your account has been created. Please log in.","Success", JOptionPane.INFORMATION_MESSAGE);  
            
            // go to basic user log in settings

            newAccountButton.setVisible(true);
            orLab.setVisible(true);
            
            loginButton.setText("Login");
            firstnameField.setVisible(false);
            firstnameLabel.setVisible(false);
            loginLabel.setText("User Login");
            
            userLoginActive = true;
            
            
        }

    }//GEN-LAST:event_loginButtonActionPerformed

   
   
    /**
     * When Clicked, Manipulates all of the elements on the LogIn panel to be oriented 
     * for an new Users Account Creation procedure.
     * @param evt 
     */
    private void newAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAccountButtonActionPerformed
        adminLoginActive = false;
        moderatorLoginActive = false;
        userLoginActive = false;
        
        loginLabel.setText("Create New Account");
        firstnameField.setVisible(true);
        firstnameLabel.setVisible(true);
        loginButton.setText("Create");
        clearTextFields();
        
        newAccountButton.setVisible(false);
        orLab.setVisible(false);
        
        
        
    }//GEN-LAST:event_newAccountButtonActionPerformed

    private void guestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestButtonActionPerformed
        main.currentUser = null;
        guestLogin();
    }//GEN-LAST:event_guestButtonActionPerformed
    
    /**
     * Logs in the given User parameter by opening their personalized RecipeDisplay page
     * @param user - The current User logging in
     */
    
    private void guestLogin() {
        RecipeDisplay rd = new RecipeDisplay(main, main.recipes);
        this.dispose();
        rd.show();
        rd.welcomeLabel.setVisible(false);
        
    }
    
    private void userLogin(User user) {
        
        this.setVisible(false);
        this.main.currentUser = user;
        RecipeDisplay rd = new RecipeDisplay(main, main.recipes);
        rd.show();
    }
    
    /**
     * Logs in the given User parameter by opening their personalized RecipeDisplay page w moderator features
     * @param user - The current User logging in
     */
    private void moderatorLogin(User user) {
        this.setVisible(false); 
        this.main.currentUser = user;
        RecipeDisplay rd = new RecipeDisplay(main, main.recipes);
        rd.show();
    }
    
    /**
     * Logs in the given User parameter by opening their personalized RecipeDisplay page w admin features
     * @param user - The current User logging in
     */
    private void adminLogin (User user) {
        
        this.setVisible(false);  
        this.main.currentUser = user;
        RecipeDisplay rd = new RecipeDisplay(main, main.recipes);
        rd.show();
    }
    
    /**
     * Erases all text that was written into any of the text fields (resets text fields).
     * 
     */
    private void clearTextFields() {
        usernameField.setText(" ");
        passwordField.setText(" ");
        firstnameField.setText(" ");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField firstnameField;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.JButton guestButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JButton newAccountButton;
    private javax.swing.JLabel orLab;
    private javax.swing.JLabel orLab1;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
