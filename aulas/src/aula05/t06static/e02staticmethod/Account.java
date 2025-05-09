package unidade01.aula05.t06static.e02staticmethod;

/**
 * @author Eldair F. Dornelles
 */
public class Account {
    
    static int id =0;
    static double interestLoanRate = 0.05;
    
    public static double calculateLoanInterest(double loanAmount){
        return loanAmount * interestLoanRate;
    }

}
