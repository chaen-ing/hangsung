package com.hangsung.home.presentation;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String redirectBasedOnSessionStatus(HttpSession session) {
        log.info("run redirectBasedOnSessionStatus()");
//        if (session.getAttribute("userId") != null) {
//            return "main/home";
//        } else {
//            return "redirect:/login";
//        }
        return "/main/home";
    }
}
