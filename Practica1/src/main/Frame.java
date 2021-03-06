/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author cami0
 */
public class Frame extends javax.swing.JFrame {
    
    // Creamos un vector que contendrá el polinomio en Vector forma 2.
    static ArrayList<Double> polinomio1;
        

    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();
        Color colorAzul = new Color(175, 235, 250);

        this.getContentPane().setBackground( colorAzul );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        Texto = new javax.swing.JLabel();
        Título = new javax.swing.JLabel();
        polinomioActual = new javax.swing.JLabel();
        Coeficiente = new javax.swing.JTextField();
        X = new javax.swing.JLabel();
        Exponente = new javax.swing.JTextField();
        Sumar = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Texto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto.setText("Ingrese su polinomio término a término");

        Título.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Título.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Título.setText("CALCULADORA DE POLINOMIOS");

        polinomioActual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        polinomioActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        polinomioActual.setText("Aqui va a salir el polinomio ingresado");

        Coeficiente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Coeficiente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Coeficiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoeficienteActionPerformed(evt);
            }
        });

        X.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        X.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        X.setText("X");

        Exponente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Exponente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Sumar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Sumar.setText("Sumar término");
        Sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar polinomios", "Mostrar un polinomio", "Multiplicar dos polinomios", "Evaliar un polinomio" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto)
                    .addComponent(Título, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(polinomioActual)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Coeficiente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(Sumar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(Exponente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 92, Short.MAX_VALUE)
                .addComponent(Título)
                .addGap(52, 52, 52)
                .addComponent(Texto)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Coeficiente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sumar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(Exponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addComponent(polinomioActual)
                .addGap(54, 54, 54)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarActionPerformed
        // TODO add your handling code here:
        double coeficiente = Double.parseDouble(Coeficiente.getText());
        double exponente = Double.parseDouble(Exponente.getText());
        
        // Evaluamos si el exponente ingresado ya existe en el array.
        // En caso de no existir, se obtendrá un -1.
        if(polinomio1.indexOf(exponente) == -1) {
            // Añadimos los datos obtenidos al vector.
            polinomio1.add(exponente);
            polinomio1.add(coeficiente);
        } else {
            // En caso de ya existir el exponente en el array, sumamos los coeficientes.
            int index = polinomio1.indexOf(exponente);
            polinomio1.set(index + 1, polinomio1.get(index + 1) + coeficiente);
        }
        
        // Aumentamos el valor que indica la cantidad de términos diferentes de cero.
        polinomio1.set(0, polinomio1.get(0) + 1);
        
        System.out.println(polinomio1);
        // ToDo: Faltaría permitir que se ingrese más de un polinomio.
        
    }//GEN-LAST:event_SumarActionPerformed

    private void CoeficienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoeficienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoeficienteActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
        
        // Inicializamos el vector polinomio.
        polinomio1 = new ArrayList<Double>();
        // Iniciamos la primera posición en 0, pues representa el número de términos diferentes de cero.
        polinomio1.add(0, 0.0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Coeficiente;
    private javax.swing.JTextField Exponente;
    private javax.swing.JButton Sumar;
    private javax.swing.JLabel Texto;
    private javax.swing.JLabel Título;
    private javax.swing.JLabel X;
    private javax.swing.JComboBox<String> jComboBox2;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private javax.swing.JLabel polinomioActual;
    // End of variables declaration//GEN-END:variables
}
