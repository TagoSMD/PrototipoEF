/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Comercial.datos.LineaDAO;
import Comercial.datos.Conexion;
import Comercial.dominio.Linea;
//import Comercial.dominio.Proveedor;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 
 */
public class Mantenimiento_Linea extends javax.swing.JInternalFrame {

    /**
     * Creates new form Mantenimiento_Linea
     */
    
    public void llenadoDeTablas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Estado");
        LineaDAO lineaDAO = new LineaDAO();
        
        List<Linea> linea = lineaDAO.select();
        
        Tbl_Datos.setModel(modelo);
        String[] dato = new String[3];
        for (int i = 0; i < linea.size(); i++) {
            dato[0] = linea.get(i).getPK_codigo_Linea();
            dato[1] = linea.get(i).getNombre_Linea();
            dato[2] = linea.get(i).getEstatus_Linea();
            //System.out.println("vendedor:" + vendedores);
            modelo.addRow(dato);
        }
    }
    
     public void buscar() {
      Linea lineaAConsultar = new Linea();
        LineaDAO proveedorDAO = new LineaDAO();
        lineaAConsultar.setPK_codigo_Linea(Txt_codigo.getText());
        lineaAConsultar = proveedorDAO.query(lineaAConsultar);
        
        Txt_nombre.setText(lineaAConsultar.getNombre_Linea());
        Txt_estado.setText(lineaAConsultar.getEstatus_Linea());
        
                
   
                
    }        
    
     public void limpiar() {
        Txt_codigo.setText("");
        Txt_nombre.setText("");
        Txt_estado.setText("");
        
        
    }
    
    
    
    
    public Mantenimiento_Linea() {
        initComponents();
        llenadoDeTablas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lbl_titulo = new javax.swing.JLabel();
        Btn_Ayuda = new javax.swing.JButton();
        Pnl_datos = new javax.swing.JPanel();
        Lbl_codigo = new javax.swing.JLabel();
        Txt_codigo = new javax.swing.JTextField();
        Lbl_nombre = new javax.swing.JLabel();
        Txt_nombre = new javax.swing.JTextField();
        Lbl_estado = new javax.swing.JLabel();
        Txt_estado = new javax.swing.JTextField();
        Btn_Reporte = new javax.swing.JButton();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Modificar = new javax.swing.JButton();
        Btn_Eliminar = new javax.swing.JButton();
        Btn_Buscar = new javax.swing.JButton();
        Pnl_detalle18 = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        Tbl_Datos = new javax.swing.JTable();

        setBackground(java.awt.Color.white);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setVisible(true);

        Lbl_titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Lbl_titulo.setText("Mantenimiento Linea");

        Btn_Ayuda.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Btn_Ayuda.setText("Ayuda");
        Btn_Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AyudaActionPerformed(evt);
            }
        });

        Pnl_datos.setBackground(java.awt.Color.white);
        Pnl_datos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Linea"));

        Lbl_codigo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Lbl_codigo.setText("Codigo Linea:");

        Txt_codigo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        Lbl_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Lbl_nombre.setText("Nombre Linea:");

        Txt_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        Lbl_estado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Lbl_estado.setText("Estado Linea:");

        Txt_estado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        Btn_Reporte.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Btn_Reporte.setText("Reporte");
        Btn_Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ReporteActionPerformed(evt);
            }
        });

        Btn_Guardar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Btn_Guardar.setText("Guardar");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        Btn_Modificar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Btn_Modificar.setText("Modificar");
        Btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ModificarActionPerformed(evt);
            }
        });

        Btn_Eliminar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Btn_Eliminar.setText("Eliminar");
        Btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarActionPerformed(evt);
            }
        });

        Btn_Buscar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Btn_Buscar.setText("Buscar");
        Btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pnl_datosLayout = new javax.swing.GroupLayout(Pnl_datos);
        Pnl_datos.setLayout(Pnl_datosLayout);
        Pnl_datosLayout.setHorizontalGroup(
            Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_datosLayout.createSequentialGroup()
                .addGroup(Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_datosLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lbl_nombre)
                            .addComponent(Lbl_codigo)
                            .addComponent(Lbl_estado))
                        .addGap(18, 18, 18)
                        .addGroup(Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_nombre)
                            .addComponent(Txt_estado)
                            .addComponent(Txt_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pnl_datosLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(Btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        Pnl_datosLayout.setVerticalGroup(
            Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_datosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_codigo)
                    .addComponent(Txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_nombre)
                    .addComponent(Txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_estado))
                .addGap(30, 30, 30)
                .addGroup(Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(180, 180, 180))
        );

        Pnl_detalle18.setBackground(java.awt.Color.white);
        Pnl_detalle18.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle Linea"));

        Tbl_Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tbl_Datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_DatosMouseClicked(evt);
            }
        });
        jScrollPane20.setViewportView(Tbl_Datos);

        javax.swing.GroupLayout Pnl_detalle18Layout = new javax.swing.GroupLayout(Pnl_detalle18);
        Pnl_detalle18.setLayout(Pnl_detalle18Layout);
        Pnl_detalle18Layout.setHorizontalGroup(
            Pnl_detalle18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_detalle18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addContainerGap())
        );
        Pnl_detalle18Layout.setVerticalGroup(
            Pnl_detalle18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_detalle18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(Lbl_titulo)
                        .addGap(86, 86, 86)
                        .addComponent(Btn_Ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pnl_detalle18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_titulo)
                    .addComponent(Btn_Ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pnl_detalle18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AyudaActionPerformed
        // TODO add your handling code here:
        try {
            if ((new File("src\\main\\java\\Comercial\\reportes\\AyudaMantenimientoLinea.chm")).exists()) {
                Process p = Runtime
                .getRuntime()
                .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\Comercial\\reportes\\AyudaMantenimientoLinea.chm");
                p.waitFor();
            } else {
                JOptionPane.showMessageDialog(null, "La ayuda no Fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
//        
//                Bitacora Insertar = new Bitacora();
//                Insertar.setId_Usuario(Login.usuarioComercial);
//                Insertar.setAccion("Insertar");
//        
//                Insertar.setCodigoAplicacion("3001");
//                Insertar.setModulo("3000");
//        
//                try {
//                        BitacoraDAO.insert(Insertar);
//                    } catch (UnknownHostException ex) {
//                        Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                
//                Registro_ventaDao  DAO = new Registro_ventaDao();
//        
//                Registro_venta Inserta = new Registro_venta();
//                Inserta.setUsuario(Login.usuarioComercial);
//                Inserta.setAccion("Insertar");
//        
//                Inserta.setTabla("3001");
//                Inserta.setTotal(Txt_total.getText());
    }//GEN-LAST:event_Btn_AyudaActionPerformed
private Connection connection = null;
    private void Btn_ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ReporteActionPerformed
        // TODO add your handling code here:
         Map p = new HashMap();

        //        
//                Bitacora Insertar = new Bitacora();
//                Insertar.setId_Usuario(Login.usuarioComercial);
//                Insertar.setAccion("Insertar");
//        
//                Insertar.setCodigoAplicacion("3001");
//                Insertar.setModulo("3000");
//        
//                try {
//                        BitacoraDAO.insert(Insertar);
//                    } catch (UnknownHostException ex) {
//                        Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                
//                Registro_ventaDao  DAO = new Registro_ventaDao();
//        
//                Registro_venta Inserta = new Registro_venta();
//                Inserta.setUsuario(Login.usuarioComercial);
//                Inserta.setAccion("Insertar");
//        
//                Inserta.setTabla("3001");
//                Inserta.setTotal(Txt_total.getText());
    }//GEN-LAST:event_Btn_ReporteActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        // TODO add your handling code here:
        LineaDAO lineaDAO = new LineaDAO();
        Linea lineaAInsertar = new Linea();
        lineaAInsertar.setPK_codigo_Linea(Txt_codigo.getText());
        lineaAInsertar.setNombre_Linea(Txt_nombre.getText());
        lineaAInsertar.setEstatus_Linea(Txt_estado.getText());
        lineaDAO.insert(lineaAInsertar);

        llenadoDeTablas();
        limpiar();
        //        
//                Bitacora Insertar = new Bitacora();
//                Insertar.setId_Usuario(Login.usuarioComercial);
//                Insertar.setAccion("Insertar");
//        
//                Insertar.setCodigoAplicacion("3001");
//                Insertar.setModulo("3000");
//        
//                try {
//                        BitacoraDAO.insert(Insertar);
//                    } catch (UnknownHostException ex) {
//                        Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                
//                Registro_ventaDao  DAO = new Registro_ventaDao();
//        
//                Registro_venta Inserta = new Registro_venta();
//                Inserta.setUsuario(Login.usuarioComercial);
//                Inserta.setAccion("Insertar");
//        
//                Inserta.setTabla("3001");
//                Inserta.setTotal(Txt_total.getText());
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ModificarActionPerformed
        // TODO add your handling code here:
        LineaDAO lineaDAO = new  LineaDAO();
        Linea lineaAActualizar = new Linea();
        lineaAActualizar.setPK_codigo_Linea(Txt_codigo.getText());
        lineaAActualizar.setNombre_Linea(Txt_nombre.getText());
        lineaAActualizar.setEstatus_Linea(Txt_estado.getText());

        lineaDAO.update(lineaAActualizar);
        JOptionPane.showMessageDialog(null, "Modificación Exitosa.");
        llenadoDeTablas();
        limpiar();
        //        
//                Bitacora Insertar = new Bitacora();
//                Insertar.setId_Usuario(Login.usuarioComercial);
//                Insertar.setAccion("Insertar");
//        
//                Insertar.setCodigoAplicacion("3001");
//                Insertar.setModulo("3000");
//        
//                try {
//                        BitacoraDAO.insert(Insertar);
//                    } catch (UnknownHostException ex) {
//                        Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                
//                Registro_ventaDao  DAO = new Registro_ventaDao();
//        
//                Registro_venta Inserta = new Registro_venta();
//                Inserta.setUsuario(Login.usuarioComercial);
//                Inserta.setAccion("Insertar");
//        
//                Inserta.setTabla("3001");
//                Inserta.setTotal(Txt_total.getText());
    }//GEN-LAST:event_Btn_ModificarActionPerformed

    private void Btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarActionPerformed
        // TODO add your handling code here:
        LineaDAO lineaDAO = new LineaDAO();
        Linea lineaAEliminar = new Linea();
        lineaAEliminar.setPK_codigo_Linea(Txt_codigo.getText());
        lineaDAO.delete(lineaAEliminar);
        JOptionPane.showMessageDialog(null, "Registro Eliminado.");
        llenadoDeTablas();
        limpiar();
        //        
//                Bitacora Insertar = new Bitacora();
//                Insertar.setId_Usuario(Login.usuarioComercial);
//                Insertar.setAccion("Insertar");
//        
//                Insertar.setCodigoAplicacion("3001");
//                Insertar.setModulo("3000");
//        
//                try {
//                        BitacoraDAO.insert(Insertar);
//                    } catch (UnknownHostException ex) {
//                        Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                
//                Registro_ventaDao  DAO = new Registro_ventaDao();
//        
//                Registro_venta Inserta = new Registro_venta();
//                Inserta.setUsuario(Login.usuarioComercial);
//                Inserta.setAccion("Insertar");
//        
//                Inserta.setTabla("3001");
//                Inserta.setTotal(Txt_total.getText());
    }//GEN-LAST:event_Btn_EliminarActionPerformed

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
        // TODO add your handling code here:
        buscar();
        //        
//                Bitacora Insertar = new Bitacora();
//                Insertar.setId_Usuario(Login.usuarioComercial);
//                Insertar.setAccion("Insertar");
//        
//                Insertar.setCodigoAplicacion("3001");
//                Insertar.setModulo("3000");
//        
//                try {
//                        BitacoraDAO.insert(Insertar);
//                    } catch (UnknownHostException ex) {
//                        Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                
//                Registro_ventaDao  DAO = new Registro_ventaDao();
//        
//                Registro_venta Inserta = new Registro_venta();
//                Inserta.setUsuario(Login.usuarioComercial);
//                Inserta.setAccion("Insertar");
//        
//                Inserta.setTabla("3001");
//                Inserta.setTotal(Txt_total.getText());
    }//GEN-LAST:event_Btn_BuscarActionPerformed

    private void Tbl_DatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_DatosMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Tbl_DatosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_Ayuda;
    public javax.swing.JButton Btn_Buscar;
    public javax.swing.JButton Btn_Eliminar;
    public javax.swing.JButton Btn_Guardar;
    public javax.swing.JButton Btn_Modificar;
    public javax.swing.JButton Btn_Reporte;
    private javax.swing.JLabel Lbl_codigo;
    private javax.swing.JLabel Lbl_estado;
    private javax.swing.JLabel Lbl_nombre;
    private javax.swing.JLabel Lbl_titulo;
    private javax.swing.JPanel Pnl_datos;
    private javax.swing.JPanel Pnl_detalle18;
    private javax.swing.JTable Tbl_Datos;
    public javax.swing.JTextField Txt_codigo;
    public javax.swing.JTextField Txt_estado;
    public javax.swing.JTextField Txt_nombre;
    private javax.swing.JScrollPane jScrollPane20;
    // End of variables declaration//GEN-END:variables
}
