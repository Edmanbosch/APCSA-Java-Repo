import java.util.Scanner;

class SolveEquation extends DailyPractice {
	SolveEquation() {
		name = "Trapezoid Calculator";
	}

	public void run() {
		Scanner input = new Scanner(System.in);

		System.out.println("What is the first base of the trapezoid?");
		double b1 = input.nextDouble();

		System.out.println("What is the second base of the trapezoid?");
		double b2 = input.nextDouble();
		
		System.out.println("What is the height of the trapezoid?");
		double height = input.nextDouble();

		double area = (b1 + b2) / 2 * height;

		System.out.println("The area of the trapezoid is " + area + ".");
	}
}