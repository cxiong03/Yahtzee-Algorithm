package com.codewithchang;

import java.util.Random;

public class Die {
    private int numSides = 6;
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
//public Die(int sides) {
//    this.numSides = sides;
//    this.value = 0;
//}

/*
method to roll our die
 */
public void roll(Random rand) {
    value = rand.nextInt(numSides) +1;
}

public int getValue() {
    return value;
}

}
