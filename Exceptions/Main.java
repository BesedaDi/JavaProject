import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Record record1 = new Record(234567, "Ivan", "89246578923");
        Record record2 = new Record(903527, "Katy", "89831253462");
        Record record3 = new Record(736921, "Petr", "89723456218");
        Record record4 = new Record(903527, "Katy", "89907468324");
        Record record5 = new Record(782345, "Ivan", "89909803262");
        Record record6 = new Record(782345, null, null);

        PhoneBook phoneBook1 = new PhoneBook(new ArrayList<Record>());
        try {
            phoneBook1.createRecord(record1);
            phoneBook1.createRecord(record2);
            phoneBook1.createRecord(record3);
            System.out.println(phoneBook1.getAllRecords());
            System.out.println("");
            //* phoneBook1.createRecord(record2);
            //* System.out.println(phoneBook1.getAllRecords());
            //* System.out.println("");
        } catch (PhoneNumberAlreadyExists e) {
            System.err.println(e.getMessage());

        }
        try {
            phoneBook1.updateRecord(record4);
            System.out.println(phoneBook1.getAllRecords());
            System.out.println("");
            //* phoneBook1.updateRecord(record5);
            //* System.out.println(phoneBook1.getAllRecords());
            //* System.out.println("");
            //* phoneBook1.updateRecord(record6);
        } catch (RecordNotFound | RecordNotValid e) {
            System.err.println(e.getMessage());
        }

        try {
            phoneBook1.deleteRecord(736921);
            System.out.println(phoneBook1.getAllRecords());
            System.out.println("");
            //* phoneBook1.deleteRecord(894672);
            //* System.out.println(phoneBook1.getAllRecords());
            //* System.out.println("");
        } catch (RecordNotFound e) {
            System.err.println(e.getMessage());
        }
    }
}
