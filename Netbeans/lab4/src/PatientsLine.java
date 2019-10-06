
import java.util.LinkedList;


class PatientsLine {
    private LinkedList <String> lin = new LinkedList<String>();
    String name ="";
    byte number = 0;
    Patient paciente = new Patient();

    public PatientsLine() {
   lin.add("");
    }
   public void enqueue(String name, byte priority){
       paciente.setNombre(name);
       paciente.setPrioridad(priority);
       if (priority<=paciente.getPrioridad()) {
          
           lin.addFirst(name);
       }
      
       
   } 
//   public Patient attend(){
//   
//   }
   public boolean isEmpty(){
       if (lin==null) {
       return false;    
       }
       else{
       return true;
       }
      
   }
   public String toString() {
   return lin.toString();
   }

    public Patient attend() {
       
        return paciente;
    }

    

    
}
