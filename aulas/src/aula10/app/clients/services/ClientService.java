package aula10.app.clients.services;

import aula10.app.clients.dao.ClientDAO;
import aula10.app.clients.model.Client;

/**
 *
 * @author gabriela.zanetti
 */
public class ClientService {
    ClientDAO dao;
    
    public void create (String nome, String endereco, String telefone, String email) {
        Client client = new Client(nome, endereco, telefone, email);
        dao.insert(client);
    }
}
