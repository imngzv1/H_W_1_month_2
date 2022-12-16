public class Sport {

    private TypeSport typeSport;
    private Stadion stadion;

    public TypeSport getTypeSport() {
        return typeSport;
    }

    public Stadion getStadion() {
        return stadion;
    }

    public Sport(TypeSport typeSport, Stadion stadion) {
        this.typeSport = typeSport;
        this.stadion = stadion;
    }

    public String GetInfo(){

        return "Type of Sport: " + typeSport +"\nStadion: "+ stadion.getName()+ stadion.getSize();

    }
}
