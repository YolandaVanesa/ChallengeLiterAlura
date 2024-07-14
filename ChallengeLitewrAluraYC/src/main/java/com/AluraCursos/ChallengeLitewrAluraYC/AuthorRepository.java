package com.AluraCursos.ChallengeLitewrAluraYC;

import com.AluraCursos.ChallengeLitewrAluraYC.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    // Método para buscar autores distintos (ejemplo hipotético)
    List<Author> findDistinctByName(String name);

    // Método para buscar autores por año de nacimiento
    List<Author> findByBirthDateYear(Integer birthYear);
}