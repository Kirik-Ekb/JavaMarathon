package day6;

import java.util.Random;

public class Teacher {
    String name;
    String studyDiscipline;

    public Teacher(String name, String studyDiscipline) {
        this.name = name;
        this.studyDiscipline = studyDiscipline;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudyDiscipline(String studyDiscipline) {
        this.studyDiscipline = studyDiscipline;
    }

    public String getName() {
        return name;
    }

    public String getStudyDiscipline() {
        return studyDiscipline;
    }

    void evaluate(String studyName) {
        Random rnd = new Random();
        int grade = rnd.nextInt(4) + 2;
        String gradeStudent = "";
        switch (grade) {
            case (5):
                gradeStudent = "отлично";
                break;
            case (4):
                gradeStudent = "хорошо";
                break;
            case (3):
                gradeStudent = "удовлетворительно";
                break;
            case (2):
                gradeStudent = "неудовлетворительно";
                break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + studyName + " по предмету " + studyDiscipline + " на оценку " + gradeStudent+"!");
    }
}

