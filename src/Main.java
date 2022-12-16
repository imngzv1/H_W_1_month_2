public class Main {
    public static void main(String[] args) {
        Stadion stadion= new Stadion(5,"Мяч");
        GameWithBall gameWithBall= new GameWithBall(TypeSport.GROUND,stadion,"Играй",10);
        System.out.println(gameWithBall.GetInfo());
        gameWithBall.Ball();
        gameWithBall.Ball(4);
        Stadion stadion1 = new Stadion(8,"hello");
        Footbol footbol1= new Footbol(TypeSport.GROUND,stadion1,"Пинай",6,"Федя","Толик");
        System.out.println(footbol1.GetInfo());
        footbol1.Ball();
        Stadion stadion2 = new Stadion(5,"delfin");
        Footbol footbol2= new Footbol(TypeSport.GROUND,stadion2,"Не переходи границу с мячем",7,"Владик","trooo");
        System.out.println(footbol2.GetInfo());
        footbol2.Ball();

    }
}