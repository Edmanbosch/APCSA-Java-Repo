import java.util.Scanner;

public class InputHelper {

  static Scanner scan = new Scanner(System.in);

  public static char getChar(String message) {
    System.out.println(message);
    String answer = scan.nextLine().toUpperCase();
    return answer.charAt(0);
  }

}