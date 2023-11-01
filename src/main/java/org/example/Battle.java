package org.example;

// Imports

import java.util.Arrays;

public class Battle {

//    Instance variables
    private Pokemon[] participants = new Pokemon[2];

//    Constructor
    public Battle() {

    }


//    Methods...
//    - Load participants
    public void loadParticipants(Pokemon poke1, Pokemon poke2) {

//      Add the pokemon to an array
        participants[0] = poke1;
        participants[1] = poke2;

        System.out.println("Loaded battlespace with "+participants[0].getName()+" and "+participants[1].getName()+".");
    }

//    - Take turn
//    - - Will prompt for a list of actions eventually, but for now will only attack

//    - Switch Turns
//    - Attack
    public int attackTarget(Pokemon attacker, Pokemon target) {
//        Get attacker's relevant roll
        int attackValue = attacker.attackRoll();

//        Compare to defender's relevant roll
        int defenseValue = target.defenseRoll();

        if (attackValue > defenseValue) {
            return (attackValue - defenseValue);
        }
        else {
            System.out.println("\n"+target.getName()+" evaded the attack!");
            return 0;
        }
    }
//    - Check hit
//    - Do Damage (Calls the setHP method on target and the getDamage method on attacker)

    public static void main(String[] args) {

        Pokemon eevee = new Pokemon("Eevee", "eevee1");
        Pokemon pidgey = new Pokemon("Pidgey", "pidgey1");

        Battle testBattle = new Battle();

        testBattle.loadParticipants(eevee, pidgey);
        testBattle.attackTarget(eevee, pidgey);

    }
}