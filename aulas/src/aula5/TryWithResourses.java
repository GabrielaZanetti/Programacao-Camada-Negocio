package aula6;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author gabriela.zanetti
 */
public class TryWithResourses {

    public static void main(String[] args) {
//        FileWriter fw = null;
//
//        try {
//            fw = new FileWriter("src/arquivo.txt");
//            System.out.println("Arquivo criado com sucesso");
//        } catch (IOException e) {
//            System.out.println("Erro no "+ e.getMessage());
//        } finally {
//            try {
//                fw.close();
//            } catch (NullPointerException | IOException ex) {
//            System.out.println("Erro ao fechar o recurso "+ ex.getMessage());
//            }
//        }
//              try whith resources
        try (FileWriter fw = new FileWriter("src/arquivo.txt");) {
            System.out.println("Arquivo criado com sucesso");
        } catch (IOException e) {
            System.out.println("Erro: "+e.getMessage());
        }
    }

}
