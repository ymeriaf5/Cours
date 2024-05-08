package org.example.cours.services;

import org.example.cours.entities.Livre;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface LivreService {
    Page<Livre> getAllLivresbyNom(PageRequest pageRequest, String keyword);
}
