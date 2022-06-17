package by.sobol.hotel.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * 
 * @author Sobolevskaya
 *
 */
@Entity
@Table(name = "rooms")
public class Room implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1821976167596161901L;

	@Id
	@Column(name = "room_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "number")
	private Integer number;

	@Column(name = "price")
	private Integer price;

	@Column(name = "number_of_seats")
	private Integer numberOfSeats;

	@Column(name = "status")
	private String status;

	@Fetch(FetchMode.JOIN)
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "type_room", joinColumns = @JoinColumn(name = "room_id"), inverseJoinColumns = @JoinColumn(name = "type_id"))
	private Set<Type> types;

	public Room() {
	}

	public Room(Integer id, Integer number, Integer price, Integer numberOfSeats, String status, Set<Type> types) {
		super();
		this.id = id;
		this.number = number;
		this.price = price;
		this.numberOfSeats = numberOfSeats;
		this.status = status;
		this.types = types;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<Type> getTypes() {
		return types;
	}

	public void setTypes(Set<Type> types) {
		this.types = types;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + number;
		result = prime * result + numberOfSeats;
		result = prime * result + price;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((types == null) ? 0 : types.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (id != other.id)
			return false;
		if (number != other.number)
			return false;
		if (numberOfSeats != other.numberOfSeats)
			return false;
		if (price != other.price)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (types == null) {
			if (other.types != null)
				return false;
		} else if (!types.equals(other.types))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Number: " + number + " price " + price + " numberOfSeats " + numberOfSeats + " status " + status
				+ "types: " + types;
	}

}
