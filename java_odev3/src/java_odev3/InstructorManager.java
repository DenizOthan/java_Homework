package java_odev3;
public class InstructorManager extends UserManager{
    public void offeredCoursesList(Instructor instructor) {
        System.out.printf("ENG�N DEM�ROG TARAFINDAN VER�LEN KURSLAR\n", instructor.getFullName());
        for (String course: instructor.getCoursesOffered()) {
            System.out.println(course);
        }
    }

    public void certificatesList(Instructor instructor) {
        System.out.printf("E��TMEN�N SERT�F�KALARI\n", instructor.getFullName());
        for (String certificate: instructor.getCertificates()) {
            System.out.println(certificate);
        }
    }
}
