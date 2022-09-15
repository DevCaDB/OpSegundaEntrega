package com.entrega2ej2.obrestejercicio2.controller;

import com.entrega2ej2.obrestejercicio2.entities.Laptop;
import com.entrega2ej2.obrestejercicio2.repository.LaptopRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {
    //Atributo
    private LaptopRepository laptopRepository;

    //Constructor
    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    //Metodos
    @GetMapping("/api/laptop")
    public List<Laptop> findAll() {
        System.out.println("Ejecutando findAll");
        return laptopRepository.findAll();
    }

    @PostMapping("/api/save")
    public List<Laptop> saveLaptop(@RequestBody Laptop laptop){
        System.out.println("Guardando Libro");
        laptopRepository.save(laptop);
        System.out.println("Laptop añadido: \n" + laptop);
        System.out.println("Lista de Laptops");
        return laptopRepository.findAll();

    }

    //Getters y setters
    public LaptopRepository getLaptopRepository() {
        return laptopRepository;
    }

    public void setLaptopRepository(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }
}
