
public class Student extends Person{
	private String Class;
	
	private Student(){
		
	}
	
	public Student(String Class){
	if((((Class == "Freshman")||(Class == "Sophomore")||(Class == "Junior")||(Class == "Senior"))))
		this.Class = Class;
		
	}
	public String getClass(){     
		return Class;   } 

	}



