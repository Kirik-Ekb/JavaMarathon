package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacherA =new Teacher("Анна","математика");
        Student studentB=new Student("Борис");
        teacherA.evaluate(studentB.getName());
    }
}
