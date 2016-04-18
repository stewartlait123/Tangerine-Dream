//Created by Finley Peters @ Team Tang

package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Address;

public interface AddressRepository {
	
	public void persistBillingAddress (Address a);
	public void persistBillingAddresses(List<Address> a);
	
	public void persistDeliveryAddress (Address a);
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
