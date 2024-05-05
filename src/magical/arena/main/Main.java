package magical.arena.main;

import magical.arena.MagicalArena;
import magical.arena.player.Player;

public class Main {
    public static void main(String[] args) {
    	System.out.println("player1 details");
        Player playerA = new Player();
        System.out.println("player2 details");
        Player playerB = new Player();
        MagicalArena arena = new MagicalArena(playerA, playerB);

        System.out.println("Starting the match...");
        arena.startMatch();

        System.out.println(playerA.getName()+" final health: " + playerA.getHealth());
        System.out.println(playerB.getName()+" final health: " + playerB.getHealth());
   
    }
}
