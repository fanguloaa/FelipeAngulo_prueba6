package Modelo;

import java.sql.ResultSet;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccesoLibro extends Conexion{
    private ResultSet resultado;
    
    public AccesoLibro() {
        super.conectar();
    }
    
    //metodo CRUD - Read
    public ResultSet listarLibro(){    
        try {
            super.getStmt();
            resultado = stmt.executeQuery("SELECT l.idLibro AS `idLibro`, l.nombreLibro AS `nombreLibro`, \n" +
                                "l.autorLibro AS `autorLibro`, l.editorial AS `editorial`, \n" +
                                "l.ejemplares AS `ejemplares`, c.nombreCategoria AS `nombreCategoria`\n" +
                                "FROM `libro` AS l \n" +
                                "INNER JOIN `categoria` AS c ON l.categoria_id = c.idCategoria\n" +
                                "ORDER BY l.idLibro;");
        } catch (SQLException ex) {
            Logger.getLogger(AccesoLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
        
    }
    
    //metodo CRUD - Create
    public void ingresarLibro(int idLibro, String nombreLibro, String autorLibro,
            String editorial, int ejemplares, int categoria_id){
        try {
            super.getStmt();
            stmt.executeUpdate("Insert into libro "
                    + "values ("+idLibro+","
                            + "'"+nombreLibro+"',"
                            + "'"+autorLibro+"',"
                            + "'"+editorial+"',"
                            + ""+ejemplares+","
                            + ""+categoria_id+")");
            System.out.println("Ingresado con exito!");
        } catch (SQLException ex) {
            System.out.println("Error al ingresar Libro!");
            Logger.getLogger(AccesoLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo CRUD - Update
    public void actualizarLibro(int idLibro, String nombreLibro, String autorLibro,
            String editorial, int ejemplares, int categoria_id){
        try {
            super.getStmt();
            stmt.executeUpdate("Update libro set "
                    + "nombreLibro='"+nombreLibro+"',"
                    + "autorLibro='"+autorLibro+"',"
                    + "editorial='"+editorial+"',"
                    + "ejemplares="+ejemplares+","
                    + "categoria_id="+categoria_id+" where idLibro="+idLibro);
            System.out.println("Actualizado con exito!");
        } catch (SQLException ex) {
            System.out.println("Error al actualizar Libro!");
            Logger.getLogger(AccesoLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo CRUD - Delete
    public void eliminarLibro(int idLibro){
        try {
            super.getStmt();
            stmt.executeUpdate("Delete from libro where idLibro="+idLibro);
            System.out.println("Eliminado con exito!");
        } catch (SQLException ex) {
            System.out.println("Error al eliminar Libro!");
            Logger.getLogger(AccesoLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
