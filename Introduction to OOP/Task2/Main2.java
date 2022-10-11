import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args){
        Student student1 = new Student(456731,"Ivan", "Ivanov",17,4.56);
        student1.printInfo();
        Student student2 = new Student(876940, "Petr", "Belkin", 21, 4.7);
        Student student3 = new Student(724659, "Katy", "Key", 17, 4.6);
        Group group1 = new Group("22103", new ArrayList<Student>());
        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.getByNumber(876940).printInfo();
        System.out.println(group1.getAll());
        System.out.println(group1.getCountByAge());
        System.out.println(group1.getByMinScore(4.7));
        group1.printInfo();
        group1.deleteStudent(student3);
        group1.printInfo();
    }
}
