
package dummy_data;

// Created by Mohammed Miah and Umar



import entities.*;
import entities.Product.PRODUCT_TYPE;

import java.util.ArrayList;
import java.util.Date;
import javax.ejb.Singleton;

@Singleton
public class InitialData{
	private ArrayList<Product> products = new ArrayList<Product>();
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	private ArrayList<Address> addresses = new ArrayList<Address>();
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	private ArrayList<PurchaseOrder> purchaseOrders = new ArrayList<PurchaseOrder>();
	private ArrayList<PurchaseOrderLine> purchaseOrderLines = new ArrayList<PurchaseOrderLine>();
	
	public InitialData(){
		products.add(new Product(1, "pot", 100, 300, 10, 500, 1000, 100, 1000, PRODUCT_TYPE.POTS));
		
		//Creation of five entries to add into customer arraylist with unique values - Finley Peters @ TeamTang
		customers.add(new Customer(new Long( 1) ,"John Doe", "BigJohn", "johnPassword", new Date() ,67 , 100));	
		customers.add(new Customer(new Long( 2) ,"James Crisps", "GoldenWonder", "crisps00001", new Date() ,15099 , 12000));
		customers.add(new Customer(new Long( 3) ,"Billy Kitten", "LifeIsPointless", "rootin_tootin", new Date() ,0 , 0));
		customers.add(new Customer(new Long( 4) ,"Henry Gobble", "TurkeyMaster", "Innocent", new Date() ,6599 , 50000));
		customers.add(new Customer(new Long( 5) ,"Jane Sniff", "Hoot", "Lovely_Day_1969", new Date() , 50020 , 600000));
	}

	// Products, Employee and Address methods by Mohammed Miah
	public ArrayList<Product> getProducts(){
		return this.products;
	}

	public void addProduct(Product product){
		this.products.add(product);
	}

	public void setProducts(ArrayList<Product> productList){
		this.products = productList;
	}

	public ArrayList<Employee> getEmployees(){
		return this.employees;
	}

	public void addEmployee(Employee employee){
		this.employees.add(employee);
	}

	public void setEmployees(ArrayList<Employee> employeeList){
		this.employees = employeeList;
	}

	public ArrayList<Address> getAddresses(){
		return this.addresses;
	}

	public void addAddress(Address address){
		this.addresses.add(address);
	}

	public void setAddresses(ArrayList<Address> addressList){
		this.addresses = addressList;
	}
	
	
	//Customer getters, setters and adder - Finley Peters @ TeamTang
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
	
	//PurchaseOrder methods - Muhammad Umar
	public ArrayList<PurchaseOrder> getPurchaseOrders()
	{
		return purchaseOrders;
	}
	
	public void addPurchaseOrder(PurchaseOrder purchaseOrder)
	{
		purchaseOrders.add(purchaseOrder);
	}
	
	public void setPurchaseOrders(ArrayList<PurchaseOrder> purchaseOrderList)
	{
		purchaseOrders = purchaseOrderList;
	}
	
	//PurchaseOrderLine methods - Muhammad Umar
	public ArrayList<PurchaseOrderLine> getPurchaseOrderLines()
	{
		return purchaseOrderLines;
	}
	
	public void addPurchaseOrderLine(PurchaseOrderLine purchaseOrderLine)
	{
		purchaseOrderLines.add(purchaseOrderLine);
	}
	
	public void setPurchaseOrderLines(ArrayList<PurchaseOrderLine> purchaseOrderLineList)
	{
		purchaseOrderLines = purchaseOrderLineList;
	}
}