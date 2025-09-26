class SumDemo {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }
    public double sum(double a, double b) {
        return a + b;
    }

    public double sum(int a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        SumDemo obj = new SumDemo();

        
        System.out.println("Sum of 2 integers: " + obj.sum(10, 20));
        System.out.println("Sum of 3 integers: " + obj.sum(5, 15, 25));
        System.out.println("Sum of 2 doubles: " + obj.sum(10.5, 20.5));
        System.out.println("Sum of int and double: " + obj.sum(10, 12.75));
    }
}
