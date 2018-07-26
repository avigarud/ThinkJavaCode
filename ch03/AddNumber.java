import java.util.Scanner;

public class AddNumber
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in );

        System.out.println("I will add two number for you .Please enter the first number:");
        Double FristNumber= scanner.nextDouble();

        System.out.println("Please enter the Second number:");
        Double SecondNumber= scanner.nextDouble();

        double result=FristNumber+SecondNumber;

        System.out.println("the total of "  +FristNumber+"and "+ SecondNumber +"is "+result );


    }
}
