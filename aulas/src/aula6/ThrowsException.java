package aula6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author gabriela.zanetti
 */
public class ThrowsException {

    public static void main(String[] args) {
        try {
            callRead("arquivo.txt");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
        }
    }

    public static void callRead (String path) throws IOException {
         readFile(path);
    }
            
    public static void readFile(String path)  throws IOException{
      
        FileReader file = new FileReader(path);
        BufferedReader reader = new BufferedReader(file);
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
