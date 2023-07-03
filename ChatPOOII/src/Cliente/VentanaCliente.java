package Cliente;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import Cliente.DadClientes;
import Servidor.HiloServidor;

public class VentanaCliente extends javax.swing.JFrame {
    
    static ArrayList<DadClientes> dadCli = new ArrayList<>();
    static String nom;
    static Cliente cliente;
    
    public VentanaCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        input_textArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        chat_textarea = new javax.swing.JTextArea();
        enviar_botton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        modelo = new DefaultListModel();
        jList1 = new javax.swing.JList<>();
        salir = new javax.swing.JButton();
        caraFelis = new javax.swing.JButton();
        caraEnojada = new javax.swing.JButton();
        carraGinando = new javax.swing.JButton();
        caraTriste = new javax.swing.JButton();
        caraPacman = new javax.swing.JButton();
        caraCeria = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input_textArea.setColumns(20);
        input_textArea.setRows(5);
        jScrollPane1.setViewportView(input_textArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 500, 85));

        chat_textarea.setColumns(20);
        chat_textarea.setRows(5);
        jScrollPane3.setViewportView(chat_textarea);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 510));

        enviar_botton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        enviar_botton.setBorderPainted(false);
        enviar_botton.setContentAreaFilled(false);
        enviar_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_bottonActionPerformed(evt);
            }
        });
        getContentPane().add(enviar_botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, 90, 85));

        jList1.setModel(modelo);
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 90, 180));

        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        caraFelis.setText(":)");
        caraFelis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caraFelisActionPerformed(evt);
            }
        });
        getContentPane().add(caraFelis, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        caraEnojada.setText("}:(");
        caraEnojada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caraEnojadaActionPerformed(evt);
            }
        });
        getContentPane().add(caraEnojada, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        carraGinando.setText(";)");
        carraGinando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carraGinandoActionPerformed(evt);
            }
        });
        getContentPane().add(carraGinando, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, -1, -1));

        caraTriste.setText(":'(");
        caraTriste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caraTristeActionPerformed(evt);
            }
        });
        getContentPane().add(caraTriste, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, -1, -1));

        caraPacman.setText(":v");
        caraPacman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caraPacmanActionPerformed(evt);
            }
        });
        getContentPane().add(caraPacman, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, -1));

        caraCeria.setText(": l");
        caraCeria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caraCeriaActionPerformed(evt);
            }
        });
        getContentPane().add(caraCeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviar_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_bottonActionPerformed
        cliente.enviarMensaje(input_textArea.getText());
        input_textArea.setText(String.valueOf(""));
    }//GEN-LAST:event_enviar_bottonActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        Servidor.HiloServidor.comnom = nom;
        Servidor.HiloServidor.si = 1;
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void caraFelisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caraFelisActionPerformed
        input_textArea.setText(input_textArea.getText() + String.valueOf(":)"));
    }//GEN-LAST:event_caraFelisActionPerformed

    private void caraTristeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caraTristeActionPerformed
        input_textArea.setText(input_textArea.getText() + String.valueOf(":'("));
    }//GEN-LAST:event_caraTristeActionPerformed

    private void caraEnojadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caraEnojadaActionPerformed
        input_textArea.setText(input_textArea.getText() + String.valueOf("}:("));
    }//GEN-LAST:event_caraEnojadaActionPerformed

    private void caraPacmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caraPacmanActionPerformed
        input_textArea.setText(input_textArea.getText() + String.valueOf(":v"));
    }//GEN-LAST:event_caraPacmanActionPerformed

    private void carraGinandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carraGinandoActionPerformed
        input_textArea.setText(input_textArea.getText() + String.valueOf(";)"));
    }//GEN-LAST:event_carraGinandoActionPerformed

    private void caraCeriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caraCeriaActionPerformed
        input_textArea.setText(input_textArea.getText() + String.valueOf(":l"));
    }//GEN-LAST:event_caraCeriaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        nom = JOptionPane.showInputDialog("INGRESE UN NOMBRE");
        VentanaCliente ventana = new VentanaCliente();
        cliente = new Cliente(nom, ventana.chat_textarea);
        Thread hilo_cliente = new Thread(cliente);
        hilo_cliente.start();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ventana.setVisible(true);
            }
        });
        DadClientes a = new DadClientes(nom);
        dadCli.add(a);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton caraCeria;
    private javax.swing.JButton caraEnojada;
    private javax.swing.JButton caraFelis;
    private javax.swing.JButton caraPacman;
    private javax.swing.JButton caraTriste;
    private javax.swing.JButton carraGinando;
    private javax.swing.JTextArea chat_textarea;
    private javax.swing.JButton enviar_botton;
    private javax.swing.JTextArea input_textArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private DefaultListModel modelo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
