public class MathUtil
{
    public static void main(String[] args)
    {
       int one=-1000;
       int two=400000;
       printDiffernace(one,two);
       printAbsValue(one);
        System.out.println();
    }

    public  static void printDiffernace(int one,int two)
    {
        int diff=one-two;
        System.out.println("the differnce between two value is"+diff);
    }

    public  static void printAbsValue(int one)
    {
       int abs=Math.abs(one);
        System.out.println("Value is :"+one+"and abs value is :"+abs);

    }
}
