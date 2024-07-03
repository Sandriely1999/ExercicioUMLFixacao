package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String name;
    private String email;
    private Date birthDate;

    public Client() {

    }

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String toString(){
        return name +" (" + sdf.format(birthDate) + ") - " + email;

    }
}
