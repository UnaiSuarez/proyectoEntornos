package com.company.DAO.DAOUsuario;

import com.company.DAO.DAOSerializable;
import com.company.clases.Usuarios;
import com.company.clases.Videojuegos;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase nos permite hacer diferentes cosas con los usuarios
 */
public class DAOUsuarioSerializable extends DAOSerializable implements DAOUsuario {
    List<Usuarios> usuarios;

    /**
     * Aqui guardamos todos los usuarios existentes en una lista, si no hay la lista se crea vacia.
     */
    public DAOUsuarioSerializable(){
        super("usuarios.txt");
        Object obj = this.load();
        if (obj == null){
            usuarios = new ArrayList<>();
        }
        else {
            usuarios = (List<Usuarios>) obj;
        }
    }

    /**
     * Con esto podemos ver todos los usuarios.
     * @return nos devuelve la lista de usuarios.
     */
    @Override
    public List<Usuarios> getUsuarios() {
        return usuarios;
    }

    /**
     * Aqui podemos añadir un nuevo usuario o editar uno ya creado.
     * @param usuario este parametro es donde se guarda toda la informacion del usuario.
     */
    public void add(Usuarios usuario){
        usuarios.add(usuario);
        this.save(usuarios);
    }

    /**
     * Aqui podemos eliminar un usario indicando la posicion en la que se encuentra este dentro de la lista.
     * @param posicion este parametro sirve para identificar un usuario dentro de la lista.
     */
    public void delete(int posicion){
        usuarios.remove(posicion);
        this.save(usuarios);
    }
}
