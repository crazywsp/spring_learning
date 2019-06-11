package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pojo.Student;

@Component("studentService")
public class StudentServiceImpl implements StudentService{

    @Autowired
    private Student student = null;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public void printStudentInfo() {
        System.out.println("学生的id为：" + student.getId());
        System.out.println("学生的name为：" + student.getName());
    }
}
