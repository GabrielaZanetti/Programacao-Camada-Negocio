package aula9.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 * @author gabriela.zanetti
 */
public class ConnectionFactory {
    
    
    
    private static Properties loadProperties() {
    try (FileInputStream fs =  new FileInputStream("src/aula9/util/db.properties")) {
          Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException ex) {
            System.out.println("erro ao carregar o arquivo de propriedades "
                    + "do banco de dados");
            return null;
        }
    }
    
   public static Connection getConnection() throws DBException {
        try {
            Properties props = loadProperties();
            String url = props.getProperty("url");           
            return DriverManager.getConnection(url, props);
        } catch (SQLException ex) {
            throw new DBException("Não foi possível estabelecer conexão "
                    + "com o banco de dados");
        }
    }


}
