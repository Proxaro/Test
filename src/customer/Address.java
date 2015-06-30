package customer;

public class Address {
	private int zipCode;
	private String city;
	private String street;
	
	public Address(int zipCode, String city, String street){
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
}
