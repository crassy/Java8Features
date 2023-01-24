package com.balu.functionalInterfaces;

import com.balu.data.Student;
import com.balu.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> {
            return new Student("Adam", 2, 3.6, "Male", Arrays.asList("Swimming", "Basketball", "Volleyball"));
        };

        System.out.println("Student is : " + studentSupplier.get());

        Supplier<List<Student>> listSupplier = () -> StudentDatabase.getAllStudents();
        System.out.println("Students are : " + listSupplier.get());
    }
}
