<!DOCTYPE html>
<html>
<head>
    <title>Personalized Book Recommendations</title>
</head>
<body>
    <h2>Book Recommendations</h2>
    <div id="recommended-books">
        <!-- Recommended books will be populated here using JavaScript -->
    </div>

    <script>
        fetch('/books/recommend/1') // Replace '1' with actual user ID
            .then(response => response.json())
            .then(data => {
                let bookList = data.map(book => `<p>${book.title} by ${book.author}</p>`);
                document.getElementById('recommended-books').innerHTML = bookList.join('');
            });
    </script>
</body>
</html>
