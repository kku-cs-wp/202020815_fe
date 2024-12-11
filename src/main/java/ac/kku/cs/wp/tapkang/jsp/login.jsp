<!DOCTYPE html>
<html>
<head>
    <title>로그인</title>
</head>
<body>
    <h2>로그인</h2>
    <form action="/users/login" method="post">
        <label for="email">이메일:</label>
        <input type="email" id="email" name="email" required><br><br>
        <label for="password">비밀번호:</label>
        <input type="password" id="password" name="password" required><br><br>
        <button type="submit">로그인</button>
    </form>
    <p><a href="/users/register">회원가입 페이지로 가기</a></p>
</body>
</html>
