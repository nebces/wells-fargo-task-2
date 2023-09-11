package com.wellsfargo.counselor.entity;
import jakarta.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue
    private Long ClientId;




    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String nationalId;

    @Column(nullable = false)
    private String DOB;

    protected Client(){

    }

    public Client(String firstName, String lastName, String address, String phone, String email, String nationalId, String DOB) {
        this.firstName = firstName;
        this.lastName = lastName ;
        this.address = address ;
        this.phone = phone ;
        this.email = email ;
        this.nationalId =  nationalId;
        this.DOB = DOB ;

    }

    public Long getClientId() {
        return ClientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }


}
