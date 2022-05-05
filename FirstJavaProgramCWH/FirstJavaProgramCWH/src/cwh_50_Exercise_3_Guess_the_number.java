import java.util.Scanner;
import java.util.Random;

public class cwh_50_Exercise_3_Guess_the_number {
    public static void main(String[] args) {
        Random r = new Random();
        int Computer_No = r.nextInt(100);
        System.out.println(Computer_No);

        int UserInput;
        System.out.println("enter the no. between 1 to 100");
        Scanner sc = new Scanner(System.in);
        UserInput = sc.nextInt(100);
        int NoOfGuess = 0;
        if (UserInput == Computer_No) {
            System.out.printf("you guessed it right in %d guess", NoOfGuess);
        }

            while (UserInput != Computer_No) {
                if (Computer_No < UserInput) {
                    System.out.println("Please enter lower number");
                } else {
                    System.out.println("Please enter higher number");
                }
                NoOfGuess++;
            }
        }
}
