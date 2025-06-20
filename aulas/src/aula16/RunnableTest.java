package aula16;

/**
 *
 * @author gabriela.zanetti
 */
public class RunnableTest {

    public static void main(String[] args) throws InterruptedException {
        int[] numeros = {1,2,3,4,5};
        MyThreadRunnable r1 = new MyThreadRunnable(numeros);
        Thread t1 = new Thread(r1);
        t1.start();
        // se nao executa primeiro ele retorna a soma 0 por nao finalizar a soma
        t1.join();

        System.out.println("Valor da soma: "+ r1.getSoma());
    }

}
