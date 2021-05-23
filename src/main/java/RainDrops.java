public class RainDrops {
	public String translate(int number) {
		if (number % 3 == 0) {
			return "Pling";
		} else {
			return Integer.toString(number);
		}
	}
}