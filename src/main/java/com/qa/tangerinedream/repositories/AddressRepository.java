//Created by Finley Peters @ Team Tang

package com.qa.tangerinedream.repositories;

import java.util.ArrayList;
import java.util.List;

import com.qa.tangerinedream.entities.Address;

public interface AddressRepository {
	
	/*
	 * Removed add/remove/update address functions as Address class does not
	 * support multiple delivery/billing address on each record.
	 * A set delivery/billing address method will encompass
	 * all uses. 
	
	public void persistBillingAddress (Address address_);
	public void persistBillingAddresses(List<Address> address_);
	
	public void persistDeliveryAddress (Address address_);
	public void persistDeliveryAddresses(List<Address> address_);
	 
	 */
	public void persistAddress(Address address_);
	
	public void persistAddresses(ArrayList<Address> address_);
	
	public Address findBillingAddress(String searchString);
	public ArrayList<String> getBillingAddresses();
	
	public Address findDeliveryAddress(String searchString);
	public ArrayList<String> getDeliveryAddresses();
	
	public void setBillingAddress(Long id_, Address address_);
	
	public void setDeliveryAddress(Long id_, Address address_);
	
	/*
	 * Removed add/remove/update address functions as Address class does not
	 * support multiple delivery/billing address on each record.
	 * A set delivery/billing address method will encompass
	 * all uses.
	 * 
	public void addBillingAddress(Long id_, Address address_);
	
	public void addDeliveryAddress(Long id_, Address address_);
	
	public void removeBillingAddress(Long id_, Address address_);
	
	public void removeDeliveryAddress(Long id_, Address address_);
	
	public void updateBillingAddress(Long id_, Address address_);
	
	public void updateDeliveryAddress(Long id_, Address address_);
	
	*/
	
}
