package by.sobol.hotel.service;

import java.util.List;

import by.sobol.hotel.domain.User;

public interface UserService {

	User authorizeUser(User user);

	void createUser(User user);

	User getUserById(int id);

	void deleteUser(int id);
	
	void updateUser(User user);
	
	List<User> getAllUsers();

	
}
