public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.mult(3, 4));
        System.out.println(calc.pow(5, 6));
    }
}