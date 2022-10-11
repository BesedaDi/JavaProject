import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    public static ArrayList<Record> listPhoneBook;

    public PhoneBook(ArrayList<Record> listPhoneBook) {
        PhoneBook.listPhoneBook = listPhoneBook;
    }

    public List<Record> getAllRecords() {
        return listPhoneBook;
    }

    public void createRecord(Record record) throws PhoneNumberAlreadyExists{
        if(!(listPhoneBook.contains(record))) {
            listPhoneBook.add(record);
        } else {
            throw new PhoneNumberAlreadyExists("Запись уже существует");
        }
    }

    public void updateRecord(Record record) throws RecordNotFound, RecordNotValid {
        if (record.phoneNumber == null) {
            throw new RecordNotValid("Неверные данные");
        } else if (record.name == null) {
            throw new RecordNotValid("Неверные данные");
        }
        int i = 0;
        for (Record elem : listPhoneBook) {
            if (elem.id == record.id) {
                elem.name = record.name;
                elem.phoneNumber = record.phoneNumber;
                i ++;
            }
        }
        if (i == 0) {
            throw new RecordNotFound("Запись не найдена");
        }
    }

    public void deleteRecord(long id) throws RecordNotFound{
        int i = 0;
        for(Record elem: listPhoneBook) {
            if(elem.id == id) {
                listPhoneBook.remove(elem);
                i ++;
                break;
            }
        }
        if (i == 0) {
            throw new RecordNotFound("Такая запись не найдена");
        }
    }
}
