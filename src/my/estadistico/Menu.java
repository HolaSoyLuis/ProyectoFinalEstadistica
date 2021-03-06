/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.estadistico;
import BaseDatos.Usuario;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Desktop;
import java.io.*;
/**
 *
 * @author werner
 */

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setTitle("Menu Principal");
  
        
       // this.setIconImage(new ImageIcon(getClass().getResource("//")).);
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMcalculomuestr = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMreportarerror = new javax.swing.JMenuItem();
        jMsoportetecnico = new javax.swing.JMenuItem();
        jMvermanual = new javax.swing.JMenuItem();
        jMquienessomos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/fondosplash.PNG"))); // NOI18N

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(519, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setBackground(new java.awt.Color(147, 60, 79));
        jMenuBar1.setForeground(new java.awt.Color(147, 60, 79));

        jMenu1.setBackground(new java.awt.Color(147, 60, 79));
        jMenu1.setBorder(null);
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/tendencia.jpg"))); // NOI18N
        jMenu1.setContentAreaFilled(false);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(147, 60, 79));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/MEDIA ARIT.jpg"))); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jSeparator1.setForeground(new java.awt.Color(147, 60, 79));
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(null);
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/posicion.jpg"))); // NOI18N
        jMenu2.setContentAreaFilled(false);
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/dispercion.jpg"))); // NOI18N
        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/muestra.jpg"))); // NOI18N

        jMcalculomuestr.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMcalculomuestr.setBackground(new java.awt.Color(147, 60, 79));
        jMcalculomuestr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/calcmuestra.jpg"))); // NOI18N
        jMcalculomuestr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMcalculomuestrActionPerformed(evt);
            }
        });
        jMenu4.add(jMcalculomuestr);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/calculadora.jpg"))); // NOI18N
        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/datosalm.jpg"))); // NOI18N
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setBackground(new java.awt.Color(147, 60, 79));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/almconusuario.JPG"))); // NOI18N
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setBackground(new java.awt.Color(147, 60, 79));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mostusuario.jpg"))); // NOI18N
        jMenu6.add(jMenuItem4);

        jMenuBar1.add(jMenu6);

        jMenu8.setBorder(null);
        jMenu8.setText("                 ");
        jMenuBar1.add(jMenu8);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/ayuda.jpg"))); // NOI18N
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });

        jMreportarerror.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMreportarerror.setBackground(new java.awt.Color(147, 60, 79));
        jMreportarerror.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/reportar error.jpg"))); // NOI18N
        jMreportarerror.setContentAreaFilled(false);
        jMreportarerror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMreportarerrorActionPerformed(evt);
            }
        });
        jMenu7.add(jMreportarerror);

        jMsoportetecnico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMsoportetecnico.setBackground(new java.awt.Color(147, 60, 79));
        jMsoportetecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/soporte tecnico12.jpg"))); // NOI18N
        jMsoportetecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMsoportetecnicoActionPerformed(evt);
            }
        });
        jMenu7.add(jMsoportetecnico);

        jMvermanual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMvermanual.setBackground(new java.awt.Color(147, 60, 79));
        jMvermanual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/ver manual.jpg"))); // NOI18N
        jMvermanual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMvermanualActionPerformed(evt);
            }
        });
        jMenu7.add(jMvermanual);

        jMquienessomos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMquienessomos.setBackground(new java.awt.Color(147, 60, 79));
        jMquienessomos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/quienes somos.jpg"))); // NOI18N
        jMquienessomos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMquienessomosActionPerformed(evt);
            }
        });
        jMenu7.add(jMquienessomos);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * accion que permite visualizar el menu muestra
     */
    private void jMcalculomuestrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMcalculomuestrActionPerformed
          Muestra m = new Muestra();
         this.jDesktopPane1.add(m);
           m.show();
    }//GEN-LAST:event_jMcalculomuestrActionPerformed

    /**
     * accion que permite visualizar el menu ayuda
     */
    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jMreportarerrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMreportarerrorActionPerformed
        // VerManual
 Ventana v = new Ventana();
         this.jDesktopPane1.add(v);
           v.show();
    }//GEN-LAST:event_jMreportarerrorActionPerformed

    private void jMvermanualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMvermanualActionPerformed
        // BOTON VER MANUAL
               try {
Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Users\\"
        + "Genly\\Desktop\\Proyecto Final Estadistica\\Estadistico\\src\\my\\estadistico\\Ayuda.pdf");
System.out.println("Final");
} catch (IOException e) {
}
    }//GEN-LAST:event_jMvermanualActionPerformed

    private void jMquienessomosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMquienessomosActionPerformed
        // boton quienes somos
        QuienesSomos q = new QuienesSomos();
        this.jDesktopPane1.add(q);
        q.show();
    }//GEN-LAST:event_jMquienessomosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
Operaciones o = new Operaciones();
this.jDesktopPane1.add(o);
        o.show();
        
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Usuario u = new Usuario();
        u.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMsoportetecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMsoportetecnicoActionPerformed
        // TODO add your handling code here:
         Ventana v = new Ventana();
         this.jDesktopPane1.add(v);
           v.show();
    }//GEN-LAST:event_jMsoportetecnicoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMcalculomuestr;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMquienessomos;
    private javax.swing.JMenuItem jMreportarerror;
    private javax.swing.JMenuItem jMsoportetecnico;
    private javax.swing.JMenuItem jMvermanual;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
