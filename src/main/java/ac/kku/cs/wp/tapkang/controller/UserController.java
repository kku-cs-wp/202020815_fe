package main.java.ac.kku.cs.wp.tapkang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // 회원가입 페이지 처리
    @GetMapping("/register")
    public String registerForm() {
        return "register"; // register.jsp
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user, Model model) {
        userService.registerUser(user);
        model.addAttribute("message", "회원가입 성공");
        return "login"; // login.jsp로 리디렉션
    }

    // 로그인 페이지 처리
    @GetMapping("/login")
    public String loginForm() {
        return "login"; // login.jsp
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, Model model) {
        if (userService.authenticate(email, password)) {
            model.addAttribute("message", "로그인 성공");
            return "redirect:/books/all"; // 로그인 후 도서 목록 페이지로 이동
        } else {
            model.addAttribute("message", "로그인 실패");
            return "login"; // 로그인 실패 시 다시 로그인 페이지로
        }
    }
}
