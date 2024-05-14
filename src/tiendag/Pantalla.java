
package tiendag;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class Pantalla extends javax.swing.JFrame {

   String productos[]={"Pokémon Escarlata/Púrpura","FIFA","Inazuma Eleven","Mario 3D World", "PS5", "Nintendo Switch"};
   double precios[]={55,45.95,15,33.99,450,300};
   double precio=0;
   int cantidad=0;
   DefaultTableModel modelo= new DefaultTableModel();
   ArrayList<venta> listaVentas = new ArrayList<venta>();
   
    public Pantalla() {
        
        initComponents();
        this.setTitle("Titulo");
        Image icono= Toolkit.getDefaultToolkit().getImage(getClass().getResource("game.png"));
        this.setIconImage(icono);
        
        bLogo.setIcon(new ImageIcon(icono.getScaledInstance(bLogo.getWidth(), bLogo.getHeight(), Image.SCALE_SMOOTH)));
        this.setSize(850, 700);
        this.setLocationRelativeTo(null);
        
        Image iconoAgregar= Toolkit.getDefaultToolkit().getImage(getClass().getResource("agregar.png"));
        bAgregar.setIcon(new ImageIcon(iconoAgregar.getScaledInstance(bAgregar.getWidth(), bAgregar.getHeight(), Image.SCALE_SMOOTH)));
        
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel(productos);
        bProducto.setModel(comboModel);
        
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Importe");
        
        actualizarTabla();
        calcularPrecio();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jDialog4 = new javax.swing.JDialog();
        bLogo = new javax.swing.JLabel();
        bAgregar = new javax.swing.JButton();
        bProducto = new javax.swing.JComboBox<>();
        spCantidad = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        bProductos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bPrecio = new javax.swing.JLabel();
        bImporte = new javax.swing.JLabel();
        bSubtotal = new javax.swing.JLabel();
        bIVA = new javax.swing.JLabel();
        bTotal = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bLogo.setFont(new java.awt.Font("3ds", 1, 18)); // NOI18N
        getContentPane().add(bLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 20, 169, 89));

        bAgregar.setFont(new java.awt.Font("3ds", 1, 18)); // NOI18N
        bAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(bAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 151, 105, 47));

        bProducto.setFont(new java.awt.Font("3ds", 1, 18)); // NOI18N
        bProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProductoActionPerformed(evt);
            }
        });
        getContentPane().add(bProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 127, 244, 30));

        spCantidad.setFont(new java.awt.Font("3ds", 1, 18)); // NOI18N
        spCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spCantidadStateChanged(evt);
            }
        });
        getContentPane().add(spCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 199, 103, 52));

        bProductos.setFont(new java.awt.Font("3ds", 1, 18)); // NOI18N
        bProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(bProductos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 281, -1, 145));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("PRODUCTO");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 127, 92, 44));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("CANTIDAD");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 221, 91, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("PRECIO");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 141, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("IMPORTE");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 188, -1, -1));

        bPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bPrecio.setText("€ 0.00");
        bPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(bPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 141, 74, -1));

        bImporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bImporte.setText("€ 0.00");
        getContentPane().add(bImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 188, 74, -1));

        bSubtotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bSubtotal.setText("€ 0.00");
        getContentPane().add(bSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 464, 267, -1));

        bIVA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bIVA.setText("€ 0.00");
        getContentPane().add(bIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 502, 111, -1));

        bTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bTotal.setText("€ 0.00");
        getContentPane().add(bTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 540, 107, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("SUBTOTAL");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 464, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("IVA");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 502, 35, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("TOTAL");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 56, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("BORRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 528, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        venta venta = new venta();
        venta.setId(bProducto.getSelectedIndex());
        venta.setDescripcion(bProducto.getSelectedItem().toString());
        venta.setPrecio(precio);
        venta.setCantidad(cantidad);
        venta.setImporte(precio*cantidad);
        if(!buscarVenta(venta)){
            
            listaVentas.add(venta);
        }
        
        actualizarTabla();
        borrarVenta();
    }//GEN-LAST:event_bAgregarActionPerformed

    private void bProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProductoActionPerformed
        calcularPrecio();
    }//GEN-LAST:event_bProductoActionPerformed

    private void spCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spCantidadStateChanged
        calcularPrecio();
    }//GEN-LAST:event_spCantidadStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        actualizarTabla();
        borrarVenta();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public boolean buscarVenta(venta nueva){
        
        for(venta v: listaVentas){
            
            if(v.getId() == nueva.getId()){
            
                int nuevaCantidad = v.getCantidad() + nueva.getCantidad();
                v.setCantidad(nuevaCantidad);
                v.setImporte(v.getPrecio()* nuevaCantidad);
                return true;
            
            }
        
        }
            
        return false;
    }
    public void borrarVenta(){
    
        precio=0;
        cantidad=1;
        bProducto.setSelectedIndex(0);
        spCantidad.setValue(1);
        calcularPrecio();
    }
    
    public void calcularPrecio(){
        
        precio = precios[bProducto.getSelectedIndex()];
        cantidad = Integer.parseInt(spCantidad.getValue().toString());
        bPrecio.setText(aMoneda(precio));
        bImporte.setText(aMoneda(precio*cantidad));
    }
    
    public String aMoneda(double precio){
        
        return "€" + Math.round(precio*100.0)/100.0 + "€";
    }
    
    public void actualizarTabla(){
        
        while(modelo.getRowCount()>0){
        
            modelo.removeRow(0);
        }
        double subtotal=0;
        for(venta v: listaVentas){
            
            Object x[] = new Object[4];
            x[0] = v.getDescripcion();
            x[1] = aMoneda(v.getPrecio());
            x[2] = v.getCantidad();
            x[3] = aMoneda(v.getImporte());
            
            subtotal += v.getImporte();
            
            modelo.addRow(x);
        }
        
        double IVA = subtotal *0.21;
        double total = subtotal + IVA;
        
        
        bSubtotal.setText(aMoneda(subtotal));
        bIVA.setText(aMoneda(IVA));
        bTotal.setText(aMoneda(total));
        bProductos.setModel(modelo);
    }
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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregar;
    private javax.swing.JLabel bIVA;
    private javax.swing.JLabel bImporte;
    private javax.swing.JLabel bLogo;
    private javax.swing.JLabel bPrecio;
    private javax.swing.JComboBox<String> bProducto;
    private javax.swing.JTable bProductos;
    private javax.swing.JLabel bSubtotal;
    private javax.swing.JLabel bTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner spCantidad;
    // End of variables declaration//GEN-END:variables
}
