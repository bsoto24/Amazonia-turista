package com.openlab.amazonia;

/**
 * Created by Bryam Soto on 12/11/2017.
 */

public class AreaProtegida {

    private String nombre;
    private String tipo;
    private String ubicacion;
    private int imagen;

    public AreaProtegida(String nombre, String tipo, String ubicacion, int imagen) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
