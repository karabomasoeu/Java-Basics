public class SimpleCalculator {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.println("=== Simple Calculator ===");
        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();
        
        System.out.println("Enter operator (+, -, *, /):");
        char operator = sc.next().charAt(0);
        
        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();
        
        double result = 0;
        boolean validOperation = true;
