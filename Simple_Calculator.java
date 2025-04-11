
    import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input from user
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        
        // Ask for operation
        System.out.println("Choose operation (+, -, *, /): ");
        char operation = sc.next().charAt(0);
        
        // Perform calculation
        double result;
        if (operation == '+') {
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        } else if (operation == '-') {
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        } else if (operation == '*') {
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        } else if (operation == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("Error: Cannot divide by zero!");
            }
        } else {
            System.out.println("Invalid operation!");
        }
        
        sc.close();
    }
}
    
