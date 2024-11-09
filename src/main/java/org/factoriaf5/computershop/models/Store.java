package org.factoriaf5.computershop.models;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private String name;
    private String owner;
    private int taxId;
    private List<Computer> computers;

    public Store(String name, String owner, int taxId, List<Computer> computers) {
        this.name = name;
        this.owner = owner;
        this.taxId = taxId;
        this.computers = computers != null ? computers : new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }
 


}