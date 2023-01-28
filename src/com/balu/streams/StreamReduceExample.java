package com.balu.streams;

import com.balu.data.Student;
import com.balu.data.StudentDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int getProduct(List<Integer> integerList){
        return integerList.stream().reduce(1,(a,b) -> a*b);
    }
    public static Optional<Integer> getProductWithoutIdentity(List<Integer> integerList){
        return integerList.stream().reduce((a,b) -> a*b);
    }

    public static Optional<Student> getHighestGPAStudent(){
        return StudentDatabase.getAllStudents().stream()
                .reduce((student1, student2) -> (student1.getGpa() > student2.getGpa())?student1:student2);
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,5,7);
        List<Integer> nullList = new ArrayList<>();
//        integerList.forEach(System.out::println);
//        System.out.println(integerList);
//        getProduct(integerList);
        System.out.println(getProduct(integerList));

        Optional<Integer> result = getProductWithoutIdentity(integerList);
        System.out.println(result.isPresent());
        System.out.println(result.get());

        Optional<Integer> nullResult = getProductWithoutIdentity(nullList);
        if(nullResult.isPresent()) {
            System.out.println(nullResult.get());
        }

        Optional<Student> highestGPAStudent = getHighestGPAStudent();
        if (highestGPAStudent.isPresent()){
            System.out.println("Highest GPA is for : "+highestGPAStudent.get());
        }
    }
}
