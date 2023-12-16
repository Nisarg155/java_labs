import java.util.Scanner;

class plaindrom{
    public static void main (String [] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter String :- ");
        String  s =  obj.nextLine();
        StringBuilder s1 = new StringBuilder(s.toLowerCase());
        StringBuilder s2 = new StringBuilder(s.toLowerCase());
        s2.reverse();

        if((s1.toString()).equals(s2.toString())) System.out.print("plindrom");
        else System.out.print(" not palindrom");
    }
}
