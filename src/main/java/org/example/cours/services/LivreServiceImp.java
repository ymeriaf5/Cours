package org.example.cours.services;

import lombok.AllArgsConstructor;
import org.example.cours.entities.Livre;
import org.example.cours.repositories.LivreRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LivreServiceImp implements LivreService {
    LivreRepository livreRepository;


    @Override
    public Page<Livre> getAllLivresbyNom(PageRequest pageRequest, String keyword) {
        return livreRepository.findByNomContains(keyword,pageRequest);
    }
}
