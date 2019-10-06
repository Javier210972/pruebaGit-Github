
public class PhoneContact {

private String apellido;
private String nombre;
private String telefono;
private boolean favorito;
public String text="";


public PhoneContact(String ape, String nom, String tel){

apellido = new String (ape);
nombre = new String (nom);
telefono = new String(tel);
favorito =false;

}

public String getLastName(){

return apellido;
}
public String getFirstName(){

return nombre;

}
public String getPhoneNumber(){
    return telefono;
  

}
public boolean isFavorite(){
    if (favorito==true) {
       text="**";
        return true;
    }
 return false;


}

public void setAsFavorite(){

favorito = true;

}
public boolean equals(PhoneContact pc){
    if (telefono.equals(pc)) {
 
        return true;        
    }
 return false;

}
@Override
public String toString(){
  isFavorite();
String s = telefono +" - "+ apellido +", "+ nombre+text ;
return s;
}


	
		}
				