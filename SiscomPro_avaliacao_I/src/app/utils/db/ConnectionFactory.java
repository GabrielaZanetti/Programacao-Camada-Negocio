package app.utils.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gabriela.zanetti
 */
public class ConnectionFactory {

    public Connection getConnection() {
        Properties props = loadProperties();
        String url = props.getProperty("url");
        try {
            return DriverManager.getConnection(url, props);
        } catch (SQLException ex) {
            return null;
        }
    }

    // carregar o arquivo
    private Properties loadProperties() {
        try {
            FileInputStream fs = new FileInputStream("src/app/utils/db/db.properties");
            Properties props = new Properties();
            props.load(fs);

            return props;
        } catch (IOException ex) {
            System.out.println("Arquivo nao localizado");
            return null;
        }
    }
}
