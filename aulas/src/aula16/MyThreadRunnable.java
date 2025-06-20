package aula16;

/**
 *
 * @author gabriela.zanetti
 */
public class MyThreadRunnable implements Runnable {
    private int[] vet;
    private int soma;
    private int idStart;
    private int idEnd;
    public MyThreadRunnable(int[] vet, int idStart, int idEnd){
        this.vet =  vet;
        this.idStart =  idStart;
        this.idEnd =  idEnd;
    }
    @Override
    public void run() {
        soma = 0;
        for (int i = idStart; i < idEnd; i++) {
            soma += vet[i];
        }
    }
    public int getSoma(){
        return soma;
    }
}
