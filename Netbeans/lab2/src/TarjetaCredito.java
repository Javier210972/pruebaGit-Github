
import java.util.Random;
import java.util.regex.Pattern;

public class TarjetaCredito {
    private String numero;
    private String nombre;
    private double limite;
    private double tasa;
    private double saldo;
    
    Random random = new Random();
 
    public TarjetaCredito(String num,String name,double lim,double tas ){
        System.out.println("entro 111"); 
  
  
   //numero = Integer.toString(random.nextInt(1000)+1000)+"-"+Integer.toString(random.nextInt(1000)+1000)+"-"+Integer.toString(random.nextInt(1000)+1000)+"-"+Integer.toString(random.nextInt(1000)+1000);
    numero  = new String (num); 
   nombre = new String (name);
    limite = lim;
    tasa = tas;
    saldo=0;
   if (!Pattern.matches("\\d{4}-\\d{4}-\\d{4}-\\d{4}", numero)){
   numero ="";
      numero = Integer.toString(random.nextInt(1000)+1000)+"-"+Integer.toString(random.nextInt(1000)+1000)+"-"+Integer.toString(random.nextInt(1000)+1000)+"-"+Integer.toString(random.nextInt(1000)+1000);
   }
    
       
        
  
    }
    
    public double getLimiteCredito(){
    return limite;
    }
    public String getNombre(){
    return nombre;
    }
    public double getTasaInteres(){
    return this.tasa;
    }
    public String getNumero(){
    return numero;
    }
    public double getSaldoActual(){
    return saldo;
    }
    public double getSaldoDisponible(){
    return saldo;
    }
    public boolean comprar(double monto){
        if (monto>=0) {
            saldo=monto+saldo; 
            return true;
             
        }
        else{
        
         return false;
        }
    }
    public boolean pagar(double monto){
    if (monto>=0) {
            saldo=saldo-monto; 
            return true;
             
        }
        else{
        
         return false;
        }
    }
    public void corte(){
    saldo= saldo*tasa;
    }
    @Override
public String toString(){
  
String s = numero +", "+nombre +", "+getSaldoActual()+", "+getSaldoDisponible() +", "+limite+", "+tasa  ;
return s;
}
}
