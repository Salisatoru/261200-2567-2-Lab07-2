public class Character {

    // Attributes
    private int health;
    private int stamina;
    private int maxHealth;
    private int maxStamina;

    // Constructor
    public Character(int maxHealth, int maxStamina) {
        this.maxHealth = maxHealth;
        this.maxStamina = maxStamina;
        this.health = maxHealth;
        this.stamina = maxStamina;
        System.out.println("Character created with " + maxHealth + " health and " + maxStamina + " stamina.");
    }

    // Getter for health
    public int getHealth() {
        return health;
    }

    // Getter for stamina
    public int getStamina() {
        return stamina;
    }

    // Method to simulate swinging a sword
    public void swingSword() {
        if (stamina > 0) {
            stamina -= 10;
            if (stamina < 0) {
                stamina = 0;
            }
            System.out.println("Character swings sword. Stamina is now " + stamina + ".");
        }
        if (stamina == 0) {
            System.out.println("Your character needs to cool down.");
        }
    }

    // Method to take damage
    public void takeDamage(int damageAmount) {
        health -= damageAmount;
        if (health < 0) {
            health = 0;
        }
        System.out.println("Character takes " + damageAmount + " damage. Health is now " + health + ".");

        if (health == 0) {
            System.out.println("Character is dead.");
        }
    }

    // Method to rest and restore health and stamina
    public void rest() {
        health = maxHealth;
        stamina = maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
    }
}

