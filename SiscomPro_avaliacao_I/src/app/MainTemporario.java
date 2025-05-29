package app;

import app.clients.controller.ClientController;
import app.clients.dto.ClientSummaryDTO;
import app.utils.db.ConnectionFactory;
import app.utils.db.DBException;
import java.sql.Connection;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriela.zanetti
 */
public class MainTemporario {
    private ClientController controller;

    public MainTemporario() throws DBException {
        // Inicialize o controller aqui
        this.controller = new ClientController(); // Assumindo que existe um construtor padrão
    }

    public static void main(String[] args) throws DBException {
        Connection con = new ConnectionFactory().getConnection();

        if (con != null) {
            System.out.println("conectado com sucesso");
        } else {
            System.out.println("erro na conexao");
        }

        MainTemporario app = new MainTemporario();
        app.loadClients(); // Agora controller não é mais null
    }

    private void loadClients() {
        try {
            List<ClientSummaryDTO> clients = controller.getAllSummarizedClient();

            for (ClientSummaryDTO client : clients) {
                System.out.println(client.name());
            }
        } catch (DBException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
