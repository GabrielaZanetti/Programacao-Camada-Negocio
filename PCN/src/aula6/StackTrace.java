package aula6;



/**
 *
 * @author gabriela.zanetti
 */
    public class StackTrace {

    public static void main(String[] args) {
        double teste = dividir(10, 0);
        System.out.println(teste);
    }
    
    public static double dividir(int a, int b) {
        return dividir2(a, b);
    }
    
    public static double dividir2(int a, int b) {
        return dividir3(a, b);
    }

    public static double dividir3(int a, int b) {
        return a/b;
    }
}
