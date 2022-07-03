import java.text.NumberFormat;
import java.util.Locale;

public class MortgageReport {

    private Calculator balance;

    MortgageReport(Calculator balance){
        this.balance = balance;
    }

    public void setPrint(){
        printMonthly();
        printBalance();
    }
    
    private void printMonthly(){

        double monthly = balance.getMortgageCalculator();
        System.out.println();
        System.out.println("Mortgage");
        System.out.println("______________");
        System.out.println();
        System.out.println("Monthly Installment to be paid : " + NumberFormat.getCurrencyInstance(Locale.US).format(monthly));
        System.out.println();
        double interestPaid = balance.getInterestPaid();
        System.out.println("Total Interest to be paid : " + NumberFormat.getCurrencyInstance(Locale.US).format(interestPaid));
        System.out.println();
        System.out.println("______________________________________");
    }

    private void printBalance(){

        System.out.println();
        System.out.println("Payment Schedule");
        System.out.println("_______________________");
        System.out.println();
        for( int i=0 ; i <= balance.getNumberOfYears() * balance.getNumberOfMonthlyPayments() ; i++ ){
            double bal = balance.getBalanceCalculator(i);
            System.out.println("Month " + i + " : " + NumberFormat.getCurrencyInstance(Locale.US).format(bal));
        }

    }

}
