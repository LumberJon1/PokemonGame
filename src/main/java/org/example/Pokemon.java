package org.example;

// Resolve any imports that I might need from utils etc.
import java.util.Random;

public class Pokemon {

//    Instance variables for the super class Pokemon
    private String species = "Eevee";
    private String name = "Eevee01";
    private int hp = 10;
    private int level = 1;
    private int xp = 0;
    private int speed = 10;
    private int attack = 10;
    private int defense = 10;
    private int attackSpecial = 10;
    private int defenseSpecial = 10;

    private String type1 = "Normal";
    private String type2 = "";

//    TODO list for instance variables:
    /*
    * - Have a flag that will toggle a boolean for dual-typing
    * - Have an ArrayList of types against which the pokemon is super effective or is half-effective
    * - Have an items ArrayList
    * */


//    Constructors
    public Pokemon(String indivspecies, String indivname) {
        name = indivname;
        species = indivspecies;
        System.out.println("Created new "+species+" "+name+"!");

    }

//    Methods...

//    Setters
    public String setName(String newValue) {
        name = newValue;
        System.out.println("Set name to "+newValue+".");
        return newValue;
    }
    public String setSpecies(String newValue) {
        species = newValue;
        System.out.println("Set species to "+newValue+".");
        return newValue;
    }
    public int setHP(int newValue) {
        hp = newValue;
        System.out.println("Set HP to "+newValue+".");
        return newValue;
    }
    public int setLevel(int newValue) {
        level = newValue;
        System.out.println("Set Level to "+newValue+".");
        return newValue;
    }
    public int setXP(int newValue) {
        xp = newValue;
        System.out.println("Set XP to "+newValue+".");
        return newValue;
    }
    public int setSpeed(int newValue) {
        speed = newValue;
        System.out.println("Set speed to "+newValue+".");
        return newValue;
    }
    public int setAttack(int newValue) {
        attack = newValue;
        System.out.println("Set attack to "+newValue+".");
        return newValue;
    }
    public int setDefense(int newValue) {
        defense = newValue;
        System.out.println("Set defense to "+newValue+".");
        return newValue;
    }
    public int setAttackSpecial(int newValue) {
        attackSpecial = newValue;
        System.out.println("Set special attack to "+newValue+".");
        return newValue;
    }
    public int setDefenseSpecial(int newValue) {
        defenseSpecial = newValue;
        System.out.println("Set special defense to "+newValue+".");
        return newValue;
    }
//    Getters
    public String getName() {
        return name;
    }
    public String getSpecies() {
        return species;
    }
    public int getHP() {
        return hp;
    }
    public int getLevel() {
        return level;
    }
    public int getXP() {
        return xp;
    }
    public int geSpeed() {
        return speed;
    }
    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }
    public int getAttackSpecial() {
        return attackSpecial;
    }
    public int getDefenseSpecial() {
        return defenseSpecial;
    }
    public String[] getTypes() {
        String[] types = new String[2];

//      Conditional to return 1 or both
        if (type2.isEmpty()) {
            System.out.println("Single-type pokemon: "+type1);
            types[0] = type1;
        }
        else {
            System.out.println("Dual-type pokemon: "+type1+"-"+type2);
            types[0] = type1;
            types[1] = type2;
        }
        return types;
    }

//    Utility methods
    public int attackRoll() {
//        Combine pokemon's attack value and level with a random number to generate a returned int value
//        Will be compared against defender's defense roll

//      random value
        Random rand = new Random();
        int randomValue = rand.nextInt(11) + 1;
        System.out.println("Randomly generated "+randomValue+".");

//      Adjust based on pokemon level
        randomValue /= (1.0 / level);
        System.out.println("Adjusted attack roll by (1 / level) ("+(1.0 / level)+"). ");
        System.out.print("Adj. value = "+randomValue+".");

//      Adjust based on pokemon attack score
        randomValue += attack;
        System.out.println("Adjusted attack roll by attack value("+attack+".");
        System.out.print("Adj. result = "+randomValue+".");

        return randomValue;
    }

        public int specialAttackRoll() {
//        Combine pokemon's special attack value and level with a random number to generate a returned int value
//        Will be compared against defender's special efense roll

//      random value
        Random rand = new Random();
        int randomValue = rand.nextInt(11) + 1;
        System.out.println("Randomly generated "+randomValue+".");

//      Adjust based on pokemon level
        randomValue /= (1.0 / level);
        System.out.println("Adjusted attack roll by (1 / level) ("+(1.0 / level)+"). ");
        System.out.print("Adj. value = "+randomValue+".");

//      Adjust based on pokemon attack score
        randomValue += attackSpecial;
        System.out.println("Adjusted attack roll by attack value("+attackSpecial+".");
        System.out.print("Adj. result = "+randomValue+".");

        return randomValue;
    }

        public int defenseRoll() {
//          Combine the pokemon's defense score with speed and level and add to a randomized roll

//          random value
            Random rand = new Random();
            int randomValue = rand.nextInt(11) + 1;
            System.out.println("Randomly generated "+randomValue+".");

//          Adjust based on level
            randomValue /= (1.0 / level);
            System.out.println("Adjusted defense roll by (1 / level) ("+(1.0 / level)+"). ");
            System.out.print("Adj. value = "+randomValue+".");

//          Adjust based on the average of speed and defense, then add level back in
            int avgDefense = (speed + defense) / 2;
            randomValue += (avgDefense + level);

            System.out.println("Added avg defense.  Final score: "+randomValue+".");

            return randomValue;
        }

        public int specialDefenseRoll() {
    //          Combine the pokemon's special defense score with speed and level and add to a randomized roll

    //          random value
            Random rand = new Random();
            int randomValue = rand.nextInt(11) + 1;
            System.out.println("Randomly generated "+randomValue+".");

    //          Adjust based on level
            randomValue /= (1.0 / level);
            System.out.println("Adjusted defense roll by (1 / level) ("+(1.0 / level)+"). ");
            System.out.print("Adj. value = "+randomValue+".");

    //          Adjust based on the average of speed and defense, then add level back in
            int avgDefense = (speed + defenseSpecial) / 2;
            randomValue += (avgDefense + level);

            System.out.println("Added avg defense.  Final score: "+randomValue+".");

            return randomValue;
        }


    public void randomizeSpecies() {
//        Create an array of species and use it to call setSpecies.
//        Maybe returns a String that is called in a class to generate a child extension specific to type?
    }

//    TODO: Set a method that has an array of possible species to assign randomly, and randomizes starting values.

    public static void main(String[] args) {

        // Testbed for pokemon methods
        Pokemon eevee1 = new Pokemon("Eevee", "Mr. Eve");

        eevee1.setHP(300);
        eevee1.setLevel(7);

        eevee1.attackRoll();
        System.out.println("\n\nIncreasing attack...\n");
        eevee1.setAttack(50);
        eevee1.attackRoll();
    }
}