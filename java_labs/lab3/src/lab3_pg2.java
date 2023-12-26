import java.util.Scanner;

public class lab3_pg2 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = obj.nextInt();
        Student[] s = new Student[n];
        int index  = 0;
        double highest = 0;

        for(int i = 0;i<n;i++)
        {
            obj.nextLine();
            System.out.print("Enter name :- ");
            String name = obj.nextLine();
            System.out.print("Enter age :- ");
            int age = obj.nextInt();
            System.out.print("Enter roll :- ");
            int roll = obj.nextInt();
            double[] marks = new double[5];
            double sum = 0;
            for(int j = 0;j<5;j++)
            {
                System.out.print("Enter element marks of " + (j+1) + " Subject :- " );
                marks[j] = obj.nextDouble();
                sum += marks[j];
            }
            s[i] = new Student(name,age,roll,marks);
            if(sum > highest)
            {
                highest = sum;
                index = i;
            }
        }

        s[index].displayDetails();
        System.out.println(Student.getCount());


    }
}
