import java.util.*;

public class Spielfeld extends MonopolyMain{
    public String name;
    public int position; //Auf dem Spielfeld (0-40)
    public Spieler besitzer;



    public Spielfeld(String name, int position, Spieler besitzer) {
        this.name=name;
        this.position=position;
        this.besitzer=null; //besitzer
    }

    List Spielfeld = new ArrayList();
    Spielfeld.add()








    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public void setBesitzer(Spieler besitzer) {
        this.besitzer = besitzer;
    }

    public Spieler getBesitzer() {
        return besitzer;
    }

}
