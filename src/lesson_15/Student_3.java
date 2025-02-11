package lesson_15;

import java.util.*;

public class Student_3 {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student_3(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public double getAverageGrade() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public void nextCourse() {
        course++;
    }

    @Override
    public String toString() {
        return name + " (Группа: " + group + ", Курс: " + course + ", Средний балл: " + getAverageGrade() + ")";
    }
}