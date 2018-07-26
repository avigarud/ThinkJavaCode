import java.util.Random;
import java.util.Scanner;

public class Employee
{
    public static void main(String[] args)
    {
        int birthyear=1992;
        boolean isUnionMember= true;
        String fristname="Avi";
        String Lastname="Garud";
        String middlename="Vishwanath";
        int employeeNumber ;
        Scanner scanner=new Scanner(System.in);
        printHeader();
        System.out.println("Please enter your 5 digit employee number ");
        employeeNumber=scanner.nextInt();
        printFullName(fristname,Lastname,middlename);
        printUnionStatus(isUnionMember);
        printAge(birthyear);
        printEvenOrOdd(employeeNumber);
        printGeneratedScreatPassword(employeeNumber);
    }
    public static void printHeader()
    {
        System.out.println("Welcome to the wallabutech Employee Application");
        System.out.println("===============================================");
    }
    public static void printFullName(String fristname,String Lastname,String middlename)
    {
        System.out.println(Lastname+","+fristname+"  "+middlename);
    }
    public static void printUnionStatus(boolean isUnioMember)
    {
        System.out.println("Your Union statues :"+isUnioMember);
    }
    public static void printAge(int birthyear)
    {
        int age=2018-birthyear;
        System.out.println("Your Agr is :"+age);
    }
    public static void printEvenOrOdd( int employeeNumber )
    {

        System.out.println("Employee number is even /odd(1=odd,0=even:"+employeeNumber%2);
    }
    public static void printGeneratedScreatPassword(int employeeNumber)
    {
        Random random=new Random();
        int number =random.nextInt(10)+1;

        int password=(employeeNumber+number)*5;
        System.out.println("Employee's random secreat pw is:"+password);


    }
}
