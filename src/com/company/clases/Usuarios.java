package com.company.clases;

import java.util.List;

public class Usuarios {
    Aplicacion aplicacion = new Aplicacion();

    private String nombre;
    private String correo;
    private String contraseña;
    private List<String> listaDEseos;

    public Usuarios(String nombre, String correo, String contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    private void login(){
        aplicacion.controladorAutentificacion();
    }

    private void comprarVideojuego(){

    }

    private void venderVideojuego(){

    }

    public void setNombre(String nombre){
        if (aplicacion.controlNombres(nombre)){
            this.nombre = nombre;
        }
    }

    public void setContraseña(String contraseña){
        if (aplicacion.controlContraseña(contraseña)){
            this.contraseña = contraseña;
        }
    }

    private void añadirAmigo(String nombre){

    }

    public void eliminarAmigo(String nombre){

    }

    public void setListaDEseos(String videojuego) {
        this.listaDEseos.add(videojuego);
    }
}
