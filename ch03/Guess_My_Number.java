import java.util.Scanner;
import java.util.Random;

public class Guess_My_Number
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        //pick a random number

        Random random=new Random();
        int number =random.nextInt(100)+1;
        System.out.println("");
        System.out.println("I'm thinking of a number between 1 to 100 \n (including both). Can you guess what it is?");
        System.out.print("Type your Number:");
        int guess=scanner.nextInt();
        System.out.println("your guess is :"+guess);
        System.out.println("The number I was thinking of is :"+number);
        System.out.println("You were of by"+(number-guess));

    }
}
