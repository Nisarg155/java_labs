import java.util.Scanner;

public class Lab4_pg4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter deposit amount :- ");
        int amount = obj.nextInt();
        System.out.print("Enter withdraw amount :- ");
        int wamount = obj.nextInt();

        SavingsAccount a1 = new SavingsAccount();

        try{
            a1.deposite(amount);
            a1.withdraw(wamount);
        }
        catch (Custom_Exception c)
        {
            System.out.println(c.getMessage());
        }
    }
}


