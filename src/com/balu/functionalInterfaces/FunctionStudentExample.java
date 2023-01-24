package com.balu.functionalInterfaces;

import com.balu.data.Student;
import com.balu.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {
    static Function<List<Student>, Map<String, Double>> studentsFunction = (students) ->{
        Map<String, Double> studentGradeMap = new HashMap<>();
        students.forEach(student->{
            studentGradeMap.put(student.getName(), student.getGpa());
        });
        return studentGradeMap;
    };

    public static void main(String[] args) {
        System.out.println(studentsFunction.apply(StudentDatabase.getAllStudents()));
    }
}
