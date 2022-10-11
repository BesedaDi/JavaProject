import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group{
    public String groupNumber;
    public static ArrayList<Student> listStudent;

    public Group(String groupNumber, ArrayList<Student> listStudent){
        this.groupNumber = groupNumber;
        Group.listStudent = listStudent;
    }
    public void addStudent(Student newStudent){
        listStudent.add(newStudent);
    }

    public Student getByNumber(int serialNumber){
        for(Student elem : this.listStudent) {
            if(elem.number == serialNumber){
                return elem;
            }
        }
         return null;
    }

    public void deleteStudent(Student student) {
        listStudent.remove(student);
    }

    public List<Student> getAll() {
        return listStudent;
    }

    public Map<Integer, Integer> getCountByAge() {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(Student elem : listStudent) {
            map.putIfAbsent(elem.age, 0);
            map.put(elem.age, map.get(elem.age)+1);
        }
        return map;
    }

    public List<Student> getByMinScore(double score) {
        List<Student> listScore = new ArrayList<>();
        for(Student elem: listStudent) {
            if(elem.averageScore >= score) {
                listScore.add(elem);
            }
        }
        return listScore;
    }

    public void printInfo() {
        for(Student elem: listStudent) {
            elem.printInfo();
            System.out.println("");
        }
    }
}