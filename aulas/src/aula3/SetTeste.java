package aula3;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author gabi
 */
public class SetTeste {

    public static void main(String[] args) {
        Set<String> languages = new HashSet<>();
        
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        System.out.println(languages);
        
        boolean isAdded = languages.add("Java");
        System.out.println(isAdded);
        
        boolean exist = languages.add("Java");
        System.out.println(exist);
        
        boolean isRemoved = languages.add("Java");
        System.out.println(isRemoved);
        
        for (String language : languages) {
            System.out.println(language);
        }
        
        languages.forEach(lang -> System.out.println(lang) );
        
        int size = languages.size();
        System.out.println(size);
        
        boolean isEmpty = languages.isEmpty();
        System.out.println(isEmpty);
        languages.clear();
        
    }
    
}
