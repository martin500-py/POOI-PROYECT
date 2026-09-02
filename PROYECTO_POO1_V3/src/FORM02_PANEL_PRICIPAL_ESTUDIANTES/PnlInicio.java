
package FORM02_PANEL_PRICIPAL_ESTUDIANTES;

import BASE_DE_dATOS.CLASS_MAIN_CAPTURA;
import CLASESCURSO_DETALLECLASE.MATRICULA;
import CLASES_HUMANO.ALUMNO;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;


public class PnlInicio extends javax.swing.JPanel {

 CLASS_MAIN_CAPTURA bd=new CLASS_MAIN_CAPTURA();

     ArrayList<MATRICULA> matricula;
     
     
     DefaultTableModel tbl=new DefaultTableModel();
     
    public PnlInicio(ALUMNO a) {
        initComponents();
        descargar();
        
        lblbienvenida.setText("!Bienvenido denuevo "+a.getNombre_completo()+"¡");
        lbldate.setText(""+dia()+", "+LocalDate.now());
        tblhorario.setModel(tbl);
    }
    
    
    
    void llenartabla(){
        
        tbl.addRow(new Object[] {"Ponemos dato hora","Ponemos dato curso"}); //por agregar
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
  
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 void cargar(){
        bd.setarraymatricula(matricula);
    }
    
    void descargar(){
        matricula=bd.getarraymatricula();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  String dia(){
         LocalDate hoy = LocalDate.now();

       
        Locale espanol = Locale.forLanguageTag("es");
        String nombreDia = hoy.getDayOfWeek().getDisplayName(TextStyle.FULL, espanol);

        
        nombreDia = nombreDia.substring(0, 1).toUpperCase() + nombreDia.substring(1);
        
return nombreDia;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblbienvenida = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pnlCursosMatri = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlPromedio = new javax.swing.JPanel();
        lblTextPromedio = new javax.swing.JLabel();
        lblPromedio = new javax.swing.JLabel();
        pnlProximaClase = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlFECHA = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblhorario = new javax.swing.JTable();

        setBackground(new java.awt.Color(244, 246, 249));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblbienvenida.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblbienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblbienvenida.setText("¡BIENVENIDO DE NUEVO USARIO!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(lblbienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblbienvenida)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCursosMatri.setBackground(new java.awt.Color(255, 255, 255));
        pnlCursosMatri.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(225, 230, 235), 1, true), javax.swing.BorderFactory.createEmptyBorder(15, 20, 15, 20)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Cursos Matriculados");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setText("0");

        javax.swing.GroupLayout pnlCursosMatriLayout = new javax.swing.GroupLayout(pnlCursosMatri);
        pnlCursosMatri.setLayout(pnlCursosMatriLayout);
        pnlCursosMatriLayout.setHorizontalGroup(
            pnlCursosMatriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCursosMatriLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlCursosMatriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pnlCursosMatriLayout.setVerticalGroup(
            pnlCursosMatriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCursosMatriLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.add(pnlCursosMatri, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 220, 110));

        pnlPromedio.setBackground(new java.awt.Color(255, 255, 255));
        pnlPromedio.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(225, 230, 235), 1, true), javax.swing.BorderFactory.createEmptyBorder(15, 20, 15, 20)));

        lblTextPromedio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTextPromedio.setText("Promedio Ponderado");

        lblPromedio.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblPromedio.setText("0");

        javax.swing.GroupLayout pnlPromedioLayout = new javax.swing.GroupLayout(pnlPromedio);
        pnlPromedio.setLayout(pnlPromedioLayout);
        pnlPromedioLayout.setHorizontalGroup(
            pnlPromedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPromedioLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(pnlPromedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTextPromedio))
                .addGap(21, 21, 21))
        );
        pnlPromedioLayout.setVerticalGroup(
            pnlPromedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPromedioLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(lblTextPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel3.add(pnlPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 220, 110));

        pnlProximaClase.setBackground(new java.awt.Color(255, 255, 255));
        pnlProximaClase.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(225, 230, 235), 1, true), javax.swing.BorderFactory.createEmptyBorder(15, 20, 15, 20)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("PROXIMA CLASE");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("SISTEMA DIGITALES");

        javax.swing.GroupLayout pnlProximaClaseLayout = new javax.swing.GroupLayout(pnlProximaClase);
        pnlProximaClase.setLayout(pnlProximaClaseLayout);
        pnlProximaClaseLayout.setHorizontalGroup(
            pnlProximaClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProximaClaseLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlProximaClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlProximaClaseLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlProximaClaseLayout.setVerticalGroup(
            pnlProximaClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProximaClaseLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel3.add(pnlProximaClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 220, 110));

        pnlFECHA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("HORARIO DEL DIA");
        pnlFECHA.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 190, 20));

        lbldate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbldate.setText("Lunes, 27 de Agosto del 2026");
        pnlFECHA.add(lbldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 210, -1));

        jPanel3.add(pnlFECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 730, 30));

        tblhorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"9:30 - 11:00 ", "Sistemas Digitales"},
                {null, null}
            },
            new String [] {
                "HORA", "ASIGNATURA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblhorario);
        if (tblhorario.getColumnModel().getColumnCount() > 0) {
            tblhorario.getColumnModel().getColumn(0).setPreferredWidth(120);
            tblhorario.getColumnModel().getColumn(1).setPreferredWidth(450);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 730, 280));

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 790, 570));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPromedio;
    private javax.swing.JLabel lblTextPromedio;
    private javax.swing.JLabel lblbienvenida;
    private javax.swing.JLabel lbldate;
    private javax.swing.JPanel pnlCursosMatri;
    private javax.swing.JPanel pnlFECHA;
    private javax.swing.JPanel pnlPromedio;
    private javax.swing.JPanel pnlProximaClase;
    private javax.swing.JTable tblhorario;
    // End of variables declaration//GEN-END:variables
}
