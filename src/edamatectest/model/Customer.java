
package edamatectest.model;

public class Customer {
    private int id;
    private String customerName;
    private String cpf;
    private String phone;
    private String email;   

    public Customer() {}
    
    public Customer(String customerName, String cpf, String phone, String email) {
        this.customerName = customerName;
        this.cpf = cpf;
        this.phone = phone;
        this.email = email;
    }
    
    public Customer(int id,String customerName, String cpf, String phone, String email) {
        this.id = id;
        this.customerName = customerName;
        this.cpf = cpf;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}


