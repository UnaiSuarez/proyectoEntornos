package com.company.DAO.DAOUsuario;

import com.company.clases.Usuarios;

import java.util.List;

public interface DAOUsuario {
    public List<Usuarios> getUsuarios();
    public  void add(Usuarios usuarios);
    void delete(int posicion);
}
