// Parent class: GameCharacter
abstract class GameCharacter {
    // Encapsulation: private fields with public getters and setters
    private String name;
    private int health;
    private int attackPower;

    // Constructor
    public GameCharacter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    // Abstraction: Abstract method for special ability
    public abstract void specialAbility();

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    // Method to display character information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Health: " + health + ", Attack Power: " + attackPower);
    }

    // Method to perform a basic attack
    public void attack() {
        System.out.println(name + " attacks with power " + attackPower + "!");
    }
}

// Child class: Warrior
class Warrior extends GameCharacter {
    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    // Polymorphism: Overriding specialAbility method
    @Override
    public void specialAbility() {
        System.out.println(getName() + " uses Shield Bash!");
    }
}

// Child class: Mage
class Mage extends GameCharacter {
    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    // Polymorphism: Overriding specialAbility method
    @Override
    public void specialAbility() {
        System.out.println(getName() + " casts Fireball!");
    }
}

// Child class: Archer
class Archer extends GameCharacter {
    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    // Polymorphism: Overriding specialAbility method
    @Override
    public void specialAbility() {
        System.out.println(getName() + " performs a Sniper Shot!");
    }
}

// Main class
public class Game {
    public static void main(String[] args) {
        // Creating objects of child classes
        GameCharacter warrior = new Warrior("Thor", 100, 20);
        GameCharacter mage = new Mage("Gandalf", 80, 25);
        GameCharacter archer = new Archer("Legolas", 90, 15);

        // Display information and perform actions
        warrior.displayInfo();
        warrior.attack();
        warrior.specialAbility();

        mage.displayInfo();
        mage.attack();
        mage.specialAbility();

        archer.displayInfo();
        archer.attack();
        archer.specialAbility();
    }
}
