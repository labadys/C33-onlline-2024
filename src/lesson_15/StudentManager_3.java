package lesson_15;

import java.util.*;

public class StudentManager_3 {

    public static void updateStudents(List<Student_3> students) {
        Iterator<Student_3> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student_3 student = iterator.next();
            if (student.getAverageGrade() < 3) {
                System.out.println("Студент " + student.getName() + " отчислен(а) из-за низкого среднего балла.");
                iterator.remove();
            } else {
                student.nextCourse();
                System.out.println("Студент " + student.getName() + " переведён(а) на курс " + student.getCourse() + ".");
            }
        }
    }

    public static void printStudents(List<Student_3> students, int course) {
        System.out.println("Студенты на " + course + " курсе:");
        students.stream()
                .filter(student -> student.getCourse() == course)
                .forEach(student -> System.out.println(student.getName()));
    }

    public static void main(String[] args) {
        List<Student_3> students = new ArrayList<>();
        students.add(new Student_3("Вячеслав", "C33-onl-2024", 1, Arrays.asList(4, 5, 9)));
        students.add(new Student_3("Мария", "C33-onl-2024", 2, Arrays.asList(2, 3, 2)));
        students.add(new Student_3("Анастасия", "C33-onl-2024", 3, Arrays.asList(5, 4, 4)));
        students.add(new Student_3("Артем", "C33-onl-2024", 3, Arrays.asList(5, 4, 4)));
        students.add(new Student_3("Марина", "C33-onl-2024", 1, Arrays.asList(5, 4, 4)));
        students.add(new Student_3("Анна", "C33-onl-2024", 3, Arrays.asList(5, 4, 4)));
        students.add(new Student_3("Вадим", "C33-onl-2024", 3, Arrays.asList(5, 4, 4)));
        students.add(new Student_3("Дмитрий", "C33-onl-2024", 1, Arrays.asList(2, 1, 2)));
        students.add(new Student_3("Ева", "C33-onl-2024", 3, Arrays.asList(5, 4, 4)));
        students.add(new Student_3("Игорь", "C33-onl-2024", 3, Arrays.asList(5, 4, 4)));
        students.add(new Student_3("Илья", "C33-onl-2024", 3, Arrays.asList(5, 4, 4)));
        students.add(new Student_3("Кирилл", "C33-onl-2024", 2, Arrays.asList(5, 4, 4)));
        students.add(new Student_3("Максим", "C33-onl-2024", 1, Arrays.asList(5, 4, 4)));
        students.add(new Student_3("Полина", "C33-onl-2024", 1, Arrays.asList(9, 4, 4)));
        students.add(new Student_3("Сергей", "C33-onl-2024", 2, Arrays.asList(9, 4, 4)));
        students.add(new Student_3("Стас", "C33-onl-2024", 1, Arrays.asList(1, 4, 2)));

        updateStudents(students);

        printStudents(students, 2);
    }
}