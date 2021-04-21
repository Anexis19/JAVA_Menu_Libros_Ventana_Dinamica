package Modelo;

import java.util.ArrayList;

public class ClsBiblioteca {

    private String nombreBiblioteca;
    
     //Agregamos atributo de ClsPrestamo que será un Arraylist
    private ArrayList<ClsPrestamo> prestamos;
    
    //Agregamos atribut de ClsLbro que sera un ArrayList
    private ArrayList<ClsLibro>libros;
    

    public ClsBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.libros=new ArrayList();
        this.prestamos=new ArrayList();
    }

    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }
    
    public ArrayList<ClsLibro> getLibros(){
    
        return libros;
    
    }
    
    public ArrayList<ClsPrestamo> getPrestamos(){
    
        return prestamos;
    }
    //Metodo que permite agregar ObjetosPrestamo a un ArrayList de prestamos en ClsBibliotecs
    public void agregarPrestamo (ClsPrestamo objPrestamo){
    
        this.prestamos.add(objPrestamo);
    
    }
   
    
    //Metodo que permite componer un ObjBiblioteca con muchos ObjLibros
    public boolean componerBiblioteca_Libro(String nombreLibro, enumTipoLibro tipoLibro){
    
        ClsLibro objLibro=new ClsLibro(nombreLibro, tipoLibro);
        boolean bandera=false;
        if(this.libros.size()<10){
        
                bandera=this.libros.add(objLibro);
        }
        return bandera;

        
    }
 
    
    public  ClsLibro consultarLibro( String nombreBusqueda){
    
    ClsLibro objLibroB= new ClsLibro();
    
        for(int i=0; i<libros.size();i++){
        
        
            if(libros.get(i).getNombreLibro().equals(nombreBusqueda)){
            
            
                objLibroB=libros.get(i);
                return objLibroB;
            }
            
            else{
                
                objLibroB=null;
                
            }
        
        }
    
        return objLibroB;
    }
      

}
