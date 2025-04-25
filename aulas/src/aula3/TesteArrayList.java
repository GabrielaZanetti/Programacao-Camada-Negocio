package aula3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabi
 */
public class TesteArrayList {

    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        
        System.out.println("language index: "+ languages.get(1));
        
        languages.set(0, "C#");
        System.out.println("language index: "+ languages.get(0));
        
        languages.remove(1);
//        languages.remove("Python");
        System.out.println("language index: "+ languages);
        
        // se a string esta no array
        System.out.println(languages.contains("Java"));
        // o tamanho do array
        System.out.println(languages.size());
        
        System.out.println("------------    PERCORRENDO A LISTA     ------------");
        for (int i = 0; i < languages.size(); i++) {
            System.out.println(languages.get(i));
        }
        
        languages.clear();
        // apos limpar a listaṕ
        System.out.println(languages);
        
        for (String language : languages) {
            System.out.println(language);
        }
        System.out.println("------------    INSERINDO NOVAS LINGUAGENS     ------------");
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        
        System.out.println("imprimindo lista com foreach");
        languages.forEach(lang -> System.out.println(lang) );
    }
}
