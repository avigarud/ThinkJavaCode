public class withdrawalfees
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

        double totalfees =1+((twenty*0.10)+ (ten*0.10)+(five*0.10)+(two*0.10));
        //output
        System.out.print("$20" + "( " + twenty + " )" + ", ");
        System.out.print("$10" + "( " +  ten + " )" + ", ");
        System.out.print("$5" + "( " + five + " )" + ", ");
        System.out.println("$2" + "( " + two+ " )");
        System.out.println("Total convenienve Fees:"  +totalfees);


    }
}
