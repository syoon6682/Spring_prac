package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// controller annotation 작성해줘야함
@Controller
public class HelloController {

    // 웹 어플리케이션에서 /hello로 들어오면 작동, 호출
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "jsy!!");
        return "hello";
    }

}
