package com.company.DAO.DAOUsuario;

import com.company.DAO.DAOSerializable;
import com.company.clases.Usuarios;
import com.company.clases.Videojuegos;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase nos permite guardar cualquier cosa pasandole algo de tipo Objeto
 */
public class DAOUsuarioSerializable extends DAOSerializable implements DAOUsuario {
    List<Usuarios> usuarios;

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


    @Override
    public List<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void add(Usuarios usuario){
        usuarios.add(usuario);
        this.save(usuarios);
    }

    public void delete(int posicion){
        usuarios.remove(posicion);
        this.save(usuarios);
    }
}
