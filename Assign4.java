import java.time.LocalDate;
import java.util.Scanner;

public class Assign4 {

	public static void main(String[] args) {

		int currentNumberOfPatients=0;
		final int maxNumberPatients=4;
		int userChoice;
		//		String name = "unknown";
		//		int healthCardNumber = -9;
		//		LocalDate birthDate = LocalDate.now();

		Patient p1 = new Patient ();
		Patient p2 = new Patient ("Sohrab Najafzadeh",3852,LocalDate.of(1994, 07, 22));

		Scanner input = new Scanner(System.in);

		Patient[]Patients=new Patient[maxNumberPatients];
		Patients[currentNumberOfPatients]=p2;
		currentNumberOfPatients++;
		do {
			System.out.print("\n\n**************************************\nMEDICAL CLINIC PATIENT TRACKER SYSTEM\n**************************************\n\n**************************\n1. ADD PATIENT\n2. LIST PATIENT\n3. SEARCH FOR PATIENT WITH HEALTH CARD NUMBER\n4. SEARCH FOR PATIENT WITH NAME\n5. EXIT\n**************************\n\n\nCHOICE: ");
			userChoice=input.nextInt();
			
			if(userChoice==1) {
				if(currentNumberOfPatients!=maxNumberPatients) {
				System.out.print("ENTER THE PATIENT'S NAME: ");
				input.nextLine();
				String name=input.nextLine();
				System.out.print("ENTER THE PATIENT'S HEALTH CARD NUMBER: ");
				int healthCardNumber=input.nextInt();
				System.out.print("THE PATIENT'S BIRTHDAY INFORMATION\nENTER YEAR: ");
				int year = input.nextInt();

				System.out.print("ENTER MONTH: ");
				int month = input.nextInt();

				System.out.print("ENTER DAY: ");
				int day = input.nextInt();

				LocalDate birthDate = LocalDate.of(year,month,day); 
				Patients [currentNumberOfPatients] = new Patient (name,healthCardNumber,birthDate);
				currentNumberOfPatients++;
				}else {
					System.out.println("NO MORE PATIENTS CAN BE ADDED\nYOU REACHED MAXIMUM NUMBER PATIENTS SET ");
				}
				
			}
			if(userChoice==2) {
				if(currentNumberOfPatients!=0) {
				for(int i = 0; i<Patients.length;i++) {
					if(i<currentNumberOfPatients) {
						System.out.println(Patients[i].toString().toUpperCase());//Patients[i].toString();
					}else {
						i=Patients.length;
					}
				
					
				}
				}else {
					System.out.println("\nTHERE ARE NO PATIENT IN SYSTEM ");
				}

			}
			if(userChoice==3) {
				String patientName=null;
				System.out.print("ENTER THE PAITENT'S HEALTH CARD NUMBER: ");
				input.nextLine();
				int searchHealthCardNumber = input.nextInt();
				
				boolean found = false;

				for(int i = 0; i<Patients.length;i++) {
					if(i<currentNumberOfPatients) {

					if(searchHealthCardNumber==(Patients[i].getFirstHealthCardNumber())) {
						patientName=Patients[i].toString().toUpperCase();
						found=true;
						i=Patients.length;
					}else {
						found = false;
						
					}
					}
				}
				if(found) {
					System.out.println(searchHealthCardNumber +" HEALTH CARD NUMBER IS IN THE SYSTEM.\nHERE IS PATIENT'S INFORMATION BELOW: \n"+patientName);
				}
				else {
					System.out.println(searchHealthCardNumber +"  HEALTH CARD NUMBER IS NOT IN THE SYSTEM");
				}




			}

			if(userChoice==4) {

				System.out.print("ENTER THE PAITENT'S NAME: ");
				input.nextLine();
				String searchName = input.nextLine();

				boolean found = false;

				for(int i = 0; i<Patients.length;i++) {
					if(i<currentNumberOfPatients) {

					if(searchName.equals(Patients[i].getName())) {
						found=true;
						i=Patients.length;
					}else {
						found = false;
						
					}
					}
				}
				if(found) {
					System.out.println(searchName +" is in the system ");
				}
				else {
					System.out.println(searchName +" is NOT in the system");
				}

			}

		}while(userChoice!=5);
		
		if(userChoice==5) {
			System.out.println("GOODBYE");
		}
		










	}

}



