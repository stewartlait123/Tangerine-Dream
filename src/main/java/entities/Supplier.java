package entities;

import java.math.BigInteger;

import javax.enterprise.inject.Default;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@ManyToOne
	@Column (name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger id;
	@NotNull
	@Size (min = 0)
	
	@Column (name = "active")
	@Default 
	private boolean active = true;

	public BigInteger getId() {
		return id;
	}
	
	public void setActive(boolean b) {
		active = b;
	}
}
