package aula5.t06static.e03staticblock;

/**
 * @author gabriela.zanetti
 */
public class Account {

    public static int id = 0;
    private static double interestLoanRate;

    static {
        System.out.println("Inicializando a taxa de juros...");
        interestLoanRate = 0.05;
    }

    public static double calculateLoanInterest(double balance) {
        return balance * interestLoanRate;
    }

}
