public class BigMethodSignature
{
    public static void main(String[] args)
    {
        int value=20;
        printSum(value);

        System.out.println("");
    }

    public static void printSum(int value)
    {
       int sum=value+10;
        System.out.println("the result of adding the 10 number together:"+sum);

    }
}
