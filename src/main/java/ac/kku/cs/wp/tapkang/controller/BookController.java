package main.java.ac.kku.cs.wp.tapkang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    // 추천 도서 목록을 JSP로 전달
    @GetMapping("/recommend/{userId}")
    public String recommendBooks(@PathVariable Long userId, Model model) {
        List<Book> recommendedBooks = bookService.recommendBooks(userId);
        model.addAttribute("recommendedBooks", recommendedBooks);
        return "recommendedBooks"; // JSP 파일 이름
    }

    // 모든 도서 목록을 JSP로 전달
    @GetMapping("/all")
    public String getAllBooks(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        return "bookList"; // bookList.jsp로 결과 전달
    }
}
