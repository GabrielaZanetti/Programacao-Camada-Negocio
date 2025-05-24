package app.clients.dao;

import app.clients.model.Client;
import app.utils.db.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        String sql = "INSERT INTO TD_CLIENTES(name, cpf, email, homePhone, cellPhone, address, zipCode, addressNumber, neighborhood, city, uf)"+
                     "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        
        // criar o preparedStatement
        try(PreparedStatement stmt = con.prepareStatement(sql)){
        stmt.setString(1, client.getName());
        stmt.setString(2, client.getCpf());
        stmt.setString(3, client.getEmail());
        stmt.setString(4, client.getHomePhone());
        stmt.setString(5, client.getCellPhone());
        stmt.setString(6, client.getAddress());
        stmt.setInt(7, client.getZipCode());
        stmt.setString(8, client.getAddressNumber());
        stmt.setString(9, client.getNeighborhood());
        stmt.setString(10, client.getCity());
        stmt.setString(11, client.getUf());
            
        stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void select(Client client){
        // criar string sql
        String sql = "SELECT * FROM TD_CLIENTES"+
                     "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        
        // criar o preparedStatement
        try(PreparedStatement stmt = con.prepareStatement(sql)){
        stmt.setString(1, client.getName());
        stmt.setString(2, client.getCpf());
        stmt.setString(3, client.getEmail());
        stmt.setString(4, client.getHomePhone());
        stmt.setString(5, client.getCellPhone());
        stmt.setString(6, client.getAddress());
        stmt.setInt(7, client.getZipCode());
        stmt.setString(8, client.getAddressNumber());
        stmt.setString(9, client.getNeighborhood());
        stmt.setString(10, client.getCity());
        stmt.setString(11, client.getUf());
        stmt.setString(12,client.getName());
            
        stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
