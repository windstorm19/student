package cn.edu.ctbu.dp1.service;

import cn.edu.ctbu.dp1.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentServiceTest {
    @Autowired
    private StudentService studentService;

    @Test
    void getAll() {
        List<Student> students = studentService.getAll();

        assertNotNull(students);
        }
    @Test
    void findById() {
        Student students = studentService.findById(1);

        assertNotNull(students);
    }
    @Test
    void  findByNameLike() {
        List<Student> students = studentService.findByName("张%");
        assertNotNull(students);
    }
    @Test
    void  findByNameAndPassword() {
        List<Student> students = studentService.findByNameAndPassword("张三","33333");
        assertNotNull(students);
    }
    @Test
    void insert() {
        Student student = new Student();
        student.setName("赵六");
        student.setPassword("55555");
        student.setSex(2);
        studentService.insert(student);
        assertNotNull(student.getId());
    }
    @Test
    void update() {
        Student student = studentService.findById(5);
        student.setName("赵六1");

        assertEquals(student.getName(),"赵六");
    }
    @Test
    void delete() {
        studentService.delete(5);
        Student student = studentService.findById(5);
        assertNull(student);
    }



}
