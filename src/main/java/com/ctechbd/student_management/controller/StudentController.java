package com.ctechbd.student_management.controller;

import com.ctechbd.student_management.entity.Student;
import com.ctechbd.student_management.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value = "/api")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/save-student")
    public boolean saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);

    }

    @GetMapping("/students-list")
    public List<Student> allstudents() {
        return studentService.getStudents();
    }

    @DeleteMapping("/delete-student/{studentId}")
    public boolean deleteStudent(@PathVariable("studentId") int student_id,Student student) {
        return studentService.deleteStudent(student);
    }

    @GetMapping("/student/{studentId}")
    public Student getStudentByID(@PathVariable("studentId") int student_id,Student student) {
        return studentService.getStudentByID(student_id);
    }

    @PutMapping("/update-student/{studentId}")
    public boolean updateStudent(@RequestBody Student student, @PathVariable String studentId) {
        return studentService.updateStudent(student);
    }
}
