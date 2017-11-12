package com.openlab.amazonia;

/**
 * Created by Bryam Soto on 12/11/2017.
 */

public class Ticket {

    private String areaProtegida;
    private String precio;
    private String fechaExpiracion;

    public Ticket(String areaProtegida, String precio, String fechaExpiracion) {
        this.areaProtegida = areaProtegida;
        this.precio = precio;
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getAreaProtegida() {
        return areaProtegida;
    }

    public void setAreaProtegida(String areaProtegida) {
        this.areaProtegida = areaProtegida;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }
}
