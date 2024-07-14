package com.AluraCursos.ChallengeLitewrAluraYC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Book>> searchByTitle(@RequestParam String title) {
        List<Book> books = bookService.findByTitle(title);
        return ResponseEntity.ok(books);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Book>> listAllBooks() {
        List<Book> books = bookService.findAll();
        return ResponseEntity.ok(books);
    }

    @GetMapping("/language")
    public ResponseEntity<List<Book>> listBooksByLanguage(@RequestParam String language) {
        List<Book> books = bookService.findByLanguage(language);
        return ResponseEntity.ok(books);
    }
}