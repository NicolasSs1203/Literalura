package com.nicolas.literalura;

import com.nicolas.literalura.principal.principal;
import com.nicolas.literalura.repository.iAutorRepository;
import com.nicolas.literalura.repository.iLibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.nicolas.literalura.repository")
public class LiteraluraApplication implements CommandLineRunner {

    @Autowired
    private iLibroRepository libroRepository;
    @Autowired
    private iAutorRepository autorRepository;

    public static void main(String[] args) {
        SpringApplication.run(LiteraluraApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        principal libreria = new principal(libroRepository, autorRepository);
        libreria.consumo();
    }
}



