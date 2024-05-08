package org.example.cours.controllers;

import lombok.AllArgsConstructor;
import org.example.cours.entities.Livre;
import org.example.cours.repositories.LivreRepository;
import org.example.cours.services.LivreService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class LivreController {
    LivreService livreService;
    @GetMapping("/index")
    public String patient(Model model,
                          @RequestParam(name = "page", defaultValue = "0") int page,
                          @RequestParam(name = "size", defaultValue = "5") int size,
                          @RequestParam(name = "keyword", defaultValue = "") String keyword) {
        Page<Livre> livresPage = livreService.getAllLivresbyNom(PageRequest.of(page, size), keyword);
        model.addAttribute("listlivres", livresPage.getContent());
        model.addAttribute("pages", new int[livresPage.getTotalPages()]);
        model.addAttribute("currentPage", page);
        model.addAttribute("keyword", keyword);
        return "livres";
    }
}
