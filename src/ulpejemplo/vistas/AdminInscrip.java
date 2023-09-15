/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulpejemplo.vistas;

/**
 *
 * @author marti
 */
public class AdminInscrip extends javax.swing.JInternalFrame {

    /**
     * Creates new form AdminInscrip
     */
    public AdminInscrip() {
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

        jLinscripciones = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLselecEstud = new javax.swing.JLabel();
        jCBselecEstud = new javax.swing.JComboBox<>();
        jLlistaMaterias = new javax.swing.JLabel();
        jRBmateNOInscri = new javax.swing.JRadioButton();
        jRBmateInscri = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtablaMaterias = new javax.swing.JTable();
        jBinscribir = new javax.swing.JButton();
        jBanularInscri = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();

        setClosable(true);
        setTitle("Gestión de Inscripciones");

        jLinscripciones.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        jLinscripciones.setText("Inscripciones");

        jLselecEstud.setText("Seleccione Estudiante");

        jCBselecEstud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante" }));

        jLlistaMaterias.setText("Lista de Materias");

        jRBmateNOInscri.setText("Materias No Inscriptas");
        jRBmateNOInscri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBmateNOInscriActionPerformed(evt);
            }
        });

        jRBmateInscri.setText("Materias Inscriptas");
        jRBmateInscri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBmateInscriActionPerformed(evt);
            }
        });

        jTtablaMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTtablaMaterias);

        jBinscribir.setText("Inscribir");

        jBanularInscri.setText("Anular Inscripción");

        jBsalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLinscripciones))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLselecEstud)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBselecEstud, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLlistaMaterias)))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBinscribir)
                        .addGap(38, 38, 38)
                        .addComponent(jBanularInscri)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBsalir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jRBmateInscri)
                        .addGap(42, 42, 42)
                        .addComponent(jRBmateNOInscri)))
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLinscripciones)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLselecEstud)
                    .addComponent(jCBselecEstud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLlistaMaterias)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBmateNOInscri)
                    .addComponent(jRBmateInscri))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBinscribir)
                    .addComponent(jBanularInscri)
                    .addComponent(jBsalir))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBmateInscriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBmateInscriActionPerformed
        // si uno está ON, el otro está OFF y viceversa
        if (jRBmateInscri.isSelected()) 
        {
            jRBmateNOInscri.setSelected(false);
            jBanularInscri.setEnabled(true);
            jBinscribir.setEnabled(false);
        }
        
    }//GEN-LAST:event_jRBmateInscriActionPerformed

    private void jRBmateNOInscriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBmateNOInscriActionPerformed
        // si uno está ON, el otro está OFF y viceversa
        if (jRBmateNOInscri.isSelected()) 
        {
            jRBmateInscri.setSelected(false);
            jBinscribir.setEnabled(true);
            jBanularInscri.setEnabled(false);
        }
    }//GEN-LAST:event_jRBmateNOInscriActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBanularInscri;
    private javax.swing.JButton jBinscribir;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<String> jCBselecEstud;
    private javax.swing.JLabel jLinscripciones;
    private javax.swing.JLabel jLlistaMaterias;
    private javax.swing.JLabel jLselecEstud;
    private javax.swing.JRadioButton jRBmateInscri;
    private javax.swing.JRadioButton jRBmateNOInscri;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTtablaMaterias;
    // End of variables declaration//GEN-END:variables
}
