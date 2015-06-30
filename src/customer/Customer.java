package customer;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

//import com.sun.jndi.cosnaming.IiopUrl.Address;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ManagedBean
@SessionScoped
public class Customer {
	private String name;
	private String surname;
	
	private List<Address> addresses = new ArrayList<Address>(Arrays.asList(
			new Address(8052, "Zürich", "Federnstrasse"),
			new Address(3997, "Bellwald", "Imwinkelried")
		));
	
	public List<Address> getAddresses(){
		return addresses;
	}
	
	public void setAddresses(List<Address> addresses){
		this.addresses = addresses;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getSurname(){
		return surname;
	}
	public void setZipCode(String surname){
		this.surname = surname;
	}
}
