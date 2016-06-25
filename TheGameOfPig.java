import java.util.*;

public class TheGameOfPig {

public static void main(String[] args) {
   int playerCount = 1;
      Scanner scan = new Scanner(System.in);
   System.out.println("Welcome to The Game of Pig.");
   System.out.println("What is the winning total?");
   int win = scan.nextInt();
   System.out.println("Press r to roll, type any other letter to hold.\nIf you roll a 1 you get no points for the turn.\nTry to gather the most points first.");
   System.out.println("Player 1 score: 0");
   System.out.println("Player 2 score: 0");
   System.out.println("It is player " + playerCount + "'s turn."); 
   

   int roll = 0;
   int turnTotal = 0;
   int p1Total = 0;
   int p2Total = 0;
   
   String rollOrNah = null;
   
   while (p1Total < win && p2Total < win) {
   
   rollOrNah = scan.next();

   
   if (rollOrNah.equalsIgnoreCase("r")) {
   
      
   roll = (int)(Math.random()*6)+1;
   System.out.println("Roll: " + roll);
      if (roll == 1) {
      turnTotal = 0;
      System.out.println("Turn total: " + turnTotal);
         if (playerCount == 1) {
         playerCount = 2;
         System.out.println("Player 1's current total is " + p1Total);
        
         } else {
         playerCount = 1;
           System.out.println("Player 2's current total is " + p2Total);
        
         }
         
         if (p1Total > win || p2Total > win){
         }else{
         System.out.println("It is player " + playerCount + "'s turn.");
         }
     
      }else {
   turnTotal += roll;
   }
   
   } else {
   
      if (playerCount == 1)
      p1Total += turnTotal;
      else
      p2Total += turnTotal;
      
      turnTotal = 0;
   
      if (playerCount == 1) {
      playerCount = 2;
       System.out.println("Player 1's current total is " + p1Total);
    
      } else {
      playerCount = 1;
        System.out.println("Player 2's current total is " + p2Total);
     
      }
     // System.out.println("It is player " + playerCount + "'s turn.");
      if (p1Total > win || p2Total > win){
         }else{
         System.out.println("It is player " + playerCount + "'s turn.");
         }
     
   
   
   }

}

if (p1Total >= win) {
System.out.println("Congratulations Player 1! You win!");
}else {
System.out.println("Congratulations Player 2! You win!");
}
}
}



