import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    private boolean addNewContact(Contact contact){
        if (myContacts.indexOf(contact) < 0) {
            return true;
        }
        return false;
    }

    private boolean updateContact(Contact contact1, Contact contact2) {
        if(myContacts.indexOf(contact1) >=0 )
    }
}
