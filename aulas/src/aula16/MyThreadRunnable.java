package aula16;

/**
 *
 * @author gabriela.zanetti
 */
public class MyThreadRunnable implements Runnable {

    private int[] vet;
    private int soma;
    
    public MyThreadRunnable(int[] vet) {
        this.vet = vet;
    }

    @Override
    public void run() {
        for (int i = 0; i < vet.length; i++) {
            soma = soma + vet[i];
        }
    }
    
    public int getSoma () {
        return soma;
    }
    
}
