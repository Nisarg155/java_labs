import java.util.Arrays;

class Student extends Person{
    private int rollno ;
    private double[] marks ;
    public static int count ;
    static {
        count = 0;
    }
    public Student() {
        super();
        count++;
    }
    public Student(int rollno, double[] marks) {
        super();
        this.rollno = rollno;
        this.marks = marks;
        count++;
    }
    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", marks=" + Arrays.toString(marks) + "]";
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public double[] getMarks() {
        return marks;
    }
    public void setMarks(double[] marks) {
        this.marks = marks;
    }
    public Student(String name, int age, int rollno, double[] marks) {
        super(name, age);
        this.rollno = rollno;
        this.marks = marks;
        count++;
    }

    void displayDetails()
    {
        System.out.println("RollNo = " + this.rollno + "\nName = "+ super.getName() + "\nAge = " + super.getAge() + "\nMarks = " + Arrays.toString(this.marks));

    }
    static int  getCount()
    {
        return count;

    }
}

