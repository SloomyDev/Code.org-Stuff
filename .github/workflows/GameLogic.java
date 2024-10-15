public class GameLogic{

  private int playerChoice;
  private double computerChoice;
  
  public GameLogic(){
    
    this(1);
    
  }
  
  public GameLogic(int playerChoice){
    
      this.playerChoice = playerChoice;

      this.computerChoice = Math.random() * 3 + 1;

      if(playerChoice == (int) computerChoice){ //Same result = Tie
        
        System.out.println("Tie");
        
      } else if (playerChoice == 1 && (int) computerChoice == 3) { //Rock v Scissors
        
        System.out.println("Player Wins!");
        
      } else if (playerChoice == 2 && (int) computerChoice == 1) { //Paper v Rock
        
        System.out.println("Player Wins!");
        
       } else if (playerChoice == 3 && (int) computerChoice == 2) { //Scissors v Paper
        
        System.out.println("Player Wins!");

      } else if (playerChoice == 3 && (int) computerChoice == 1) { //Rock v Scissors
        
        System.out.println("CPU Wins!");
        
      } else if (playerChoice == 1 && (int) computerChoice == 2) { //Paper v Rock
        
        System.out.println("CPU Wins!");
        
       } else if (playerChoice == 2 && (int) computerChoice == 3) { //Scissors v Paper
        
        System.out.println("CPU Wins!");
        
      } else {
        
        System.out.println("ERROR");
        
      }
  }
  
}
