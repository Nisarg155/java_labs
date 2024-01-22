import java.util.Scanner;

public class CompareLine {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Line l1 = new Line(5,4,3,1);
        Line l2 = new Line(8,2,0,1);

        System.out.println(l1.isEqual(l2));
        System.out.println(l1.isLess(l2));
        System.out.println(l1.isGreater(l2));
    }
}
