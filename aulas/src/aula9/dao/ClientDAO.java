package aula9.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import aula9.model.Client;
import aula9.util.ConnectionFactory;
import aula9.util.DBException;

/**
 * @author gabriela.zanetti
 */
public class ClientDAO {

     public static void insert(Client client) {
        String sql = "INSERT INTO clientes (nome, endereco, telefone, email) VALUES (?, ?, ?, ?)";
        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, client.getName());
            stmt.setString(2, client.getAddress());
            stmt.setString(3, client.getPhone());
            stmt.setString(4, client.getEmail());

            stmt.executeUpdate();

        } catch (SQLException | DBException ex) {
            System.out.println("erro: " + ex.getMessage());
        } 
    }
}
