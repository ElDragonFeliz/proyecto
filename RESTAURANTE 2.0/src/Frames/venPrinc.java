package Frames;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class venPrinc extends javax.swing.JFrame {

    static String nombreA;

    public venPrinc() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/img/Fondos/dragon.png")).getImage());
        setLocationRelativeTo(null);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idUser = new javax.swing.JTextField();
        passwordUser = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(600, 80, 70, 20);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(590, 190, 100, 23);

        idUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        idUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idUserActionPerformed(evt);
            }
        });
        jPanel1.add(idUser);
        idUser.setBounds(560, 130, 140, 21);

        passwordUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordUserKeyPressed(evt);
            }
        });
        jPanel1.add(passwordUser);
        passwordUser.setBounds(560, 250, 140, 20);

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Iniciar Sesión");
        jButton1.setAutoscrolls(true);
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(590, 320, 100, 21);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\CRASH\\Documents\\GitHub\\proyecto\\RESTAURANTE 2.0\\src\\Img\\Fondos\\inicio.jpg")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 550, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nom = idUser.getText();
        String pass = passwordUser.getText();
        boolean bandera;
        Opciones opciones = new Opciones(true);

        if ((nom.equals("Administrador")) && (pass.equals("admin"))) {
            nombreA = "Administrador";
            bandera = true;
            Opciones op = new Opciones(true);
            op.setTitle("Restaurante El Dragón Feliz");
            op.setVisible(true);
            op.setLocationRelativeTo(null);
            this.dispose();

            op.verCocina.setEnabled(true);
        } else if ((nom.equals("Erick")) && (pass.equals("123"))) {
            nombreA = "Erick";
            bandera = false;
            Empleado op = new Empleado();
            op.setTitle("Restaurante El Dragón Feliz");
            op.setVisible(true);
            op.setLocationRelativeTo(null);
            this.dispose();
        } else if ((nom.equals("Alberto")) && (pass.equals("123"))) {
            nombreA = "Alberto";
            bandera = false;
            Empleado op = new Empleado();
            op.setTitle("Restaurante El Dragón Feliz");
            op.setVisible(true);
            op.setLocationRelativeTo(null);
            this.dispose();
            //op.verCocina.setEnabled(false);
        } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos, verifique nuevamente.");
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idUserActionPerformed

    private void passwordUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordUserKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordUserKeyPressed

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
            java.util.logging.Logger.getLogger(venPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(venPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(venPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(venPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new venPrinc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField idUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPasswordField passwordUser;
    // End of variables declaration//GEN-END:variables
}
