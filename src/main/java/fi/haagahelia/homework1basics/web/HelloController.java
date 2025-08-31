package fi.haagahelia.homework1basics.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(
            @RequestParam String name,
            @RequestParam int age,
            Model model) {

        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "hello";
    }
}
