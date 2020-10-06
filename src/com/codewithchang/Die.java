package com.codewithchang;

import java.util.Random;

public class Die {
    private int numSides;
    private int value;
/*
Default constructor
 */
public Die() {
    this.value = 1;
}

/*
Second version of constructor
 */
public Die(int sides){
    this.numSides = sides;
    this.value = 0;
}

/*
method to roll our die
 */
public int roll() {
    Random rand = new Random();
    value = rand.nextInt(numSides) +1;

    return value;
}

public int getNumSides() {
    return numSides;
}

public void setNumSides() {
    this.numSides = numSides;
}

public int getValue() {
    return getValue();
}


    @Override
    public String toString() {
        return "com.codewithchang.Die{" +
                "numSides=" + numSides +
                ", value=" + value +
                '}';
    }
}
