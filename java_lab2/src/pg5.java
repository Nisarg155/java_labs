
import java.util.*;

class Student{
    int roll;
    String name;
    float Average;
    int[] marks;

    Student(String name , int roll , int[] marks)
    {
        this.name = name;
        this.roll = roll;
        this.marks = marks;

        average_marks(marks);
    }

    void average_marks(int[] marks)
    {
        int n = marks.length;
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }
        this.Average = sum*1.0f/n;
    }
}

class Main
{
    public  static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number :- ");
        int n = obj.nextInt();
        Student[] stud = new Student[n];
        int highest = 0;
        int index = 0;
        for (int i = 0;i<n;i++)
        {
            obj.nextLine();
            System.out.println("Enter student name :- ");
            String name = obj.nextLine();
            System.out.println("Enter id :- ");
            int roll = obj.nextInt();
            int[] marks = new int[5];

            for (int j = 0;j<n;j++)
            {
                System.out.println("Enter marks of sub " + j +  " :- ");
                marks[i] = obj.nextInt();
            }

            stud[i] = new Student(name,roll,marks);
            if(stud[i].Average > highest )
            {
                index = i;
            }
        }

        System.out.println(stud[index]);

    }

}