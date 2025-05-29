package app.clients.controller;

import app.clients.dto.ClientSummaryDTO;
import app.clients.exceptions.ClientValidationException;
import app.clients.model.Client;
import app.clients.services.ClientService;
import app.utils.db.DBException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriela.zanetti
 */
public class ClientController {
    ClientService service;
    
    public ClientController() throws DBException {
        service = new ClientService();
    }
    
    public Client getById(String id) throws DBException, ClientValidationException, IllegalArgumentException {
        return service.selectId(Integer.parseInt(id));
    }
    
    public List<ClientSummaryDTO> getAllSummarizedClient() throws DBException {
        List<Client> clients = service.selectAll();
        List<ClientSummaryDTO> dtos = new ArrayList<>();

        for (Client client : clients) {
            dtos.add(new ClientSummaryDTO(
                client.getId(),
                client.getName(),
                client.getCpf(),
                client.getEmail(),
                client.getHomePhone(),
                client.getCellPhone()
            ));
        }

        return dtos;
    }
    
    public List<ClientSummaryDTO> getSummarizedClientsByName(String name) throws DBException, ClientValidationException {
        List<Client> clients = service.selectName(name);
        List<ClientSummaryDTO> dtos = new ArrayList<>();

        for (Client client : clients) {
            dtos.add(new ClientSummaryDTO(
                client.getId(),
                client.getName(),
                client.getCpf(),
                client.getEmail(),
                client.getHomePhone(),
                client.getCellPhone()
            ));
        }

        return dtos;
    }
    
    public void createClient(String name, String cpf, String email, String homePhone, String cellPhone, String address, String zipCode, String addressNumber, String neighborhood, String city, String uf)  throws DBException, ClientValidationException {
        service.create(name, cpf, email, homePhone, cellPhone, address, zipCode, addressNumber, neighborhood, city, uf);
    }
 
    public void updateClient(int id, String name, String cpf, String email, String homePhone, String cellPhone, String address, String zipCode, String addressNumber, String neighborhood, String city, String uf) throws DBException, ClientValidationException {
        service.update(id, name, cpf, email, homePhone, cellPhone, address, zipCode, addressNumber, neighborhood, city, uf);
    }
    
    public boolean deleteClientById(String id) throws DBException, ClientValidationException {
        return service.delet(Integer.parseInt(id));
    }
    
}