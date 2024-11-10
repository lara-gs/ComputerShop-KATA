package org.factoriaf5.computershop.models;

public class Computer {
    private int id_computer;
    private String brand;
    private int memory;
    private String processor;
    private String operatingSystem;
    private double price;
    
    public Computer(String brand, int memory, String processor,String operatingSystem, double price) {
        this.brand = brand;
        this.memory = memory;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getId_computer() {
        return id_computer;
    }

    public void setId_computer(int id_computer) {
        this.id_computer = id_computer;
    }

    


}
