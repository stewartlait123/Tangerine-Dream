package com.qa.tangerine_gardens.repository;

import entities.*;
import entities.Product.PRODUCT_TYPE;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Singleton;

@Singleton
public class InitialData{
	private ArrayList<Product> products = new ArrayList<Product>();
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	private ArrayList<Address> addresses = new ArrayList<Address>();
	
	public InitialData(){
		products.add(new Product(1, "pot", 100, 300, 10, 500, 1000, 100, 1000, PRODUCT_TYPE.POTS));
		
		//Creation of five entries to add into customer Arraylist with unique values - Finley Peters @ TeamTang
		customers.add(new Customer(new Long( 1) ,"John Doe", "BigJohn", "johnPassword", new Date() ,67 , 100));	
		customers.add(new Customer(new Long( 2) ,"James Crisps", "GoldenWonder", "crisps00001", new Date() ,15099 , 12000));
		customers.add(new Customer(new Long( 3) ,"Billy Kitten", "LifeIsPointless", "rootin_tootin", new Date() ,0 , 0));
		customers.add(new Customer(new Long( 4) ,"Henry Gobble", "TurkeyMaster", "Innocent", new Date() ,6599 , 50000));
		customers.add(new Customer(new Long( 5) ,"Jane Sniff", "Hoot", "Lovely_Day_1969", new Date() , 50020 , 600000));
	}

	public ArrayList<Product> getProducts(){
		return products;
	}


	public void addProduct(Product product){
		products.add(product);
	}

	public void setProducts(ArrayList<Product> products){
		this.products = products;
	}
	
	//Customer getters, setters and adder - Finley Peters @ TeamTang
	public ArrayList<Customer> getCustomers()
	{
		return customers;
	}
	
	public void setCustomer(Customer customer_)
	{
		for(int i = 0 ; i < customers.size() ; i++ )
		{
			if(customers.get(i).getCustomerId().equals(customer_.getCustomerId())) //Checks searched customers ID against records
			{
				customers.set(i, customer_); //Replaces old record with new, updated record
				return;
			}
		}
	}
	
	public void addCustomer(Customer customer_)
	{
		customers.add(customer_);
	}
	
	public void addCustomers(ArrayList<Customer> customers_)
	{
		customers.addAll(customers_);
	}
	
	public void removeCustomer(Customer customer_)
	{
		
		for(int i = 0 ; i < customers.size() ; i++ )
		{
			if(customers.get(i).getCustomerId().equals(customer_.getCustomerId())) //Checks searched customers ID against records
			{
				customers.remove(i);
				return;
			}
		}
	}
	
	public void setCustomers(ArrayList<Customer> customerList)
	{
		customers = customerList;
	}
	
	public ArrayList<Address> getAddresses()
	{
		return addresses;
	}
	
	public void addAddress(Address address_)
	{
		addresses.add(address_);
	}
	
	public void addAddresses(ArrayList<Address> address_)
	{
		addresses.addAll(address_);
	}
	
	public void setDeliveryAddress(Address address_) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i < customers.size() ; i++ )
		{
			if(customers.get(i).getCustomerId().equals(address_.getCustomercustomer_id())) //Checks searched customers ID against records
			{
				addresses.set(i, address_); //Replaces old record with new, updated record
				return;
			}
		}
	}


	public void setBillingAddress(Address address_) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i < customers.size() ; i++ )
		{
			if(customers.get(i).getCustomerId().equals(address_.getCustomercustomer_id())) //Checks searched customers ID against records
			{
				addresses.set(i, address_); //Replaces old record with new, updated record
				return;
			}
		}
	}
}