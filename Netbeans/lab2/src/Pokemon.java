import java.util.*;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;
public class Pokemon {
    private String nombre;
    private String tipo;
    private int combat;
 
public Pokemon(String nom, String type){
 Random random = new Random();  
nombre= new String(nom);
tipo = new String(type);
combat = random.nextInt(1491)+10;
  
 
 
 }
public String getName(){
return nombre;
}
public String getType(){
return tipo;
}
public int getCombatPower(){
return combat;
}
public void  powerUp(int candy){
    if (combat<500) {
    combat = combat+candy*10;
    }
    else if (500<=combat && combat<=1000) {
    combat = combat+candy*12;
    }
    else if (combat>1000) {
    combat = combat+candy*14;
    }
    
    
    
    
}
@Override
public String toString(){
  
String s = nombre +" - "+ combat ;
return s;
}

}
