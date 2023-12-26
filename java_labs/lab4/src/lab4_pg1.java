import java.util.Scanner;

public class lab4_pg1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the denominator :- ");
        int denominator = sc.nextInt();
        System.out.print("Enter the numerator :- ");
        int numerator = sc.nextInt();
        try{
            int ans = numerator/denominator;
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by 0 error");
        }
    }
}
