package aula10.app.clients.validator;

import aula10.app.clients.exceptions.ClientValidationException;

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
}
