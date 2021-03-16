import java.util.Random;

public class Dice {
	int value = 0;
	Random r = new Random();

	public Dice(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int throwDice() {
		value = r.nextInt(6) + 1;
		return value;
	}

}
