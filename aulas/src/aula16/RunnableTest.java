package aula16;

/**
 *
 * @author gabriela.zanetti
 */
public class RunnableTest {
   
    public static void main(String[] args) throws InterruptedException {
        
        int[] vetor =  new int[1000000];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i]= i;
        }
        long start = System.currentTimeMillis();
        MyThreadRunnable r1 =  new MyThreadRunnable(vetor, 0, 99999);
//        MyThreadRunnable r2 =  new MyThreadRunnable(vetor, 500, 999);
        Thread t1 = new Thread(r1);
//        Thread t2 = new Thread(r2);
        t1.start();
//        t2.start();
        t1.join();
//        t2.join();
        long end = System.currentTimeMillis();
        System.out.println("Valor da soma: "+(r1.getSoma()));
        System.out.println("tempo de processamento: "+(end-start));
    }

}