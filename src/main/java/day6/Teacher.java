package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;
    private String markInWords;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void evaluate (Student student) {
        Random random = new Random();
        int mark = random.nextInt(4) + 2;

        switch (mark) {
            case 2:
                markInWords = "неудовлетворительно";
                break;
            case 3:
                markInWords = "удовлетворительно";
                break;
            case 4:
                markInWords = "хорошо";
                break;
            case 5:
                markInWords = "отлично";
                break;
        }

        System.out.println("Преподаватель " + name +" оценил студента с именем " + student.getName()
                + " по предмету " + subject + " на оценку " + markInWords + ".");
    }
}
