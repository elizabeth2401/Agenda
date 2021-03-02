// Ing.en Sistemas Computacionales 4A
// Sedano Acosta Martha Elizabeth   19290949
// Barajas Cervantes Luis Enrique   19290975
public class Persona {
    private String Nombre;
    private String Apellidos;
    private String Telefono;
    private String Tipo;
    private String Correo;
    private String Cumple;
    
    public String getNombre(){
     return Nombre;
    }
    
    public void setNombre(String nombre){
        this.Nombre = nombre;
    }
    public String getApellidos(){
     return Apellidos;
    }
    
    public void setApellidos(String apellidos){
        this.Apellidos = apellidos;
    }
    
    public String getTelefono(){
     return Telefono;
    }
    
    public void setTelefono(String telefono){
        this.Telefono = telefono;
    }
   
   public String getTipo(){
     return Tipo;
    }
    
    public void setTipo(String tipo){
        this.Tipo = tipo;
    }
    public String getCumple(){
     return Cumple;
    }
    public void setCumple(String cumple){
        this.Cumple = cumple;
    }

    public String getCorreo(){
     return Correo;
    }
    public void setCorreo(String correo){
        this.Correo = correo;
    }

   
}
