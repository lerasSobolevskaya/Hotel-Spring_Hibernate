package by.sobol.hotel.dao;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public interface BaseDao<T extends Serializable> {

	void create(T entity);

	T read(int id);

	List<T> readAll();

	void update(T entity);

	void delete(int id);

	default void closePS(PreparedStatement stm) {
		try {
			if (stm != null) {
				stm.close();
			}

		} catch (SQLException ex) {
			// LOG.warn("Can't close resultset: " + ex.getMessage());
		}
	}

	default void closeST(Statement st) {
		try {
			if (st != null) {
				st.close();
			}
		} catch (SQLException ex) {
			// LOG.warn("Can't close statement: " + ex.getMessage());
		}
	}

}
