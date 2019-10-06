import java.util.regex.*;
public class User {
	/* ** No modifique este codigo ** */
	private String username, name, password;

	public User(String username, String nombre, String pwd) throws Exception{
		if (username == null) {
			throw new NullPasswordExcception();
		} else if (validUser(username)) {
			this.username = username;
			this.name = nombre;
			this.password = pwd;
		} else {
			throw new InvalidUsernameException();
		}
	}
	/* *********************************/

	public static boolean validUser(String username) {
            return Pattern.matches("([a-z][a-z|0-9|_]{5,13})@([a-z]+)([.])([a-z]{1,3})",username)==true;
	}

    

	/* ** No modifique este codigo ** */
	public String getUsername() {
		return this.username;
	}

	public String getName() {
		return this.name;
	}

	public String getPwd() {
		return this.password;
	}

	public String toString() {
		return "[ " + this.username + " : " + this.name + " ]";
	}
	/* *********************************/
}

/* ** No modifique este codigo ** */
class InvalidUsernameException extends Exception {
}

class NullPasswordExcception extends Exception {
}
/* *********************************/
