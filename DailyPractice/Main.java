import java.util.Scanner;

class Main {
	static DailyPractice[] dpApps = {new UserInput(), new SolveEquation(), new CountingChange(), new MagicEightBall(), new LunarNewYear()};
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		for (int app = 0; app < dpApps.length; app++) {
			System.out.println(app + ": " + dpApps[app].name);
		}

		int selectedApp = input.nextInt();
		dpApps[selectedApp].run();
		
		input.close();
	}
}