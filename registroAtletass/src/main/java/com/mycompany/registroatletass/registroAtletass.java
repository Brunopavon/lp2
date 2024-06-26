/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.registroatletass;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class registroAtletass extends javax.swing.JFrame {
    // declarar el array para almacenar los datos del atleta
        String Atletas[][]= new String [100][6];
        int atletasID;

    /**
     * Creates new form registroAtletass
     */
    public registroAtletass() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        altura = new javax.swing.JTextField();
        peso = new javax.swing.JTextField();
        modalidad = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Edad:");

        jLabel4.setText("Modalidad:");

        jLabel5.setText("Altura:");

        jLabel6.setText("Peso:");

        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });

        peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoActionPerformed(evt);
            }
        });

        jTextField7.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jTextField7.setText("Registro de atletas");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnmostrar.setText("Mostrar");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnguardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnmostrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(apellido)
                            .addComponent(edad)
                            .addComponent(altura)
                            .addComponent(peso)
                            .addComponent(modalidad))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(modalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnmostrar)
                    .addComponent(btnbuscar)
                    .addComponent(btneliminar))
                .addContainerGap(218, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        //Declarar variables y asignar a los campos
        String Nombre = nombre.getText();
        String Apellido = apellido.getText();
        String Edad = edad.getText();
        String Altura = altura.getText();
        String Peso = peso.getText();
        String Modalidad = modalidad.getText();
         //verificar si esta vacio
         if(Nombre.isEmpty()|| Apellido.isEmpty() || Edad.isEmpty() || Altura.isEmpty() || Peso.isEmpty()|| Modalidad.isEmpty()){
        JOptionPane.showMessageDialog(this, "complete todos los campos", "ERROR ", JOptionPane.ERROR_MESSAGE);
           return; 
         }
         //guardar datos del array
        Atletas[atletasID][0] =  Nombre;
        Atletas[atletasID][1] = Apellido;
        Atletas[atletasID][2] = Edad;
        Atletas[atletasID][3] = Altura;
        Atletas[atletasID][4] = Peso;
        Atletas[atletasID][5] = Modalidad;
         //mensaje de alerta de que se guardo bien
        JOptionPane.showMessageDialog(null, "Se guardo fantastico!\n");
        
        atletasID++;
        // vaciar campos despues de cargas datos
        nombre.setText("");
        apellido.setText("");
        edad.setText("");
        peso.setText("");
        altura.setText("");
        modalidad.setText("");
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        //mostar los datos de los atletas en una ventana
        StringBuilder datosAtletas = new StringBuilder("Lista de atletas:\n");
         for (int i = 0; i < atletasID; i++) {
                    datosAtletas
                            .append("Nombre: ").append(Atletas[i][0]).append("\n")
                            .append("Apellido: ").append(Atletas[i][1]).append("\n")
                            .append("Edad: ").append(Atletas[i][2]).append("\n")
                            .append("Peso: ").append(Atletas[i][3]).append("\n")
                            .append("Altura: ").append(Atletas[i][4]).append("\n")
                            .append("Modalidad: ").append(Atletas[i][5]).append("\n\n");
                }  
          JOptionPane.showMessageDialog(null, datosAtletas.toString(), "Datos de atletas", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnmostrarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
  //recuperamos lo introducido por teclado
        String buscar = nombre.getText();
        boolean encontrado = false;
        //en un for buscamos todos los casos posbiles
        //si encuentra carga los datos y tira un Jpane
        for(int i = 0; i < atletasID; i++){
            if(Atletas[i][0].equalsIgnoreCase(buscar)){
                nombre.setText(Atletas[i][0]);
                apellido.setText(Atletas[i][1]);
                edad.setText(Atletas[i][2]);
                peso.setText(Atletas[i][3]);
                altura.setText(Atletas[i][4]);
                modalidad.setText(Atletas[i][5]);
                JOptionPane.showMessageDialog(null, "Atleta encontrado", "Resultado de busqueda", JOptionPane.INFORMATION_MESSAGE);
                encontrado = true;
                break;
            }
            //si no encuentra tira un mensaje de que el atleta no existe
        }
        if(!encontrado){
             //dejar campos vacios
                nombre.setText("");
                apellido.setText("");
                edad.setText("");
                peso.setText("");
                altura.setText("");
                modalidad.setText("");
            JOptionPane.showMessageDialog(null, "No existe el atleta", "Resultado de busqueda", JOptionPane.INFORMATION_MESSAGE);
        }
        
     
      
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
          String eliminar = nombre.getText();
        boolean elim = false;
        for(int i = 0; i < atletasID; i++){
            if(Atletas[i][0].equalsIgnoreCase(eliminar)){
                JOptionPane.showMessageDialog(null, "Atleta encontrado, datos eliminados ", "Resultado de busqueda", JOptionPane.INFORMATION_MESSAGE);
                elim = true;
                //agarramos la fila en la que estamos y como vamos a decrecer el tamano
                //le igualamos al siguiente, ya que la matriz va a decrecer en 1
                for (int p = i; p < atletasID - 1; p++) {
                Atletas[p] = Atletas[p + 1];  
            }
                atletasID--;
                
                //dejar campos vacios
                nombre.setText("");
                apellido.setText("");
                edad.setText("");
                peso.setText("");
                altura.setText("");
                modalidad.setText("");
                break;
            }
    }                                           
        if(!elim){
            nombre.setText("");
            JOptionPane.showMessageDialog(null, "No se encontro al atleta que se desea eliminar", "Resultado de busqueda", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btneliminarActionPerformed

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
            java.util.logging.Logger.getLogger(registroAtletass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroAtletass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroAtletass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroAtletass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registroAtletass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField altura;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JTextField edad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField modalidad;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField peso;
    // End of variables declaration//GEN-END:variables
}
