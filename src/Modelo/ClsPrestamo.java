package Modelo;

import java.util.ArrayList;


public class ClsPrestamo {
    
    private int idPrestamo;
    private float valorPrestamo;
    private boolean estadoPrestamo;
    
    //Atributo de la clase Persona
    private ClsPersona persona;
    
    //Atributo de la clase Libro que es un ArrayList
    private ArrayList<ClsLibro>librosprestados;
    
    public ClsPrestamo(int idPrestamo, float valorPrestamo, boolean estadoPrestamo) {
        this.idPrestamo = idPrestamo;
        this.valorPrestamo = valorPrestamo;
        this.estadoPrestamo = estadoPrestamo;
        this.librosprestados=new ArrayList();
    }
    
    public ClsPrestamo(){
    
    
    }
    public int getIdPrestamo() {
        return idPrestamo;
    }

    public float getValorPrestamo() {
        return valorPrestamo;
    }

    public boolean getEstadoPrestamo() {
        return estadoPrestamo;
    }

    //Metodo que asocia un ObjPrestamo con un ObjPersona
    public void crearPersona(ClsPersona objPersona){
    
           this.persona=objPersona;
          
          
    }

    public ClsPersona getPersona() {
        return persona;
    }

   
    
    //Metodo que agrega un ObjLibro con un ObjPrestamo y lo guarda en un ArrayList
    public void agregarLibro_Prestamo(ClsLibro objLibro){
    
            this.librosprestados.add(objLibro);
    }
    public ArrayList<ClsLibro> getLibrosDePrestamo(){
    
        return librosprestados;
    
    }
    

    
}
