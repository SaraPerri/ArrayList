import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student uno = new Student("Sara", 27);
        Student due = new Student("Marco", 31);
        Student tre = new Student("Antonio", 24);


        ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(uno, due, tre));
        printArrayList(students);
        students.add(new Student("Claudio", 28));
        students.add(new Student("Gianna", 34));
        students.add(new Student("Silvia", 23));
        students.add(new Student("Riccardo", 31));
        printArrayList(students);
    }

    public static void printArrayList(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student.getName());
            System.out.println(student.getAge());
        }
    }


}
