
public class Person {

/*
 * Design a class named Person and 
 * its two subclasses named Student and Employee. 
 * 
 * Make Faculty and Staff subclasses of Employee. 
 * 
 * A person has a name, address, phone number, and email address. 
 * 
 * A student has a class status (freshman, sophomore, junior, or senior).
 * Define the status as a constant.
 * 
 * An employee has an office, salary, and date hired. 
 * Define a class named MyDate that contains the fields year, month, and day. 
 * 
 * A faculty member has office hours and a rank. A staff member has a title. 

 * Override the toString method in each class 
 * to display the class name and the person's name.

Draw the UML diagram for the classes. Write the code for the Student class only.

What to submit:

You should have three java classes (*.java) and one UML diagram. 
Zip all four files and submit 
Also, post to GitHub and post the link in the follow up (unscored) question.

 */

public Person(){
}
private String name;
private String address;
private String emailAddress;
private String phoneNumber;



public Person(String name, String address, String emailAddress, String phoneNumber){
	this.name = name;
	this.address = address;
	this.emailAddress = emailAddress;
	this.phoneNumber = phoneNumber;
	
}
public String getName(){     
	return name;   } 
public String getAddress(){     
	return address;   } 
public String getEmailAddress(){     
	return emailAddress;   } 
public String getPhoneNumber(){     
	return phoneNumber;   } 





}
	


