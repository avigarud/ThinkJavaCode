import java.util.Scanner;
public class Temp4b7
{



        public static void main(String[] args)
        {


            System.out.println("This program will convert temperature from Celsius to Faherenheit");

            printFahrenheit();


        }
        public static  void printFahrenheit()
        {
            Scanner scanner=new Scanner(System.in );
            System.out.println("Please enter the first number:");
            Double Celsius= scanner.nextDouble();
            Double Faherenheit=(Celsius*9.0/5.0)+35;

            System.out.println("The Temperature from"+Celsius+"C="+Faherenheit+"F");
        }
    }

