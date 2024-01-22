import java.util.Arrays;

public abstract class student {
    String studentName ;
    int [] testScores = new int[4];
    String testResult ;

    student(String studentName)
    {
        this.studentName = studentName;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    abstract void generateResult();

    public void setTestScores(int testScore, int testnumber) {
        this.testScores[testnumber] = testScore;
    }

    public int[] getTestScores() {
        return testScores;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return
                "studentName=" + studentName + '\n' +
                "testResult=" + testResult
                ;
    }
}


