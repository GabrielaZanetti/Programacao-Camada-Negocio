package app.clients.services;

import app.clients.dao.ClientDAO;
import app.clients.model.Client;

/**
 *
 * @author gabriela.zanetti
 */
public class ClientService {
    ClientDAO dao;
    
    public void create (String name, String cpf, String email, String homePhone, String cellPhone, String address, int zipCode, String addressNumber, String neighborhood, String city, String uf) {
        Client client = new Client(name, cpf, email, homePhone, cellPhone, address, zipCode, addressNumber, neighborhood, city, uf);
        dao.insert(client);
    }
}
