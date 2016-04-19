package repositorybackend;

//Created by Mohammed Miah and Umar

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Singleton;

import com.qa.tangerinedream.entities.Address;
import com.qa.tangerinedream.entities.Customer;
import com.qa.tangerinedream.entities.Employee;
import com.qa.tangerinedream.entities.Order;
import com.qa.tangerinedream.entities.OrderLine;
import com.qa.tangerinedream.entities.Payment;
import com.qa.tangerinedream.entities.Product;
import com.qa.tangerinedream.entities.ProductSupplier;
import com.qa.tangerinedream.entities.PurchaseOrder;
import com.qa.tangerinedream.entities.PurchaseOrderLine;
import com.qa.tangerinedream.entities.Supplier;

@Singleton
public class InitialData{
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	private ArrayList<Address> address = new ArrayList<Address>();
	private ArrayList<Order> Orders = new ArrayList<Order>();
	private ArrayList<OrderLine> OrderLine= new ArrayList<OrderLine>();
	private ArrayList<Payment> payment = new ArrayList<Payment>();
	private ArrayList<Product> products = new ArrayList<Product>();
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	private ArrayList<PurchaseOrder> purchaseOrders = new ArrayList<PurchaseOrder>();
	private ArrayList<PurchaseOrderLine> purchaseOrderLines = new ArrayList<PurchaseOrderLine>();
	private ArrayList<Supplier> supplier = new ArrayList<Supplier>();
	private ArrayList<ProductSupplier> productsupplier = new ArrayList<ProductSupplier>();
	
