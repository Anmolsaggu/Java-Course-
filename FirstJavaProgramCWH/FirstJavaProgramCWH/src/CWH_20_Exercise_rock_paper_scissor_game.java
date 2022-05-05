import java.util.Scanner;
import java.util.Random;
public class CWH_20_Exercise_rock_paper_scissor_game {
    final static int rock = 1,paper = 2,scissor = 3;
    public static void main(String[] args) {

        Random r = new Random();
        int low = 1;
        int high = 4;
        int a = r.nextInt(high-low) + low;
//        System.out.println(a);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for rock, 2 for paper, 3 for scissor");
        int number = sc.nextInt();

        if (a == number) {
            System.out.println("both given same output! Tie");
        }
        else {
            switch (number) {
                case rock:
                    if (a == scissor) {
                        System.out.println("you win");
                    } else {
                        System.out.println("computer win");
                    }
                    break;
                case paper:
                    if (a == rock) {
                        System.out.println("you win");
                    } else {
                        System.out.println("computer win");
                    }
                    break;
                case scissor:
                    if (a == paper) {
                        System.out.println("you win");
                    } else {
                        System.out.println("computer win");
                    }
                    break;
            }
        }
    }
}
