package by.sobol.hotel.dao.util;

public abstract class AbstractDBDao {

	protected static final String SQL_SELECT_USER = "SELECT user_id,login,role FROM users WHERE login=?";
	
}
