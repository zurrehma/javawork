package adressbook;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> Contacts=new ArrayList<Contact>();
    Scanner input=new Scanner(System.in);
    int answer;
    public void add(String fN,String lN,String ad,String zip,String pN) 
		{
    	
    		Contacts.add(new Contact(fN,lN,ad,zip,pN));
		}
    public void print()  {
    	for(int i=0;i<Contacts.size();i++)
    		{
    		    
    			System.out.println("first name"+"   "+Contacts.get(i).firstName);
    			System.out.println("last name "+"   "+Contacts.get(i).lastName);
    			System.out.println("address   "+"   "+Contacts.get(i).Address);
//    			System.out.println("zipcode   "+"   "+Contacts.get(i).zipCode);
//    			System.out.println("state     "+"   "+Contacts.get(i).State);
//    			System.out.println("city      "+"   "+Contacts.get(i).City);
//    			System.out.println("number    "+"   "+Contacts.get(i).phoneNumber);
    			System.out.println("   ");
    			System.out.println("   ");
    		}
    }
    public void deleteContact(String firstName){
     for(int i=0;i<Contacts.size();i++)
     {
    	 if(firstName.equals(Contacts.get(i).firstName))
    	 {
    		 Contacts.remove(i);
    		 break;
    	 }
     }
    }
//    public void sorting()
//    {
//    	for(int i=0;i<Contacts.size();i++)
//    	{
//    		
//    		 
//    		
//    	}
//    }
//   
//   
	public void editContact(String firstName,String lastName)
     {
    	 for(int i=0;i<Contacts.size();i++)
         {
        	 if((firstName.equals(Contacts.get(i).firstName) && (lastName.equals(Contacts.get(i).lastName))))
        	 {
        		 System.out.println("what you want to change");
        		 System.out.println("Enter 1 for address,2 for zipcode,3 for state,4 for city,5 for phone number");
        		 answer=input.nextInt();
        		 switch(answer)
        		 {
        		 case 1:
        		 {
        			 System.out.println("enter Address");
        			 input.nextLine();
        			 Contacts.get(i).Address=input.nextLine();
            		 break; 
        		 }
        		 case 2:
        		 {
        			 System.out.println("enter zip code");
        			 input.nextLine();
        			 Contacts.get(i).zipCode=input.nextLine();
            		 break; 
        		 }
        		 case 3:
        		 {
        			 System.out.println("enter state");
        			 input.nextLine();
        			 Contacts.get(i).State=input.nextLine();
            		 break; 
        		 }
        		 case 4:
        		 {
        			 System.out.println("enter new city name");
        			 input.nextLine();
        			 Contacts.get(i).City=input.nextLine();
            		 break; 
        		 }
        		 case 5:
        		 {
        			 System.out.println("enter new phone number");
        			 input.nextLine();
        			 Contacts.get(i).phoneNumber=input.nextLine();
            		 break; 
        		 }
        		  default:
        		 {
        			 System.out.println("sorry match not found");
        			 break;
        		 }
        		 }
        		
        		
        	 }
        	
        	 else
    		 {
        		 System.out.println("sorry match not found");
    		 }
     }
      
  }
public static void main(String[]   args)
    {
	   Scanner input=new Scanner(System.in);
    	//AddressBook obj=new AddressBook();
    	test addTest=new test();
    	addTest.frame.setVisible(true);
    	//addTest.initialize();
    	// addTest.test();
    	int ans=1;
    	int delans=1;
    	int inputs=0;
//    	do
//    	{
    		System.out.println("Enter 1 for add contact,2 for Delete contact");
//    		System.out.println("Enter 3 for edit contact,4 for termination");
//    		inputs=input.nextInt();
//    		switch(inputs)
//    		{
//    		case 1:
//    				{
//    					do
//    	    			{
//    	    				//obj.add();
//    	    				System.out.println("Do you want to add more contacts:enter 1 else enter 2");
//    	    				ans=input.nextInt();
//    	    				
//    	    			}while(ans==1);
//    					obj.print();
//    					break;
//    				}
//    		case 2:
//    				{
//    					do
//    						{
//    					System.out.println("enter F.N");
//    					input.nextLine();
//    			    	String firstName=input.nextLine();
//    			    	obj.deleteContact(firstName);
//    			    	obj.print();
//    			    	System.out.println("Do you want to delete more contacts:enter 1 else enter 2");
//    			    	 delans=input.nextInt();
//    						}while(delans == 1);
//    					break;
//    				}
//    		case 3:
//    				{
//    					
//    					System.out.println("enter F.N");
//    					input.nextLine();
//    			    	String firstName=input.nextLine();
//    			    	
//    			    	System.out.println("enter L.N");
//    			    	//input.nextLine();
//    			    	String lastName=input.nextLine();
//    			    	//input.nextLine();
//    			    	obj.editContact(firstName,lastName);
//    					obj.print();
//    					//input.nextLine();
//    				}
//    		}
//    		
//    		System.out.println("Do you want to d");
//    	
//    	
//    	}while(inputs!=4);
    }

}