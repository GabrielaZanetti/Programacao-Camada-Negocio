package aula6;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author gabriela.zanetti
 */
public class TryCatchFinali {

    public static void main(String[] args) {
        try {
            char[] character = { 'a', 'b', 'c', 'd' };
    
            System.out.println("character[0]: " + character[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Linha que finaliza o processo");
        }
        
        /*try {
            FileWriter fw = new FileWriter("src/arquivo.txt");
            System.out.println("Arquivo criado com sucesso");
            fw.close();
        } catch (IOException e) {
            System.out.println("Erro no "+ e.getMessage());
        } finally {
            // finaliza o processo
        }*/
    }
}
