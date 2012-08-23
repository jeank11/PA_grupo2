package Ventanas;

import Clases.Date;
import Clases.Jugador;
import Clases.ManejadorBD;
import javax.swing.JOptionPane;

public class AltaJugador extends javax.swing.JDialog {

    public AltaJugador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    ManejadorBD mbd = ManejadorBD.getInstancia();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lab_nombre = new javax.swing.JLabel();
        lab_nom_completo = new javax.swing.JLabel();
        lab_fecha_nacimiento = new javax.swing.JLabel();
        lab_nacionalidad = new javax.swing.JLabel();
        lab_posicion = new javax.swing.JLabel();
        lab_altura = new javax.swing.JLabel();
        lab_peso = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        campo_nom_completo = new javax.swing.JTextField();
        campo_mes = new javax.swing.JTextField();
        campo_nacionalidad = new javax.swing.JTextField();
        campo_posicion = new javax.swing.JTextField();
        campo_altura = new javax.swing.JTextField();
        campo_peso = new javax.swing.JTextField();
        panel_imagen = new javax.swing.JPanel();
        boton_confirmar = new javax.swing.JButton();
        boton_sel_imagen = new javax.swing.JButton();
        campo_dia = new javax.swing.JTextField();
        campo_anio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lab_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lab_nombre.setText("Nombre");

        lab_nom_completo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lab_nom_completo.setText("Nombre Completo");

        lab_fecha_nacimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lab_fecha_nacimiento.setText("Fecha de Nacimiento");

        lab_nacionalidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lab_nacionalidad.setText("Nacionalidad");

        lab_posicion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lab_posicion.setText("Posicion");

        lab_altura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lab_altura.setText("Altura");

        lab_peso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lab_peso.setText("Peso");

        campo_nombre.setColumns(15);
        campo_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_nombre.setToolTipText("");

        campo_nom_completo.setColumns(15);
        campo_nom_completo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_nom_completo.setToolTipText("");

        campo_mes.setColumns(2);
        campo_mes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_mes.setText("mes");
        campo_mes.setToolTipText("");
        campo_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_mesActionPerformed(evt);
            }
        });

        campo_nacionalidad.setColumns(15);
        campo_nacionalidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_nacionalidad.setToolTipText("");

        campo_posicion.setColumns(15);
        campo_posicion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_posicion.setToolTipText("");

        campo_altura.setColumns(15);
        campo_altura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_altura.setToolTipText("");

        campo_peso.setColumns(15);
        campo_peso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_peso.setToolTipText("");

        panel_imagen.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_imagenLayout = new javax.swing.GroupLayout(panel_imagen);
        panel_imagen.setLayout(panel_imagenLayout);
        panel_imagenLayout.setHorizontalGroup(
            panel_imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );
        panel_imagenLayout.setVerticalGroup(
            panel_imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );

        boton_confirmar.setText("Confirmar");
        boton_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarAlta(evt);
            }
        });

        boton_sel_imagen.setText("Seleccionar imagen...");
        boton_sel_imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarImagen(evt);
            }
        });

        campo_dia.setColumns(2);
        campo_dia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_dia.setText("dia");
        campo_dia.setToolTipText("");
        campo_dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_diaActionPerformed(evt);
            }
        });

        campo_anio.setColumns(4);
        campo_anio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_anio.setText("año");
        campo_anio.setToolTipText("");
        campo_anio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_anioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(panel_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lab_nom_completo)
                    .addComponent(lab_nacionalidad)
                    .addComponent(lab_altura)
                    .addComponent(lab_posicion)
                    .addComponent(lab_peso)
                    .addComponent(lab_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_peso)
                    .addComponent(campo_nombre)
                    .addComponent(campo_nacionalidad)
                    .addComponent(campo_posicion)
                    .addComponent(campo_altura)
                    .addComponent(campo_nom_completo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(campo_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campo_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campo_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(boton_sel_imagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton_confirmar)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(panel_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab_nombre)
                            .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_nom_completo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lab_nom_completo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab_fecha_nacimiento)
                            .addComponent(campo_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab_nacionalidad)
                            .addComponent(campo_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_posicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lab_posicion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lab_altura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab_peso)
                            .addComponent(campo_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_sel_imagen)
                    .addComponent(boton_confirmar))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarAlta(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarAlta
        String nom, nom_c, nac, pos;
        double altura, peso;
        int dia, mes, anio;
        
        if(campo_nom_completo.getText().equals("")){
            JOptionPane.showMessageDialog(this, "El campo nombre completo no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            nom = campo_nombre.getText();
            nom_c = campo_nom_completo.getText();
            dia = Integer.parseInt(campo_dia.getText());
            mes = Integer.parseInt(campo_mes.getText());
            anio = Integer.parseInt(campo_anio.getText());
            Date fecha_nac = new Date(dia, mes, anio);
            nac = campo_nacionalidad.getText();
            pos = campo_posicion.getText();
            altura = Double.parseDouble(campo_altura.getText());
            peso = Double.parseDouble(campo_peso.getText());
            
            Jugador jugador = new Jugador(nom,nom_c,nac, fecha_nac, pos, altura, peso);
            mbd.insertJugador(jugador);
            dispose();
        }
    }//GEN-LAST:event_confirmarAlta

    private void seleccionarImagen(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarImagen
        javax.swing.JFileChooser sel = new javax.swing.JFileChooser();
        int res = sel.showOpenDialog(null);
        if(res == sel.APPROVE_OPTION){
            java.io.File archivo = sel.getSelectedFile();
        }
        sel.setLocation(300,200);

    }//GEN-LAST:event_seleccionarImagen

    private void campo_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_mesActionPerformed

    private void campo_diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_diaActionPerformed

    private void campo_anioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_anioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_anioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_confirmar;
    private javax.swing.JButton boton_sel_imagen;
    private javax.swing.JTextField campo_altura;
    private javax.swing.JTextField campo_anio;
    private javax.swing.JTextField campo_dia;
    private javax.swing.JTextField campo_mes;
    private javax.swing.JTextField campo_nacionalidad;
    private javax.swing.JTextField campo_nom_completo;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_peso;
    private javax.swing.JTextField campo_posicion;
    private javax.swing.JLabel lab_altura;
    private javax.swing.JLabel lab_fecha_nacimiento;
    private javax.swing.JLabel lab_nacionalidad;
    private javax.swing.JLabel lab_nom_completo;
    private javax.swing.JLabel lab_nombre;
    private javax.swing.JLabel lab_peso;
    private javax.swing.JLabel lab_posicion;
    private javax.swing.JPanel panel_imagen;
    // End of variables declaration//GEN-END:variables
}
