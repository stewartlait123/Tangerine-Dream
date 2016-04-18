// Created by Mohammed Miah
package implementations_offline;

import java.util.ArrayList;

import javax.inject.Inject;

import repositories.PaymentRepository;
import entities.*;
import dummy_data.InitialData;

public class PaymentRepositoryOffline implements PaymentRepository{
	@Inject
	private InitialData initialData;

	@Override
	public void persistPayment(Payment payment){
		initialData.addPayment(payment);
	}
	
	@Override
	public void persistPayments(ArrayList<Payment> payments){
		initialData.setPayments(payments);
	}
	
	@Override
	public Payment findByPaymentId(long id){
		ArrayList<Payment> paymentList = initialData.getPayments();
		Payment payment = null;
		
		for(int i = 0; i < paymentList.size(); i++) {
			if(paymentList.get(i).getPayment_id() == id){
				payment = paymentList.get(i);
				break;
			}
		}
		
		return payment;
	}
	
	@Override
	public ArrayList<Payment> getPayments(){
		return initialData.getPayments();
	}
	
	@Override
	public void updatePayment(Payment payment){
		ArrayList<Payment> paymentList = initialData.getPayments();
		
		for(int i=0; i < paymentList.size(); i++) {
			if(paymentList.get(i).getPayment_id() == payment.getPayment_id())
				paymentList.set(i, payment);
		}
		
		initialData.setPayments(paymentList);
	}
	
	@Override
	public void removePayment(Payment payment){
		ArrayList<Payment> paymentList = initialData.getPayments();
		
		for(int i=0; i < paymentList.size(); i++) {
			if(paymentList.get(i).getPayment_id() == payment.getPayment_id())
				paymentList.remove(i);
		}
		
		initialData.setPayments(paymentList);
	}
	
	@Override
	public void addPayment(Payment payment){
		initialData.addPayment(payment);
	}
}
