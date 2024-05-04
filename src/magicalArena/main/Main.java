package magicalArena.main;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Player A", 50, 5, 10);
        Player player2 = new Player("Player B", 100, 10, 5);
        MagicalArena arena = new MagicalArena(player1, player2);

        System.out.println("Starting the match...");
        arena.startMatch();

        System.out.println("Player A's final health: " + player1.getHealth());
        System.out.println("Player B's final health: " + player2.getHealth());
   
    }
}
