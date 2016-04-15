package repository_data_offline;

import java.util.ArrayList;

import javax.inject.Singleton;

import com.qa.tangerine_gardens.entities.Customer;


@Singleton
public class CustomerData {
	
	private ArrayList<Customer> customers = 
			new ArrayList<Customer>();
	
	public void initialData(){
		
		customers.add(new Customer()
				);
		
		
		
	}

}
