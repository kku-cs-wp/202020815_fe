package main.java.ac.kku.cs.wp.tapkang.Repository Layer;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserBookHistoryRepository extends JpaRepository<UserBookHistory, Long> {
    List<Book> findBooksByUserId(Long userId);
}