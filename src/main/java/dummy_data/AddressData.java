package dummy_data;

import java.util.ArrayList;

import javax.inject.Singleton;

import entities.Address;

@Singleton
public class AddressData
{
	
	private ArrayList<Address> addresses = 
			new ArrayList<Address>();
	
	
	public void InitialData()
	{
		addresses.add(new Address());
	}

}
