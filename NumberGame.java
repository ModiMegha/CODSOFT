import java.util.Scanner;
import java.util.Random;
public class NumberGame{
    
    public static void main(String[] args) {
        
Scanner sc= new Scanner(System.in);
Random random = new Random();
 int secretNumber = random.nextInt(100)+1;
 int attempts = 0;

 System.out.println("Welcome to number guessing game");
 System.out.println("I am thinking about you will guess it correct");

 while(true){
    System.out.println("Enter your guess:");
    int guess = sc.nextInt();
    attempts++;

    if(guess == secretNumber){
        System.out.println("Congrats! You guessed the number in" + attempts +"attempts");
        break;
    }
    else if(guess<secretNumber){
        System.out.println("Too low yarr..Try again..");
    }
 
 else{
    System.out.println("Too high..Pls Try again..");
}
 }
sc.close();
    }
}