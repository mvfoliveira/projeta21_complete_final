package Livro_Catalog_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"java", "config"})
public class LivroCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivroCatalogServiceApplication.class, args);
	}

}
