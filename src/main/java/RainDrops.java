public class RainDrops {
	public String translate(int number) {
		if (number % 3 == 0 && number % 5 == 0) {
			return "PlingPlang";
		} else if (number % 3 == 0) {
			return "Pling";
		} else if (number % 5 == 0) {
			return "Plang";
		} else {
			return Integer.toString(number);
		}
	}
}