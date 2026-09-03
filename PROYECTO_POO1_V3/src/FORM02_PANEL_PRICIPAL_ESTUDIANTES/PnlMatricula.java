package FORM02_PANEL_PRICIPAL_ESTUDIANTES;

import BASE_DE_dATOS.CLASS_MAIN_CAPTURA;
import CLASESCURSO_DETALLECLASE.CURSO;
import CLASESCURSO_DETALLECLASE.MATRICULA;
import CLASES_HUMANO.ALUMNO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PnlMatricula extends javax.swing.JPanel {

    CLASS_MAIN_CAPTURA bd = new CLASS_MAIN_CAPTURA();

    ArrayList<MATRICULA> matricula;
    ArrayList<CURSO> cursos;
    ALUMNO a;

    private DefaultTableModel TablaCursos;

    public PnlMatricula(ArrayList<CURSO> cursos, ArrayList<MATRICULA> matricula, ALUMNO a) {
        initComponents();
        this.cursos = cursos;
        this.matricula = matricula;
        this.a = a;
        TablaCursos = (DefaultTableModel) jTable1.getModel();
        btnMatricular.setEnabled(false);
        descargar();
        CargarDatosAlumnos();
        inicializarTabla();
        cargarCursosEnTabla();
    }

    void cargar() {
        bd.setarraymatricula(matricula);
    }

    void descargar() {
        matricula = bd.getarraymatricula();
        cursos = bd.getarraycurso();
    }

    void CargarDatosAlumnos() {
        if (a != null && a.getCodigo() != null) {
            lbldatosalumno.setText(" " + a.getCodigo() + " - " + a.getNombre_completo());
        } else {
            lbldatosalumno.setText(" null");
        }
    }

    private void inicializarTabla() {
        String[] columnas = {
            "N°", "CODIGO", "NOMBRE CURSO", "CICLO",
            "EST", "NC", "NV", "*", "GRUPO"
        };

        jTable1.getTableHeader().setReorderingAllowed(false);
        TablaCursos = new DefaultTableModel(columnas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 7) {
                    return Boolean.class;
                }
                return super.getColumnClass(columnIndex);
            }
        };

        jTable1.setModel(TablaCursos);

        int[] anchos = {40, 90, 210, 55, 45, 45, 45, 35, 65};
        for (int i = 0; i < anchos.length; i++) {
            jTable1.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
    }

    private void cargarCursosEnTabla() {
        TablaCursos.setRowCount(0);

        if (cursos == null || cursos.isEmpty()) {
            return;
        }
        int orden = 1;
        for (CURSO c : cursos) {
            String codigo;
            if (c.getCodigo() != null) {
                codigo = c.getCodigo();
            } else {
                codigo = "";
            }
            String nombre;
            if (c.getNombrecurso() != null) {
                nombre = c.getNombrecurso();
            } else {
                nombre = "";
            }
            int creditos = c.getCredito();
            Object[] fila = new Object[]{orden, codigo, nombre, "05", "P", creditos, 0, false, ""};
            TablaCursos.addRow(fila);
            orden++;
        }
    }

    private void seleccionarFilaTabla() {
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada != -1) {

            Object estadoObj = jTable1.getValueAt(filaSeleccionada, 4);
            Object checkObj = jTable1.getValueAt(filaSeleccionada, 7);

            String estado = "";
            if (estadoObj != null) {
                estado = estadoObj.toString();
            }
            boolean estaCheck = false;
            if (checkObj instanceof Boolean) {
                estaCheck = (Boolean) checkObj;
            }
            Object valorN = jTable1.getValueAt(filaSeleccionada, 0);
            if (valorN != null) {
                txtN.setText(valorN.toString());
            } else {
                txtN.setText("");
            }
            Object valorCodigo = jTable1.getValueAt(filaSeleccionada, 1);
            if (valorCodigo != null) {
                txtCodigo.setText(valorCodigo.toString());
            } else {
                txtCodigo.setText("");
            }
            Object valorCurso = jTable1.getValueAt(filaSeleccionada, 2);
            if (valorCurso != null) {
                txtCurso.setText(valorCurso.toString());
            } else {
                txtCurso.setText("");
            }
            Object valorCR = jTable1.getValueAt(filaSeleccionada, 5);
            if (valorCR != null) {
                txtCR.setText(valorCR.toString());
            } else {
                txtCR.setText("");
            }
            Object valorGrupo = jTable1.getValueAt(filaSeleccionada, 8);
            if (valorGrupo != null && !valorGrupo.toString().trim().isEmpty()) {
                cboGrupo.setSelectedItem(valorGrupo.toString().trim());
            } else {
                cboGrupo.setSelectedIndex(0);
            }

            if (estado.equals("M") || estaCheck == true) {
                btnMatricular.setEnabled(false);
            } else {
                btnMatricular.setEnabled(true);
            }
        }
    }

    private void limpiarCampos() {
        txtN.setText("");
        txtCodigo.setText("");
        txtCurso.setText("");
        txtCR.setText("");
        if (cboGrupo.getItemCount() > 0) {
            cboGrupo.setSelectedIndex(0);
        }
        jTable1.clearSelection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlCentral = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbldatosalumno = new javax.swing.JLabel();
        LblFecha = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblNroFicha = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblPromedioPonderado = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblOrdenMerito = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblOrdenMatricula = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblNMaximoCursos = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblCreditosAprobados = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblCreditosMatricular = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblCursosMatricular = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblMaximoCreditos = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblCicloRelativo = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtN = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtCurso = new javax.swing.JTextField();
        txtCR = new javax.swing.JTextField();
        cboGrupo = new javax.swing.JComboBox<>();
        btnMatricular = new javax.swing.JButton();

        setBackground(new java.awt.Color(244, 246, 249));
        setPreferredSize(new java.awt.Dimension(800, 580));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(244, 246, 249));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(20, 30, 45));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ficha de Matrícula");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pnlCentral.setBackground(new java.awt.Color(255, 255, 255));
        pnlCentral.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(225, 230, 235), 1, true), javax.swing.BorderFactory.createEmptyBorder(10, 15, 10, 15)));
        jPanel2.setLayout(new java.awt.GridLayout(2, 2));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("     Escuela: Ingenieria de Sistemas");
        jPanel2.add(jLabel3);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("                                         Periodo:   2026-I");
        jPanel2.add(jLabel5);

        lbldatosalumno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbldatosalumno.setText("     Alumno:  ");
        jPanel2.add(lbldatosalumno);

        LblFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblFecha.setText("                                         Fecha: ");
        jPanel2.add(LblFecha);

        pnlCentral.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(225, 230, 235), 1, true), javax.swing.BorderFactory.createEmptyBorder(10, 15, 10, 15)));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Nro de Ficha:");

        lblNroFicha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNroFicha.setText("0000-212-3323-2933");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNroFicha, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblNroFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel3.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridLayout(3, 6));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("  Promedio Ponderado:");
        jPanel6.add(jLabel6);

        lblPromedioPonderado.setText("  13.33");
        jPanel6.add(lblPromedioPonderado);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Orden de Merito:");
        jPanel6.add(jLabel9);

        lblOrdenMerito.setText("  5000");
        jPanel6.add(lblOrdenMerito);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Orden de Matricula:");
        jPanel6.add(jLabel11);

        lblOrdenMatricula.setText("156");
        jPanel6.add(lblOrdenMatricula);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("  N° Máximo de Cursos:");
        jPanel6.add(jLabel13);

        lblNMaximoCursos.setText("  8");
        jPanel6.add(lblNMaximoCursos);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Creditos Aprobados:");
        jPanel6.add(jLabel15);

        lblCreditosAprobados.setText("   21");
        jPanel6.add(lblCreditosAprobados);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Creditos a Matricular: ");
        jPanel6.add(jLabel17);

        lblCreditosMatricular.setText("19");
        jPanel6.add(lblCreditosMatricular);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("  Cursos a Matricular: ");
        jPanel6.add(jLabel19);

        lblCursosMatricular.setText("  8");
        jPanel6.add(lblCursosMatricular);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("N° Máximo de Creditos: ");
        jPanel6.add(jLabel21);

        lblMaximoCreditos.setText("   21");
        jPanel6.add(lblMaximoCreditos);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("Ciclo Relativo:");
        jPanel6.add(jLabel23);

        lblCicloRelativo.setText("II");
        jPanel6.add(lblCicloRelativo);

        jPanel7.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        txtN.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N°", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtN.setEnabled(false);
        txtN.addActionListener(this::txtNActionPerformed);

        txtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CODIGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(this::txtCodigoActionPerformed);

        txtCurso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CURSO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtCurso.setEnabled(false);
        txtCurso.addActionListener(this::txtCursoActionPerformed);

        txtCR.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N° CR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtCR.setEnabled(false);
        txtCR.addActionListener(this::txtCRActionPerformed);

        cboGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "A", "B" }));
        cboGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Grupo"));
        cboGrupo.addActionListener(this::cboGrupoActionPerformed);

        btnMatricular.setBackground(new java.awt.Color(15, 66, 45));
        btnMatricular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMatricular.setForeground(new java.awt.Color(255, 255, 255));
        btnMatricular.setText("MATRICULAR");
        btnMatricular.addActionListener(this::btnMatricularActionPerformed);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCR, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMatricular, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnMatricular, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(cboGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel7, java.awt.BorderLayout.CENTER);

        pnlCentral.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(pnlCentral, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCursoActionPerformed

    private void txtCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCRActionPerformed

    private void btnMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricularActionPerformed
//        MATRICULA m = new MATRICULA();
//        m.setAlumno(a);
//        matricula.add(m);
//        bd.setarraymatricula(matricula);
        int filaSeleccionada = jTable1.getSelectedRow();

        if (filaSeleccionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, selecciona un curso de la tabla.");
            return;
        }
        if (cboGrupo.getSelectedIndex() == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecciona un grupo válido (A o B).");
            return;
        }
        String grupoSeleccionado = cboGrupo.getSelectedItem().toString();
        jTable1.setValueAt("M", filaSeleccionada, 4);
        jTable1.setValueAt(true, filaSeleccionada, 7);
        jTable1.setValueAt(grupoSeleccionado, filaSeleccionada, 8);
        if (matricula == null) {
            matricula = new ArrayList<>();
        }
        MATRICULA m = new MATRICULA();
        m.setAlumno(a);
        if (cursos != null && filaSeleccionada < cursos.size()) {
            m.setCurso(cursos.get(filaSeleccionada));
        }
        m.setCiclorelativo("V");
        m.setEstado("En Curso");
        try {
            Object crObj = jTable1.getValueAt(filaSeleccionada, 5);
            if (crObj != null) {
                m.setCreditos(Integer.parseInt(crObj.toString()));
            }
        } catch (Exception ex) {
            m.setCreditos(3);
        }
        matricula.add(m);
        System.out.println("antes");
        bd.setarraymatricula(matricula);
        System.out.println("despues");
        JOptionPane.showMessageDialog(this, "Curso matriculado correctamente.");
        btnMatricular.setEnabled(false);
        limpiarCampos();
    }//GEN-LAST:event_btnMatricularActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        seleccionarFilaTabla();
    }//GEN-LAST:event_jTable1MouseClicked

    private void cboGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGrupoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblFecha;
    private javax.swing.JButton btnMatricular;
    private javax.swing.JComboBox<String> cboGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCicloRelativo;
    private javax.swing.JLabel lblCreditosAprobados;
    private javax.swing.JLabel lblCreditosMatricular;
    private javax.swing.JLabel lblCursosMatricular;
    private javax.swing.JLabel lblMaximoCreditos;
    private javax.swing.JLabel lblNMaximoCursos;
    private javax.swing.JLabel lblNroFicha;
    private javax.swing.JLabel lblOrdenMatricula;
    private javax.swing.JLabel lblOrdenMerito;
    private javax.swing.JLabel lblPromedioPonderado;
    private javax.swing.JLabel lbldatosalumno;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JTextField txtCR;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtN;
    // End of variables declaration//GEN-END:variables
}
