package org.cid.Inventoryservice;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity 
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@ToString

class Product{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private String name;
	private double price;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(Long id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Product() {}
	
	
}

@RepositoryRestResource
interface ProductRepository extends JpaRepository<Product,Long> { }

@SpringBootApplication
public class InventoryServiceApplication {
	public static void main(String[] args) { SpringApplication.run(InventoryServiceApplication.class, args);}
		@Bean
		CommandLineRunner start(ProductRepository productRepository){
		return args -> {
		productRepository.save(new Product(null,"Computer Desk Top HP",900));
		productRepository.save(new Product(null,"Printer Epson",80));
		productRepository.save(new Product(null,"MacBook Pro Lap Top",1800));
		productRepository.findAll().forEach(System.out::println);
		};
	}
}

