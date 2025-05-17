package aula10.app.clients.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import aula10.app.clients.model.Client;
import aula10.app.utils.db.ConnectionFactory;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabriela.zanetti
 */
public class ClientDAO {
    Connection con;
    public ClientDAO () {
        con = new ConnectionFactory().getConnection();
    }
    
    public void insert(Client client){
        // criar string sql
        String sql = "INSERT INTO clientes(nome,endereco,telefone,email) VALUES (?,?,?,?)";
        
        // criar o preparedStatement
        try(PreparedStatement stmt = con.prepareStatement(sql)){
        stmt.setString(1,client.getNome());
        stmt.setString(2,client.getEndereco());
        stmt.setString(3,client.getTelefone());
        stmt.setString(4,client.getEmail());
            
        stmt.executeUpdate();
            
            // definir os valores para cada placeHolder
            // executar o preparedStatement
            
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
