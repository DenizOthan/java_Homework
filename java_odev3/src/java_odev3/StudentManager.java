package java_odev3;

public class StudentManager extends UserManager {
    public void registeredCoursList(Student student) {
        System.out.printf("��RENC�N�N KAYITLI OLDU�U KURSLAR:\n", student.getId());
        for (String course: student.getRegisteredCourses()) {
            System.out.println(course);
        }
    }
}