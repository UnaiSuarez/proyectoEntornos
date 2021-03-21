package com.company.clases;

/**
 * Aqui se pondran todas las funcionalidades que dependen de la aplicacion.
 */
public class Aplicacion {
    /**
     * En esta funcion validaremos que el usuario puede iniciar sesion.
     */
    public void controladorAutentificacion(){

    }

    /**
     * Aqui podremos validar si e sposible cambiar de nombre.
     * @param nombre el nuevo nombre del usuario.
     * @return devuelve true si es posible o false si el nombre ya esta en uso.
     */
    public boolean controlNombres(String nombre){
        return true;
    }
    /**
     * Aqui podremos validar si e sposible cambiar de contraseña.
     * @param contraseña la nueva contraseña del usuario.
     * @return devuelve true si es posible o false si no es posible.
     */
    public boolean controlContraseña(String contraseña){
        return true;
    }
}
