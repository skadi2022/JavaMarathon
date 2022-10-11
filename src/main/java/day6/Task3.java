package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Никита");

        Teacher teacher = new Teacher("Иванов А.А.", "История");
        teacher.evaluate(student);
    }
}
