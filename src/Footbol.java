public final class Footbol extends GameWithBall {


    public Footbol(TypeSport typeSport, Stadion stadion, String rules, int AmountOfPlayers, String sudya, String Trener) {
        super(typeSport, stadion, rules, AmountOfPlayers);
        this.sudya = sudya;
        this.Trener = Trener;
    }

    private String sudya;
    private String Trener;

    public String getSudya() {
        return sudya;
    }

    public String getTrener() {
        return Trener;
    }

    @Override
    public void Ball() {
        System.out.println("Пинай");
    }

    @Override
    public String GetInfo() {
        return super.GetInfo() + "\nSudya: " + sudya + "\nTrener: " + Trener;
    }
}
