public class Calculator {
    
    private double principleAmount;
    private double rateOfInterest;
    private int numberOfYears;

    private int numberOfMonthlyPayments = 12;

    Calculator(double principleAmount, double rateOfInterest, int numberOfYears,int numberOfMonthlyPayments){
        this.principleAmount = principleAmount;
        this.rateOfInterest = rateOfInterest;
        this.numberOfYears = numberOfYears;
        this.numberOfMonthlyPayments = numberOfMonthlyPayments;
    }

    private double balanceCalculator(int numberOfPayments){

        int numberOfInstallments = numberOfMonthlyPayments*numberOfYears;
        double monthlyRateOfInterest = (rateOfInterest/numberOfMonthlyPayments)/100;

        double balance = principleAmount*(Math.pow((1+monthlyRateOfInterest),numberOfInstallments)-Math.pow((1+monthlyRateOfInterest),numberOfPayments))/(Math.pow((1+monthlyRateOfInterest),numberOfInstallments)-1);

        return balance;
    }

    private double MortgageCalculator(){

        int numberOfInstallments = numberOfMonthlyPayments*numberOfYears;
        double monthlyRateOfInterest = (rateOfInterest/numberOfMonthlyPayments)/100;

        
        double monthlyInstallments= monthlyRateOfInterest*principleAmount*((Math.pow((1+monthlyRateOfInterest),numberOfInstallments))/(Math.pow((1+monthlyRateOfInterest), numberOfInstallments)-1));
        
        return monthlyInstallments;
    }

    private double MortgageInterest(){

        int numberOfInstallments = numberOfMonthlyPayments*numberOfYears;
        double monthlyInstallments = MortgageCalculator();

        return (numberOfInstallments*monthlyInstallments-principleAmount);
    }

    public double getMortgageCalculator(){
        return MortgageCalculator();
    }

    public double getBalanceCalculator(int numberOfPayments){
        return balanceCalculator(numberOfPayments);
    }

    public double getPrincipleAmount(){
        return principleAmount;
    }

    public double getInterestPaid(){
        return MortgageInterest();
    }

    public double getRateOfInterest(){
        return rateOfInterest;
    }

    public int getNumberOfYears(){
        return numberOfYears;
    }

    public int getNumberOfMonthlyPayments(){
        return numberOfMonthlyPayments;
    }

}
