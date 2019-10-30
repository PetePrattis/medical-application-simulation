package mainpackage;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.net.*;
import java.nio.charset.Charset;

public class CreateUsers {
	public static void main(String[] args) {		
		
		System.out.println("If you are a patient input 'p', if you are admin input 'a'");
		Scanner input = new Scanner(System.in);
		String u = input.nextLine();		
		while(!Arrays.asList("p","a").contains(u)){
			System.out.println("That's not a user!");
			u = input.nextLine();
		}
		if("p".equals(u))
		{
			System.out.println("User is a Patient");
			System.out.println("Are you a new user? Yes 'y' or No 'n'?");
			String u1 = input.nextLine();		
			while(!Arrays.asList("y","n").contains(u1)){
				System.out.println("You must define if you are a new user or not!");
				u1 = input.nextLine();
			}
			Scanner scn = new Scanner(System.in);
			String i1,i2,i3,i4,i5,d;
			if("y".equals(u1)){
				System.out.println("Input name");
				i1 = scn.nextLine();
				System.out.println("Input surname");
				i2 = scn.nextLine();
				System.out.println("Input username");
				i3 = scn.nextLine();
				System.out.println("Input password");
				i4 = scn.nextLine();
				System.out.println("Input AMKA");
				i5 = scn.nextLine();
				String newUsertxt = i1 + " " + i2 + " " + i3 + " " + i4 + " " + i5;
				try{
				    PrintWriter writer = new PrintWriter("Patients.txt", "UTF-8");
				    writer.println(newUsertxt);
				    writer.close();
				} catch (IOException e) {
				   // do something
				}
				Users U1 = new Users(i3,i4);
				System.out.println("Input the information of the doctor you want to set an appointment with");
				System.out.println("Input name");
				d = scn.nextLine();
				Patient P1 = new Patient(i5);
				P1.setAppointment(d);
				U1.logout();
			}
			else if ("n".equals(u1)){
				System.out.println("Input username");
				i3 = scn.nextLine();
				System.out.println("Input password");
				i4 = scn.nextLine();
				
				String line;
				try (
				    InputStream fis = new FileInputStream("Patients.txt");
				    InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
				    BufferedReader br = new BufferedReader(isr);
				) {
					while ((line = br.readLine()) != null) {
					    String[] words = line.split(" ");
					}
				}
				catch(IOException e){}
				Users U1 = new Users(i3,i4);
				U1.logout();
				
			}
			
		}
		else if("a".equals(u))
		{
			System.out.println("User is an Administrator");
			System.out.println("Want to insert a new Doctor to the system? Yes 'y' or No 'n'?");
			String a = input.nextLine();		
			while(!Arrays.asList("y","n").contains(a)){
				System.out.println("Do you want ot insert new Doctor or not?");
				a = input.nextLine();
				
			}
			if("y".equals(a)){
				Scanner s = new Scanner(System.in);
				String dname, dsurname, dspecialty;
				System.out.println("Input name");
				dname = s.nextLine();
				System.out.println("Input surname");
				dsurname = s.nextLine();
				System.out.println("Input specialty (pathologist or oculist or orthopedic)");
				dspecialty = s.nextLine();
				while(!Arrays.asList("pathologist","oculist","orthopedic").contains(dspecialty)){
					System.out.println("Pick a valid specialty");
					dspecialty = s.nextLine();
				}
				Admin A1 = new Admin(dname,dsurname,dspecialty);
			}
		}
	}
		
		
		
		
		
}
	

