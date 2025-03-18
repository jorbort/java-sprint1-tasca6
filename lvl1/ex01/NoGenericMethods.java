package lvl1.ex01;

public class NoGenericMethods {
	private String name;
	private String lastName;
	private String country;

	public NoGenericMethods(String name, String lastName, String country){
		this.name = name;
		this.lastName = lastName;
		this.country = country;
	}

	public String getName(){
		return this.name;
	}
	public String getLastName(){
		return this.lastName;
	}
	public String getCountry(){
		return this.country;
	}
	public void setName(String name){
		this.name = name;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;

	}
	public void setCountry(String  country){
		this.country = country;
	}
}
