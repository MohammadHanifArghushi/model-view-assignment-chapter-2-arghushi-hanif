package fi.haagahelia.homework1basics.web;

import fi.haagahelia.homework1basics.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/hello")
    public String showStudents(Model model) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Kate", "Cole"));
        students.add(new Student("Dan", "Brown"));
        students.add(new Student("Mike", "Mars"));

        model.addAttribute("message", "Welcome to the Haaga-Helia!");
        model.addAttribute("students", students);

        return "studentlist";
    }
}
