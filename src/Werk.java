public class Werk extends Spielfeld { //aka Raumstationen
    int kaufpreis;
    int station;

    public Werk(String name, int position, int kaufpreis, int mietpreis) {
        super(name, position, besitzer);
        this.kaufpreis=kaufpreis;
        this.station=station;
    }


    public int getKaufpreis() { return this.kaufpreis;}
    public void setKaufpreis(int kaufpreis) {this.kaufpreis=kaufpreis;}

    public int getMiete() {
       return (int)((Math.random()*6+1)*(Math.random()*6+1))*7; //zwei würfel werden geworfen, die augenzahl mit 7 multipliziert

    }


}
