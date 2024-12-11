package main.java.ac.kku.cs.wp.tapkang.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserBookHistoryRepository userBookHistoryRepository;

    public List<Book> recommendBooks(Long userId) {
        // 사용자가 읽은 도서를 가져와 장르 기반으로 추천
        List<Book> userBooks = userBookHistoryRepository.findBooksByUserId(userId);
        List<Book> recommendedBooks = new ArrayList<>();
        
        for (Book book : userBooks) {
            String genre = book.getGenre();
            recommendedBooks.addAll(bookRepository.findByGenre(genre));
        }

        return recommendedBooks.stream().distinct().collect(Collectors.toList());
    }
}