package aula10.app.clients.model;

import aula10.app.clients.exceptions.ClientValidationException;
import aula10.app.clients.validator.ClienteValidator;

/**
 *
 * @author gabriela.zanetti
 */
public class Client {
    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public Client(int id, String nome, String endereco, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public Client(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) throws ClientValidationException {
        ClienteValidator.nomeValidator(nome);
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    
}
