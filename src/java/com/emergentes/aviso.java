
package com.emergentes;

public class aviso {
    private int id;
    private String producto;
    private double precio;
    private String cantidad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String Producto) {
        this.producto = Producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double Precio) {
        this.precio = Precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString(){
        return "aviso("+ "id=" +id+ ", producto" +producto + 
                ",precio" +precio+ "cantidad" +cantidad+')';
    }
    
    
    
}
