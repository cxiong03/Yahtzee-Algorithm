package com.codewithchang;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        YahtzeeConsole.welcome();
        Hand myHand = new Hand();
        myHand.roll(rand);
        YahtzeeConsole.handRolled(myHand.getDice());
        myHand.roll(rand, YahtzeeConsole.chooseDice());
        YahtzeeConsole.handRolled(myHand.getDice());
        myHand.roll(rand, YahtzeeConsole.chooseDice());
    }
}
