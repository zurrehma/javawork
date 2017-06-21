import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
/**
 * Created by Admin on 12/6/2016.
 */
public class AddressBook {
    ArrayList<Contact> Contacts=new ArrayList<Contact>(0);
    private int uniqueCode=0;
    private int TotalContact=0;
    Scanner input=new Scanner(System.in);
    public  static void main(String[] args){
        AddressBook check=new AddressBook();
        check.addContact();
    }

    public void addContact(){
        TotalContact++;
        Contacts.add(new Contact());
    }
    public void deleteContact(){
        TotalContact--;
        Contacts.remove(0);
    }
    public void editContact(char button,int n){
        switch (button){
            case 'a':
            case 'A':
                Contacts.get(n).setAddress(input.next());
                break;
            case 'z':
            case 'Z':
                Contacts.get(n).setzipCode(input.next());
                break;
            case 's':
            case 'S':
                Contacts.get(n).setState(input.next());
                break;
            case 'c':
            case 'C':
                Contacts.get(n).setCity(input.next());
                break;
            case 'p':
            case 'P':
                Contacts.get(n).setphoneNumber(input.next());
        }
    }
    public void sortContact(){
        for(int i=0; i<TotalContact; i++){
            if(Contacts.get(i).getlastName().compareTo(Contacts.get(i+1).getlastName())>0){
                    Contact temp;
                    temp=Contacts.get(i);
                    Contacts.set(i,Contacts.get(i+1));
                    Contacts.set(i+1,temp);
            }
            else if(Contacts.get(i).getlastName().compareTo(Contacts.get(i+1).getlastName())==0) {
                if (Contacts.get(i).getfirstName().compareTo(Contacts.get(i + 1).getfirstName()) > 0) {
                    Contact temp;
                    temp = Contacts.get(i);
                    Contacts.set(i, Contacts.get(i + 1));
                    Contacts.set(i + 1, temp);
                }
                else if(Contacts.get(i).getfirstName().compareTo(Contacts.get(i + 1).getfirstName())==0){
                    if(Contacts.get(i).getzipCode().compareTo(Contacts.get(i + 1).getzipCode()) > 0){
                        Contact temp;
                        temp = Contacts.get(i);
                        Contacts.set(i, Contacts.get(i + 1));
                        Contacts.set(i + 1, temp);
                    }
                }
            }
        }
    }
    public void searchContact(){
        ArrayList<Contact> Search=new ArrayList<Contact>(0);
    }
}