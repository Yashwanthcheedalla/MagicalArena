package magical.arena;
import java.util.Random;

import magical.arena.player.Player;

public class MagicalArena {
    private Player player1;
    private Player player2;
    private Random random;

    public MagicalArena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.random = new Random();
    }

    public void startMatch() {
        Player attacker = player1.getHealth() < player2.getHealth() ? player1 : player2;
        Player defender = attacker == player1 ? player2 : player1;

        while (attacker.getHealth() > 0 && defender.getHealth() > 0) {
            int attackRoll = random.nextInt(6) + 1;
            int defenseRoll = random.nextInt(6) + 1;

            int attackDamage = attackRoll * attacker.getAttack();
            int defenseDamage = defenseRoll * defender.getStrength();
            
            int damageTaken = Math.max(0, attackDamage - defenseDamage);
            defender.takeDamage(damageTaken);
            System.out.printf("attackDamage:{%d},defenseDamage:{%d}, damageTaken:{%d}\n",attackDamage,defenseDamage,damageTaken);
            
            System.out.println("attacker " +attacker.getName()+ " final health: " + attacker.getHealth());
            System.out.println("defender " +defender.getName()+" final health: " + defender.getHealth());

            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        Player winner = player1.getHealth() > 0 ? player1 : player2;
        System.out.println("The winner is: " + winner.getName());
    }
}
