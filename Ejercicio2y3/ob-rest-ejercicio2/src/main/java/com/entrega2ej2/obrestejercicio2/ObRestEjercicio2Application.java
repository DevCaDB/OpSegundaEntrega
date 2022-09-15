package com.entrega2ej2.obrestejercicio2;

import com.entrega2ej2.obrestejercicio2.entities.Laptop;
import com.entrega2ej2.obrestejercicio2.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ObRestEjercicio2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObRestEjercicio2Application.class);
		LaptopRepository repository = (LaptopRepository) context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null,"Dell","intel i7","6H");
		Laptop laptop2 = new Laptop(null,"MSI","intel i9","5.5H");
		Laptop laptop3 = new Laptop(null,"Acer","intel i5","7H");

		repository.save(laptop1);
		repository.save(laptop2);
		repository.save(laptop3);

		System.out.println("El numero de laptops introducidos es de: "+repository.findAll().size());
	}

}
