import java.util.Scanner;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loadAmount;
    private java.util.Date loanDate;

    public Loan(){
        this(2.5,1,1000);
    }

    public Loan(double annualInterestRate,int numberOfYears,double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loadAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears(){
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }

    public double getLoadAmount(){
        return loadAmount;
    }

    public void setLoadAmount(double loadAmount){
        this.loadAmount = loadAmount;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loadAmount * monthlyInterestRate / ( 1 - ( 1 / Math.pow( 1 + monthlyInterestRate,numberOfYears * 12)) );
        return monthlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    public java.util.Date getLoanDate(){
        return loanDate;
    }
}
