package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student=new Student("Vladimir", "mehanic");
        Teacher teacher=new Teacher("Anna", "chemistry");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();
    }
}
