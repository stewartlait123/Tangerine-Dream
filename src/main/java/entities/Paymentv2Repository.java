/**
 * @author Stewart
 */

package entities;

import java.util.List;
import java.util.ArrayList;

import entities.Paymentv2;


public interface Paymentv2Repository {
	
	public void persistPayment (Paymentv2 p);
	public void persistPayment (List<Paymentv2> p);
	
	public Paymentv2 findByPaymentID(int id);
	public ArrayList<Paymentv2> getPayment();
	
	public void updatePaymentv2 (Paymentv2 p);
		
	

}
