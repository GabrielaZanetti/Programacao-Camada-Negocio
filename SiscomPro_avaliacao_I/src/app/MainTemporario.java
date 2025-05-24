package app;

import app.utils.db.ConnectionFactory;
import java.sql.Connection;

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
