package magicalArena.main;

public class Main {
    public static void main(String[] args) {
//    	System.out.println("player1 details");
//        Player player1 = new Player();
//        System.out.println("player2 details");
//        Player player2 = new Player();
        Player player1 = new Player("Player A", 23, 12, 45);
        Player player2 = new Player("Player B", 34, 16, 50);
        MagicalArena arena = new MagicalArena(player1, player2);

        System.out.println("Starting the match...");
        arena.startMatch();

        System.out.println("Player A's final health: " + player1.getHealth());
        System.out.println("Player B's final health: " + player2.getHealth());
   
    }
}