	public InitialData(){
		products.add(new Product(1, "pot", 100, 300, 10, 500, 1000, 100, 1000, "POTS"));
		
		//Creation of five entries to add into customer arraylist with unique values - Finley Peters @ TeamTang
		customers.add(new Customer(new Long( 1) ,"John Doe", "BigJohn", "johnPassword", new Date() ,67 , 100));	
		customers.add(new Customer(new Long( 2) ,"James Crisps", "GoldenWonder", "crisps00001", new Date() ,15099 , 12000));
		customers.add(new Customer(new Long( 3) ,"Billy Kitten", "LifeIsPointless", "rootin_tootin", new Date() ,0 , 0));
		customers.add(new Customer(new Long( 4) ,"Henry Gobble", "TurkeyMaster", "Innocent", new Date() ,6599 , 50000));
		customers.add(new Customer(new Long( 5) ,"Jane Sniff", "Hoot", "Lovely_Day_1969", new Date() , 50020 , 600000));
		
		//Creation of Address Dummy Data by Christine Stokes
		Customer customer_ID = new Customer();
		address.add(new Address("5 Linden Drive, Preston, PR54JL", "5 Linden Drive, Preston, PR54JL", customer_ID));
		address.add(new Address("50 Mandel Drive, Manchester, M354JL", "50 Mandel Drive, Manchester, M354JL", customer_ID));
		address.add(new Address("Walton Hall Paddock, Birmingham, B267hr", "Walton Hall Paddock, Birmingham, B267hr", customer_ID));
		
		//Creation of Order Dummy data by Christine Stokes
		
		Date currentDate = null;
		DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		try {
			currentDate = (Date) df.parse("15/04/2016");
		} catch (ParseException e) {
			System.out.println("Error in creating date!");
			e.printStackTrace();
		}
		Orders.add(new Order(1, currentDate, customer_ID));
		Orders.add(new Order(2, currentDate, customer_ID));
		Orders.add(new Order(3, currentDate, customer_ID));
	
	// Creation of Dummy Data for oderline by Christine Stokes
	Order orderID = new Order();
	Product productID = new Product(0, null, 0, 0, 0, 0, 0, 0, 0, null);
	
	OrderLine.add(new OrderLine(orderID, productID, 2));
	OrderLine.add(new OrderLine(orderID, productID, 1));
	OrderLine.add(new OrderLine(orderID, productID, 5));
	
	// Creation of Payment Dummy Data by Christine Stokes
	

	payment.add(new Payment(2, orderID, address.get(0), customer_ID));
	payment.add(new Payment(2, orderID, address.get(1), customer_ID));
	payment.add(new Payment(2, orderID, address.get(2), customer_ID));
	
	// Creation of Employee Dummy data by Christine
	
	employees.add(new Employee("daniel davison", 2, 3, true));
	employees.add(new Employee("Sarah Smith", 3, 3, true));
	employees.add(new Employee("Gordon First", 1, 2, false));
	
	// Creation of Purchase Order Dummy data Christine
	
	purchaseOrders.add(new PurchaseOrder(currentDate, employees.get(0)));
	purchaseOrders.add(new PurchaseOrder(currentDate, employees.get(1)));
	purchaseOrders.add(new PurchaseOrder(currentDate, employees.get(2)));
	
	// Creation of Purchase orderline data by Christine Stokes
	
	purchaseOrderLines.add(new PurchaseOrderLine(3, purchaseOrders.get(0)));
	purchaseOrderLines.add(new PurchaseOrderLine(2, purchaseOrders.get(1)));
	purchaseOrderLines.add(new PurchaseOrderLine(4, purchaseOrders.get(2)));
	
	// Creation of Supplier Dummy Data by Christine
	
	supplier.add(new Supplier());
	supplier.add(new Supplier());
	supplier.add(new Supplier());
	
	// Creation of Product Supplier Dummy data by Christine
	
	productsupplier.add(new ProductSupplier(supplier.get(0), productID));
	productsupplier.add(new ProductSupplier(supplier.get(1), productID));
	productsupplier.add(new ProductSupplier(supplier.get(2), productID));
	
	}
	// Products and Employee methods by Mohammed Miah
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
		return this.address;
	}

	public void addAddress(Address address){
		this.address.add(address);
	}

	public void setAddresses(ArrayList<Address> addressList){
		this.address = addressList;
	}
	

	// Added by Stewart
	public ArrayList<Payment> getPayments(){
		return payment;
	}

	public void addPayment(Payment payment){
		this.payment.add(payment);
	}

	public void setPayments(ArrayList<Payment> paymentList){
		payment = paymentList;
	}
	
	// Order data getter by Christine Stokes
	
	public List<Order>getOrders(){
		return Orders;

	}
	public void addOrder(Order order){
		Orders.add(order);
	}
	public void setOrder(List<Order> order) {
		Orders = (ArrayList<Order>) order;
	}

	public List<Order> getEntityList() {
		return Orders;
	}
	
	// Order Line getter etc added by Christine
	
	public List<OrderLine> getOrderLine(){
		return OrderLine;

	}
	public void addOrderLine(OrderLine orderline){
		OrderLine.add(orderline);
	}
	public void setOrderLine(List<OrderLine> orderline) {
		OrderLine = (ArrayList<OrderLine>) orderline;
	}

	public List<OrderLine> getEntityListOrderLine() {
		return OrderLine;
	}
	
	// Supplier getters added by Christine Stokes
	
	public List<Supplier>getSupplier(){
		return supplier;

	}
	public void addSupplier(Supplier supplier){
		this.supplier.add(supplier);
	}
	public void setSupplier(List<Supplier> supplier) {
		this.supplier = (ArrayList<Supplier>) supplier;
	}

	public List<Supplier> getEntityListSupplier() {
		return supplier;
	}
	
	// Product Supplier added by Christine Stokes
	
	public List<ProductSupplier>getProductSupplier(){
		return productsupplier;

	}
	public void addProductSupplier(ProductSupplier productsupplier){
		this.productsupplier.add(productsupplier);
	}
	public void setProductSupplier(List<ProductSupplier> productsupplier) {
		this.productsupplier = (ArrayList<ProductSupplier>) productsupplier;
	}

	public List<ProductSupplier> getEntityListProductSupplier() {
		return productsupplier;
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