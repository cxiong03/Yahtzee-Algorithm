package com.codewithchang;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hand {
    private List<Die> dice;

    public Hand() {
        dice = new ArrayList<Die>();
        for (int count = 0; count < 5; count++) {
            dice.add(new Die());
        }
    }

    public void roll(Random rand) {
        for (Die die : dice) {
            die.roll(rand);
        }
    }

    public void roll(Random rand, int dieChoice) {
        dice.get(dieChoice).roll(rand);
    }

    public void roll(Random rand, List<Integer> dieChoices) {
        for (int choice : dieChoices) {
            roll(rand, choice);
        }
    }

    public List<Die> getDice() {
        return dice;
    }
}
