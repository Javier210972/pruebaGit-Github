

public class WordTable extends HashTable<String,Word>  {
       
   public WordTable(int cantidad) {
        super(cantidad);
    }

    @Override
    public String key(Word dato) {
       return "";
    }

    @Override
    public int hashfunction(String key) {
        if (key!=null) {
            int a =0;
            for (int i = 0; i < key.length(); i++) {
               a = a + (int)key.charAt(i);
            }
            return a%table.size();
        }
   return -1;
    }

    @Override
    public void insert(Word dato) {
      
       
    }

    @Override
    public Word delete(String key) {
        Word word = new Word(key,"");
     return word;
    }

    @Override
    public boolean searchDato(Word dato) {
        return true;
    }

    @Override
    public Word searchKey(String key) {
       Word word = new Word("","");
       return word;
    }
   
    
   

    
    
}
