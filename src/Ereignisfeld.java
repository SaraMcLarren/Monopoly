import java.util.*;

public class Ereignisfeld extends Spielfeld{
    ArrayList<Ereigniskarten> karte;
    ArrayList<Ereigniskarten> karte_gespielt;

    public Ereigniskarten () {
        this.karte = new ArrayList<Ereigniskarten>();
        this.karte_gespielt = new ArrayList<Ereigniskarten>();

        karte.add(new Ereigniskarten(0, "Du hast das Tempolimit im Hyperraum überschritten. Zahle ein Bußgeld von §300."));
        karte.add(new Ereigniskarten(1, "Steuerfeld! Zahle §100 am das allmächtige Imperium."));
        karte.add(new Ereigniskarten(2, "Herzlichen Glückwunsch! Du wurdest zur Miss Wookie gewählt. Erhalte §210 als Preisgeld!"));
        karte.add(new Ereigniskarten(3, "Du wurdest beim illegalen Handel mit Porgs erwischt! Gehe ins Gefängnis."));
        karte.add(new Ereigniskarten(4, "Die Rebellen sind gekommen und haben dich befreit! Entkomme dem Gefängnis."));
        karte.add(new Ereigniskarten(5, "Durch ein Loch im Raum-Zeit-Kontinuum fliegt dein Schiff schneller als sonst. Du rückst auf Los vor."));
        karte.add(new Ereigniskarten(6, "Alarm! It's a trap! Gehe drei Felder zurück."));
        karte.add(new Ereigniskarten(7, "Schnell sein, du musst. Rücke vier Felder vor."));
    }

    public void mischen() {
        Random kartenstapel = new Random();
        while(karte_gespielt.size()>0) {
            int index = Math.abs(kartenstapel.nextInt())%karte_gespielt.size();
            karte.add(karte_gespielt.get(index));
            karte_gespielt.remove(index);
        }

    }

    public int ereignisTyp (int typ){
        switch (typ) {
            case 0:
        }
    }

}
