package jeudeloie;

import java.util.Random;

public class Dice {
	public static int throwDice() {
		return new Random().nextInt(10) + 2;
		
	}

}
