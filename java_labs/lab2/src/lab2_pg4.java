import java.util.*;

class removespaces{

    static String remove_space(String s)
    {
        String []sarr = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for( String str  : sarr )
        {
            sb.append(str);
        }

        return sb.toString();

    }
    public static void main (String[] s)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter string :- ");
        String str = obj.nextLine();

        System.out.print("New String is :-  " + remove_space(str));

    }
}
