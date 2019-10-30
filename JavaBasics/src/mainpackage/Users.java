package mainpackage;

public class Users{

	private static String username;
	private static String password;
	private static String name;
	private static String surname;
	private static int counter = 0;
	
	//Set
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	
	
	//Get
	public static String getUsername()
	{
		return username;
	}
	
	public static String getPassword()
	{
		return password;
	}
	
	public static String getName()
	{
		return name;
	}
	
	public static String getSurname()
	{
		return surname;
	}
	
	
	//Login and logout methods
	public void login(String username, String password)
	{
		System.out.println("You are logged in.");
		System.out.println("Usenrame: " + username);
		System.out.println("Password: "+ password);
	}
	
	public void logout()
	{
		System.out.println("You are logged out");
	}
	
	//Constructors
	
	
	public Users(String username, String password)
	{
		this.setUsername(username);
		this.setPassword(password);
		this.setName(name);
		this.setSurname(surname);
		login(this.username, this.password);
	}
	public Users(String username, String password, String name, String surname)
	{
		this.setUsername(username);
		this.setPassword(password);
		this.setName(name);
		this.setSurname(surname);
		System.out.println("You are logged in, Full info.");
		System.out.println("Name: " + name);
		System.out.println("Surname: "+ surname);
		System.out.println("Usenrame: " + username);
		System.out.println("Password: "+ password);
	}
	public Users()
	{
		logout();
	}
	
}




