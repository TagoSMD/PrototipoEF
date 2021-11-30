/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comercial.datos;

import Comercial.dominio.Bodega;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Diana
 */
public class BodegaDAO {

    private static final String SQL_SELECT = "SELECT codigo_bodega, nombre_bodega, nombre_bodega FROM bodegas";
    private static final String SQL_INSERT = "INSERT INTO bodegas (codigo_bodega, nombre_bodega, estatus_bodega) VALUES(?,?,?)";
    private static final String SQL_UPDATE = "UPDATE bodegas SET  nombre_bodega= ?, estatus_bodega= ? WHERE codigo_bodega=?";
    private static final String SQL_QUERY = "SELECT codigo_bodega, nombre_bodega, estatus_bodega FROM bodegas WHERE codigo_bodega=?";
    private static final String SQL_DELETE = "DELETE FROM bodegas WHERE codigo_bodega=?";

    public List<Bodega> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Bodega bodega = null;
        List<Bodega> bodegas = new ArrayList<Bodega>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String codigo_bodega = rs.getString("codigo_bodega");
                String nombre_bodega = rs.getString("nombre_bodega");
                String estatus_bodega = rs.getString("estatus_bodega");

                bodega = new Bodega();
                bodega.setCodigo_bodega(codigo_bodega);
                bodega.setNombreBodega(nombre_bodega);
                bodega.setEstatusBodega(estatus_bodega);

                bodegas.add(bodega);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return bodegas;
    }

    public int insert(Bodega bodega) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, bodega.getCodigo_bodega());
            stmt.setString(2, bodega.getNombreBodega());
            stmt.setString(3, bodega.getEstatusBodega());

            //System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            //System.out.println("Registros afectados:" + rows);
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int update(Bodega bodega) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);

            stmt.setString(1, bodega.getNombreBodega());
            stmt.setString(2, bodega.getEstatusBodega());
      stmt.setString(3, bodega.getCodigo_bodega());
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public Bodega query(Bodega bodega) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Bodega> bodegas = new ArrayList<Bodega>();
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setString(1, bodega.getCodigo_bodega());
            rs = stmt.executeQuery();

            while (rs.next()) {
                String codigo_bodega = rs.getString("codigo_bodega");
                String nombre_bodega = rs.getString("nombre_bodega");
                String estatus_bodega = rs.getString("estatus_bodega");

                bodega = new Bodega();
                bodega.setCodigo_bodega(codigo_bodega);
                bodega.setNombreBodega(nombre_bodega);
                bodega.setEstatusBodega(estatus_bodega);

                //empleados.add(empleado); // Si se utiliza un ArrayList
            }
            //System.out.println("Registros buscado:" + empleado);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        //return empleados;  // Si se utiliza un ArrayList
        return bodega;
    }

    public int delete(Bodega bodega) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            //System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, bodega.getCodigo_bodega());
            rows = stmt.executeUpdate();
            //System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }
}
