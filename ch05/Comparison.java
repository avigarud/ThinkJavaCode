public class Comparison
{
    public static void main(String[] args)
    {
        String txt="Fantastic";
        String lang="java";
        boolean state=(txt==lang);
        System.out.println("String equality Test:"+state);
        state=(txt!=lang);//assign result
        System.out.println("String inequality Test:"+state);
        int dozen=12;
        int score =20;
        state=(dozen>score);
        System.out.println("Great thanTest:"+state);
        state=(dozen<score);  //Assign result
        System.out.println("Less than Test:"+state);

    }
}
