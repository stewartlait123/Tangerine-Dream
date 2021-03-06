package com.qa.tangerinedream.service;

//service to link with muley mule

/**
 * Service to send over the form information from webpage to mule
 */
import static javax.jms.Session.AUTO_ACKNOWLEDGE;

import javax.ejb.Stateless;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

@Stateless
public class CreditApplicationService {
	private Context context = null;
	private QueueConnectionFactory connectionFactory = null;
	private QueueConnection connection = null;
	private Queue queue = null;
	private QueueSession session = null;
	private QueueSender queueSender = null;

	public void sendApplication(String surname, String first_name, String date_of_birth, String home_address,
			String time_at_address, String place_of_birth, String type_of_proof, String proof_number,
			String employer_name, String employer_address, String time_with_employer, String type_of_employment,
			String bank_name, String time_with_bank, String account_number, String sort_code, String card_name,
			String card_number, String expiry_date, String cvs, String bank_address) {
	
		//JMS sender for mule to pick up 
		//send ip address and port to mule
		CreditApplicationApplication thing = new CreditApplicationApplication(surname, first_name, date_of_birth, home_address,
				time_at_address,  place_of_birth,  type_of_proof,  proof_number,
				employer_name,  employer_address,  time_with_employer,  type_of_employment,
				bank_name,  time_with_bank,  account_number,  sort_code,  card_name,
				card_number,  expiry_date,  cvs,  bank_address);
		try {
			context = new InitialContext();
			connectionFactory = (QueueConnectionFactory) context.lookup("ConnectionFactory");
			queue = (Queue) context.lookup("queue1");
			connection = connectionFactory.createQueueConnection();
			session = connection.createQueueSession(false, AUTO_ACKNOWLEDGE);
			queueSender = session.createSender(queue);
			ObjectMessage oM = session.createObjectMessage();
			oM.setObject(thing);
			connection.start();
			queueSender.send(oM);
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (JMSException e) {
			e.printStackTrace();
		} finally {
			if (context != null) {
				try {
					context.close();
				} catch (NamingException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (JMSException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
