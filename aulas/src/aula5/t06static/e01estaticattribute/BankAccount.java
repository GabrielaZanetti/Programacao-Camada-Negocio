package aula5.t06static.e01estaticattribute;

/**
 *
 * @author Eldair
 */
public class BankAccount {
   
    public static void main(String[] args) {

        Account account01 = new Account();
        Account account02 = new Account();
        
        System.out.println("account01.id: "+account01.id);
        System.out.println("account02.id: "+account02.id);
        
//        Account.id = 10;
        account01.id = 20;
        System.out.println("account01.id: "+account01.id);
        System.out.println("account02.id: "+account02.id);
        
        
        
    }

}
