package com.android.store.mercapp.Entidades;

public class Storage {
    private String Nombre,Direccion;
    private String Estado;


    public Storage(){

    }
    public Storage(String nombre, String direccion, String estado) {
        Nombre = nombre;
        Direccion = direccion;
        Estado = estado;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }





}
