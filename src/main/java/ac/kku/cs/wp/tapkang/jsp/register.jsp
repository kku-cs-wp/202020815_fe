<!DOCTYPE html>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
    <h2>회원가입</h2>
    <form action="/users/register" method="post">
        <label for="username">사용자명:</label>
        <input type="text" id="username" name="username" required><br><br>
        <label for="email">이메일:</label>
        <input type="email" id="email" name="email" required><br><br>
        <label for="password">비밀번호:</label>
        <input type="password" id="password" name="password" required><br><br>
        <button type="submit">회원가입</button>
    </form>
    <p><a href="/users/login">로그인 페이지로 가기</a></p>
</body>
</html>
