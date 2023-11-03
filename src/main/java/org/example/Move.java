package org.example;

public class Move {

//    instance variables
    private String name;
    private String moveType;
    private String attackType;
    private int power;

//    Constructor
    public Move(String name, String moveType, String attackType, int power) {
        this.name = name;
        this.moveType = moveType;
        this.attackType = attackType;
        this.power = power;
    }

//    Methods
    public void describeMove() {
        System.out.println("\n"+this.name+"\nType: "+this.moveType+"\n("+this.attackType+")\nPower: "+this.power);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setMoveType(String moveType) {
        this.moveType = moveType;
    }
    public void setAttackType(String attackType) {
//    Validate
        if ( this.attackType.equals("Physical") || this.attackType.equals("Special")) {
            this.attackType = attackType;
        }
        else {
            System.out.println("\nInvalid type selection.  Moves must be Physical or Special.");
        }
    }
    public void setPower(int power) {
        this.power = power;
    }
}
