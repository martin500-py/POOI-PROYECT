package FORM02_PANEL_PRICIPAL_ESTUDIANTES;

import BASE_DE_dATOS.CLASS_MAIN_CAPTURA;
import CLASESCURSO_DETALLECLASE.CURSO;
import CLASESCURSO_DETALLECLASE.MATRICULA;
import CLASES_HUMANO.ALUMNO;
import CLASES_HUMANO.DOCENTE;
////////////////////////////////////////////////////////////
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PANEL02_PRINCIPAL_ESTUDIANTES extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PANEL02_PRINCIPAL_ESTUDIANTES.class.getName());
    CLASS_MAIN_CAPTURA bd = new CLASS_MAIN_CAPTURA();
    ALUMNO a = new ALUMNO();//Esto es nuevo

    ArrayList<ALUMNO> alumnos;
    ArrayList<DOCENTE> docentes;
    ArrayList<CURSO> cursos;
    ArrayList<MATRICULA> matricula;

    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///Esto es nuevo 
    
    public PANEL02_PRINCIPAL_ESTUDIANTES() {
        initComponents();
        subirImagenes();
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    public PANEL02_PRINCIPAL_ESTUDIANTES(ALUMNO a) {
        initComponents();
        subirImagenes();
        this.setSize(1050, 680);

        this.setMinimumSize(new java.awt.Dimension(900, 550));
        this.setLocationRelativeTo(null);
        mostrarPanel(new PnlInicio(a));

        //////////////////////////////////
        //////////////////////////////////
        ///Esto es nuevo
        bd.prepararbasededatos();
        this.a = a;
        descargar();
        //////////////////////////////////
        //////////////////////////////////
        ///COMPRUEBO QUE CARGARON CURSOS Y DOCENTES 
        JOptionPane.showMessageDialog(null, "tamanio curso " + cursos.size());
        JOptionPane.showMessageDialog(null, "tamanio docentes " + docentes.size());
        JOptionPane.showMessageDialog(null, "tamanio matricula " + matricula.size());
        JOptionPane.showMessageDialog(null, "El curso " + cursos.get(0).getNombrecurso() + " lo enseña " + cursos.get(0).getDocente().getNombre_completo());

    }

    void subirImagenes() {
        setImagenEscalada(lblLogo, "/IMAGENES/logoUnu.png", 70, 70);
        setImagenEscalada(lblCasa, "/IMAGENES/casa.png", 45, 45);
        setImagenEscalada(lblMatricula, "/IMAGENES/Matricula.png", 45, 45);
        setImagenEscalada(lblBoleta, "/IMAGENES/BoletaNotas.png", 45, 45);
        setImagenEscalada(lblHorario, "/IMAGENES/Horario.png", 45, 45);
        setImagenEscalada(lblApuntes, "/IMAGENES/Apuntes.png", 45, 45);
        setImagenEscalada(lblCerrar, "/IMAGENES/Cerrar.png", 45, 45);
        setImagenEscalada(lblIconUsuario, "/IMAGENES/USER.png", 35, 35);
        aplicarEfectoHover(btnInicio);
        aplicarEfectoHover(btnMatricula);
        aplicarEfectoHover(btnBoleta);
        aplicarEfectoHover(btnHorario);
        aplicarEfectoHover(btnApuntes);
        aplicarEfectoHover(btnCerrar);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void descargar() {
        docentes = bd.getarraydocente();
        cursos = bd.getarraycurso();
        matricula = bd.getarraymatricula();
        lblcodigo.setText(a.getCodigo());
        lblusuario.setText(a.getNombre_completo());
    }

    void cargar() {
        bd.setarraydocente(docentes);
        bd.setarraycurso(cursos);

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void mostrarPanel(JPanel vista) {
        vista.setSize(panelContenedor.getWidth(), panelContenedor.getHeight());
        vista.setLocation(0, 0);
        panelContenedor.removeAll();
        panelContenedor.add(vista, BorderLayout.CENTER);
        panelContenedor.revalidate();
        panelContenedor.repaint();

    }

    public void aplicarEfectoHover(JButton boton) {
        Color colorBase = new Color(15, 66, 45);
        Color colorHover = new Color(27, 85, 60);

        boton.setContentAreaFilled(false);
        boton.setOpaque(true);
        boton.setBackground(colorBase);
        boton.setFocusPainted(false);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                boton.setBackground(colorHover);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton.setBackground(colorBase);
            }
        });
    }

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

        jPanel1 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCasa = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        lblBoleta = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        lblApuntes = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnApuntes = new javax.swing.JButton();
        btnHorario = new javax.swing.JButton();
        btnBoleta = new javax.swing.JButton();
        btnMatricula = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        pnHEAD = new javax.swing.JPanel();
        pnUsuario = new javax.swing.JPanel();
        lblusuario = new javax.swing.JLabel();
        lblcodigo = new javax.swing.JLabel();
        lblIconUsuario = new javax.swing.JLabel();
        panelContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 66, 45));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UCAYALI");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 100, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("UNIVERSIDAD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 100, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NACIONAL DE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 100, 20));
        jPanel1.add(lblCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 60, 50));
        jPanel1.add(lblMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 60, 50));
        jPanel1.add(lblBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 60, 50));
        jPanel1.add(lblHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 60, 50));
        jPanel1.add(lblApuntes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 60, 50));
        jPanel1.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 60, 50));

        btnCerrar.setBackground(new java.awt.Color(15, 66, 45));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("CERRAR SESIÓN");
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCerrar.addActionListener(this::btnCerrarActionPerformed);
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 150, 60));

        btnApuntes.setBackground(new java.awt.Color(15, 66, 45));
        btnApuntes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnApuntes.setForeground(new java.awt.Color(255, 255, 255));
        btnApuntes.setText("MIS APUNTES");
        btnApuntes.setBorderPainted(false);
        btnApuntes.setContentAreaFilled(false);
        btnApuntes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnApuntes.setFocusPainted(false);
        btnApuntes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnApuntes.addActionListener(this::btnApuntesActionPerformed);
        jPanel1.add(btnApuntes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 150, 60));

        btnHorario.setBackground(new java.awt.Color(15, 66, 45));
        btnHorario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHorario.setForeground(new java.awt.Color(255, 255, 255));
        btnHorario.setText("HORARIO");
        btnHorario.setBorderPainted(false);
        btnHorario.setContentAreaFilled(false);
        btnHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHorario.setFocusPainted(false);
        btnHorario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHorario.addActionListener(this::btnHorarioActionPerformed);
        jPanel1.add(btnHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 150, 60));

        btnBoleta.setBackground(new java.awt.Color(15, 66, 45));
        btnBoleta.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnBoleta.setForeground(new java.awt.Color(255, 255, 255));
        btnBoleta.setText("BOLETA DE NOTAS");
        btnBoleta.setBorderPainted(false);
        btnBoleta.setContentAreaFilled(false);
        btnBoleta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBoleta.setFocusPainted(false);
        btnBoleta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBoleta.addActionListener(this::btnBoletaActionPerformed);
        jPanel1.add(btnBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 150, 60));

        btnMatricula.setBackground(new java.awt.Color(15, 66, 45));
        btnMatricula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMatricula.setForeground(new java.awt.Color(255, 255, 255));
        btnMatricula.setText("MATRICULA");
        btnMatricula.setBorderPainted(false);
        btnMatricula.setContentAreaFilled(false);
        btnMatricula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMatricula.setFocusPainted(false);
        btnMatricula.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMatricula.addActionListener(this::btnMatriculaActionPerformed);
        jPanel1.add(btnMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 203, 150, 60));

        btnInicio.setBackground(new java.awt.Color(15, 66, 45));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("INICIO");
        btnInicio.setBorderPainted(false);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setFocusPainted(false);
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioMouseEntered(evt);
            }
        });
        btnInicio.addActionListener(this::btnInicioActionPerformed);
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 150, 60));

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        pnHEAD.setBackground(new java.awt.Color(255, 255, 255));
        pnHEAD.setLayout(new java.awt.BorderLayout());

        pnUsuario.setBackground(new java.awt.Color(255, 255, 255));
        pnUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblusuario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblusuario.setText("USUARIO");
        pnUsuario.add(lblusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, 20));

        lblcodigo.setText("0001234567");
        pnUsuario.add(lblcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 70, -1));
        pnUsuario.add(lblIconUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 40));

        pnHEAD.add(pnUsuario, java.awt.BorderLayout.LINE_END);

        jPanel4.add(pnHEAD, java.awt.BorderLayout.PAGE_START);

        panelContenedor.setBackground(new java.awt.Color(255, 255, 255));
        panelContenedor.setLayout(new java.awt.BorderLayout());
        jPanel4.add(panelContenedor, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoletaActionPerformed
        mostrarPanel(new PnlBoletaNotas(a));
    }//GEN-LAST:event_btnBoletaActionPerformed

    private void btnMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatriculaActionPerformed

        mostrarPanel(new PnlMatricula(cursos, matricula, a));
    }//GEN-LAST:event_btnMatriculaActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        mostrarPanel(new PnlInicio(a));
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorarioActionPerformed
        mostrarPanel(new PnlHorario());        // TODO add your handling code here:
    }//GEN-LAST:event_btnHorarioActionPerformed

    private void btnApuntesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApuntesActionPerformed
        mostrarPanel(new PnlApuntes());
    }//GEN-LAST:event_btnApuntesActionPerformed

    private void btnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseEntered

    }//GEN-LAST:event_btnInicioMouseEntered

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        int confirmar = JOptionPane.showConfirmDialog(this,
                "¿Estás seguro de que deseas cerrar sesión?",
                "Cerrar Sesión",
                JOptionPane.YES_NO_OPTION);

        if (confirmar == JOptionPane.YES_OPTION) {
            this.dispose();
        }

    }//GEN-LAST:event_btnCerrarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new PANEL02_PRINCIPAL_ESTUDIANTES().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApuntes;
    private javax.swing.JButton btnBoleta;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnHorario;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnMatricula;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblApuntes;
    private javax.swing.JLabel lblBoleta;
    private javax.swing.JLabel lblCasa;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblIconUsuario;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel pnHEAD;
    private javax.swing.JPanel pnUsuario;
    // End of variables declaration//GEN-END:variables
}
