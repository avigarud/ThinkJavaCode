public class WithdrawalTwo
{
    public static void main(String[] args)
    {
        int withdrawal=137;//variable declaration

        //calculation
        int  twenty  = withdrawal/ 20;
         int remaining = withdrawal % 20;
        int   ten  = remaining/ 10;
        remaining = remaining % 10;
        int  five  = remaining/ 5;
         remaining = remaining % 5;
        int two = remaining/ 2;
        //output
        System.out.print("$20" + "( " + twenty + " )" + ", ");
        System.out.print("$10" + "( " +  ten + " )" + ", ");
        System.out.print("$5" + "( " + five + " )" + ", ");
        System.out.println("$2" + "( " + two+ " )");

    }
}


