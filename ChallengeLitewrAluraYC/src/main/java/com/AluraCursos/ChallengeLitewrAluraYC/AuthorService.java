package com.AluraCursos.ChallengeLitewrAluraYC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    public List<Author> findDistinctByName(String name) {
        return authorRepository.findDistinctByName(name);
    }

    public List<Author> findByBirthYear(Integer birthYear) {
        // Implementa la lógica según sea necesario para buscar autores por año de nacimiento
        // Aquí un ejemplo hipotético:
        // return authorRepository.findByBirthDateYear(birthYear);
        return null; // Cambia esto según la implementación real
    }
}