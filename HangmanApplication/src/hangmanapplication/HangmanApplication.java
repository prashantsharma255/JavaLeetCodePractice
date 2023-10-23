
package hangmanapplication;

import java.io.IOException;
import java.util.Scanner;


public class HangmanApplication {
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //How do we play
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Hangman! I will pick a word "
        + "and You will guess it, character by character.\nIf You guess wrong 6 times,"+
                " then I win. \nIf you can guess it before then, You win.");
        System.out.println();
        System.out.println("I have picked my word. \nBelow is a picture, and below"+
                " that, is your current guess, which starts off as nothing. "+
                "\nEverytime you guess incorrectly, I add a body part to the picture. "+
                "\nWhen there is a full person, you lose.");
        
        //Allows for multiple games
        boolean doYouWantToPlay = true;
        while(doYouWantToPlay){
            //Setting up the game
            System.out.println();
            System.out.println("Alright! Let's Play!");
            Hangman game = new Hangman();
            
            do{
                //Draw the things
                System.out.println();
                System.out.println(game.drawPicture());
                System.out.println();
                System.out.println(game.getFormalCurrentGuess());
                System.out.println(game.mysteryWord);
                
                //Get the guess
                System.out.println("Enter a character that you think is in the word");
                char guess = (sc.next().toLowerCase()).charAt(0);
                System.out.println();
                //Check if the character is guessed already
                while (game.isGuessedAlready(guess)){
                    System.out.println("Try Again! You've already guessed that character.");
                    guess = (sc.next().toLowerCase()).charAt(0);
                }
                
                if(game.playGuess(guess)){
                    System.out.println("Great Guess! That Char was present in the word");
                }
                else{
                    System.out.println("Unfortunately, that char is not in the word");
                }
            }
            while(!game.gameOver());//Keep Playing until it is over
            //Play again or no
            System.out.println();
            System.out.println("Do you want to play another game? Enter Y if you do");
            Character response = (sc.next().toUpperCase()).charAt(0);
            doYouWantToPlay = (response == 'Y');
        }
    }
    
}
