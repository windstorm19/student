package cn.edu.ctbu.dp1.controller;

import cn.edu.ctbu.dp1.entity.Student;
import cn.edu.ctbu.dp1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/list")
    public String getList(Model model) {
        List<Student> students = studentService.getAll();
        model.addAttribute("students", students);
        return "/student/list";
    }
}
