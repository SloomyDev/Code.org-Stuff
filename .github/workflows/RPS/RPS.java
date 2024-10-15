import java.util.Scanner;

public class RPS {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to RPS, please pick a move:");
    System.out.println("1. Rock");
    System.out.println("2. Paper");
    System.out.println("3. Scissors");
    
    int choice = input.nextInt();
    
    GameLogic logic = new GameLogic(choice);
    
    
  }
}
