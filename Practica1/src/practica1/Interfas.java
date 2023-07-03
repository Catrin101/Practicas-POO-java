package practica1;

import controlador.Metodos;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Interfas extends javax.swing.JFrame {
    
    Metodos control = new Metodos();
    String tarjeta;

    public Interfas() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FormaPago = new javax.swing.ButtonGroup();
        TipoTarjeta = new javax.swing.ButtonGroup();
        PanelFormaPago = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        RBTarjeta = new javax.swing.JRadioButton();
        RBEfectivo = new javax.swing.JRadioButton();
        PanelTarjeta = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        RBVisa = new javax.swing.JRadioButton();
        RBMasterCart = new javax.swing.JRadioButton();
        RBAmericanExpres = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        TFimportePagar = new javax.swing.JTextField();
        PanelEfectivo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        CBMoneda = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TFCantidad = new javax.swing.JTextField();
        PanelInformacionTarjeta = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TFnmeroTarjeta = new javax.swing.JTextField();
        TFnombre = new javax.swing.JTextField();
        TFdireccion = new javax.swing.JTextField();
        TFcp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CBpais = new javax.swing.JComboBox<>();
        TFcodigoSeguridad = new javax.swing.JTextField();
        Bconfirmar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texLista = new javax.swing.JTextArea();
        bImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFormaPago.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("FORMA DE PAGO");

        FormaPago.add(RBTarjeta);
        RBTarjeta.setText("Tarjeta");
        RBTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBTarjetaActionPerformed(evt);
            }
        });

        FormaPago.add(RBEfectivo);
        RBEfectivo.setText("Efectivo");

        javax.swing.GroupLayout PanelFormaPagoLayout = new javax.swing.GroupLayout(PanelFormaPago);
        PanelFormaPago.setLayout(PanelFormaPagoLayout);
        PanelFormaPagoLayout.setHorizontalGroup(
            PanelFormaPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFormaPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFormaPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBEfectivo)
                    .addComponent(RBTarjeta)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelFormaPagoLayout.setVerticalGroup(
            PanelFormaPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFormaPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBTarjeta)
                .addGap(18, 18, 18)
                .addComponent(RBEfectivo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelTarjeta.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tarjeta");

        TipoTarjeta.add(RBVisa);
        RBVisa.setText("Visa");
        RBVisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RBVisaMouseClicked(evt);
            }
        });
        RBVisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBVisaActionPerformed(evt);
            }
        });

        TipoTarjeta.add(RBMasterCart);
        RBMasterCart.setText("Master Cart");
        RBMasterCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RBMasterCartMouseClicked(evt);
            }
        });

        TipoTarjeta.add(RBAmericanExpres);
        RBAmericanExpres.setText("American Expres");
        RBAmericanExpres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RBAmericanExpresMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Importe a PAGAR");

        TFimportePagar.setText("0.0");
        TFimportePagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFimportePagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTarjetaLayout = new javax.swing.GroupLayout(PanelTarjeta);
        PanelTarjeta.setLayout(PanelTarjetaLayout);
        PanelTarjetaLayout.setHorizontalGroup(
            PanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTarjetaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBAmericanExpres)
                    .addComponent(RBMasterCart)
                    .addGroup(PanelTarjetaLayout.createSequentialGroup()
                        .addGroup(PanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(RBVisa))
                        .addGap(61, 61, 61)
                        .addGroup(PanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFimportePagar)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTarjetaLayout.setVerticalGroup(
            PanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTarjetaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBVisa)
                    .addComponent(TFimportePagar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(RBMasterCart)
                .addGap(18, 18, 18)
                .addComponent(RBAmericanExpres)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelEfectivo.setBackground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Efectivo");

        CBMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesos", "Dolares", "Euro", "Libra", "Rupia", "Creditos", " " }));

        jLabel5.setText("Tipo De Moneda");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Cantidad");

        TFCantidad.setText("0.0");
        TFCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelEfectivoLayout = new javax.swing.GroupLayout(PanelEfectivo);
        PanelEfectivo.setLayout(PanelEfectivoLayout);
        PanelEfectivoLayout.setHorizontalGroup(
            PanelEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEfectivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(CBMoneda, 0, 100, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(TFCantidad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelEfectivoLayout.setVerticalGroup(
            PanelEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEfectivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelInformacionTarjeta.setBackground(new java.awt.Color(0, 153, 153));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Numero De Tarjeta");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Nombre");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Direccion");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("C.P");

        jLabel11.setText("Codigo De Seguridad");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Selecciona Pais");

        CBpais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mexico", "U.S", "Canada", "España", "Argentina", "Francia", "Russia", "Japon", "China", "Bracil", "Portugal", "Alemania", " " }));

        javax.swing.GroupLayout PanelInformacionTarjetaLayout = new javax.swing.GroupLayout(PanelInformacionTarjeta);
        PanelInformacionTarjeta.setLayout(PanelInformacionTarjetaLayout);
        PanelInformacionTarjetaLayout.setHorizontalGroup(
            PanelInformacionTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInformacionTarjetaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInformacionTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelInformacionTarjetaLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFnmeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelInformacionTarjetaLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFnombre))
                    .addGroup(PanelInformacionTarjetaLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFdireccion))
                    .addGroup(PanelInformacionTarjetaLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFcp)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInformacionTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInformacionTarjetaLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFcodigoSeguridad))
                    .addGroup(PanelInformacionTarjetaLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBpais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelInformacionTarjetaLayout.setVerticalGroup(
            PanelInformacionTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInformacionTarjetaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInformacionTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TFnmeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(TFcodigoSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelInformacionTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(CBpais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelInformacionTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TFdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelInformacionTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TFcp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        Bconfirmar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Bconfirmar.setText("Confirmar");
        Bconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BconfirmarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        texLista.setColumns(20);
        texLista.setRows(5);
        jScrollPane1.setViewportView(texLista);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
        );

        bImprimir.setText("Imprimir");
        bImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Bconfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bImprimir))
                            .addComponent(PanelFormaPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelInformacionTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(PanelFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Bconfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(PanelTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelInformacionTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RBTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBTarjetaActionPerformed

    private void TFimportePagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFimportePagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFimportePagarActionPerformed

    private void RBVisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBVisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBVisaActionPerformed

    private void RBVisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBVisaMouseClicked
        tarjeta="visa";               
    }//GEN-LAST:event_RBVisaMouseClicked

    private void RBMasterCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBMasterCartMouseClicked
        tarjeta="master cart";
    }//GEN-LAST:event_RBMasterCartMouseClicked

    private void RBAmericanExpresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBAmericanExpresMouseClicked
        tarjeta="american exples";
    }//GEN-LAST:event_RBAmericanExpresMouseClicked

    private void BconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BconfirmarActionPerformed
        float importe = Float.parseFloat(TFimportePagar.getText());
        float cantidad = Float.parseFloat(TFCantidad.getText());
        float dinero =0;
        if(importe == 0)
        {
            dinero = cantidad;
        }
        if(cantidad == 0)
        {
            dinero = importe;
        }
        String tipMoneda=CBMoneda.getSelectedItem().toString();
        String numt=TFcodigoSeguridad.getText();
        int numTar = Integer.parseInt(numt);
        String nom=TFnombre.getText();
        String direccion=TFdireccion.getText();
        String cp=TFcp.getText();
        String cod=TFcodigoSeguridad.getText();
        int codSegu = Integer.parseInt(cod);
        String pais=CBpais.getSelectedItem().toString();
        
        if(TFimportePagar.getText().equals("") || TFCantidad.getText().equals("") || TFnmeroTarjeta.getText().equals("") 
                || TFnombre.getText().equals("") || TFdireccion.getText().equals("") || TFcp.getText().equals("") || TFcodigoSeguridad.getText().equals(""))
        { 
            JOptionPane.showMessageDialog(null, "hay campos vacios.");
        }
        else
        {
            control.crearventas(tarjeta, dinero, tipMoneda, numTar, nom, direccion, cp, codSegu, pais);

            TFimportePagar.setText(String.valueOf("0.0"));
            TFCantidad.setText(String.valueOf("0.0"));
            TFnmeroTarjeta.setText(String.valueOf(""));
            TFnombre.setText(String.valueOf(""));
            TFdireccion.setText(String.valueOf(""));
            TFcp.setText(String.valueOf(""));
            TFcodigoSeguridad.setText(String.valueOf(""));
        }
    }//GEN-LAST:event_BconfirmarActionPerformed

    private void bImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bImprimirActionPerformed
        texLista.setText(String.valueOf(control.show()));
    }//GEN-LAST:event_bImprimirActionPerformed

    private void TFCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFCantidadActionPerformed

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
            java.util.logging.Logger.getLogger(Interfas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bconfirmar;
    public static javax.swing.JComboBox<String> CBMoneda;
    public static javax.swing.JComboBox<String> CBpais;
    private javax.swing.ButtonGroup FormaPago;
    private javax.swing.JPanel PanelEfectivo;
    private javax.swing.JPanel PanelFormaPago;
    private javax.swing.JPanel PanelInformacionTarjeta;
    private javax.swing.JPanel PanelTarjeta;
    private javax.swing.JRadioButton RBAmericanExpres;
    private javax.swing.JRadioButton RBEfectivo;
    private javax.swing.JRadioButton RBMasterCart;
    private javax.swing.JRadioButton RBTarjeta;
    private javax.swing.JRadioButton RBVisa;
    private javax.swing.JTextField TFCantidad;
    private javax.swing.JTextField TFcodigoSeguridad;
    private javax.swing.JTextField TFcp;
    private javax.swing.JTextField TFdireccion;
    private javax.swing.JTextField TFimportePagar;
    private javax.swing.JTextField TFnmeroTarjeta;
    private javax.swing.JTextField TFnombre;
    private javax.swing.ButtonGroup TipoTarjeta;
    private javax.swing.JButton bImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea texLista;
    // End of variables declaration//GEN-END:variables
}
