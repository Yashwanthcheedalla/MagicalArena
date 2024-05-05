package magical.arena.player;
import java.util.Scanner;

public class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;
    private Scanner scanner;

    public Player() {
        scanner = new Scanner(System.in);
        setName();
        setHealth();
        setStrength();
        setAttack();
    }
    
    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    private void setName() {
        System.out.print("Enter player name: ");
        String input = scanner.nextLine();
        while (input.isEmpty()) {
            System.out.println("Name cannot be empty. Please enter a valid name.");
            input = scanner.nextLine();
        }
        this.name = input;
    }

    private void setHealth() {
        System.out.print("Enter player health: ");
        int input = scanner.nextInt();
        while (input < 0) {
            System.out.println("Health must be a non-negative value. Please enter a valid health value.");
            input = scanner.nextInt();
        }
        this.health = input;
    }

    private void setStrength() {
        System.out.print("Enter player strength: ");
        int input = scanner.nextInt();
        while (input < 0) {
            System.out.println("Strength must be a non-negative value. Please enter a valid strength value.");
            input = scanner.nextInt();
        }
        this.strength = input;
    }

    private void setAttack() {
        System.out.print("Enter player attack: ");
        int input = scanner.nextInt();
        while (input < 0) {
            System.out.println("Attack must be a non-negative value. Please enter a valid attack value.");
            input = scanner.nextInt();
        }
        this.attack = input;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    public void takeDamage(int damage) {
    	if(damage > this.health) {
    		this.health = 0;
    	}
    	else {
    		this.health -= damage;
    	}
        
    }
}
