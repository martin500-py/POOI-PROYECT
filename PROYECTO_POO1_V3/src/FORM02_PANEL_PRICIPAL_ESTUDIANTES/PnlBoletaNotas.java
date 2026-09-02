
package FORM02_PANEL_PRICIPAL_ESTUDIANTES;

import BASE_DE_dATOS.CLASS_MAIN_CAPTURA;
import CLASESCURSO_DETALLECLASE.MATRICULA;
import CLASES_HUMANO.ALUMNO;
import java.util.ArrayList;


public class PnlBoletaNotas extends javax.swing.JPanel {
    CLASS_MAIN_CAPTURA bd=new CLASS_MAIN_CAPTURA();

     ArrayList<MATRICULA> matricula;
     ALUMNO a;

    public PnlBoletaNotas(ALUMNO a) {
        initComponents();
        descargar();
        this.a=a;
    }
    
    
    void mostrartabla(){
        for (int i = 0; i < matricula.size(); i++) {
            if(matricula.get(i).getAlumno().getDni()==a.getDni()){
                //lenas toda la tabla con datos de matricula
        //tabla.addrow()
            }
            
        }
    }
    
    
    void cargar(){
        bd.setarraymatricula(matricula);
    }
    
    void descargar(){
        matricula=bd.getarraymatricula();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTITULOBOLETA = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lblEscuelaBoleta = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCodigoBoleta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCredLlevadosBoleta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblProPondAcumuladoBoleta = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblAlumnoBoleta = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCredAprobados = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblProPonderadoDel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblboletadenotas = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblTITULOBOLETA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTITULOBOLETA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTITULOBOLETA.setText("BOLETA DE NOTAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(lblTITULOBOLETA, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTITULOBOLETA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        lblEscuelaBoleta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEscuelaBoleta.setText("Escuela: Ingenieria de Sistemas");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEscuelaBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEscuelaBoleta, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(225, 230, 235), 1, true), javax.swing.BorderFactory.createEmptyBorder(10, 15, 10, 15)));
        jPanel4.setLayout(new java.awt.GridLayout(2, 6));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("  Codigo:");
        jPanel4.add(jLabel1);

        lblCodigoBoleta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel4.add(lblCodigoBoleta);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Cred. Llevados:");
        jPanel4.add(jLabel3);

        lblCredLlevadosBoleta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel4.add(lblCredLlevadosBoleta);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Pro.Pond.Acumulado");
        jPanel4.add(jLabel5);

        lblProPondAcumuladoBoleta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel4.add(lblProPondAcumuladoBoleta);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("  Alumno:");
        jPanel4.add(jLabel7);

        lblAlumnoBoleta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel4.add(lblAlumnoBoleta);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Cred. Aprobados:");
        jPanel4.add(jLabel9);

        lblCredAprobados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel4.add(lblCredAprobados);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel11.setText("Pro.Ponderado.Del");
        jPanel4.add(jLabel11);

        lblProPonderadoDel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel4.add(lblProPonderadoDel);

        jPanel3.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tblboletadenotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "N°", "Codigo de Curso", "Nombre de Curso", "Creditos", "Nota Final", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblboletadenotas);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlumnoBoleta;
    private javax.swing.JLabel lblCodigoBoleta;
    private javax.swing.JLabel lblCredAprobados;
    private javax.swing.JLabel lblCredLlevadosBoleta;
    private javax.swing.JLabel lblEscuelaBoleta;
    private javax.swing.JLabel lblProPondAcumuladoBoleta;
    private javax.swing.JLabel lblProPonderadoDel;
    private javax.swing.JLabel lblTITULOBOLETA;
    private javax.swing.JTable tblboletadenotas;
    // End of variables declaration//GEN-END:variables
}
