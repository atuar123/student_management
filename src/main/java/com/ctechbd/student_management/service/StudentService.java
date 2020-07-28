package com.ctechbd.student_management.service;

import com.ctechbd.student_management.entity.Student;

import java.util.List;

public interface StudentService {

    public boolean saveStudent(Student student);
    public List<Student> getStudents();
    public boolean deleteStudent(Student student);
    public Student getStudentByID(Integer id);
    public boolean updateStudent(Student student);
}
