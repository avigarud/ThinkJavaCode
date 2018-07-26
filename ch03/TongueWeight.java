import java.util.Scanner;

public class TongueWeight
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter trailer Weight ");
        double triweight=scanner.nextDouble();

        System.out.println("Please enter cargo Weight ");
        double cargoweight=scanner.nextDouble();

         double totalweight=triweight+cargoweight;

        double min=0.09*totalweight;
        double max=0.15*totalweight;

        System.out.println("the minimum weight "+min+"and maximum "+max+" toungue weight allowed ");





    }
}
