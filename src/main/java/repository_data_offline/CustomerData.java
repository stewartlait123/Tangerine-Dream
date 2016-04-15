package repository_data_offline;

import java.util.ArrayList;
import java.util.Date;

import javax.ejb.Singleton;

import com.qa.tangerine_gardens.entities.Customer;


@Singleton
public class CustomerData {
	
	private ArrayList<Customer> customers = 
			new ArrayList<Customer>();
	
	public void initialData(){
		
		
		customers.add(new Customer(new Long( 1) ,"John Doe", "BigJohn", "johnPassword", new Date() ,67 , 100));	
		customers.add(new Customer(new Long( 1) ,"James Crisps", "GoldenWonder", "crisps00001", new Date() ,15099 , 12000));
		customers.add(new Customer(new Long( 1) ,"Billy Kitten", "LifeIsPointless", "rootin_tootin", new Date() ,0 , 0));
		customers.add(new Customer(new Long( 1) ,"Henry Gobble", "TurkeyMaster", "Innocent", new Date() ,6599 , 50000));
		customers.add(new Customer(new Long( 1) ,"Jane Sniff", "Hoot", "Lovely_Day_1969", new Date() , 50020 , 600000));
	}
	
	public ArrayList<Customer> getCustomers()
	{
		return customers;
	}
	
	public void addCustomer(Customer customer)
	{
		customers.add(customer);
	}
	
	public void setCustomers(ArrayList<Customer> customerList)
	{
		customers = customerList;
	}

}
