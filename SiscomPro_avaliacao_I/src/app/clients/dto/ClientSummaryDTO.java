package app.clients.dto;

/**
 *
 * @author gabriela.zanetti
 */

public class ClientSummaryDTO {
    private int id;
    private String name;
    private String cpf;
    private String email;
    private String homePhone;
    private String cellPhone;

    public ClientSummaryDTO(int id, String name, String cpf, String email, String homePhone, String cellPhone) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.homePhone = homePhone;
        this.cellPhone = cellPhone;
    }

    public int id() { return id; }
    public String name() { return name; }
    public String cpf() { return cpf; }
    public String email() { return email; }
    public String homePhone() { return homePhone; }
    public String cellPhone() { return cellPhone; }
}
