import java.util.Scanner;
import java.util.Random;
import java.util.Random.*;
public class game {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("----:game with computer:----");
        System.out.println();
        
        int x;
        do{
        System.out.println("1 -> Play Rock Paper Scissor");
        System.out.println("2 -> Play Number Guessing Game");
        System.out.println("0 -> Exit");
        System.out.println("--*--*--*--");
        System.out.print("-->"); 
        x=sc.nextInt();
        System.out.println();
       
        switch(x){
            case 1:
               playRockPaperscissor(sc);
               break;
            case 2:
                playNumberGuessingGame(sc);
                break;
            case 0:
               System.out.println("Exiting the program.Thanks for Playing");
               break;
            default:
            System.out.println("Invalid option,Please select 1,2 or 0");
            break;
        }
        System.out.println();
    }while(x!=0);
    sc.close();
}
public static void playRockPaperscissor(Scanner sc) {
        
        Random random= new Random();
        String[]menu={"Rock","Paper","Scissor"};
        sc.nextLine();
        while(true){
        System.out.println("Enter your choice(Rock,Paper,Scissor) or type 'exit' to quit :");
        String userneed=sc.nextLine();
        
        if(userneed.equalsIgnoreCase("exit")){
            System.out.println("Exiting Rock Paper Scissor game.");
            break;
        }
        String computerChoice=menu[random.nextInt(3)];
        System.out.println("User choise is :"+" " +userneed );
        System.out.println("Computer Choice is :"+" " +computerChoice);
        if(userneed.equals(computerChoice))
        {
            System.out.println("Match got tie !");
            
        }
        else if(userneed.equals("Rock")&& computerChoice.equals("Scissor")||
                userneed.equals("Scissor")&& computerChoice.equals("Paper")||
                userneed.equals("Paper")&& computerChoice.equals("Rock") )
                {
                    System.out.println("you won !");
                    
                }
        else{
                System.out.println("computer won !");
              
            }
            System.out.println();
    }
}
public static void  playNumberGuessingGame(Scanner sc) {
    Random random=new Random();
    int guess=0;
    while(true){
    System.out.print("Enter your number (between 0 and 10) or type '-1' to quit :");
    int userNumber=sc.nextInt();
    if(userNumber ==-1){
        System.out.println("Exiting Number Guessing game.");
        break;
    }
    System.out.println("Result ->");
    int computerNumber=random.nextInt(10);
    System.out.println("user number is :"+" "+userNumber);
    System.out.println("Computer number is :"+" "+computerNumber);

    if(computerNumber<userNumber){
        guess++;
    System.out.println("your number is greater than the computer's number.");
        System.out.println();
    }
    else if(computerNumber > userNumber){
        guess++;
        System.out.println("your number is lesser than the computer's number. ");
        System.out.println();
    }
    else{
        guess++;
        System.out.println("Correct! You guessed the number in"+" "+guess+" "+"attempts.");
        guess=0;
        
      }
   
  System.out.println();
    
    }     
    }
}



