package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Никита", "Аспирант");
        System.out.println(student.getGroupName());

        Teacher teacher = new Teacher("Иванов А.А.", "Философия");
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();
    }
}
