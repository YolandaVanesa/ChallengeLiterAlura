package com.AluraCursos.ChallengeLitewrAluraYC;

import com.AluraCursos.ChallengeLitewrAluraYC.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // Método para buscar libros por título
    List<Book> findByTitle(String title);

    // Método para listar todos los libros registrados
    List<Book> findAll();

    // Método para listar autores registrados
    List<Book> findAllByAuthor();

    // Método para listar autores vivos en un determinado año
    List<Book> findByAuthorDeathYearIsNullAndAuthorBirthYearLessThanEqual(Integer year);

    // Método para listar libros por idioma
    List<Book> findByLanguage(String language);
}