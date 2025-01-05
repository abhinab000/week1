package week4;

public class Calculate {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public double div(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Calculate calc = new Calculate();

        int a = 10, b = 5;

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.sub(a, b));
        System.out.println("Multiplication: " + calc.mul(a, b));
        System.out.println("Division: " + calc.div(a, b));

        // Demonstrate division by zero
        System.out.println("Division by zero test: " + calc.div(a, 0));
    }
}
