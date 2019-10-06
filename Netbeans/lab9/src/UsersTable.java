
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import sun.reflect.annotation.AnnotationParser;

public class UsersTable {
    // declare sus campos aqui

    public HashMap<String, User> tabla = new HashMap<String, User>();
    public ArrayList<String> tablaA;

    public UsersTable() {
        tablaA = new ArrayList<>();
        //tabla.put(, value);
        // implemente instrucciones de constructor aqui

    }

    public void insert(String uname, String n, String p) throws Exception {
        //put((new )())
        if (this.search(uname)) {
            throw new UserAlreadyExistsException();
        } else {
            tabla.put(uname, new User(uname, n, p));
            tablaA.add(uname);
        }
    }

    public String delete(String username) {
        if (!this.search(username)) {
            return null;
        } else {

            return tabla.remove(username).toString();

        }
    }

    private User get(String username) {
        if (!this.search(username)) {
            return null;
        } else {

            return tabla.get(username);

        }

    }

    /* ** No modifique este codigo ** */
    public String userToString(String username) {
        return this.get(username).toString();
    }

    /* *********************************/
    public String getPassword(String username) {
        if (!this.search(username)) {
            return null;
        } else {

            return tabla.get(username).getPwd();

        }
// implemente aqui su codigo
    }

    public String getName(String username) {

        if (!this.search(username)) {
            return null;
        } else {

            return tabla.get(username).getName();

        }
// implemente aqui su codigo
    }

    public boolean search(String username) {
        return !(tabla.get(username) == null);
    }

    public ArrayList<String> getAllUsernames() {

        return tablaA;
// implemente aqui su codigo
    }

    /* ** No modifique este codigo ** */
    public String toString() {
        String str = "";
        for (String uname : this.getAllUsernames()) {
            str += uname + " -> " + this.get(uname).getName() + "\n";

        }
        return str;
    }
    /* *********************************/
}

/* ** No modifique este codigo ** */
class UserAlreadyExistsException extends Exception {

}
/* *********************************/
