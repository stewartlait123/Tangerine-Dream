@Entity
@Table (name = "payment");

public class Payment {
	
	@ID
	@Column (name = "payment_id")
	@generatedValue ( strategy  =GenerationType.IDENTITY)
	private int payment_id;
	
	@Column (payementType = "payementType", nullable = false, length = 19)
	@NotNull
	private int payment_type;
	
	@Column (order_id = "order_id")
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@GeneratedValue
	
	@OneToOne
	@JoinColumn(name = "order_fk", nullable = true)
	private int order_id;
	
	@OneToMany (name = "address_fk", nullable = true)
	private int address_id;
	
	
	public PayementID()
	{
		return payement_id;
	}
	
	
	public PaymentType()
	{
		reutrn payment_Type;
	}
	
	//1 - 1
	public OrderID()
	{
		return order_id;
	}
	
	public AddressID()
	{
		return address_id;
	}

}
