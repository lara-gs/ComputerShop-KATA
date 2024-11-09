package org.factoriaf5.computershop.models;

public class Computer {
    private String brand;
    private int memory;
    private String processador;
    private String operatingSystem;
    private double price;
    
    public Computer(String brand, int memory, String processador,String operatingSystem, double price) {
        this.brand = brand;
        this.memory = memory;
        this.processador = processador;
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

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
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

    


}
