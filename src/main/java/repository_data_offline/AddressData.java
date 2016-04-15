package repository_data_offline;

import java.util.ArrayList;

import javax.inject.Singleton;

import com.qa.tangerine_gardens.entities.Address;

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
