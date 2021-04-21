package Modelo;


public class ClsLibro {
    
    
    private String nombreLibro;
    private  enumTipoLibro tipoLibro;
    
     public ClsLibro(String nombreLibro, enumTipoLibro tipoLibro) {
        this.nombreLibro = nombreLibro;
        this.tipoLibro = tipoLibro;
    }

    public ClsLibro() {
    }

    
    
    
    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public enumTipoLibro getTipoLibro() {
        return tipoLibro;
    }

    public void setTipoLibro(enumTipoLibro tipoLibro) {
        this.tipoLibro = tipoLibro;
    }
}
