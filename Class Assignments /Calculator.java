// Calculator.java - The class definition
public class Calculator {
    // Attributes
    private int number1;
    private int number2;

    // Constructor
    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // Methods
    public int add() {
        return number1 + number2;
    }

    public int subtract() {
        return number1 - number2;
    }

    public double divide() {
        if (number2 == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return (double) number1 / number2;
    }

    public int multiply() {
        return number1 * number2;
    }

    public int modulus() {
        if (number2 == 0) {
            System.out.println("Error: Modulus by zero!");
            return 0;
        }
        return number1 % number2;
    }

    // Display results
    public void displayResults() {
        System.out.println("=================================");
        System.out.println("number1 = " + number1 + ", number2 = " + number2);
        System.out.println("Add:      " + number1 + " + " + number2 + " = " + add());
        System.out.println("Subtract: " + number1 + " - " + number2 + " = " + subtract());
        System.out.println("Divide:   " + number1 + " / " + number2 + " = " + divide());
        System.out.println("Multiply: " + number1 + " * " + number2 + " = " + multiply());
        System.out.println("Modulus:  " + number1 + " % " + number2 + " = " + modulus());
    }
}

class CalculatorDriver {
    public static void main(String[] args) {

        // Array of 5 Calculator objects
        Calculator[] calculators = new Calculator[5];

        // Initialize 5 objects with different values
        calculators[0] = new Calculator(10, 3);
        calculators[1] = new Calculator(20, 4);
        calculators[2] = new Calculator(15, 5);
        calculators[3] = new Calculator(100, 7);
        calculators[4] = new Calculator(50, 0);  // Tests divide/modulus by zero

        // Test all methods on each object
        for (int i = 0; i < calculators.length; i++) {
            System.out.println("Calculator Object #" + (i + 1));
            calculators[i].displayResults();
            System.out.println();
        }
    }
}
