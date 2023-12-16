import java.util.Scanner;

class Substr {

    public static void main (String [] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter string : - ");
        String str =  new String(obj.nextLine());
        System.out.println("The count is :- " + (str.split("hi").length + 1) );
    }
}
