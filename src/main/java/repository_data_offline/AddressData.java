package repository_data_offline;

import java.util.ArrayList;

@Singleton
public class AddressData
{
	
	private ArrayList<Address> addresses = 
			new ArrayList<Address>();
	
	
	public InitialData()
	{
		addresses.add(new Address())
	}

}
