import java.util.Scanner;

public class calculator {
    public static void main(String args[])
    {
        Scanner number = new Scanner(System.in);
        double no1,no2,ans;

        System.out.println("Enter number 1 :- ");
        no1 = number.nextDouble();

        System.out.println("Enter number 2 :- ");
        no2 =number.nextDouble();

        ans = no1 + no2 ;

        System.out.println("Answer is  "  + ans);


    }
}
