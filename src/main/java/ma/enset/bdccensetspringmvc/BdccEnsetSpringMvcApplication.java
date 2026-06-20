package ma.enset.bdccensetspringmvc;

import ma.enset.bdccensetspringmvc.entities.Product;
import ma.enset.bdccensetspringmvc.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BdccEnsetSpringMvcApplication {

    public static void main(String[] args) {

        SpringApplication.run(BdccEnsetSpringMvcApplication.class, args);

    }
    @Bean
    public CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder()
                            .name("Computer Science")
                            .price(500)
                            .quantity(12)
                            .build());
            productRepository.save(Product.builder()
                    .name("Smartphone")
                    .price(3000)
                    .quantity(10)
                    .build());
        };
    }


}
