public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return (a * b) + 1;
    }

    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
    }
}
