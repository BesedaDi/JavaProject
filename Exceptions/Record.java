public class Record {
    public long id;
    public String phoneNumber;
    public String name;

    public Record(long id, String phoneNumber, String name) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name =  name;
    }

    public String toString(){
        return "Запись: " + id + "; Телефон: " + phoneNumber + "; Имя: " + name;
    }
}
