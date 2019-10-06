import java.util.LinkedList;
import java.util.ArrayList;


/**
	HastTable clase abstracta que crea
	un arraylist de listas encadenadas
 **/
public abstract class HashTable<K,V>{
	protected ArrayList<LinkedList<V>> table;

		/**
			Construcot que recibe de parametros el numero
			de casillas a crear en el ArrayList
			@parm numero entero que presenta el numero de casillas
		**/
		public HashTable(int size) {
			if (size>=1) {
				table = new ArrayList<LinkedList<V>>(size);
				for (int i=0;i < size ;i++ ) {
					table.add(i,new LinkedList<V>());
				}
			}	
		}

		public abstract K key(V dato);
		public abstract int hashfunction(K key);
		public abstract void insert(V dato);
		public abstract V delete(K key);
		public abstract boolean searchDato(V dato);
		public abstract V searchKey(K key);
}