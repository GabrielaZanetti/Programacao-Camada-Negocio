package aula3;

/**
 *
 * @author gabriela.zanetti
 */

public class MyList <T> {
    //criar um vetor
    private T[] vet;

    // definir constante para o valor inicial do vetor
    private final int INITIAL_VET_SIZE = 10;

    // uma variável para contar o numero de itens que tem no vetor
    private int size;

   /*   # METODOS   */
    // construtor
    public MyList(){
        vet = (T[]) new Object[INITIAL_VET_SIZE];
    }

    // adicionar um item
    public void setItem(T element) {
        vet [size++] = element;
    }

    // Obter um item do vetor
    public T getItem(int index) {
        return vet[index];
    }

    // retornar o numero de  intens inseridos 
    public boolean removeItem(int index) {
        // verificar se o index e valido
        // copia o item da direita para sobrepor os valores
        // setar xom null o ultimo int item 

    }

    // verificar se ha espaço livre no vetor
    // verificar se o vetor esta vazio
   
}