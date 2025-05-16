package aula10.app;

import java.sql.Connection;
import aula10.app.utils.db.ConnectionFactory;

/**
 *
 * @author gabriela.zanetti
 */
public class MainTemporario {
    public static void main(String[] args) {
        Connection con = new ConnectionFactory().getConnection();
        if(con != null){
            System.out.println("conectado com sucesso");
        }else{
            System.out.println("erro na conexao");
        }
    }

}
