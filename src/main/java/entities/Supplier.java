package entities;

import java.math.BigInteger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 
 * 
 * @author Duncan Gillespie
 *
 */
@Entity 
@Table (name = "suppliers")
public class Supplier
{
	@Id
	@Column (name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger id;
	@NotNull
	@Size (min = 0)

	public BigInteger getId() {
		return id;
	}
}
