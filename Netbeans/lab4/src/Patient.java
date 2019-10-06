
class Patient {
String nombre;
byte prioridad ;


   

public Patient(String nombre, byte prioridad) {
        
    }

    Patient() {
        
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(byte prioridad) {
        this.prioridad = prioridad;
    }

    
    public String toString() {
        return nombre+": "+prioridad;
    }
   
    
}
