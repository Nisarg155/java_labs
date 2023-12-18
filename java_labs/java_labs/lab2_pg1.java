import java.util.Scanner;

class Substr {

    public static void main (String [] args)
    {Scanner obj = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = obj.nextLine();

        int count = 0;
        int index = 0;

        while ((index = str.indexOf("hi", index)) != -1) {
            count++;
            index += 2; // Move index forward to avoid counting the same "hi" again
        }

        System.out.println("The count is: " + count);
    }
}
