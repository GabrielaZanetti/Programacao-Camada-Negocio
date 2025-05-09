package unidade01.aula04.t04varargs.e01varargscontext;

/**
 * <b>Unijuí</b><br>
 * <b>Disciplina</b>: Programação para Camada de Negócio<br>
 * <b>Semestre</b>: 2025/02<br>
 * <b>Campus</b>: Santa Rosa<br>
 *
 * @author Eldair Fabricio Dornelles
 */
public class Varargs {

    public static void main(String[] args) {
        Integer result = sum(1,2);
        System.out.println("result: "+result);
        
        result= sum(1,2,3);
        System.out.println("result: "+result);
        
        int[] vet = {1,2,3,4,5};
        
        result= sum(vet);
        System.out.println("result vet: "+result);
        
        //  varargs allow you to pass a set of values as parameters to a function 
        //  withoud having to create an array
        result = sum(1,2,3,4,5,6);
        System.out.println("result from varargs: "+ result);
      
        result = sum("somando 6 valores inteiros",1,2,3,4,5,6);
        System.out.println("result from varargs: "+ result);
        
    }

    //method to sum two values
    static int sum(int a, int b) {
        return a + b;
    }
    //method to sum three values
    static int sum(int a, int b, int c) {
        return a + b +c;
    }
    //method to sum an array of int
    static int sum(int[] vet) {
        int total=0;
        for (int i = 0; i < vet.length; i++) {
            total+=vet[i];
        }
        return total;
    }
    
    //method to sum a set of values using varargs
    static int sum(Integer... values){
        int total = 0;
        for (Integer value : values) {
            total+=value;
        }
        return total;
    }
    
    // se for necessario passar outros valores para o metodo, os parametros
    // para receber esses valores devem ser adicionados antes do varargs
    static int sum(String info, Integer... values){
        System.out.println("info: "+info);
        int total = 0;
        for (Integer value : values) {
            total+=value;
        }
        return total;
    }
    
    public void exemploMetodo(String str, int value, boolean status,  Double... notas) {
    // Código do método
}

}
