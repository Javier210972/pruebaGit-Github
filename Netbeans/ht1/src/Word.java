public class Word {
	private String palabra, significado;

	public Word(String p, String s) {
		this.palabra = new String(p);
		this.significado = new String(s);
	}

	public String getPalabra() {
		return this.palabra;
	}

	public String getSignificado() {
		return this.significado;
	}

	public boolean equals(Word otra) {
		if (otra != null) {
			return this.palabra.equals(otra.palabra);			
		}
		return false;
	}

	public String toString() {
		return "[" + this.palabra + ": " + this.significado + "]";
	}
}