package com.qa.tangerinedream.repositories.offline;

import java.util.ArrayList;

import javax.inject.Inject;

import repositorybackend.InitialData;

import com.qa.tangerinedream.entities.Address;
import com.qa.tangerinedream.repositories.AddressRepository;


/**
 * @author Finley Peters TeamTang 2016
 *
 */
public class AddressRepositoryOffline
implements AddressRepository
{
	@Inject
	private InitialData initialData;

	@Override
	public void persistAddress(Address address_)
	{
		initialData.addAddress(address_);
	}
	
	@Override
	public void persistAddresses(ArrayList<Address> address_)
	{
		initialData.addAddresses(address_);
	}

	@Override
	public Address findBillingAddress(String searchString) {
		// TODO Auto-generated method stub
		
		ArrayList<Address> searchList = initialData.getAddresses();
		
		for(int i = 0; i < searchList.size() ; i++)
		{
			if(searchList.get(i).getBilling_address().equals(searchString))
			{
				return searchList.get(i);
			}
		}		
		return null;
	}

	@Override
	public ArrayList<String> getBillingAddresses() {
		// TODO Auto-generated method stub
		
		ArrayList<Address> searchList = initialData.getAddresses();
		ArrayList<String> resultList = new ArrayList<String>();
		for (int i = 0 ; i < searchList.size(); i++)
		{
			//Adds each billing address string to the result list
			resultList.add(searchList.get(i).getBilling_address());
		}
		
		return resultList;		
	}

	@Override
	public Address findDeliveryAddress(String searchString) {
		// TODO Auto-generated method stub
		
		ArrayList<Address> searchList = initialData.getAddresses();
		
		for(int i = 0; i < searchList.size() ; i++)
		{
			if(searchList.get(i).getDelivery_address().equals(searchString))
			{
				return searchList.get(i);
			}
		}		
		return null;
	}

	@Override
	public ArrayList<String> getDeliveryAddresses() {
		// TODO Auto-generated method stub
		ArrayList<Address> searchList = initialData.getAddresses();
		ArrayList<String> resultList = new ArrayList<String>();
		for (int i = 0 ; i < searchList.size(); i++)
		{
			//Adds each deliveryif address string to the result list
			resultList.add(searchList.get(i).getDelivery_address());
		}
		
		return resultList;		
	}

	@Override
	public void setBillingAddress(Long id_, Address address_) {
		// TODO Auto-generated method stub

		ArrayList<Address> searchList = initialData.getAddresses();
		
		for(int i = 0; i < searchList.size() ; i++)
		{
			if(searchList.get(i).getCustomercustomer_id() == id_)
			{
				Address newDetails = searchList.get(i);
				newDetails.setBilling_address(address_.getBilling_address());
				initialData.setBillingAddress(newDetails);
			}
		}	
	}

	@Override
	public void setDeliveryAddress(Long id_, Address address_) {
		// TODO Auto-generated method stub

		ArrayList<Address> searchList = initialData.getAddresses();
		
		for(int i = 0; i < searchList.size() ; i++)
		{
			if(searchList.get(i).getCustomercustomer_id() == id_)
			{
				Address newDetails = searchList.get(i);
				newDetails.setDelivery_address(address_.getDelivery_address());
				initialData.setDeliveryAddress(newDetails);
			}
		}	
	}
}
