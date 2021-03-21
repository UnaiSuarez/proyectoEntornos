package com.company.DAO;

import com.company.DAO.DAOUsuario.DAOUsuario;
import com.company.DAO.DAOUsuario.DAOUsuarioSerializable;

public class DAOFactory {
    private static DAOFactory daoFactory;
    private DAOUsuario daoUsuario;

    private DAOFactory(){}

    public static DAOFactory getInstance(){
        if (daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public DAOUsuario getDaoUsuario(){
        if (daoUsuario == null){
            daoUsuario = new DAOUsuarioSerializable();
            }
        return daoUsuario;
        }

}
