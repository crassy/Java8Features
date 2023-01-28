package com.balu.streams;

import com.balu.data.Student;
import com.balu.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {
    public static List<String> printStudentActivities(){
        List<String> studentActivities = StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
//                .distinct()
                .sorted()
                .collect(Collectors.toList());
        return studentActivities;
    }

    public static Long getStudentActivitiesCount(){
        Long studentActivitiesCount = StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
        return studentActivitiesCount;
    }
    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(getStudentActivitiesCount());
    }

}
