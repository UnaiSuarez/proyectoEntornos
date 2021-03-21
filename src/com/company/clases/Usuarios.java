package com.company.clases;

import java.util.List;

/**
 * La calse usuario es donde se va a guardar la informcaion de este.
 */
public class Usuarios {
    Aplicacion aplicacion = new Aplicacion();

    private String nombre;
    private String correo;
    private String contraseña;
    private List<Videojuegos> listaDEseos;

    /**
     * En este constructor creamos un nuevo usuario.
     * @param nombre se refiere al nombre que tendra el usuario.
     * @param correo se refiere al correo que tendra el usuario.
     * @param contraseña se refiere al contraseña que tendra el usuario.
     */
    public Usuarios(String nombre, String correo, String contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    /**
     * Esta funcion nos permitira hacer login
     * Necesitará ser comprobada por la aplicacion para poder iniciar sesion.
     */
    private void login(){
        aplicacion.controladorAutentificacion();
    }

    /**
     * Esta función nos permitira comprar videojuegos.
     */
    private void comprarVideojuego(){

    }

    /**
     * Esta función nos permitira vender videojuegos que esten en nuestro poder.
     */
    private void venderVideojuego(){

    }

    /**
     * Aqui podremos cambiar el nombre del usuario.
     * Siempre y cuando el controlador nos lo permita.
     * @param nombre Es el nuevo nombre que queramos tener.
     */
    public void setNombre(String nombre){
        if (aplicacion.controlNombres(nombre)){
            this.nombre = nombre;
        }
    }

    /**
     * Aqui podremos cambiar la contraseña del usuario.
     * Siempre y cuando el controlador nos lo permita.
     * @param contraseña Es la nueva contraseña que queramos tener.
     */
    public void setContraseña(String contraseña){
        if (aplicacion.controlContraseña(contraseña)){
            this.contraseña = contraseña;
        }
    }

    /**
     * Aqui podremos añadir un nuevo amigo.
     * @param nombre nombre de la persona que queramos añadir como amigo.
     */
    private void añadirAmigo(String nombre){

    }

    /**
     * Aqui podremos eliminar a un amigo.
     * @param nombre nombre del amigo que queramos eliminar.
     */
    public void eliminarAmigo(String nombre){

    }

    /**
     * Aqui podremos añadir videojuegos a nuesra lista de deseos.
     * @param videojuego videojuego que queremos añadir
     */
    public void setListaDeseos(Videojuegos videojuego) {
        this.listaDEseos.add(videojuego);
    }
}
