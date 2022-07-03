
public class App{
    
    public static void main(String args[]){

        double principleAmount = console.readNumber("Enter the Loan Amount : ",0,1000000);
        int numberOfYears = (int) console.readNumber("Enter the duration period in years : ",0,50);
        double rateOfInterest = console.readNumber("Enter the Rate of Interest in % : ",0,25);
        int numberOfMonthlyPayments = (int) console.readNumber("Enter number of payments in a year : ",1,12);

        var mortgageCalculator = new Calculator(principleAmount, rateOfInterest, numberOfYears,numberOfMonthlyPayments);

        var report = new MortgageReport(mortgageCalculator);
        report.setPrint();
    }

}