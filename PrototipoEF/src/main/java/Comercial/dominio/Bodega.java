/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comercial.dominio;

/**
 *
 * @author Diana
 */
public class Bodega {

     String codigo_bodega;
    String nombreBodega;
    String estatusBodega;

    
    public Bodega() {
    }

    public Bodega(String codigo_bodega, String nombreBodega, String estatusBodega) {
        this.codigo_bodega = codigo_bodega;
        this.nombreBodega = nombreBodega;
        this.estatusBodega = estatusBodega;
    }

    public String getCodigo_bodega() {
        return codigo_bodega;
    }

    public void setCodigo_bodega(String codigo_bodega) {
        this.codigo_bodega = codigo_bodega;
    }

    public String getNombreBodega() {
        return nombreBodega;
    }

    public void setNombreBodega(String nombreBodega) {
        this.nombreBodega = nombreBodega;
    }

    public String getEstatusBodega() {
        return estatusBodega;
    }

    public void setEstatusBodega(String estatusBodega) {
        this.estatusBodega = estatusBodega;
    }

    @Override
    public String toString() {
        return "Bodega{" + "codigo_bodega=" + codigo_bodega + ", nombreBodega=" + nombreBodega + ", estatusBodega=" + estatusBodega + '}';
    }

    
}
