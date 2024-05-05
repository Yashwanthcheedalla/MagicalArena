package magical.arena;
import java.util.Random;

import magical.arena.player.Player;

public class MagicalArena {
    private Player playerA;
    private Player playerB;
    private Random random;

    public MagicalArena(Player player1, Player player2) {
        this.playerA = player1;
        this.playerB = player2;
        this.random = new Random();
    }

    public void startMatch() {
        Player attacker = playerA.getHealth() < playerB.getHealth() ? playerA : playerB;
        Player defender = attacker == playerA ? playerB : playerA;

        while (attacker.getHealth() > 0 && defender.getHealth() > 0) {
            int attackRoll = random.nextInt(6) + 1;
            int defenseRoll = random.nextInt(6) + 1;

            int attackDamage = attackRoll * attacker.getAttack();
            int defenseDamage = defenseRoll * defender.getStrength();
            
            int damageTaken = Math.max(0, attackDamage - defenseDamage);
            defender.takeDamage(damageTaken);
            System.out.printf("attackDamage:{%d},defenseDamage:{%d}, damageTaken:{%d}\n",attackDamage,defenseDamage,damageTaken);
            
            System.out.println("attacker " +attacker.getName()+ " health: " + attacker.getHealth());
            System.out.println("defender " +defender.getName()+" health: " + defender.getHealth());

            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        Player winner = playerA.getHealth() > 0 ? playerA : playerB;
        System.out.println("The winner is: " + winner.getName());
    }
}
