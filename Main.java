import java.util.Scanner;
import java.util.Random;

/**
 * The number guessing game
 * @author celer7841
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create Scanner for user input
    Scanner input = new Scanner(System.in);

    // create the Random generator
    Random rand = new Random();

    // create a integer between 1 and 100
    int randInt = rand.nextInt(100) + 1;

    // declare the variable for the user guess
    int guess;

   do{
     // prompt the user for their guess
    System.out.println("Please guess your number from 1 to 100");
    // get the guess
    guess = input.nextInt();

    // is the guess too big or too small
    if(guess > randInt){
      System.out.println("Too big!");
    } else if(guess < randInt){
      System.out.println("Too small!");
    }

    }while(guess != randInt);
    // loop has ended means you have the right number!
    System.out.println("Correct!");


   }
}