package mainpackage;

public class Admin extends Doctor {
	
	private static String dname;
	private static String dsurname;
	private static String dspecialty;
	
	public void setDoctorSpecialty(String doctorn,String doctors, String specialty)
	{
		System.out.println("Doctor " +doctorn+ " "+ doctors+ " by specialty is a " + specialty);
	}
	
	public String getDoctorSpecialty()
	{
		//we will have a database with the doctors and their specialties
		return null;
	}
	
	public Admin(String doctorn,String doctors, String specialty)
	{
		this.setName(doctorn);
		this.setSurname(doctors);
		this.setSpecialty(specialty);		
		setDoctorSpecialty(doctorn,doctors,specialty);
	}
	public void setName(String dname)
	{
		this.dname = dname;
	}
	
	public void setSurname(String dsurname)
	{
		this.dsurname = dsurname;
	}
	
	public void setSpecialty(String dspecialty)
	{
		this.dspecialty = dspecialty;
	}
}
