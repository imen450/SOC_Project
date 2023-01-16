package org.cid.customerservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity 
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@ToString
class Customer{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private String name; 
	private String email;
	public Customer(Long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public Customer() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
} 
@RepositoryRestResource
interface CustomerRepository extends JpaRepository<Customer,Long> { }

@Projection(name = "fullCustomer",types = Customer.class)
interface CustomerProjection extends Projection{
	public Long getId();
	public String getName();
	public String getEmail();
}

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
	return args -> {
	customerRepository.save(new Customer(null,"Enset","contact@enset-media.ma"));
	customerRepository.save(new Customer(null,"FSTM","contact@fstm.ma"));
	customerRepository.save(new Customer(null,"ENSAM","contact@ensam.ma"));
	
	
	customerRepository.findAll().forEach(System.out::println);
	};
	}

}
