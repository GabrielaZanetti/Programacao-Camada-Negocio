package aula16;

/**
 *
 * @author gabriela.zanetti
 */
public class RunnableTest {

    public static void main(String[] args) throws InterruptedException {
        int[] vetor = new int[1000];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
        }
        
        MyThreadRunnable r1 = new MyThreadRunnable(vetor);
        Thread t1 = new Thread(r1);
        
        long start = System.nanoTime();
        t1.start();
        // se nao executa primeiro ele retorna a soma 0 por nao finalizar a soma
        t1.join();
        long end = System.nanoTime();
        
        System.out.println("Valor da soma: "+ r1.getSoma());
        System.out.println("Tempo de duracao "+ (end-start));
    }

}
