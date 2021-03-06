package Vista;


import seguridad.vista.*;
//import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Dimension;
import java.io.File;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import seguridad.datos.BitacoraDao;
import seguridad.dominio.Bitacora;

//import seguridad.datos.BitacoraDao;
//import seguridad.dominio.Bitacora;
/**
 *
 *
 */
public class MDIContenedor extends javax.swing.JFrame {
private Mantenimiento_Bodega Mantenimiento_Bodega;
private Mantenimiento_Producto Mantenimiento_Producto; 
    private FmrBitacora FmrBitacora;
   
    
    public static JLabel logo = new JLabel();

    public MDIContenedor() throws UnknownHostException {
        initComponents();
        logo(0);

//        GenerarPermisos permisos = new GenerarPermisos();
//        MDI_Components mdi_Components = new MDI_Components();
        String modulo_nombre = "Comercial";

//        this.setTitle("Usuario: " + "[" + Login.usuarioComercial + "]" + " \t" + "IP: [" + mdi_Components.getIp() + "]");
//        permisos.getPermisos(modulo_nombre, Login.usuarioComercial);
    }

    public void logo(int activar) {
        Icon icon = new ImageIcon("C:src/main/java/Imagen/2.jpg");
        logo.setSize(300, 300);
        if (icon != null) {
            //Agrega Icono
            logo.setIcon(icon);
        } else {
            //No existe imagen.
        }
        Dimension desktopSize = jdpescritorio.getSize();
        Dimension FrameSize = logo.getSize();
        logo.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        logo.setVisible(true);
        jdpescritorio.add(logo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpescritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        M_ccompras = new javax.swing.JMenu();
        M_inventario = new javax.swing.JMenu();
        Item_Mntbodega = new javax.swing.JCheckBoxMenuItem();
        Item_Mntproducto = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        cerrar_sesion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SANTIAGO MARTINEZ DIAZ 9959-19-13847");
        setResizable(false);

        jdpescritorio.setBackground(new java.awt.Color(153, 255, 153));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu1);

        M_ccompras.setText("Catalogos");
        M_ccompras.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        M_inventario.setText("Mantenimientos ");

        Item_Mntbodega.setSelected(true);
        Item_Mntbodega.setText("Mantenimiento Bodegas");
        Item_Mntbodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_MntbodegaActionPerformed(evt);
            }
        });
        M_inventario.add(Item_Mntbodega);

        Item_Mntproducto.setText("Mantenimiento Producto");
        Item_Mntproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_MntproductoActionPerformed(evt);
            }
        });
        M_inventario.add(Item_Mntproducto);

        M_ccompras.add(M_inventario);

        jMenuBar1.add(M_ccompras);

        jMenu12.setText("Informes");
        jMenu12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jMenu13.setText("Historial");

        jMenuItem1.setText("Bitacora Comercial");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem1);

        jMenu12.add(jMenu13);

        jMenuBar1.add(jMenu12);

        jMenu6.setText("Herramientas");
        jMenu6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Ayuda");
        jMenu7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jMenu11.setText("Ayuda");
        jMenu11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jMenuItem7.setText("Ayuda Menu");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem7);

        jMenu7.add(jMenu11);

        jMenuBar1.add(jMenu7);

        cerrar_sesion.setText("Cerrar Sesi??n");
        cerrar_sesion.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cerrar_sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrar_sesionMouseClicked(evt);
            }
        });
        jMenuBar1.add(cerrar_sesion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpescritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpescritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        
        FmrBitacora = new seguridad.vista.FmrBitacora();

        jdpescritorio.add(FmrBitacora);
        Dimension desktopSize = jdpescritorio.getSize();
        Dimension FrameSize = FmrBitacora.getSize();
        FmrBitacora.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        FmrBitacora.show();
        logo.setVisible(true);
        FmrBitacora.setVisible(true);

        Bitacora Bitacora = new Bitacora();

        Bitacora Insertar = new Bitacora();
        Insertar.setId_Usuario(Login.usuarioComercial);
        Insertar.setAccion("Accesso");

        Insertar.setCodigoAplicacion("200");
        Insertar.setModulo("3000");

     
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void cerrar_sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_sesionMouseClicked
        int respuesta_cs = JOptionPane.showConfirmDialog(this, "??Desea Cerrar Sesi??n?", "Cerrar Sesi??n", JOptionPane.YES_NO_OPTION);
        if (respuesta_cs == 0) {
            this.dispose();
        }

    }//GEN-LAST:event_cerrar_sesionMouseClicked

    private void Item_MntproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_MntproductoActionPerformed
        Mantenimiento_Producto = new Mantenimiento_Producto();
        jdpescritorio.add(Mantenimiento_Producto);
        Dimension desktopSize = jdpescritorio.getSize();
        Dimension FrameSize = Mantenimiento_Producto.getSize();
        Mantenimiento_Producto.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        Mantenimiento_Producto.show();
        logo.setVisible(true);
        Mantenimiento_Producto.setVisible(true);
    }//GEN-LAST:event_Item_MntproductoActionPerformed

    private void Item_MntbodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_MntbodegaActionPerformed
        Mantenimiento_Bodega = new Mantenimiento_Bodega();
        jdpescritorio.add(Mantenimiento_Bodega);
        Dimension desktopSize = jdpescritorio.getSize();
        Dimension FrameSize = Mantenimiento_Bodega.getSize();
        Mantenimiento_Bodega.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        Mantenimiento_Bodega.show();
        logo.setVisible(true);
        Mantenimiento_Bodega.setVisible(true);
    }//GEN-LAST:event_Item_MntbodegaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
//            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.out.println(ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MDIContenedor().setVisible(true);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(MDIContenedor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem Item_Mntbodega;
    private javax.swing.JMenuItem Item_Mntproducto;
    public static javax.swing.JMenu M_ccompras;
    private javax.swing.JMenu M_inventario;
    public static javax.swing.JMenu cerrar_sesion;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    public static javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem7;
    public static javax.swing.JDesktopPane jdpescritorio;
    // End of variables declaration//GEN-END:variables
}
