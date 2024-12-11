package main.java.ac.kku.cs.wp.tapkang.entity;
import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String genre;
    private String description;
    private float rating;

    // Getters and Setters
}