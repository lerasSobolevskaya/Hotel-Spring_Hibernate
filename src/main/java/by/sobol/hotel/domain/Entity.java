package by.sobol.hotel.domain;

import java.io.Serializable;

/**
 * 
 * @author Sobolevskaya
 *
 */
public abstract class Entity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1744863263135996356L;
	private int id;

	/**
	 * 
	 */
	public Entity() {
	}

	/**
	 * 
	 * @param id
	 */
	public Entity(int id) {
		super();
		this.id = id;
	}

	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Entity other = (Entity) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
