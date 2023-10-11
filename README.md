import java.util.Random;

public class DiceRoller {

	public static void main(String[] args) {
		Random dice = new Random();
		
		int x = dice.nextInt(20);

		System.out.println("rolling the dice : " + x);

	}

}
