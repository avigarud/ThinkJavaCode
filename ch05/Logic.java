public class Logic
{
    public static void main(String[] args)
    {
        boolean yes=true;
        boolean no=false;
        System.out.println("Both Yes Yes True:"+(yes && yes));
        System.out.println("Both Yes Yes True:"+(yes && no));
        System.out.println("Either YEs Yes True:"+(yes||yes));
        System.out.println("Either YEs no True:"+(yes||no));
        System.out.println("Either no no True:"+(no||no));
        System.out.println("Original Yes value:"+yes);
        System.out.println("Original Yes value:"+ !yes);
    }
}
