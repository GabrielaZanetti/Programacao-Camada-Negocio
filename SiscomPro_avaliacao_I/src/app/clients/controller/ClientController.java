package app.clients.controller;

import app.clients.exceptions.ClientValidationException;
import app.clients.model.Client;
import app.clients.services.ClientService;
import app.utils.db.DBException;

/**
 *
 * @author gabriela.zanetti
 */
public class ClientController {
    ClientService service;
    
    public ClientController() throws DBException {
        service = new ClientService();
    }
    
    public Client getById(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void getAllSummarizedClient () {
        
    }
    
    public void getSummarizedClientsByName(String name) {
        
    }
    
    public void createClient(String name, String cpf, String email, String homePhone, String cellPhone, String address, String zipCode, String addressNumber, String neighborhood, String city, String uf)  throws DBException, ClientValidationException {
        service.create(name, cpf, email, homePhone, cellPhone, address, zipCode, addressNumber, neighborhood, city, uf);
    }
 
    public void updateClient(int id, String name, String cpf, String email, String homePhone, String cellPhone, String address, String zipCode, String addressNumber, String neighborhood, String city, String uf) throws DBException, ClientValidationException {
        service.update(id, name, cpf, email, homePhone, cellPhone, address, zipCode, addressNumber, neighborhood, city, uf);
    }
    
}