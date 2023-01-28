package com.balu.data;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;

    private int noOfNoteBooks;

    public int getNoOfNoteBooks() {
        return noOfNoteBooks;
    }

    public void setNoOfNoteBooks(int noOfNoteBooks) {
        this.noOfNoteBooks = noOfNoteBooks;
    }

    List<String> activities = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", gpa=" + gpa +
                ", gender='" + gender + '\'' +
                ", activities=" + activities +
                ", noOfNoteBooks="+ noOfNoteBooks+
                '}';
    }

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities, int noOfNoteBooks) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
        this.noOfNoteBooks = noOfNoteBooks;
    }

    public void printListOfActivities(){
        System.out.println(activities);
    }
}
