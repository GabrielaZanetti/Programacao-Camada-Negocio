package aula10.app.clients.controller;

import aula10.app.clients.services.ClientService;

/**
 *
 * @author gabriela.zanetti
 */
public class ClientController {
    ClientService service;
    
    public ClientController() {
        service = new ClientService();
    }
    
    public void create(String nome, String endereco, String telefone, String email) {
        service.create(nome, endereco, telefone, email);
    }
}
