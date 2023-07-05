/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tambo_mysql;

/**
 *
 * @author fabri
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        izquierda = new javax.swing.JPanel();
        jtxtPass = new javax.swing.JPasswordField();
        jbtnIniciarSesion = new javax.swing.JButton();
        jbtnRegistro = new javax.swing.JButton();
        jtxtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setPreferredSize(new java.awt.Dimension(550, 600));
        setResizable(false);

        izquierda.setBackground(new java.awt.Color(176, 18, 129));
        izquierda.setToolTipText("");
        izquierda.setMinimumSize(new java.awt.Dimension(400, 500));
        izquierda.setPreferredSize(new java.awt.Dimension(400, 500));
        izquierda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtPass.setBackground(new java.awt.Color(176, 18, 129));
        jtxtPass.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jtxtPass.setForeground(new java.awt.Color(204, 204, 204));
        jtxtPass.setText("Ingrese su Contraseña");
        jtxtPass.setToolTipText("");
        jtxtPass.setBorder(null);
        jtxtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPassActionPerformed(evt);
            }
        });
        izquierda.add(jtxtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 250, 50));

        jbtnIniciarSesion.setBackground(new java.awt.Color(230, 226, 32));
        jbtnIniciarSesion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jbtnIniciarSesion.setForeground(new java.awt.Color(176, 18, 129));
        jbtnIniciarSesion.setText("INICIAR SESIÓN");
        jbtnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIniciarSesionActionPerformed(evt);
            }
        });
        izquierda.add(jbtnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 240, 40));

        jbtnRegistro.setBackground(new java.awt.Color(230, 226, 32));
        jbtnRegistro.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jbtnRegistro.setForeground(new java.awt.Color(176, 18, 129));
        jbtnRegistro.setText("REGISTRARME");
        jbtnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistroActionPerformed(evt);
            }
        });
        izquierda.add(jbtnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 240, 40));

        jtxtEmail.setBackground(new java.awt.Color(176, 18, 129));
        jtxtEmail.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jtxtEmail.setForeground(new java.awt.Color(204, 204, 204));
        jtxtEmail.setText("Ingrese su Gmail");
        jtxtEmail.setBorder(null);
        izquierda.add(jtxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 250, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Sprite-0002.png"))); // NOI18N
        izquierda.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        izquierda.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 250, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        izquierda.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 250, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(izquierda, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(izquierda, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistroActionPerformed
        // TODO add your handling code here:

        Registro RegistroFrame = new Registro();
        RegistroFrame.setVisible(true);
        RegistroFrame.pack();
        RegistroFrame.setLocationRelativeTo(null);//Centra el formulario
        this.dispose();
    }//GEN-LAST:event_jbtnRegistroActionPerformed

    private void jbtnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIniciarSesionActionPerformed
        // TODO add your handling code here:

        String Email=this.jtxtEmail.getText();
        String Pass=this.jtxtPass.getText();

        MenuPrincipal Mp=new MenuPrincipal();
        Mp.setEmail(jtxtEmail.getText());

        Cliente cl=new Cliente(Email, Pass);
        cl.InicioSeionDB();
        this.dispose();

    }//GEN-LAST:event_jbtnIniciarSesionActionPerformed

    private void jtxtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPassActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel izquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbtnIniciarSesion;
    private javax.swing.JButton jbtnRegistro;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JPasswordField jtxtPass;
    // End of variables declaration//GEN-END:variables
}
