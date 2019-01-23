package Modelo;

import java.sql.ResultSet;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccesoCategoria extends Conexion{
    private ResultSet resultado;
    
    public AccesoCategoria() {
        super.conectar();
    }
    
    //metodo CRUD - Read
    public ResultSet listarCategoria(){    
        try {
            super.getStmt();
            resultado = stmt.executeQuery("Select * from categoria");
        } catch (SQLException ex) {
            Logger.getLogger(AccesoCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
        
    }
    
    //metodo CRUD - Create
    public void ingresarCategoria(int idCategoria, String nombreCategoria, String descripcionCategoria){
        try {
            super.getStmt();
            stmt.executeUpdate("Insert into categoria "
                    + "values ("+idCategoria+","
                            + "'"+nombreCategoria+"',"
                            + "'"+descripcionCategoria+"')");
            System.out.println("Ingresado con exito!");
        } catch (SQLException ex) {
            System.out.println("Error al ingresar Categoría!");
            Logger.getLogger(AccesoCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo CRUD - Update
    public void actualizarCategoria(int idCategoria, String nombreCategoria, String descripcionCategoria){
        try {
            super.getStmt();
            stmt.executeUpdate("Update categoria set "
                    + "nombreCategoria='"+nombreCategoria+"',"
                    + "descripcionCategoria='"+descripcionCategoria+"' where idCategoria="+idCategoria);
            System.out.println("Actualizado con exito!");
        } catch (SQLException ex) {
            System.out.println("Error al actualizar Categoría!");
            Logger.getLogger(AccesoCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo CRUD - Delete
    public void eliminarCategoria(int idCategoria){
        try {
            super.getStmt();
            stmt.executeUpdate("Delete from categoria where idCategoria="+idCategoria);
            System.out.println("Eliminado con exito!");
        } catch (SQLException ex) {
            System.out.println("Error al eliminar Categoría!");
            Logger.getLogger(AccesoCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}