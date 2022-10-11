public class Student {
    public int number, age;
    public String name, lastName;
    public double averageScore;

    public Student(int number, String name, String lastName, int age, double averageScore) {
        this.number = number;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.averageScore = averageScore;
    }
    public void printInfo(){
        System.out.println("Номер зачетки: " + this.number);
        System.out.println("Имя: " + this.name);
        System.out.println("Фамилия: " + this.lastName);
        System.out.println("Возраст: " + this.age);
        System.out.println("Средний балл: " + this.averageScore);
    }
}
