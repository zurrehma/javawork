/**
 * Created by Admin on 12/6/2016.
 */
import java.util.Scanner;

public class Contact {
    private String firstName;
    private String lastName;
    private String Address;
    private String zipCode;
    private String State;
    private String City;
    private String phoneNumber;
    Scanner input=new Scanner(System.in);
//    public Contact(){
//        firstName=input.next();
//        lastName=input.next();
//        Address=input.next();
//        zipCode=input.next();
//        State=input.next();
//        City=input.next();
//        phoneNumber=input.next();
//    }

    public void setAddress(String Address){
        this.Address=Address;
    }
    public void setzipCode(String zipCode){
        this.zipCode=zipCode;
    }
    public void setState(String State){
        this.State=State;
    }
    public  void setCity(String City){
        this.City=City;
    }
    public void setphoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getfirstName(){
        return firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public String getAddress(){
        return Address;
    }
    public String getzipCode(){
        return zipCode;
    }
    public String getState(){
        return State;
    }
    public String getCity(){
        return City;
    }
    public String getphoneNumber(){
        return phoneNumber;
    }
}
