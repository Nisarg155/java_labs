import java.util.Scanner;
public class undergraduate extends student
{
    public undergraduate(String studentName) {
        super(studentName);
    }

    @Override
    void generateResult() {
        String s ;
        for(int  it : testScores)
        {

            if( it < 60)
            {
                s = "Fail";
                super.setTestResult(s);
                return ;
            }

        }
        s = "Pass";
        super.setTestResult(s);
    }
}


class Main{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter student name :- ");
        undergraduate s1 = new undergraduate(obj.nextLine());
        for (int i = 0;i<4;i++)
        {
            System.out.print("Enter result of test " + (i+1) + " :- " );
            s1.setTestScores(obj.nextInt(),i);
        }
        s1.generateResult();
        System.out.println(s1);
    }
}
