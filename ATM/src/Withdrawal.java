public class Withdrawal
{
    public static void main(String[] args)
    {
        int withdrawal=137;//variable declaration

        //calculation
        int  five = withdrawal/ 5;
        int remaining = withdrawal % 5;
        int one = remaining/ 1;
        //output
        System.out.print("$5" + "( " + five + " )" + ", ");
        System.out.println("$1" + "( " + one+ " )");

    }
}
