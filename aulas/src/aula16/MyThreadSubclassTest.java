package aula16;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabriela.zanetti
 */
class MyThreadSubClass extends Thread {
    private int timeToSlep;

    public MyThreadSubClass(int timeToSlep) {
        this.timeToSlep = timeToSlep;
    }
            
    @Override
    public void run () {
        String threadName = Thread.currentThread().getName();
        System.out.println("Executado a thread: " + Thread.currentThread().getName());
        
        for (int i = 0; i < 10; i++) {
            
            try {
                System.out.println(threadName + " " + i);
                // aguardo no start das thread
                Thread.sleep(timeToSlep);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThreadSubClass.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
}

public class MyThreadSubclassTest {

    public static void main(String[] args) throws InterruptedException {
        MyThreadSubClass t1 = new MyThreadSubClass(100);
        MyThreadSubClass t2 = new MyThreadSubClass(300);
        
        t1.setName("thread_01");
        t2.setName("\t\tthread_02");
        
        // executa na thread
        t1.start(); 
        t2.start();

        // executa na thread main
        // t1.run();
        // t2.run();;
        
        // da prioridade para a t1
        t1.join();
        t2.join();
        
        // metodo main executa dentro da thread principal main
        System.out.println("Fim da " + Thread.currentThread().getName());               
    }

}
