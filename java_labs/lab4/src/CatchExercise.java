import java.util.Scanner;


public class CatchExercise {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the denominator :- ");
        int deno = obj.nextInt();
        System.out.print("Enter the array index :- ");
        int index = obj.nextInt();
        int[] arr  = new int[5];
        try{
            arr[index] = 30/5;

            int ans = 5/deno;
        }
        catch(ArithmeticException a)
        {
            System.out.print("Divide by 0 exception");
        }
        catch(ArrayIndexOutOfBoundsException aob)
        {
            System.out.print("Array out of bound exception ");
        }

    }
}
