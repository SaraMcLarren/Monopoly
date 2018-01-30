public class Spieler {
    public String name;
    public int vermoegen;
    public int standort;
    //private Besitz;

    public Spieler(String name, int vermoegen, int standort){
        this.name = name;
        this.vermoegen= vermoegen;
        this.standort= 0;
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

    public void bewegen(Spielfeld standort) { //setStandort
        this.standort=this.standort+(int)((Math.random()*6+1)*(Math.random()*6+1));
    }

    public int getStandort(){
        return this.standort;
    }

    public void kaufeFeld(int station) {
        if (this.getStandort().getBesitzer() != null) {
            if (this.getStandort().getBesitzer().equals(this.getName())) {
                System.out.println("Du besitzt dieses Feld bereits");
            }
            else {
                System.out.println("Jemand anderes besitzt dieses Feld bereits.");
                this.getStandort().getBesitzer().setVermoegen(this.getStandort().getBesitzer.getVermoegen() + this.getStandort().getMiete());
                this.setVermoegen(this.getVermoegen() - this.getStandort().getMiete());
            }
        }
        else System.out.println("Du kannst diesen Planeten nicht kaufen.");
    }

    public void setStandort(int station){

        switch (this.getStandort()) {
            case 0:
                System.out.println("Du stehst auf LOS! Erhalte §200.");
                this.setVermoegen(this.getVermoegen() + 200);
                break;
            case 1: System.out.println(name.Strasse())


        }
        if (this.getStandort() == (28 || 12)) {
    }
}
