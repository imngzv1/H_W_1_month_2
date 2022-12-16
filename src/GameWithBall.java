public class GameWithBall extends Sport {

    public GameWithBall(TypeSport typeSport, Stadion stadion, String rules, int AmountOfPlayers) {
        super(typeSport, stadion);
        this.rules = rules;
        this.AmountOfPlayers = AmountOfPlayers;
    }

    private String rules;
    private int AmountOfPlayers;

    public String getRules() {
        return rules;
    }

    public int getAmountOfPlayers() {
        return AmountOfPlayers;
    }


    public void Ball() {
        System.out.println("Мячикккк");
    }

    public final int Ball(int size) {
        return size;
    }

    @Override
    public String GetInfo() {
        return super.GetInfo() + "\nRules: " + rules + "\nAmountPlayers: " + AmountOfPlayers;
    }
}
