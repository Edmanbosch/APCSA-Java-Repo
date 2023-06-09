import java.util.Scanner;

class LunarNewYear extends DailyPractice {
	LunarNewYear() {
		name = "Lunar New Year";
	}

	class ZodiacAnimal {
		public String name;
		public String description;

		ZodiacAnimal(String name, String description) {
			this.name = name;
			this.description = description;
		}
	}

	public void run() {
		ZodiacAnimal[] zodiacAnimals = { 
			new ZodiacAnimal("Rat", "Rat stuff"),
			new ZodiacAnimal("Ox", "Rat stuff"),
			new ZodiacAnimal("Tiger", "Rat stuff"),
			new ZodiacAnimal("Rabbit", "Rat stuff"),
			new ZodiacAnimal("Dragon", "Rat stuff"),
			new ZodiacAnimal("Snake", "Rat stuff"),
			new ZodiacAnimal("Horse", "Rat stuff"),
			new ZodiacAnimal("Sheep", "Rat stuff"),
			new ZodiacAnimal("Monkey", "Rat stuff"),
			new ZodiacAnimal("Rooster", "Rat stuff"),
			new ZodiacAnimal("Dog", "Rat stuff"),
			new ZodiacAnimal("Pig", "Rat stuff"),
		};
			
		Scanner input = new Scanner(System.in);

		int birthYear = input.nextInt();
		int zodiacIndex = (birthYear - 4) % 12;

		ZodiacAnimal userZodiac = zodiacAnimals[zodiacIndex];
		System.out.format("You are a %s. %s", userZodiac.name, userZodiac.description);
	}
}