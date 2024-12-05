package cn.edu.ctbu.dp1.dao;

import cn.edu.ctbu.dp1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findByNameLike(String name);//按名字查询
    List<Student> findByNameAndPassword(String name, String password);
}





