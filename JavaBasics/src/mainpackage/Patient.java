package mainpackage;

import java.util.Scanner;

public class Patient extends Users {
	
Scanner scn = new Scanner(System.in);
	
	
	final String AMKA = null;
	
	Appointment A1 = new Appointment();
	
	
	
	//override constructor of superclass
	public Patient(String AMKA)
	{
		super(Users.getUsername(),Users.getPassword());
		System.out.println("AMKA : "+AMKA);
	}
	
	//methods
	public void setAppointment(String doctor)
	{
		System.out.println("Give day: ");
		A1.setDay(scn.nextInt());
		System.out.println("Give month: ");
		A1.setMonth(scn.nextInt());
		System.out.println("Give year: ");
		A1.setYear(scn.nextInt());
		System.out.println("You have an appointment with doctor "+doctor+" at " +A1.date());
	}
}



