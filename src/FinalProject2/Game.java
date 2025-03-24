package FinalProject2;

public class Game {
    private Player player1;
    private Player player2;

    public Game() {
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
    }

    public void start() {
        Player current = player1;
        Player opponent = player2;

        while (player1.hasShipsRemaining() && player2.hasShipsRemaining()) {
            System.out.println(current.getName() + "-тың кезегі.");
            boolean hit = current.attack(opponent);
            if (hit) {
                System.out.println("Дәл тиді! Тағы бір рет атуға болады.");
                continue;
            }
            System.out.println("Мүлт кетті! Кезек қарсыласқа өтеді.");
            Player temp = current;
            current = opponent;
            opponent = temp;
        }

        System.out.println(current.getName() + " жеңді!");
    }
}
