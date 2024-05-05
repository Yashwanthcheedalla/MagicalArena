package magical.arena.main;

import magical.arena.MagicalArena;
import magical.arena.player.Player;

public class Main {
    public static void main(String[] args) {
    	System.out.println("player1 details");
        Player player1 = new Player();
        System.out.println("player2 details");
        Player player2 = new Player();
        MagicalArena arena = new MagicalArena(player1, player2);

        System.out.println("Starting the match...");
        arena.startMatch();

        System.out.println(player1.getName()+" final health: " + player1.getHealth());
        System.out.println(player2.getName()+" final health: " + player2.getHealth());
   
    }
}
