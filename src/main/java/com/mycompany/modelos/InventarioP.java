
package com.mycompany.modelos;

public class InventarioP {
    private int codigo;
    private String articulo;
    private String cantidad;
    private String precio;
    private String categoria;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getArticulo() {
        return articulo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }
    
}
