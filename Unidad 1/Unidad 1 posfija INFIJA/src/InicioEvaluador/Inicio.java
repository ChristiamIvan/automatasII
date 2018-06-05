
package InicioEvaluador;

import Images.Calculadora;
import static InicioEvaluador.Evaluador.convertir;
import static InicioEvaluador.Evaluador.evaluar;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.text.MessageFormat;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Migue
 */
public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Resultado1 = new javax.swing.JLabel();
        operadores = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnEvaluar = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        txtInfija = new javax.swing.JTextField();
        txtPosfija = new javax.swing.JTextField();
        Resultado = new javax.swing.JLabel();
        posfija = new javax.swing.JLabel();
        infija = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Resultado1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Resultado1.setForeground(new java.awt.Color(255, 255, 255));
        Resultado1.setText("PILA DE EXPRESIONES");
        getContentPane().add(Resultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        operadores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        operadores.setForeground(new java.awt.Color(255, 255, 255));
        operadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        operadores.setText("   ");
        getContentPane().add(operadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 220, 30));

        btnLimpiar.setBackground(new java.awt.Color(118, 220, 219));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setBorder(null);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 100, 40));

        btnEvaluar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEvaluar.setForeground(new java.awt.Color(255, 255, 255));
        btnEvaluar.setText("EVALUAR");
        btnEvaluar.setBorder(null);
        btnEvaluar.setBorderPainted(false);
        btnEvaluar.setContentAreaFilled(false);
        btnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEvaluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 110, 40));

        txtResultado.setBackground(new java.awt.Color(243, 88, 104));
        txtResultado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(255, 255, 255));
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado.setBorder(null);
        getContentPane().add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 220, 30));

        txtInfija.setBackground(new java.awt.Color(243, 88, 104));
        txtInfija.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtInfija.setForeground(new java.awt.Color(255, 255, 255));
        txtInfija.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInfija.setBorder(null);
        txtInfija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInfijaActionPerformed(evt);
            }
        });
        getContentPane().add(txtInfija, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 220, 30));

        txtPosfija.setBackground(new java.awt.Color(243, 88, 104));
        txtPosfija.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPosfija.setForeground(new java.awt.Color(255, 255, 255));
        txtPosfija.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPosfija.setBorder(null);
        getContentPane().add(txtPosfija, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 220, 30));

        Resultado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Resultado.setForeground(new java.awt.Color(255, 255, 255));
        Resultado.setText("RESULTADO DE LA OPERACION");
        getContentPane().add(Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        posfija.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        posfija.setForeground(new java.awt.Color(255, 255, 255));
        posfija.setText("RESULTADO EN POSTFIJO");
        getContentPane().add(posfija, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        infija.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        infija.setForeground(new java.awt.Color(255, 255, 255));
        infija.setText("INSERTE EXPRESION INFIJA");
        getContentPane().add(infija, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDO.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInfijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInfijaActionPerformed
        // ingresar infijo
        
    }//GEN-LAST:event_txtInfijaActionPerformed

    private void btnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarActionPerformed
        // Evaluar infijo
        Calculadora yo = new Calculadora();
        try {
        this.txtPosfija.setText(convertir(txtInfija.getText()));
        txtResultado.setText(String.valueOf(yo.calcular(txtInfija.getText())));
        operadores.setText(Evaluador.operadores(txtInfija.getText()));
        
        JOptionPane.showMessageDialog(null, "Operacion Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifique los operadores");
        }

        
    }//GEN-LAST:event_btnEvaluarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //Boton limpiar: esta en un try para manejo de esepciones
        try {
            this.txtPosfija.setText("");
        this.txtInfija.setText("");
        this.txtResultado.setText("");
        this.operadores.setText("");
        JOptionPane.showMessageDialog(null, "Limpieza Correcta");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Resultado;
    private javax.swing.JLabel Resultado1;
    private javax.swing.JButton btnEvaluar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel infija;
    private javax.swing.JLabel operadores;
    private javax.swing.JLabel posfija;
    private javax.swing.JTextField txtInfija;
    private javax.swing.JTextField txtPosfija;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables

    
}
