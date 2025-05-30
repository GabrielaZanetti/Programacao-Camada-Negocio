package app.clients.validator;

import app.clients.exceptions.ClientValidationException;

/**
 *
 * @author gabriela.zanetti
 */
public class ClienteValidator {
    
    public static void nomeValidator(String nome) throws ClientValidationException {
        if (nome.isEmpty()) {
            throw new ClientValidationException("O nome nao foi informado");
        }
    }
    
    public static void cpfValidator(String cpf) throws ClientValidationException {
        if (cpf.isEmpty()) {
            throw new ClientValidationException("O cpf nao foi informado");
        }
    }
    
    public static void idValidator(String id) throws ClientValidationException {
        if (id.isEmpty()) {
            throw new ClientValidationException("O id nao foi informado");
        }
    }
}
