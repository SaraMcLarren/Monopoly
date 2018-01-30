import java.util.*;
public class Strasse extends Strassenfelder { //Planeten
    int kaufpreis;
    int mietpreis_original;
    int mietpreis;
    int siedlungen;
    int siedlungspreis; //die städte kosten genauso viel wie eine siedlung
    int stadtanzahl;
    Scanner sc = new Scanner(System.in);
    //String farbe;

    public Strasse(String name, int position, int kaufpreis, int mietpreis /*, String farbe*/) {
        super(name, position, besitzer);
        this.kaufpreis = kaufpreis;
        this.mietpreis_original = mietpreis_original;
        this.mietpreis = mietpreis_original;
        //this.farbe=farbe;
        this.siedlungen = siedlungen;
        this.siedlungspreis = this.kaufpreis / 2;
        this.stadtanzahl = stadtanzahl;
    }

    public int getMietpreis() {
        return mietpreis;
    }

    public void setMietpreis(int mietpreis) {
        this.mietpreis = this.mietpreis_original + (this.mietpreis_original * (this.kaufpreis / 10) * this.siedlungen);
    }

    public int getKaufpreis() {
        return this.kaufpreis;
    }

    public void setKaufpreis(int kaufpreis) {
        this.kaufpreis = kaufpreis;
    }

    //public String getFarbe(){return this.farbe;}
    //public void setFarbe(String farbe) {this.farbe=farbe;}

    public int getSiedlungen() {
        return this.siedlungen;
    }

    public void baueSiedlung(int siedlungen, int stadtanzahl) {
        if (this.getBesitzer() == this.besitzer) {
            System.out.println("Soll hier eine neue Siedlung errichtet werden? (ja/nein)");
            String eingabe = sc.next();
            if (eingabe == "ja") {
                if (this.siedlungen < 5 && this.stadtanzahl != 1) {
                    if (besitzer.getVermoegen() >= this.siedlungspreis) {
                        this.siedlungen = this.siedlungen + 1;
                        if (this.siedlungen == 5) {
                            this.stadtanzahl = 1;
                            this.siedlungen = 0;
                        }
                    }
                    else System.out.println("Du hast leider nicht genug Geld zum Siedlungskauf.");
                }
                if (this.stadtanzahl == 1) {
                    System.out.println("Auf diesem Planeten können keine weiteren Zivilisationen errichtet werden.");
                }
                else System.out.println("Fehler Siedlungsbau");
            }
            else System.out.println("Was ein herrlicher Tag in der freien Natur");
        }
        else System.out.println("Du kannst auf diesem Planeten nicht bauen.");
    }


    public void zerstoereSiedlungen(int siedlungen) {
        if ((this.getBesitzer() == this.besitzer) && ((this.siedlungen >=1))) { //  this.stadtanzahl =1)) { ACHTUNG HIER NOCH ANDERN MIT STADT
            System.out.println("Soll hier eine Siedlung zerstört werden? (ja/nein)");
            String eingabe = sc.next();
            if (eingabe == "ja") {
                if (this.siedlungen >1 && this.stadtanzahl != 1) {
                    besitzer.setVermoegen(this.siedlungspreis + besitzer.getVermoegen());
                        this.siedlungen = this.siedlungen - 1;
                        if (this.siedlungen == 5) {
                            this.stadtanzahl = 1;
                            this.siedlungen = 0;
                        }

                if (this.stadtanzahl == 1) {
                    this.siedlungen =5;
                    this.stadtanzahl=0;
                    this.siedlungen = this.siedlungen - 1;
                    besitzer.setVermoegen(this.siedlungspreis + besitzer.getVermoegen());

                }
                    System.out.println("Auf diesem Planeten können keine weiteren Zivilisationen errichtet werden.");
                }
                else System.out.println("Fehler Siedlungszerstörung");
            }
            else System.out.println("Es lebe die Zivilisation!");
        }
        else System.out.println("Du kannst auf diesem Planeten nichts zerstören. Nicht mal mit einem Todesstern.");
    }
    public void setSiedlungen(int siedlungen) {
        this.siedlungen = siedlungen;
    }
    public void setSiedlungspreis(int siedlungspreis){ this.siedlungspreis=siedlungspreis; }
    public int getSiedlungspreis() { return this.siedlungspreis;}

    public void setStadtanzahl(int stadtanzahl) {this.stadtanzahl = stadtanzahl;}
    public int getStadtanzahl() {return this.stadtanzahl;}

    public void setBesitzer(Spieler besitzer) {
        if (this.getBesitzer()== null) {
            if (besitzer.getVermoegen() >= this.kaufpreis) {
                this.besitzer = besitzer;
            }
        }
        else {System.out.println("Dieser Planet ist bereits verkauft.");
        }
    }

    public Spieler getBesitzer() {
        return this.besitzer;
    }
}
