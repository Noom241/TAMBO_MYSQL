
package com.mycompany.tambo_mysql;
import Resources.ButtonAnimationUtils;
import Resources.TextFieldUtils;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Regsitro
     */
    public Registro() {
        initComponents();
        jLabel1.requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        derecha1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtnIniciarSesion1 = new javax.swing.JButton();
        jbtnRegistrarme = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jtxtNombre_ = new javax.swing.JTextField();
        jtxtDNI_ = new javax.swing.JTextField();
        jtxtCelular_ = new javax.swing.JTextField();
        jtxtApellido_ = new javax.swing.JTextField();
        jtxtDireccion_ = new javax.swing.JTextField();
        jtxtEmail_ = new javax.swing.JTextField();
        jtxtPass_ = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO DE CLIENTE");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        derecha1.setBackground(new java.awt.Color(176, 18, 129));
        derecha1.setMinimumSize(new java.awt.Dimension(550, 600));
        derecha1.setName(""); // NOI18N
        derecha1.setPreferredSize(new java.awt.Dimension(550, 600));
        derecha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blank(evt);
            }
        });
        derecha1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(104, 17, 130));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(104, 17, 130));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Sprite-0002.png"))); // NOI18N
        derecha1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jbtnIniciarSesion1.setBackground(new java.awt.Color(230, 226, 32));
        jbtnIniciarSesion1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jbtnIniciarSesion1.setForeground(new java.awt.Color(176, 18, 129));
        jbtnIniciarSesion1.setText("VOLVER");
        jbtnIniciarSesion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnIniciarSesion1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnIniciarSesion1MouseExited(evt);
            }
        });
        jbtnIniciarSesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIniciarSesion1ActionPerformed(evt);
            }
        });
        derecha1.add(jbtnIniciarSesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 240, 40));

        jbtnRegistrarme.setBackground(new java.awt.Color(230, 226, 32));
        jbtnRegistrarme.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jbtnRegistrarme.setForeground(new java.awt.Color(176, 18, 129));
        jbtnRegistrarme.setText("REGISTRARME");
        jbtnRegistrarme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnRegistrarmeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnRegistrarmeMouseExited(evt);
            }
        });
        jbtnRegistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarmeActionPerformed(evt);
            }
        });
        derecha1.add(jbtnRegistrarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 240, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        derecha1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 200, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        derecha1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 200, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        derecha1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 200, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        derecha1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 200, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        derecha1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 200, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        derecha1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 200, -1));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        derecha1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 200, -1));

        jtxtNombre_.setBackground(new java.awt.Color(176, 18, 129));
        jtxtNombre_.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jtxtNombre_.setForeground(new java.awt.Color(204, 204, 204));
        jtxtNombre_.setText("Nombre");
        jtxtNombre_.setToolTipText("Nombre");
        jtxtNombre_.setBorder(null);
        jtxtNombre_.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldFocusLost(evt);
            }
        });
        derecha1.add(jtxtNombre_, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 200, 30));

        jtxtDNI_.setBackground(new java.awt.Color(176, 18, 129));
        jtxtDNI_.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jtxtDNI_.setForeground(new java.awt.Color(204, 204, 204));
        jtxtDNI_.setText("DNI");
        jtxtDNI_.setToolTipText("DNI");
        jtxtDNI_.setBorder(null);
        jtxtDNI_.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldFocusLost(evt);
            }
        });
        derecha1.add(jtxtDNI_, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 200, 30));

        jtxtCelular_.setBackground(new java.awt.Color(176, 18, 129));
        jtxtCelular_.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jtxtCelular_.setForeground(new java.awt.Color(204, 204, 204));
        jtxtCelular_.setText("Celular");
        jtxtCelular_.setToolTipText("Celular");
        jtxtCelular_.setBorder(null);
        jtxtCelular_.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldFocusLost(evt);
            }
        });
        derecha1.add(jtxtCelular_, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 200, 30));

        jtxtApellido_.setBackground(new java.awt.Color(176, 18, 129));
        jtxtApellido_.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jtxtApellido_.setForeground(new java.awt.Color(204, 204, 204));
        jtxtApellido_.setText("Apellidos");
        jtxtApellido_.setToolTipText("Apellidos");
        jtxtApellido_.setBorder(null);
        jtxtApellido_.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldFocusLost(evt);
            }
        });
        derecha1.add(jtxtApellido_, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 200, 30));

        jtxtDireccion_.setBackground(new java.awt.Color(176, 18, 129));
        jtxtDireccion_.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jtxtDireccion_.setForeground(new java.awt.Color(204, 204, 204));
        jtxtDireccion_.setText("Dirección");
        jtxtDireccion_.setToolTipText("Dirección");
        jtxtDireccion_.setBorder(null);
        jtxtDireccion_.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldFocusLost(evt);
            }
        });
        derecha1.add(jtxtDireccion_, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 200, 30));

        jtxtEmail_.setBackground(new java.awt.Color(176, 18, 129));
        jtxtEmail_.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jtxtEmail_.setForeground(new java.awt.Color(204, 204, 204));
        jtxtEmail_.setText("Correo");
        jtxtEmail_.setToolTipText("Correo");
        jtxtEmail_.setBorder(null);
        jtxtEmail_.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldFocusLost(evt);
            }
        });
        derecha1.add(jtxtEmail_, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 200, 30));

        jtxtPass_.setBackground(new java.awt.Color(176, 18, 129));
        jtxtPass_.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jtxtPass_.setForeground(new java.awt.Color(204, 204, 204));
        jtxtPass_.setText("Contraseña");
        jtxtPass_.setToolTipText("Contraseña");
        jtxtPass_.setBorder(null);
        jtxtPass_.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldFocusLost(evt);
            }
        });
        derecha1.add(jtxtPass_, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(derecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(derecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnIniciarSesion1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnIniciarSesion1MouseEntered
        jbtnIniciarSesion1.setBorderPainted(false);
        jbtnIniciarSesion1.setFocusPainted(false);
        ButtonAnimationUtils.animateButtonOnMouseEnter(jbtnIniciarSesion1);
    }//GEN-LAST:event_jbtnIniciarSesion1MouseEntered

    private void jbtnIniciarSesion1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnIniciarSesion1MouseExited
        ButtonAnimationUtils.resetButtonSizeOnMouseExit((JButton) evt.getSource());
    }//GEN-LAST:event_jbtnIniciarSesion1MouseExited

    private void jbtnIniciarSesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIniciarSesion1ActionPerformed

        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);//Centra el formulario
        this.dispose();
    }//GEN-LAST:event_jbtnIniciarSesion1ActionPerformed

    private void jbtnRegistrarmeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnRegistrarmeMouseEntered
        jbtnRegistrarme.setBorderPainted(false);
        jbtnRegistrarme.setFocusPainted(false);
        ButtonAnimationUtils.animateButtonOnMouseEnter(jbtnRegistrarme);
    }//GEN-LAST:event_jbtnRegistrarmeMouseEntered

    private void jbtnRegistrarmeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnRegistrarmeMouseExited
        ButtonAnimationUtils.resetButtonSizeOnMouseExit(jbtnRegistrarme);    // TODO add your handling code here:
    }//GEN-LAST:event_jbtnRegistrarmeMouseExited

    private void jbtnRegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarmeActionPerformed
        String DNI=this.jtxtDNI_.getText();
        String Nombre=this.jtxtNombre_.getText();
        String Apellido=this.jtxtApellido_.getText();
        String Direccion=this.jtxtDireccion_.getText();
        String Celular=this.jtxtCelular_.getText();
        String Email=this.jtxtEmail_.getText();
        char[] passwordString=this.jtxtPass_.getPassword();
        String Pass = new String(passwordString);
        
        Cliente cl=new Cliente(DNI, Nombre, Apellido, Direccion, Celular, Email, Pass);
        
        cl.RegistroDB();
        
        this.dispose();
    }//GEN-LAST:event_jbtnRegistrarmeActionPerformed

    private void jTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFocusGained
        TextFieldUtils.setupClearTextOnFirstClick((JTextField) evt.getSource());
    }//GEN-LAST:event_jTextFieldFocusGained

    private void jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFocusLost
        TextFieldUtils.setupClearTextOnFirstClickOff((JTextField) evt.getSource());
    }//GEN-LAST:event_jTextFieldFocusLost

    private void blank(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blank
        // TODO add your handling code here:
    }//GEN-LAST:event_blank

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel derecha1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton jbtnIniciarSesion1;
    private javax.swing.JButton jbtnRegistrarme;
    private javax.swing.JTextField jtxtApellido_;
    private javax.swing.JTextField jtxtCelular_;
    private javax.swing.JTextField jtxtDNI_;
    private javax.swing.JTextField jtxtDireccion_;
    private javax.swing.JTextField jtxtEmail_;
    private javax.swing.JTextField jtxtNombre_;
    private javax.swing.JPasswordField jtxtPass_;
    // End of variables declaration//GEN-END:variables
}
