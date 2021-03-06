package org.kearis.formation.javaee7.chapitre1_1.ex34;

import javax.persistence.*;

public class Address34 {

    // ======================================
    // =             Attributes             =
    // ======================================
    private Long id;
    private String street1;
    private String city;
    private String zipcode;
    private String country;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Address34() {
    }

    public Address34(String street1, String city, String zipcode, String country) {
        this.street1 = street1;
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
    }

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}