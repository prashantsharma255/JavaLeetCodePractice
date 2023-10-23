package tictactoeapplication;

import java.util.Scanner;

public class TicTacToeApplication {

    public static void main(String[] args) {
        // TODO code application logic here
        //Getting Input
        Scanner sc = new Scanner(System.in);

        //Allows for continous Game
        boolean doYouWantToPlay = true;

        while (doYouWantToPlay) {
            //Setting up out Tokens and AI
            System.out.println("Welcome to TicTacToe." + "Are you ready? \n");
            System.out.println("But first, Pick what Char you'll be and which one, I'll be. ");
            System.out.println();
            System.out.println("Enter a Single Character that'll represent you on the board");
            char playerToken = sc.next().charAt(0);
            System.out.println("Enter a Single Character that'll represent your opponent on the board");
            char opponentToken = sc.next().charAt(0);
            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI();

            //Setting up the Game
            System.out.println();
            System.out.println("Now we start the game. To play, enter a "
                    + "number where your token will be placed. \n");
            TicTacToe.printIndexBoard();
            System.out.println();

            //Lets PLay
            while (game.gameOver().equals("notOver")) {
                if (game.currentMarker == game.currentMarker) {
                    //User Turn
                    System.out.println("It's your turn! Enter a spot for your token");
                    int spot = sc.nextInt();
                    while (!game.playTurn(spot)) {
                        System.out.println("Try Again. " + spot
                                + "is invalid. This spot is already taken or out of range");
                        spot = sc.nextInt();
                    }
                    System.out.println("You Picked " + spot + " !");
                } else {
                    //AI marker
                    System.out.println("It's my turn!");
                    //Pick Spot
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("I picked " + aiSpot + " !");
                }
                System.out.println();
                game.printBoard();
            }
            System.out.println(game.gameOver());
            System.out.println();
            //Set up a new game..or not depending on user
            System.out.println("Do you want to play again? Enter Y if you do, "
                    + "anything else if you dont.");
            char response = sc.next().charAt(0);
            char convertedResponse = Character.toUpperCase(response);
            doYouWantToPlay = (convertedResponse == 'Y');
            System.out.println();
            System.out.println();
        }
    }

}
