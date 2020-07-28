package com.ctechbd.student_management.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer studentId;
    private String studentName;
    private String studentEmail;
    private String studentBranch;
}
