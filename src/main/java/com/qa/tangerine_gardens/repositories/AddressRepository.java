//Created by Finley Peters @ Team Tang

package com.qa.tangerine_gardens.repositories;

import java.util.ArrayList;
import java.util.List;

import com.qa.tangerine_gardens.entities.Address;

public interface AddressRepository {
	
	public void persisBillingAddress (Address a);
	public void persistBillingAddresses(List<Address> a);
	
	public void persisDeliveryAddress (Address a);
	public void persistDeliveryAddresses(List<Address> a);
	
	public Address findBillingAddress(String s);
	public ArrayList<Address> getBillingAddresses();
	
	public Address findDeliveryAddress(String s);
	public ArrayList<Address> getDeliveryAddresses();
	
	public void addBillingAddress(Address a);
	
	public void addDeliveryAddress(Address a);
	
	public void removeBillingAddress(Address a);
	
	public void removeDeliveryAddress(Address a);
	
	public void updateBillingAddress(Address a);
	
	public void updateDeliveryAddress(Address a);	
	
}
