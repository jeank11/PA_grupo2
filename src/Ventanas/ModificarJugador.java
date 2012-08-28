package Ventanas;

import Clases.Date;
import Clases.Jugador;
import Clases.ManejadorBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ModificarJugador extends javax.swing.JDialog {

    public ModificarJugador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        llenarLista();
    }
    ManejadorBD mbd = ManejadorBD.getInstancia();
    List <Integer> ids = new ArrayList<>();
    
    private void llenarLista(){
        Statement st = mbd.getStatement();
        ResultSet res;
        Object nombre;
        
        DefaultListModel modelo = new DefaultListModel();
        lista_jugadores.setModel(modelo);
        
        try {
             res = st.executeQuery("select ID_Jugador, Nombre from jugadores");
             while(res.next()){
                 nombre = res.getObject(2);
                 modelo.addElement(nombre);
                 ids.add((Integer)res.getObject(1));
             }
        } catch (SQLException ex) {
            System.out.println("Error");
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_titulo_lista = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_jugadores = new javax.swing.JList();
        label_nombre = new javax.swing.JLabel();
        label_nom_comp = new javax.swing.JLabel();
        label_fecha = new javax.swing.JLabel();
        label_pos = new javax.swing.JLabel();
        label_nac = new javax.swing.JLabel();
        label_altura = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        campo_nom_comp = new javax.swing.JTextField();
        campo_pos = new javax.swing.JTextField();
        campo_nac = new javax.swing.JTextField();
        campo_altura = new javax.swing.JTextField();
        label_peso = new javax.swing.JLabel();
        campo_peso = new javax.swing.JTextField();
        boton_confirmar = new javax.swing.JButton();
        boton_selec = new javax.swing.JButton();
        label_id = new javax.swing.JLabel();
        campo_dia = new javax.swing.JTextField();
        campo_mes = new javax.swing.JTextField();
        campo_anio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        label_titulo_lista.setText("Jugadores");

        jScrollPane2.setViewportView(lista_jugadores);

        label_nombre.setText("Nombre");

        label_nom_comp.setText("Nombre Completo");

        label_fecha.setText("Fecha Nacimiento");

        label_pos.setText("Posicion");

        label_nac.setText("Nacionalidad");

        label_altura.setText("Altura");

        campo_altura.setText("     ");

        label_peso.setText("Peso");

        campo_peso.setText("     ");

        boton_confirmar.setText("Confirmar");
        boton_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarModificacion(evt);
            }
        });

        boton_selec.setText("Seleccionar");
        boton_selec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionar(evt);
            }
        });

        label_id.setText("ID:");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(23, 23, 23)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(label_nac)
                            .add(label_pos)
                            .add(label_fecha)
                            .add(label_nombre)
                            .add(label_nom_comp))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(campo_pos)
                            .add(campo_nom_comp)
                            .add(campo_nombre)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(campo_nac, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(layout.createSequentialGroup()
                                        .add(campo_dia, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(campo_mes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(campo_anio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(0, 0, Short.MAX_VALUE))))
                    .add(layout.createSequentialGroup()
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 157, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 58, Short.MAX_VALUE)
                        .add(boton_selec)
                        .add(52, 52, 52))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(label_id)
                            .add(label_titulo_lista)
                            .add(layout.createSequentialGroup()
                                .add(label_altura)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(campo_altura, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(label_peso)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(campo_peso, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(59, 59, 59)
                                .add(boton_confirmar)))
                        .add(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(new java.awt.Component[] {campo_nac, campo_nom_comp, campo_nombre, campo_pos}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.linkSize(new java.awt.Component[] {label_fecha, label_nac, label_nom_comp, label_nombre, label_pos}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(label_titulo_lista)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 114, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(boton_selec))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 30, Short.MAX_VALUE)
                .add(label_id)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(label_nombre)
                    .add(campo_nombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(label_nom_comp)
                    .add(campo_nom_comp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(label_fecha)
                    .add(campo_dia, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(campo_mes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(campo_anio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(label_pos)
                    .add(campo_pos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(label_nac)
                    .add(campo_nac, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(label_altura)
                    .add(campo_altura, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(label_peso)
                    .add(campo_peso, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(boton_confirmar))
                .addContainerGap())
        );

        layout.linkSize(new java.awt.Component[] {campo_nac, campo_nom_comp, campo_nombre, campo_pos}, org.jdesktop.layout.GroupLayout.VERTICAL);

        layout.linkSize(new java.awt.Component[] {label_fecha, label_nac, label_nom_comp, label_nombre, label_pos}, org.jdesktop.layout.GroupLayout.VERTICAL);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionar
        boton_selec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verInformacionJugador(evt);
    }//GEN-LAST:event_seleccionar
        });
                }
    
        private void verInformacionJugador(java.awt.event.ActionEvent evt) {                                       
        try {
            int lugar_lista = lista_jugadores.getSelectedIndex();
            Integer id = ids.get(lugar_lista);
            ResultSet resultado = mbd.selectJugador(id);
            resultado.next();
            
            label_id.setText("ID: "+resultado.getString(1));
            campo_nombre.setText(resultado.getString(2));
            campo_nom_comp.setText(resultado.getString(3));
            campo_dia.setText(resultado.getString(4));
            //campo_mes.setText(resultado.getString(5));
            //campo_anio.setText(resultado.getString(6));
            campo_pos.setText(resultado.getString(5));
            campo_nac.setText(resultado.getString(6));
            campo_altura.setText(resultado.getString(7)+" m");
            campo_peso.setText(resultado.getString(8)+" Kg");
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        }
    private void confirmarModificacion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarModificacion
        String nom = "", nom_c = "", nac = "", pos = "";
        double altura = 0, peso = 0;
        int dia, mes, anio;
        Date fecha_nac = null;
        
        if(campo_nom_comp.getText().equals("")){
            JOptionPane.showMessageDialog(this, "El campo nombre completo no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            nom = campo_nombre.getText();
            nom_c = campo_nom_comp.getText();
            if(!"".equals(campo_dia.getText()) && !"".equals(campo_mes.getText()) && !"".equals(campo_anio.getText())){
                    dia = Integer.parseInt(campo_dia.getText());
                    mes = Integer.parseInt(campo_mes.getText());
                    anio = Integer.parseInt(campo_anio.getText());
                    fecha_nac = new Date(dia, mes, anio);
            }
            else{
                JOptionPane.showMessageDialog(this, "Ninguno de los campos de fecha puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            }
            nac = campo_nac.getText();
            pos = campo_pos.getText();
            if(!"".equals(campo_altura.getText())) {
                altura = Double.parseDouble(campo_altura.getText());
            }
            if(!"".equals(campo_peso.getText())) {
                peso = Double.parseDouble(campo_peso.getText());
            }
            
            Jugador jugador = new Jugador(nom,nom_c,nac, fecha_nac, pos, altura, peso);
            int id= mbd.modificarJugador(jugador);
            JOptionPane.showMessageDialog(this, "Se modifico el jugador: ");
            dispose();
        }
    
    }//GEN-LAST:event_confirmarModificacion

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_confirmar;
    private javax.swing.JButton boton_selec;
    private javax.swing.JTextField campo_altura;
    private javax.swing.JTextField campo_anio;
    private javax.swing.JTextField campo_dia;
    private javax.swing.JTextField campo_mes;
    private javax.swing.JTextField campo_nac;
    private javax.swing.JTextField campo_nom_comp;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_peso;
    private javax.swing.JTextField campo_pos;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_altura;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_nac;
    private javax.swing.JLabel label_nom_comp;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_peso;
    private javax.swing.JLabel label_pos;
    private javax.swing.JLabel label_titulo_lista;
    private javax.swing.JList lista_jugadores;
    // End of variables declaration//GEN-END:variables
}
