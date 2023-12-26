public class FinallyExercise_Case_1 {
    public static void main(String[] args) {
        try{
            int ans = 25/5;
        }
        catch(NullPointerException npe){
            System.out.println("Nullpointer Exception");

        }
        finally {
            System.out.println("Finally Case 1");
        }
    }

}
