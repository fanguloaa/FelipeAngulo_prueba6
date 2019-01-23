package Modelo;


public class ComboBox {
    private int idCategoria;
    private String nombreCategoria;

    public ComboBox() {
    }

    public ComboBox(int idCategoria, String nombreCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }
    
    @Override
    public String toString(){
        return nombreCategoria;
    }
}