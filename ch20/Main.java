package gr.aueb.cf.ch20;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
interface TeacherIdChecker {
    boolean checkId(Teacher teacher);
}

public class Main {

    private static List<Teacher> teachers = Arrays.asList
            (new Teacher(1, "Th.", "Andr"),
            new Teacher(2, "B..", "Dylan"),
            new Teacher(3, "E..", "Musk"),
            new Teacher(4, "B.", "Gates")
    );

    public static void main(String[] args) {

        int id = 3;

        printEqualId(teachers, new TeacherIdChecker() {
            @Override
            public boolean checkId(Teacher teacher) {
                return teacher.getTeacherId() == id;
            }
        });

        printEqualId(teachers, teacher -> teacher.getTeacherId() == id);

        printEqualId(teachers, teacher -> teacher.getTeacherId() == id, teacher -> Teacher.printTeacher(teacher));
    }

    public static void printEquals(List<Teacher> teachers, int teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() == teacherId) {
                System.out.println("Full name: " + teacher.getFirstname() +
                        " " + teacher.getLastname());
            }
        }
    }

    public static void printGreaterThanId(List<Teacher> teachers, int teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() > teacherId) {
                System.out.println("Full name: " + teacher.getFirstname() +
                        " " + teacher.getLastname());
            }
        }
    }

    public static void printEqualId(List<Teacher> teachers, TeacherIdChecker idChecker) {
        for (Teacher teacher : teachers) {
            if (idChecker.checkId(teacher)) {
                System.out.println("Full name: " + teacher.getFirstname() +
                        " " + teacher.getLastname());
            }
        }
    }

    public static void printEqualId(List<Teacher> teachers, Predicate<Teacher> checker,
                                    Consumer<Teacher> teacherConsume) {
        for (Teacher teacher : teachers) {
            if (checker.test(teacher)) {
               teacherConsume.accept(teacher);
            }
        }
    }
}
