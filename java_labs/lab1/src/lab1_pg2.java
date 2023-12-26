import java.util.Scanner;

class _input {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i + "\n");
            }
        }
    }

}
