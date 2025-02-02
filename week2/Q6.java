package week2;
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }
}
public class Q6 {
	public static void main(String[] args) {
       
        Calculator calculator = new Calculator();

        int result1 = calculator.add(5, 8);
        System.out.println("The sum of two integers (5 and 8): " + result1);

        int result2 = calculator.add(10, 15, 20);
        System.out.println("The sum of three integers (10, 15, and 20): " + result2);

        double result3 = calculator.add(3.5, 2.7);
        System.out.println("The sum of two doubles (3.5 and 2.7): " + result3);

        double result4 = calculator.add(1.1, 2.2, 3.3);
        System.out.println("The sum of three doubles (1.1, 2.2, and 3.3): " + result4);
    }

}