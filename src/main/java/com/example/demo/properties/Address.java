package com.example.demo.properties;

import lombok.Data;

public class Address {

    private String street = "dummy";

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
