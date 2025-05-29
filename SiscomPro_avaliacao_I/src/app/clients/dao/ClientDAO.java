package app.clients.dao;

import app.clients.exceptions.ClientValidationException;
import app.clients.model.Client;
import app.utils.db.ConnectionFactory;
import app.utils.db.DBException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author gabriela.zanetti
 */
public class ClientDAO {
    Connection con;
    public ClientDAO () throws DBException {
        con = new ConnectionFactory().getConnection();
    }
    
    public void insert(Client client){
        // criar string sql
        String sql = "INSERT INTO TD_CLIENTES(name, cpf, email, homePhone, cellPhone, address, zipCode, addressNumber, neighborhood, city, uf) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        
        // criar o preparedStatement
        try(PreparedStatement stmt = con.prepareStatement(sql)){
        stmt.setString(1, client.getName());
        stmt.setString(2, client.getCpf());
        stmt.setString(3, client.getEmail());
        stmt.setString(4, client.getHomePhone());
        stmt.setString(5, client.getCellPhone());
        stmt.setString(6, client.getAddress());
        stmt.setString(7, client.getZipCode());
        stmt.setString(8, client.getNumber());
        stmt.setString(9, client.getNeighborhood());
        stmt.setString(10, client.getCity());
        stmt.setString(11, client.getUf());
            
        stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(Client client) {
        // Comando SQL de atualização
        String sql = "UPDATE TD_CLIENTES SET name = ?, cpf = ?, email = ?, homePhone = ?, cellPhone = ?, zipCode = ?, address = ?, addressNumber = ?, neighborhood = ?, city = ?, uf = ? WHERE id = ?";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            // Define os parâmetros do SET
            stmt.setString(1, client.getName());
            stmt.setString(2, client.getCpf());
            stmt.setString(3, client.getEmail());
            stmt.setString(4, client.getHomePhone());
            stmt.setString(5, client.getCellPhone());
            stmt.setString(6, client.getZipCode());
            stmt.setString(7, client.getAddress());
            stmt.setString(8, client.getNumber());
            stmt.setString(9, client.getNeighborhood());
            stmt.setString(10, client.getCity());
            stmt.setString(11, client.getUf());

            // Parâmetro da cláusula WHERE (identificação do cliente)
            stmt.setInt(12, client.getId());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean delet(int id) throws ClientValidationException {
        String sql = "DELETE FROM TD_CLIENTES WHERE id = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int affectedRows = stmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            throw new ClientValidationException("Erro ao deletar cliente", e);
        }
    }

    public List<Client> select()throws DBException{
        // criar string sql
        String sql = "SELECT * FROM TD_CLIENTES VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        
        return consultaTabela(sql);
    }

    public List<Client> selectName(String name)throws ClientValidationException{
        // criar string sql
        String sql = "SELECT * FROM TD_CLIENTES WHERE name = ?";
        
        return consultaTabela(sql);
    }

    public Client selectId(int id)throws DBException, ClientValidationException, IllegalArgumentException{
        // criar string sql
        String sql = "SELECT * FROM TD_CLIENTES WHERE id = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Client client = new Client();
                    client.setId(rs.getInt("id"));
                    client.setName(rs.getString("name"));
                    client.setCpf(rs.getString("cpf"));
                    client.setEmail(rs.getString("email"));
                    client.setHomePhone(rs.getString("home_phone"));
                    client.setCellPhone(rs.getString("cell_phone"));
                    return client;
                } else {
                    return null; // ou lançar exceção caso não encontre
                }
            }
        } catch (SQLException e) {
            throw new ClientValidationException("Erro ao buscar cliente por ID", e);
        }
    }
    
    public List<Client> consultaTabela(String sql) throws DBException {
        List<Client> list = new ArrayList<>();

        try (PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Client client = new Client();
                client.setId(rs.getInt("id"));
                client.setName(rs.getString("name"));
                client.setCpf(rs.getString("cpf"));
                client.setEmail(rs.getString("email"));
                client.setHomePhone(rs.getString("home_phone"));
                client.setCellPhone(rs.getString("cell_phone"));
                list.add(client);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar clientes", e);
        }

        return list;
    }
}
