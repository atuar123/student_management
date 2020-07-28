package com.ctechbd.student_management.service.impl;

import com.ctechbd.student_management.entity.Student;
import com.ctechbd.student_management.repository.StudentRepository;
import com.ctechbd.student_management.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public boolean saveStudent(Student student) {
        boolean status=false;
        try {
            studentRepository.save(student);
            status=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public boolean deleteStudent(Student student) {
        boolean status=false;
        try {
            studentRepository.delete(student);
            status=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public Student getStudentByID(Integer id) {
        Student student = studentRepository.findById(id).get();
        return student;
    }

    @Override
    public boolean updateStudent(Student student) {
        boolean status=false;
        try {
            studentRepository.save(student);
            status=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}
