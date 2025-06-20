package aula16;

/**
 *
 * @author gabriela.zanetti
 */
class MyThreadSubClass extends Thread {

    @Override
    public void run () {
        String threadName = Thread.currentThread().getName();
        System.out.println("Executado a thread: " + Thread.currentThread().getName());
        
        for (int i = 0; i < 10; i++) {
            System.out.println(threadName + " " + i);
        }
        
        
    }
}

public class MyThreadSubclassTest {

    public static void main(String[] args) {
        MyThreadSubClass t1 = new MyThreadSubClass();
        MyThreadSubClass t2 = new MyThreadSubClass();
        
        t1.setName("thread_01");
        t2.setName("\t\tthread_02");
        
        // executa na thread
        t1.start(); 
        t2.start();

        // executa na thread main
        // t1.run();
        // t2.run();;

        // metodo main executa dentro da thread principal main
        System.out.println("Fim da " + Thread.currentThread().getName());               
    }

}
