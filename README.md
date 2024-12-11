# 개인화된 도서 추천 시스템
사용자의 독서 이력 및 관심사에 기반하여 개인화된 도서를 추천하는 시스템

백엔드: Spring Boot 6, Java 21

프론트엔드: JSP + JavaScript

데이터베이스: MySQL

서버: Tomcat 9


DB 테이블

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL
);

CREATE TABLE books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255),
    genre VARCHAR(100),
    description TEXT,
    rating FLOAT
);

CREATE TABLE user_book_history (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    book_id INT,
    rating FLOAT,
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (book_id) REFERENCES books(id)
);
