package by.sobol.hotel.dao;

import by.sobol.hotel.domain.User;

public interface UserDao extends BaseDao<User> {

	User readUser(User user);
}
