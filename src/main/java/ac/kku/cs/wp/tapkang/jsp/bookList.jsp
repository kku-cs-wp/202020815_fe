<!DOCTYPE html>
<html>
<head>
    <title>모든 도서 목록</title>
</head>
<body>
    <h2>모든 도서 목록</h2>
    <ul>
        <c:forEach var="book" items="${books}">
            <li>${book.title} - ${book.author} (${book.genre})</li>
        </c:forEach>
    </ul>
    <p><a href="/books/recommend/1">추천 도서 보기</a></p>
</body>
</html>
