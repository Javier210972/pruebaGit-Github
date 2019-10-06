
import java.util.Arrays;
import java.util.Random;


public class ParkingLot {
    Random ra = new Random();
   int[] parqueo;
    
    public ParkingLot (int total){
      
        parqueo = new int[total];
        
      
     
     }
     public int size(){
     return parqueo.length;
     }
     public boolean isFull(){
         
         if (parqueo!=null) {
             return false;
         }
         else{
         return true; 
         }
        
     }
     public boolean isEmpty(){
         if (parqueo==null) {
             return true;
         }
         else{
         return false;
         }
     }
     
     public boolean isEmpty(int parking){
         if (parqueo[parking]==0) {
             return true;
         }
         else{
     return false;
         }
     }
     public boolean parkInLot(int parking){
         if (parqueo[parking]!=0) {
             return true;
         }
         else{
         return true;
         }
     }
     public int parkInRandomSpace(){
        
         for (int i = 0; i < parqueo.length; i++) {
             if (parqueo[i+1]!=0) {
                 return -1;
             }
             else if(parqueo[i+1]==0){
             return parqueo[ra.nextInt(parqueo.length+1)];
             }
         }
         
     
         return parqueo[ra.nextInt(parqueo.length+1)];
     }
     public void emptyLot(int parking){
     parqueo[parking]=0;
     }
     
     public boolean  isValidParking(int parking){
         if (parking>=1&&parking<=parqueo.length) {
             return true;
         }
         else{
         return false;
         }
     }
    @Override
     public String toString(){
        for (int i = 0; i <= parqueo.length-1; i++) {
            return ""+parqueo[i+1];
        
        }
        return "";
     }
}
