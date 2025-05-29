package app.clients.model;

import app.clients.exceptions.ClientValidationException;
import app.clients.validator.ClienteValidator;
/**
 *
 * @author gabriela.zanetti
 */
public class Client {
    private int id;
    private String name;
    private String cpf;
    private String email;
    private String homePhone;
    private String cellPhone;
    private String address;
    private String zipCode;
    private String addressNumber;
    private String neighborhood;
    private String city;
    private String uf;

    public Client(String name, String cpf, String email, String homePhone, String cellPhone, String address, String zipCode, String addressNumber, String neighborhood, String city, String uf) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.homePhone = homePhone;
        this.cellPhone = cellPhone;
        this.address = address;
        this.zipCode = zipCode;
        this.addressNumber = addressNumber;
        this.neighborhood = neighborhood;
        this.city = city;
        this.uf = uf;
    }

    public Client(int id, String name, String cpf, String email, String homePhone, String cellPhone, String address, String zipCode, String addressNumber, String neighborhood, String city, String uf) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.homePhone = homePhone;
        this.cellPhone = cellPhone;
        this.address = address;
        this.zipCode = zipCode;
        this.addressNumber = addressNumber;
        this.neighborhood = neighborhood;
        this.city = city;
        this.uf = uf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws ClientValidationException {
        ClienteValidator.nomeValidator(name);
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws ClientValidationException {
        ClienteValidator.cpfValidator(cpf);
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
