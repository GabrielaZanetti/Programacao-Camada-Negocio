package aula8.BasicCrud;

import aula8.BasicCrud.Model.Client;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class Main {

    static final String DATABASE_URL = "jdbc:derby://localhost:1527/siscom";
    static final String USER = "app";
    static final String PASSWORD = "app";
    
    public static void main(String[] args) {
       /* Insere um cliente novo
       Client client = new Client("ana", "Rua um", "55 9999-9999", "juliana@email.com");
       insert(client);
       */

       /* retorna a lista de clientes
       List<Client> list = getAll();
       for (Client item: list) {
        System.out.println(item);
       }
       */
       
       // Busca apenas um id
       // System.out.println(getByID(1));
       
       /* Deletar um item 
            Delet(1);
       */
       
       Client clienteAtualizado = new Client();

        clienteAtualizado.setId(2);
        clienteAtualizado.setName("Maria Silva");
        clienteAtualizado.setAddress("Rua Nova, 123");
        clienteAtualizado.setEmail("maria.teste@example.com");

        boolean sucesso = Update(clienteAtualizado);

        if (sucesso) {
            System.out.println("Atualizacao realizada com sucesso.");
        } else {
            System.out.println("Falha ao atualizar o cliente.");
        }
    }

    public static void insert(Client client) {
        String sql = "INSERT INTO clientes (nome, endereco, telefone, email) VALUES (?,?,?,?)";

        try (Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD)) {
            PreparedStatement smtm = connection.prepareStatement(sql);

            smtm.setString(1, client.getName());
            smtm.setString(2, client.getAddress());
            smtm.setString(3, client.getPhone());
            smtm.setString(4, client.getEmail());

            smtm.execute();
            connection.commit();

        } catch (SQLException ex) {
            System.out.println("erro: " + ex.getMessage());
        }
    }
    
    public static List<Client> getAll() {
        List<Client> clients = new ArrayList<>();
        String sql = "Select * FROM CLIENTES";

        try (Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
             PreparedStatement select_clients = connection.prepareStatement(sql);) {
            
            ResultSet result = select_clients.executeQuery();
            while (result.next()) {
                Client client = new Client();
                client.setId(result.getInt("id"));
                client.setName(result.getString("nome"));
                client.setPhone(result.getString("telefone"));
                client.setAddress(result.getString("endereco"));
                client.setEmail(result.getString("email"));
                
                clients.add(client);
            }   
        } catch (SQLException ex) {
            System.out.println("erro: " + ex.getMessage());
        }
        
        return clients;
    }
    
    public static Client getByID(int id) {
        Client client = new Client();
        String sql = "Select * FROM CLIENTES WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
             PreparedStatement select_clients = connection.prepareStatement(sql);) {
            select_clients.setInt(1, id);
            ResultSet result = select_clients.executeQuery();
            if (result.next()) {
                client.setId(result.getInt("id"));
                client.setName(result.getString("nome"));
                client.setPhone(result.getString("telefone"));
                client.setAddress(result.getString("endereco"));
                client.setEmail(result.getString("email"));
            }   
        } catch (SQLException ex) {
            System.out.println("erro: " + ex.getMessage());
        }
        
        return client;
    }
    
    public static Client Delet(int id) {
        Client client = null;
        String selectSql = "SELECT * FROM CLIENTES WHERE id = ?";
        String deleteSql = "DELETE FROM CLIENTES WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD)) {
            try (PreparedStatement selectStmt = connection.prepareStatement(selectSql)) {
                selectStmt.setInt(1, id);
                ResultSet result = selectStmt.executeQuery();

                if (result.next()) {
                    client = new Client();
                    client.setId(result.getInt("id"));
                    client.setName(result.getString("nome"));
                    client.setPhone(result.getString("telefone"));
                    client.setAddress(result.getString("endereco"));
                    client.setEmail(result.getString("email"));
                } else {
                    System.out.println("Cliente com ID " + id + " nao encontrado.");
                    return null;
                }
            }
            try (PreparedStatement deleteStmt = connection.prepareStatement(deleteSql)) {
                deleteStmt.setInt(1, id);
                int rowsAffected = deleteStmt.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Cliente " + client.getName() + " deletado com sucesso.");
                } else {
                    System.out.println("Nenhum cliente foi deletado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao deletar cliente: " + ex.getMessage());
        }

        return client;
    }

    public static boolean Update(Client client) {
        String updateSql = "UPDATE CLIENTES SET nome = ?, telefone = ?, endereco = ?, email = ? WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
             PreparedStatement updateStmt = connection.prepareStatement(updateSql)) {

            updateStmt.setString(1, client.getName());
            updateStmt.setString(2, client.getPhone());
            updateStmt.setString(3, client.getAddress());
            updateStmt.setString(4, client.getEmail());
            updateStmt.setInt(5, client.getId());

            int rowsAffected = updateStmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Cliente " + client.getName() + " atualizado com sucesso.");
                return true;
            } else {
                System.out.println("Nenhum cliente foi atualizado. Verifique o ID.");
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar cliente: " + ex.getMessage());
            return false;
        }
    }
}
