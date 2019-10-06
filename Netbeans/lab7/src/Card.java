
class Card implements Ordenable {

    protected byte numero;
    protected byte simbolo;

    Card(byte n, byte s) {
        numero = n;
        simbolo = s;
    }

    public char getNumero() {
        switch (numero) {
            case 1:
                return 'A';
            case 2:
                return '2';
            case 3:
                return '3';
            case 4:
                return '4';
            case 5:
                return '5';
            case 6:
                return '6';
            case 7:
                return '7';
            case 8:
                return '8';
            case 9:
                return '9';
            case 10:
                return 'J';
            case 11:
                return 'Q';
            case 12:
                return 'K';
            default:
                return ' ';
        }

    }

    public String getSimbolo() {
        switch (simbolo) {
            case 1:
                return "spades";
            case 2:
                return "hearts";
            case 3:
                return "diamonds";
            case 4:
                return "clubs";
            default:
                return " ";
        }

    }

    public String toString() {
        return "" + getNumero() + ":" + getSimbolo();
    }

    @Override
    public boolean mayorQue(Ordenable x) {
        Card m = (Card) x;
        return m.simbolo < this.simbolo;
    }

    @Override
    public boolean menorQue(Ordenable x) {
       Card m = (Card) x;
        return m.simbolo > this.simbolo;
    }

    @Override
    public boolean mayorOIgualA(Ordenable x) {
       Card m = (Card) x;
        return m.simbolo <= this.simbolo;
    }

    @Override
    public boolean menorOIgualA(Ordenable x) {
         Card m = (Card) x;
        return m.simbolo >= this.simbolo;
    }

    @Override
    public boolean igualA(Ordenable x) {
        Card m = (Card) x;
        return m.simbolo == this.simbolo;
    }

}
