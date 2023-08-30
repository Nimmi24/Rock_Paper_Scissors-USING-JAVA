import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Getting user input
        Scanner sc = new Scanner(System.in);
        int wins=0;
        int losses=0;

        while (true) {
            System.out.println("Enter your move: 1) rock 2) paper 3) scissors. \n if you want to exit the game then enter quit");
            String myMove = sc.nextLine();


            // Check if the user entered quit

            if(myMove.equalsIgnoreCase("quit")){
                break;
            }

            //Verify if the user has entered correct input or not

            if(!myMove.equalsIgnoreCase("rock") && !myMove.equalsIgnoreCase("paper") &&
                    !myMove.equalsIgnoreCase("scissors")){
                System.out.println("Please Enter a valid input");
            }

            else{
                // Randomly generate computer's move
                String opponent_move;
                int rand =(int) (Math.random() * 3);
                if(rand == 0){
                    opponent_move = "rock";
                }
                else if(rand == 1){
                    opponent_move = "paper";
                }
                else{
                    opponent_move = "scissors";
                }
                System.out.println("Opponent move " + opponent_move);

                System.out.println("Opponent's move = " + opponent_move);

                if (myMove.equalsIgnoreCase(opponent_move)){
                    System.out.println("The game is Tie");
                }

                else if (myMove.equalsIgnoreCase("rock") && opponent_move.equalsIgnoreCase
                        ("scissors") || myMove.equalsIgnoreCase("paper") && opponent_move.equalsIgnoreCase(
                        "rock") || myMove.equalsIgnoreCase("scissors") && opponent_move.equalsIgnoreCase(
                        "paper")
                ) {
                    System.out.println("Your have won!");
                    wins++;

                }
                else{
                    System.out.println("You Lost!");
                    losses++;
                }
            }


        }
        if(wins > losses){
            System.out.println("congratulations! You have won the game");
        }
        else if(wins< losses){
            System.out.println("Sorry you have lost the game");
        }
        System.out.println("Total wins = " + wins);
        System.out.println("Total losses = " + losses);
        System.out.println("Thanks for playing!");

    }
}