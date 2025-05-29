package app.clients.services;

import app.clients.dao.ClientDAO;
import app.clients.model.Client;
import app.utils.db.DBException;

/**
 *
 * @author gabriela.zanetti
 */
public class ClientService  {
    ClientDAO dao;
    
    public ClientService() throws DBException {
        dao = new ClientDAO();
    }
    
    public void create(String name, String cpf, String email, String homePhone, String cellPhone, String address, String zipCode, String addressNumber, String neighborhood, String city, String uf) {
        Client client = new Client(name, cpf, email, homePhone, cellPhone, address, zipCode, addressNumber, neighborhood, city, uf);
        dao.insert(client);
    }
    
    public void update(int id, String name, String cpf, String email, String homePhone, String cellPhone, String address, String zipCode, String addressNumber, String neighborhood, String city, String uf) {
        Client client = new Client(id, name, cpf, email, homePhone, cellPhone, address, zipCode, addressNumber, neighborhood, city, uf);
        dao.update(client);
    }
}
