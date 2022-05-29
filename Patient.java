import java.time.LocalDate;
import java.util.Scanner;

public class Patient {
	private String name;
	private int healthCardNumber;
	private LocalDate birthDate;
	
	Scanner input = new Scanner(System.in);

	public Patient () {
		
		this.name="unknown" ;
		healthCardNumber = -9;
		birthDate = LocalDate.now();
		
		

	}

	public Patient (String name , int healthCardNumber , LocalDate birthDate) {
		
		this.name=name ;
		this.healthCardNumber = healthCardNumber;
		this.birthDate = birthDate;
		

	}
	
	 
	
	

	public String toString() {
		
		return "Name: "+name.toString() + "\nHealth Card Number: "+ Integer.toString(healthCardNumber) + "\nBirth Date: " + birthDate+"\n";
	}
	
	public String getName() {
		
		return name;
		}
	
	
	public int getFirstHealthCardNumber() {
		
		
		return healthCardNumber;
	}

}
