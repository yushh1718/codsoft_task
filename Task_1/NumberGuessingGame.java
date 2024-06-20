package Task_1;

import java.util.*;
public class NumberGuessingGame {
    public static void numberGuessingGame(){
        Scanner sc = new Scanner(System.in);
        // Generate number.
        int num = 1 + (int)(100*Math.random());
        int k =5; // k = trails

        System.out.println("A number is chosen between 1 and 100." +
                " Guess the number within 5 trials.");
        int guess, i;

        for (i = 0; i < k; i++) {
            System.out.print("Guess the number: ");

            //Taking input guess.
            guess = sc.nextInt();

            if(guess == num){
                System.out.println("CONGRATULATIONS!!");
                break;
            }
            else if(guess<num && i!= k-1){
                System.out.println("Number is greater than "+ guess);
            }
            else if (guess>num && i!=k-1){
                System.out.println("Number is less than "+ guess);
            }

        }
        if(i==k){
            System.out.println("You've exhausted "+k+" trails. The guess was "+ num);
            System.out.println("Better luck next time.");
        }

    }

    public static void main(String[] args) {
        numberGuessingGame();
    }
}

