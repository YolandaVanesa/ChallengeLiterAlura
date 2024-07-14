package com.AluraCursos.ChallengeLitewrAluraYC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public List<Book> findByLanguage(String language) {
        return bookRepository.findByLanguage(language);
    }
}