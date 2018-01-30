import java.util.*;

public class Strassenfelder extends Spielfeld {
    ArrayList<Strasse> karte;
    ArrayList<Strasse> karte_gespielt;

    public Strassenfelder() {
        this.karte = new ArrayList<Strasse>();
        this.karte_gespielt = new ArrayList<Strasse>();

        karte.add(new Strasse("Tatooine Dünenmeer", 1, 60, 8));
        karte.add(new Strasse("Tatooine System", 3, 60, 8));
        karte.add(new Strasse("Bothawui", 6, 100, 15));
        karte.add(new Strasse("Ruusan Sparrenburg", 8, 100, 15));
        karte.add(new Strasse("Abregado System", 9, 120, 18 ));
        karte.add(new Strasse("Rugosa", 11, 140, 20));
        karte.add(new Strasse("Toydaria System", 13, 140, 20));
        karte.add(new Strasse("Rishi", 14, 160, 22));
        karte.add(new Strasse("Teth Festung", 16, 180, 24));
        karte.add(new Strasse("Teth-Dschugel", 18, 180, 24));
        karte.add(new Strasse("Teth System", 19, 200, 28 ));
        karte.add(new Strasse("Kalida Nebel", 21, 220, 30));
        karte.add(new Strasse("Antar", 23, 220, 30));
        karte.add(new Strasse("Rodia", 24, 240, 32));
        karte.add(new Strasse("Ryloth",26, 260, 34 ));
        karte.add(new Strasse("Florrum", 27, 260, 34));
        karte.add(new Strasse("Vassek", 29, 280,36 ));
        karte.add(new Strasse("Crystal City Plaza Center", 31, 300, 38));
        karte.add(new Strasse("Crystal City", 32, 300, 38));
        karte.add(new Strasse("Christophsis System", 34, 320, 40));
        karte.add(new Strasse("Ziros Palast", 37,350, 44 ));
        karte.add(new Strasse("Jabbas Palast", 39, 400, 50 ));
    }
}