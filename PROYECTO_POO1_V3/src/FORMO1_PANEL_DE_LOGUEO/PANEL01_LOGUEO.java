package FORMO1_PANEL_DE_LOGUEO;

import CLASESCURSO_DETALLECLASE.CURSO;
import CLASESCURSO_DETALLECLASE.MATRICULA;
import CLASES_HUMANO.ALUMNO;
import BASE_DE_dATOS.CLASS_MAIN_CAPTURA;
import CLASES_HUMANO.DOCENTE;
import FORM02_PANEL_PRICIPAL_ESTUDIANTES.PANEL02_PRINCIPAL_ESTUDIANTES;
import java.awt.Color;

import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PANEL01_LOGUEO extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PANEL01_LOGUEO.class.getName());

    CLASS_MAIN_CAPTURA bd = new CLASS_MAIN_CAPTURA();
    private String tipoUsuario = "";

    ArrayList<ALUMNO> alumnos;
    ArrayList<DOCENTE> docentes;
    ArrayList<MATRICULA> matriculas;
    ArrayList<CURSO> cursos;
    
    private int prueba;

    boolean escoge = true;

    public PANEL01_LOGUEO() {
        initComponents();
        setImagenEscalada(lblPortada, "/IMAGENES/portada.png", 400, 500);
        setImagenEscalada(lblDNI, "/IMAGENES/Recurso 1.png", 30, 20);
        setImagenEscalada(lblCONTRA, "/IMAGENES/Recurso 2.png", 25, 25);
        setImagenEscalada(lblLogoUnu, "/IMAGENES/logoUnu.png", 65, 70);
        setShape(new java.awt.geom.RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 25, 25));
        setLocationRelativeTo(null);

        bd.prepararbasededatos();
        descargar();

        JOptionPane.showMessageDialog(null, "tamanio alumnos " + alumnos.size());
        JOptionPane.showMessageDialog(null, "tamanio deocentes " + docentes.size());

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       void descargar() {
        docentes = bd.getarraydocente();
        alumnos = bd.getarrayalumno();
    }

    void cargar() {

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    
    ALUMNO validacion1() {
        if (txtcontraseña.getText().equals("") || txtcodigo.getText().equals("")) {

            return null;
        } else {

            for (ALUMNO a : alumnos) {
                if (a.getCodigo().equals(txtcodigo.getText()) && a.getContraseña().equals(txtcontraseña.getText())) {
                    return a;
                }

            }
        }

        return null;
    }

    DOCENTE validacion2() {
        if (txtcontraseña.getText().equals("") || txtcodigo.getText().equals("")) {
            return null;
        } else {

            for (DOCENTE d : docentes) {
                if (d.getCodigo().equals(txtcodigo.getText()) && d.getContraseña().equals(txtcontraseña.getText())) {
                    return d;
                }

            }
        }

        return null;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    void limpiar() {
        txtcodigo.setText("");
        txtcontraseña.setText("");
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   public void setImagenEscalada(JLabel label, String rutaImagen, int ancho, int alto) {
        URL url = getClass().getResource(rutaImagen);
        if (url != null) {
            ImageIcon iconoOriginal = new ImageIcon(url);

            Image imagenAjustada = iconoOriginal.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);

            label.setIcon(new ImageIcon(imagenAjustada));
        } else {
            System.err.println("Error: No se encontró la imagen en: " + rutaImagen);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblPortada = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcod = new javax.swing.JLabel();
        txtcon = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        lblCONTRA = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        btnDocente = new javax.swing.JButton();
        btnEstudiante = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        lblLogoUnu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(lblPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 440));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("INICIO DE SESIÓN ACADÉMICO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txtcod.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtcod.setText("CÓDIGO DE ESTUDIANTE");
        jPanel1.add(txtcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 133, -1, -1));

        txtcon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtcon.setText("CONTRASEÑA");
        jPanel1.add(txtcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 211, 139, -1));
        jPanel1.add(lblDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 40, 30));
        jPanel1.add(lblCONTRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 40, 40));

        txtcontraseña.setBackground(new java.awt.Color(240, 243, 246));
        txtcontraseña.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 225, 230), 1, true), javax.swing.BorderFactory.createEmptyBorder(5, 38, 5, 12)));
        txtcontraseña.addActionListener(this::txtcontraseñaActionPerformed);
        txtcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontraseñaKeyTyped(evt);
            }
        });
        jPanel1.add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 293, 38));

        txtcodigo.setBackground(new java.awt.Color(240, 243, 246));
        txtcodigo.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 225, 230), 1, true), javax.swing.BorderFactory.createEmptyBorder(5, 38, 5, 12)));
        txtcodigo.addActionListener(this::txtcodigoActionPerformed);
        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodigoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoKeyTyped(evt);
            }
        });
        jPanel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 155, 293, 38));

        btnDocente.setBackground(new java.awt.Color(41, 128, 185));
        btnDocente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDocente.setForeground(new java.awt.Color(255, 255, 255));
        btnDocente.setText("SOY DOCENTE");
        btnDocente.setBorder(null);
        btnDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDocenteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDocenteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDocenteMouseExited(evt);
            }
        });
        btnDocente.addActionListener(this::btnDocenteActionPerformed);
        jPanel1.add(btnDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 130, 30));

        btnEstudiante.setBackground(new java.awt.Color(41, 128, 185));
        btnEstudiante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        btnEstudiante.setText("SOY ESTUDIANTE");
        btnEstudiante.setBorder(null);
        btnEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstudianteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEstudianteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEstudianteMouseExited(evt);
            }
        });
        btnEstudiante.addActionListener(this::btnEstudianteActionPerformed);
        jPanel1.add(btnEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 140, 30));

        btnIngresar.setBackground(new java.awt.Color(26, 161, 142));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(this::btnIngresarActionPerformed);
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 160, 42));
        jPanel1.add(lblLogoUnu, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 70, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Versión 3.1.0");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 160, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 340, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocenteActionPerformed
        txtcod.setText("CODIGO DE DOCENTE");

        escoge = false;
        limpiar();
    }//GEN-LAST:event_btnDocenteActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        if (escoge) {

            if (validacion1() != null) {
                PANEL02_PRINCIPAL_ESTUDIANTES p2 = new PANEL02_PRINCIPAL_ESTUDIANTES(validacion1());

                p2.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No existe el Alumno");
            }
        } else {
            if (validacion2() != null) {
                //aca me abres el jframe de docente.......................
            } else {

                JOptionPane.showMessageDialog(null, "No existe el Docente");
            }
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraseñaActionPerformed

    private void btnEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudianteActionPerformed
        txtcod.setText("CODIGO DE ESTUDIANTE");
        escoge = true;
        limpiar();
    }//GEN-LAST:event_btnEstudianteActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed

    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtcodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoKeyPressed

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped
        char c = evt.getKeyChar();
        int MAX = 10;

        if (txtcodigo.getText().length() >= MAX) {
            evt.consume();
            return;
        }
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcodigoKeyTyped

    private void txtcontraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraseñaKeyTyped
        char c = evt.getKeyChar();
        int MAX = 4;

        if (txtcontraseña.getText().length() >= MAX) {
            evt.consume();
            return;
        }
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcontraseñaKeyTyped

    private void btnEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstudianteMouseClicked
        tipoUsuario = "ESTUDIANTE";
        btnEstudiante.setBackground(Color.BLUE);
        btnDocente.setBackground(new java.awt.Color(41, 128, 185));
    }//GEN-LAST:event_btnEstudianteMouseClicked

    private void btnEstudianteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstudianteMouseEntered
        if (!tipoUsuario.equals("ESTUDIANTE")) {
            btnEstudiante.setBackground(Color.BLUE);
        }
    }//GEN-LAST:event_btnEstudianteMouseEntered

    private void btnEstudianteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstudianteMouseExited
        if (!tipoUsuario.equals("ESTUDIANTE")) {
            btnEstudiante.setBackground(new java.awt.Color(41, 128, 185));
        }
    }//GEN-LAST:event_btnEstudianteMouseExited

    private void btnDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDocenteMouseClicked
        tipoUsuario = "DOCENTE";
        btnDocente.setBackground(Color.BLUE);
        btnEstudiante.setBackground(new java.awt.Color(41, 128, 185));
    }//GEN-LAST:event_btnDocenteMouseClicked

    private void btnDocenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDocenteMouseEntered
        if (!tipoUsuario.equals("DOCENTE")) {
            btnDocente.setBackground(Color.BLUE);
        }
    }//GEN-LAST:event_btnDocenteMouseEntered

    private void btnDocenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDocenteMouseExited
        if (!tipoUsuario.equals("DOCENTE")) {
            btnDocente.setBackground(new java.awt.Color(41, 128, 185));
        }
    }//GEN-LAST:event_btnDocenteMouseExited

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new PANEL01_LOGUEO().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDocente;
    private javax.swing.JButton btnEstudiante;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCONTRA;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblLogoUnu;
    private javax.swing.JLabel lblPortada;
    private javax.swing.JLabel txtcod;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JLabel txtcon;
    private javax.swing.JTextField txtcontraseña;
    // End of variables declaration//GEN-END:variables

    private void setIconImage(JLabel lblPortada, String imageneSportadapng, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
