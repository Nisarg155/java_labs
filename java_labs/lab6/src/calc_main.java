public class calc_main {
    public static void main(String[] args) {
        Calculator<Integer> calc = new Calculator<>();
        System.out.println("Addition :-  " + calc.add(1, 2));
        System.out.println("Substraction :- " + calc.subtract(1, 2));
        System.out.println("Multiplication :- " + calc.multiply(1, 2));
        System.out.println("Division :- " + calc.divide(1, 2));
    }
}
