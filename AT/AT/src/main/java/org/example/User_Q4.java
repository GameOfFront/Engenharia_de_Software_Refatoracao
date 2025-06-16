package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User_Q4 {
    private String name;
    private String email;
    private List<Address_Q4> addresses;

    public User_Q4(String name, String email) {
        this.name = name;
        this.email = email;
        this.addresses = new ArrayList<>();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public void addAddress(Address_Q4 address) {
        if (address != null) {
            this.addresses.add(address);
        }
    }

    public List<Address_Q4> getAddresses() {
        return Collections.unmodifiableList(addresses);
    }
}
