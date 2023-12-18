import java.util.*;

class abbreviation{
    public static void  main(String [] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter string :- ");
        String S = obj.nextLine();

        int count = 1;
        String []Fullname = S.split(" ");
        StringBuffer n = new StringBuffer();
        for(String s : Fullname)
        {
            if(count%3 == 0)
            {
                n.append(s);
            }
            else{
                n.append(String.valueOf(s.charAt(0)) + ".");
            }
            count++;
        }

        System.out.println("New string is :- " + n );
    }
}
