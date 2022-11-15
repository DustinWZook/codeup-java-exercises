import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        highLowGame();
    }

    public static int count;

    public static String userContinue;

    public static void highLowGame() {
        Scanner sc = new Scanner(System.in);
        do {

            int randomNumber = (int) (Math.random() * 100) + 1;
            int userGuess;
            count=0;
            do {
                count++;
                if (count ==10){
                    System.out.println("last guess!");
                }
                System.out.println("Guess the random number between 1 and 100!");
                userGuess = sc.nextInt();
                sc.nextLine();
                if (randomNumber > userGuess) {
                    System.out.println("HIGHER");
                } else if (randomNumber < userGuess) {
                    System.out.println("LOWER");
                }
                System.out.println("number of guesses: " + count);
            } while (userGuess != randomNumber && count != 10);
            count++;
            if (userGuess == randomNumber){
                System.out.println("GOOD GUESS!");
            } else if (count == 11) {
                System.out.println("Try again");
            }
            System.out.println("would you like to play again? y/n");
            userContinue = sc.nextLine();
            userContinue = userContinue.toLowerCase();
        } while (userContinue.equals("y"));
    }

}
