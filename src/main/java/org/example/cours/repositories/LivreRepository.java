package org.example.cours.repositories;

import org.example.cours.entities.Livre;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreRepository extends JpaRepository<Livre,Integer> {
    Page<Livre> findByNomContains(String keyword, Pageable pageable);
}
