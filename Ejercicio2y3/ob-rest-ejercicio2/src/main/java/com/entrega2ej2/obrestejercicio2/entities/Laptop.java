package com.entrega2ej2.obrestejercicio2.entities;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String manufacturer;
    private String processor;
    private String battery;

    //constructor
    public Laptop() {
    }

    public Laptop(Long id, String manufacturer, String processor, String battery) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.battery = battery;
    }

    //getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }
}
