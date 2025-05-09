package unidade01.aula04.t04varargs.e02varargsuse;

/**
 *
 * @author Eldair
 */
public class PrintfExample {
   
    public static void main(String[] args) {
        // printf uses varargs
        System.out.printf("%s: %d %s: %d %n","idade",40, "Estado civil", 0);
        
        double[] precos = {100, 12.5, 72.234, 4.73648};
        
        for (int i = 0; i < precos.length; i++) {
//            System.out.println("Item "+i+": "+ precos[i]);
            System.out.printf("%s %d: %s %6.2f%n", "Item",i+1,"R$", precos[i]);
        }
    
    }

}
