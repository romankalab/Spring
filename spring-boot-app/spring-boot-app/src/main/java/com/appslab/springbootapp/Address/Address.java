package com.appslab.springbootapp.Address;

import com.appslab.springbootapp.Company.Company;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Address")
public class Address {
    @Id
    @Column(name = "address")
    private int addressId;
    private String street;
    private String zipCode;
    private String city;
    private String state;

    @OneToOne(mappedBy = "address")
    private Company company;

    public Address(int addressId, String street, String zipCode, String city, String state) {
        this.addressId = addressId;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
    }

    public Address(){

    }
    public int getAddressId(){
        return addressId;
    }

    public void setAddressId(int addressId){
        this.addressId = addressId;
    }

    public String getStreet(){
        return street;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public String getZipCode(){
        return zipCode;
    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }

    public Company getCompany(){
        return company;
    }

    public void setCompany(Company company){
        this.company = company;
    }
}
