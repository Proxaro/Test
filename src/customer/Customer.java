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
			new Address(8052, "Zürich", "Federnstrasse"),
			new Address(3997, "Bellwald", "Imwinkelried")
		));
	
	public List<Address> getAddresses(){
		return addresses;
	}
	
	
	public void setAddresses(List<Address> addresses){
		this.addresses = addresses;
	}
	
	
	private List<Kunde> kunden = new ArrayList<Kunde>(Arrays.asList(
			new Kunde("Fredi", "Hard"),
			new Kunde("Milla", "Moos")
		));
	
	public List<Kunde> getKunde(){
		return kunden;
	}
	
	public void setKunden(List<Kunde> kunden){
		this.kunden = kunden;
	}
	

}
