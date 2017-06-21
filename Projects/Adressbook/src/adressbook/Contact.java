package adressbook;
import java.util.Scanner;

public class Contact {
    public String firstName;
    public String lastName;
    public String Address;
    public String zipCode;
    public String State;
    public String City;
    public String phoneNumber;
    Scanner input=new Scanner(System.in);
    
    public Contact(String FN,String LN,String ad,String zip,String pN){
//    	System.out.println("enter first name");
        //firstName=input.nextLine();
//        System.out.println("enter last name");
//        lastName=input.nextLine();
//        System.out.println("enter address");
//        Address=input.nextLine();
//        System.out.println("enter zipcode");
//        zipCode=input.nextLine();
//        System.out.println("enter state");
//        State=input.nextLine();
//        System.out.println("enter city");
//        City=input.nextLine();
//        System.out.println("phone number");
//        phoneNumber=input.nextLine();
    	firstName=FN;
    	lastName=LN;
    	Address=ad;
    	zipCode=zip;
    	phoneNumber=pN;
    }


}
