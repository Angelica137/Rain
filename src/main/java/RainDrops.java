public class RainDrops {
	public String translate(int number) {
		String translation = "";

		if (number % 3 == 0)
			translation += "Pling";
		if (number % 5 == 0)
			translation += "Plang";
		if (number % 7 == 0)
			translation += "Plong";
		if (translation.isEmpty())
			return Integer.toString(number);
		return translation;
	}
}