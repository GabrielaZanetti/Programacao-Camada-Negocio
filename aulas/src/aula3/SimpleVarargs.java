package aula3;

/**
 *
 * @author gabi
 */
public class SimpleVarargs {

    public static void main(String[] args) {
        System.out.println("A media e: " + CalcMedia(100, 50));
        System.out.println("A media e: " + CalcMedia(100, 100));
        
        CalcMediaNome("Ana", 100, 100, 45, 45);
    }
    
    static double CalcMedia(Integer... notas) {
        int total = 0;
        for (Integer nota : notas) {
            total = total + nota;
        }
        
        return total/notas.length;
    }
    
    static void CalcMediaNome(String nome, Integer... notas) {
        int total = 0;
        for (Integer nota : notas) {
            total = total + nota;
        }
        
        int media = total/notas.length;
        System.out.println("A m´dia do aluno "+nome+" foi " +media);
    }
}
