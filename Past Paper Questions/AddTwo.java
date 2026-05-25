// CAT I 2023
import java.util.Scanner;

public class AddTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Resource inputs
        System.out.print("Enter first number:  "); 
        int a = sc.nextInt();

        System.out.print("Enter second number: "); 
        int b = sc.nextInt();

        // Output logic execution
        System.out.println("Sum = " + (a + b));
        
        sc.close(); // Closed scanner to prevent resource leaks
    }
}