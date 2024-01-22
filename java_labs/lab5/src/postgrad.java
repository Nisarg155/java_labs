import java.util.Scanner;
public class postgrad extends student {
    public postgrad(String studentName) {
        super(studentName);
    }

    @Override
    void generateResult() {
        for(int it : super.testScores)
        {
            if(it < 75)
            {
                super.setTestResult("Fail");
                return ;
            }
        }
        super.setTestResult("Pass");
    }
}

class Main1{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter student name :- ");
        postgrad s1 = new postgrad(obj.nextLine());
        for (int i = 0;i<4;i++)
        {
            System.out.print("Enter result of test " + (i+1) + " :- " );
            s1.setTestScores(obj.nextInt(),i);
        }
        s1.generateResult();
        System.out.println(s1);
    }
}