public class Strasse extends Strassenfelder { //Planeten
    int kaufpreis;
    int mietpreis_original;
    int mietpreis;
    int siedlungen;
    int siedlungspreis; //die städte kosten genauso viel wie eine siedlung
    int stadtanzahl;
    //String farbe;

    public Strasse(String name, int position, int kaufpreis, int mietpreis /*, String farbe*/) {
        super(name, position, besitzer);
        this.kaufpreis=kaufpreis;
        this.mietpreis_original=mietpreis_original;
        this.mietpreis=mietpreis_original;
        //this.farbe=farbe;
        this.siedlungen=siedlungen;
        this.siedlungspreis=this.kaufpreis/2;
        this.stadtanzahl=stadtanzahl;
    }

    public int getMietpreis(){
        return mietpreis;
    }
    public void setMietpreis(int mietpreis) {
        this.mietpreis = this.mietpreis_original+(this.mietpreis_original*(this.kaufpreis/10)*this.siedlungen);
    }

    public int getKaufpreis() { return this.kaufpreis;}
    public void setKaufpreis(int kaufpreis) {this.kaufpreis=kaufpreis;}

    //public String getFarbe(){return this.farbe;}
    //public void setFarbe(String farbe) {this.farbe=farbe;}

    public int getSiedlungen() { return this.siedlungen;}
    public void baueSiedlung(int siedlungen, int stadtanzahl) {
        if (this.siedlungen <5 && this.stadtanzahl != 1) { this.siedlungen = this.siedlungen+1; }
        if (this.siedlungen <5 && this.stadtanzahl == 1) { System.out.println("Auf diesem Planeten können keine weiteren Zivilisationen errichtet werden.");}
        else { this.stadtanzahl = 1; this.siedlungen = 0;}
    }
    public void zerstoereSiedlungen(int siedlungen) {
        this.siedlungen = this.siedlungen -1;
    }
    public void setSiedlungen(int siedlungen) {
        this.siedlungen = siedlungen;
    }
    public void setSiedlungspreis(int siedlungspreis){ this.siedlungspreis=siedlungspreis; }
    public int getSiedlungspreis() { return this.siedlungspreis;}

    public void setStadtanzahl(int stadtanzahl) {this.stadtanzahl = stadtanzahl;}
    public int getStadtanzahl() {return this.stadtanzahl;}

}
