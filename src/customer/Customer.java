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
	private List<Address> addresses = new ArrayList<Address>(Arrays.asList(
			new Address(8052, "Z�rich", "Federnstrasse", "Fredi", "Krueger"),
			new Address(3997, "Bellwald", "Imwinkelried", "Milla", "Fair")
		));
	
	public List<Address> getAddresses(){
		return addresses;
	}
	
	public void setAddresses(List<Address> addresses){
		this.addresses = addresses;
	}
}
