package main.java.ac.kku.cs.wp.tapkang.entity;
import javax.persistence.*;

@Entity
public class UserBookHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    private float rating;

}