package by.sobol.hotel.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bills")
public class Bills implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5782994278570273532L;

	@Id
	@Column(name = "bill_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "user_id")
	private User user;

	@Column(name = "room_id")
	private Room room;

	@Column(name = "price")
	private int price;

	@Column(name = "is_paid")
	private String isPaid;

	public Bills() {
	}

	public Bills(int id, User user, Room room, int price, String isPaid) {
		super();
		this.id = id;
		this.user = user;
		this.room = room;
		this.price = price;
		this.isPaid = isPaid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIsPaid() {
		return isPaid;
	}

	public void setIsPaid(String isPaid) {
		this.isPaid = isPaid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((isPaid == null) ? 0 : isPaid.hashCode());
		result = prime * result + price;
		result = prime * result + ((room == null) ? 0 : room.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Bills other = (Bills) obj;
		if (id != other.id)
			return false;
		if (isPaid == null) {
			if (other.isPaid != null)
				return false;
		} else if (!isPaid.equals(other.isPaid))
			return false;
		if (price != other.price)
			return false;
		if (room == null) {
			if (other.room != null)
				return false;
		} else if (!room.equals(other.room))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "user_id" + user + " room_id " + room + " price " + price + " isPaid " + isPaid;
	}

}
