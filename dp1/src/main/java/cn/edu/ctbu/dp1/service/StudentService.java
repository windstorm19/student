package cn.edu.ctbu.dp1.service;

import cn.edu.ctbu.dp1.dao.StudentRepository;
import cn.edu.ctbu.dp1.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAll() {
        return studentRepository.findAll();
    }
    public Student findById(Integer id) {

        return studentRepository.findById(id).orElse(null);
    }
    public List<Student> findByName(String name) {

        return studentRepository.findByNameLike(name);
    }
    public List<Student> findByNameAndPassword(String name,String password) {

        return studentRepository.findByNameAndPassword(name,password);
    }
    public void insert(Student student) {
        studentRepository.save(student);
    }
    public void update(Student student) {
        studentRepository.save(student);
    }
    public void delete(Integer id) {
        studentRepository.deleteById(id);
    }

}
