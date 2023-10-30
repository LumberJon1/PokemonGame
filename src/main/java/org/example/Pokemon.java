package org.example;

// Resolve any imports that I might need from utils etc.

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

//    Methods
    public int setHP(int newValue) {
        hp = newValue;
        System.out.println("Set HP to "+newValue+".");
        return newValue;
    }

//    TODO: Set a method that has an array of possible species to assign randomly, and randomizes starting values.

    public static void main(String[] args) {

        // Testbed for pokemon methods
        Pokemon eevee1 = new Pokemon("Eevee", "Mr. Eve");

        eevee1.setHP(300);
        eevee1.setHP(1);

    }
}