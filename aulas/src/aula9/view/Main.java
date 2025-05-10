package aula9.view;

import java.sql.Connection;
import aula9.util.ConnectionFactory;
import aula9.util.DBException;

/**
 *
 * @author gabriela.zanetti
 */
public class Main {
   
    public static void main(String[] args) {
        try {
            Connection connection = ConnectionFactory.getConnection();
            System.out.println("conectado com sucesso");
        } catch (DBException ex) {
            System.out.println(ex);
        }

       /* Criar um objeto do tipo cliente */
       /* Criar um objeto do tipo ClienteDAO */
       
       /* Cadastrar o client criado no banco de dados usando o objeto clienteDAO */
    }

}
