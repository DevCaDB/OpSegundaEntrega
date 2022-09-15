package com.entrega2ej2.obrestejercicio2.repository;

import com.entrega2ej2.obrestejercicio2.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop,Long> {
}
