package AOE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//
 

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
 
/**
 *
 * @author crist
 */
public class ventana_mejorar extends javax.swing.JFrame {
 
 
 
    /**
     * Creates new form ventana_crear
     */
    public ventana_mejorar() {
    
        initComponents();
        
    }
         public String[] datos (String datos)
    {
        String[] unidades = new String[3];
        if(datos.equalsIgnoreCase("aldeano"))
        {
             unidades[0] = "";
             unidades[1] = "";
             unidades[2] = "";
             
        }
        
        if(datos.equalsIgnoreCase("naval"))
        {
            unidades[0] = "pesca";
            unidades[1] = "naval militar";
            unidades[2] = "transporte";
           
        }
        if(datos.equalsIgnoreCase("militar"))
        {
            unidades[0] = "arquero";
            unidades[1] = "caballeria";
           unidades[2] = "asedio";
          
        }
        return unidades;
    
            
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
        CAJA4 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CAJA6 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        c2 = new javax.swing.JComboBox<>();
        c1 = new javax.swing.JComboBox<>();
        c3 = new javax.swing.JLabel();
        cajay = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        cajau = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("........");
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                formAncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("UNIDAD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setText("TIPO UNIDAD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jLabel3.setText("UNIDAD MILITAR SELECCIOANADA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel4.setText("MEJORAR UNIDAD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, 20));

        CAJA4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "heopolis", "catapulta", "ballesta", "catapulta ligera", "catapulta pesada", " " }));
        CAJA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAJA4ActionPerformed(evt);
            }
        });
        getContentPane().add(CAJA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel5.setText("TIPO DE UNIDAD");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel6.setText("A MEJORAR");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 114, 70, 20));

        CAJA6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DEFENSA", "ATAQUE", "VELOCIDAD", "PUNTOS SALUD" }));
        CAJA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAJA6ActionPerformed(evt);
            }
        });
        getContentPane().add(CAJA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 94, -1));

        jLabel7.setText(">>");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        jButton3.setText("CAMBIAR CIVILIZACION");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        jButton4.setText("MEJORAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        jButton5.setText("SALIR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 11, -1, -1));

        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione tipo unidad", "aldeano", "naval", "militar" }));
        c1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                c1ItemStateChanged(evt);
            }
        });
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        c3.setText("_");
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 90, 30));

        cajay.setText("_");
        getContentPane().add(cajay, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 90, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("RECURSOS\n\nORO> DISPONIBLE\nPIEDRA> DISPONIBLE\nMADERA> DISPONIBLE\nCOMIDA> DISPONIBLE");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 108));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("TIPO DE MEJORA REALIZADA>>");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        cajau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cajau.setText("_");
        getContentPane().add(cajau, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 150, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesAOE/Aoe_fuchs.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
       // visualizacion_creacion1 v2=new visualizacion_creacion1();
          //      v2.setVisible(true);
           //  dispose();
             
                      
     visualizacion_creacion1 ventana = new  visualizacion_creacion1();
        ventana.unidad0=c1.getSelectedItem().toString();
        
        ventana.setVisible(true);
        dispose();
                             
    // visualizacion_creacion1 ventana = new  visualizacion_creacion1();
        ventana.unidad01=c2.getSelectedItem().toString();
        
        ventana.setVisible(true);
        dispose();
        
        
        ventana.unidad012=CAJA4.getSelectedItem().toString();
        
        ventana.setVisible(true);
        dispose();
        
        
        ventana.unidad0123=CAJA6.getSelectedItem().toString();
        
        ventana.setVisible(true);
        dispose();
         
         
         
             
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        zona_principal v2=new zona_principal();
                v2.setVisible(true);
             dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      ventana_bienvenida v2=new ventana_bienvenida();
                v2.setVisible(true);
             dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formAncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formAncestorMoved

    private void c1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_c1ItemStateChanged
        // TODO add your handling code here:
        
         if(evt.getStateChange() == ItemEvent.SELECTED)
       {
           if(this.c1.getSelectedIndex()>0)
           {
               this.c2.setModel(new DefaultComboBoxModel(this.datos(this.c1.getSelectedItem().toString())));
           }
       }
    
    }//GEN-LAST:event_c1ItemStateChanged

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
        
        String datos =(String) c2.getSelectedItem();
     
       c3.setText(datos);  
       
       
     
      //
    }//GEN-LAST:event_c2ActionPerformed

    private void CAJA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAJA4ActionPerformed
        // TODO add your handling code here:
         String datos =(String) CAJA4.getSelectedItem();
     
       cajay.setText(datos);  
    }//GEN-LAST:event_CAJA4ActionPerformed

    private void CAJA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAJA6ActionPerformed
        // TODO add your handling code here:
        
         String datos =(String) CAJA6.getSelectedItem();
     
       cajau.setText(datos);  
    }//GEN-LAST:event_CAJA6ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

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
            java.util.logging.Logger.getLogger(ventana_mejorar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_mejorar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_mejorar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_mejorar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ventana_mejorar().setVisible(true);
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CAJA4;
    private javax.swing.JComboBox<String> CAJA6;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel cajau;
    private javax.swing.JLabel cajay;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

