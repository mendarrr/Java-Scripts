// CAT I Feb 2024 - Loan Class Implementation
import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    // Default constructor (chains to the parameterized constructor)
    public Loan() {
        this(2.5, 1, 1000);
    }

    // Parameterized constructor
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears      = numberOfYears;
        this.loanAmount         = loanAmount;
        this.loanDate           = new Date();
    }

    // --- Getters ---
    
    public double getAnnualInterestRate() { 
        return annualInterestRate; 
    }
    
    public int getNumberOfYears() { 
        return numberOfYears; 
    }
    
    public double getLoanAmount() { 
        return loanAmount; 
    }
    
    public Date getLoanDate() { 
        return loanDate; 
    }

    // --- Setters ---
    
    public void setAnnualInterestRate(double r) { 
        annualInterestRate = r; 
    }
    
    public void setNumberOfYears(int y) { 
        numberOfYears = y; 
    }
    
    public void setLoanAmount(double a) { 
        loanAmount = a; 
    }

    // --- Financial Calculations ---

    /**
     * Calculates the monthly loan payment using the standard amortization formula.
     */
    public double monthlyPayment() {
        double monthlyRate = annualInterestRate / 1200; // Conversion to fractional monthly rate
        int months         = numberOfYears * 12;
        
        return loanAmount * monthlyRate / (1 - Math.pow(1 + monthlyRate, -months));
    }

    /**
     * Calculates the total payment over the full life span of the loan.
     */
    public double totalPayment() {
        return monthlyPayment() * numberOfYears * 12;
    }

    // --- Test Program ---
    
    public static void main(String[] args) {
        Loan loan = new Loan(5.5, 15, 40000);
        
        System.out.printf("Monthly Payment: $%.2f%n", loan.monthlyPayment());
        System.out.printf("Total Payment:   $%.2f%n", loan.totalPayment());
    }
}