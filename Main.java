public class Main {

    public static void main(String[] args) {
        // Create a Character instance with max health of 100 and max stamina of 50
        Character character = new Character(100, 50);

        // Test the swingSword() method to deplete stamina
        character.swingSword();
        character.swingSword();
        character.swingSword();
        character.swingSword();
        character.swingSword();

        // Test the takeDamage() method to deplete health
        character.takeDamage(30); // Health should drop to 70
        character.takeDamage(50); // Health should drop to 20
        character.takeDamage(20); // Health should drop to 0 (and trigger death)

        // Test resting the character to restore health and stamina
        character.rest();

        // Print the character's current state
        System.out.println("Character's health: " + character.getHealth() + ", stamina: " + character.getStamina() + ".");
    }
}
