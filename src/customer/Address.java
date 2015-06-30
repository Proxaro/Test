package customer;

public class Address {
	private int zipCode;
	private String city;
	private String street;
	private String name;
	private String surname;
	
	public Address(int zipCode, String city, String street, String name, String surname){
		this.name = name;
		this.zipCode = zipCode;
		this.city = city;
		this.street = street;
	}
	
	public int getZipCode(){
		return zipCode;
	}
	public void setZipCode(int zipCode){
		this.zipCode = zipCode;
	}
	//
	
	public String getCity(){
		return city;
	}
	public void setCity(String city){
		this.city = city;
	}
	//
	
	public String getStreet(){
		return street;
	}
	public void setStreet(String street){
		this.street = street;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	//
	public String getSurname(){
		return surname;
	}
	public void setZipCode(String surname){
		this.surname = surname;
	}
	//
}
