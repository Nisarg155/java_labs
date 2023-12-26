public class FinallyExercise_Case_2 {
    public static void main(String[] args) {

        try{
            int ans = 25/0;
        }
        catch (NullPointerException nep) {
            System.out.println("NullPointer Exception");
        }
        finally {
            System.out.println("Finally  Case 2");
        }
    }
}
