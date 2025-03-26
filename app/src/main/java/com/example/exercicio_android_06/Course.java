package com.example.exercicio_android_06;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private int enrollmentLimit;
    private List<Student> enrolledStudents;

    public Course(String name, int enrollmentLimit) {
        this.name = name;
        this.enrollmentLimit = enrollmentLimit;
    }

    public Course(String name, int enrollmentLimit, List<Student> enrolledStudents) {
        this.name = name;
        this.enrollmentLimit = enrollmentLimit;
        this.enrolledStudents = enrolledStudents;
    }

    public void enrollStudent (Student student) throws EnrollmentLimitException {
        if (enrolledStudents == null) {
            enrolledStudents = new ArrayList<>();
        }

        if (enrolledStudents.size() >= enrollmentLimit) {
            throw new EnrollmentLimitException("The course " + name + " has reached the maximum enrollment limit.");
        }
        enrolledStudents.add(student);
        Log.i("Enrollment", "Student " + student.getName() + " enrolled in the course " + name);
    }
}
