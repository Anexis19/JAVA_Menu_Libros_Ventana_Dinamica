
package Modelo;


public class ClsPersona {
    
    private String nombrePersona;
    private String tipoDocumento;
    
      
    //atributo de la universidad
    private ClsUniversidad universidad; 

    public ClsPersona(String tipoDocumento, String nombrePersona) {
        this.tipoDocumento = tipoDocumento;
        this.nombrePersona = nombrePersona;
        
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

  public void asociarPersona_Universidad(ClsUniversidad objUniversidad){
  
      this.universidad=objUniversidad;
  
  }

    public ClsUniversidad getUniversidad() {
        return universidad;
    }
  
 
}
