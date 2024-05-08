package org.example.cours;

import lombok.AllArgsConstructor;
import org.example.cours.entities.Livre;
import org.example.cours.repositories.LivreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@SpringBootApplication
@AllArgsConstructor
public class CoursApplication  {
    LivreRepository livreRepository;

    public static void main(String[] args) {
        SpringApplication.run(CoursApplication.class, args);
    }
//    @Override
//    @Transactional
//    public void run(String... args) throws Exception {
//        for (int i = 0; i < 30; i++) {
//            Livre entity = new Livre();
//            entity.setNom("Default Name " + i);
//            entity.setDateEdition(new Date());
//            entity.setEnStock(true);
//            entity.setNbrExamplaire(1);
//            livreRepository.save(entity);
//        }
//    }

}
