public class Bahnhof extends Spielfeld { //aka Raumschiff
    int kaufpreis;

    public Bahnhof(String name, int position, int kaufpreis) {
        super(name, position, besitzer);
        this.kaufpreis=kaufpreis;
    }

    public int getKaufpreis() { return this.kaufpreis;}
    public void setKaufpreis(int kaufpreis) {this.kaufpreis=kaufpreis; }

    public int getMiete() {
        int anzahlBesitz=0;
        for(int i=0; i<spieler.getBesitz().size(); i++) {
            if(spieler.getBesitz().get(i) instanceof Bahnhof) {
                anzahlBesitz++;
            }
        }
        return anzahlBesitz*25;
    }

}

