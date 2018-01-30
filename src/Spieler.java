public class Spieler extends MonopolyMain{
    public String name;
    public int vermoegen;
    //private Besitz;

    public Spieler(String name, int vermoegen){
        this.name = name;
        this.vermoegen= vermoegen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVermoegen(int vermoegen) {
        this.vermoegen = vermoegen;
    }

    public int getVermoegen() {
        return vermoegen;
    }
}
