import java.util.Scanner;
public class Main {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no.:");
        int a = sc.nextInt();
        Scanner scl = new Scanner(System.in);
        System.out.print("Enter second no.:");
        int b = scl.nextInt();
        System.out.println("diffrence "+(a-b));
        System.out.println("addition "+(a+b));
        System.out.println("product "+(a*b));
        System.out.println("division "+(a/b));
    }
}
