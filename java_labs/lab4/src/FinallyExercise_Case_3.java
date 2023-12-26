public class FinallyExercise_Case_3 {
    public static void main(String[] args) {
        try{
            int ans = 25/0;

        }
        catch (ArithmeticException ae)
        {
            System.out.println("Arithmetic Exception");
        }
        finally {
            System.out.println("Finally Case 3");
        }
    }
}
