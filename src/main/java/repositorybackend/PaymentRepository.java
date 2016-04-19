/**
 * @author Stewart Lait
 */

package repositorybackend;

import java.util.ArrayList;

public interface PaymentRepository{
	public void persistPayment(Payment payment);
	public void persistPayments(ArrayList<Payment> payment);
	
	public Payment findByPaymentId(long id);
	public ArrayList<Payment> getPayments();
	
	public void updatePayment(Payment payment);
	public void removePayment(Payment payment);
	public void addPayment(Payment payment);
}