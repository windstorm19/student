package cn.edu.ctbu.dp1.api;

import cn.edu.ctbu.dp1.entity.Student;
import cn.edu.ctbu.dp1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentApiController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/list")
    public List<Student> findAll() {
        List<Student> students = studentService.getAll();
        return students;
    }
}
