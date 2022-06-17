package by.sobol.hotel.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import by.sobol.hotel.dao.UserDao;
import by.sobol.hotel.domain.User;
import by.sobol.hotel.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	@Transactional
	public User authorizeUser(User user) {
		user = new User(user.getLogin(), user.getPass());
		return userDao.readUser(user);
	}

	@Override
	@Transactional
	public void createUser(User user) {
		userDao.create(user);
	}

	@Override
	@Transactional
	public User getUserById(int id) {
		return userDao.read(id);
	}

	@Override
	@Transactional
	public void deleteUser(int id) {
		userDao.delete(id);
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		userDao.update(user);
	}

	@Override
	@Transactional
	public List<User> getAllUsers() {
		return userDao.readAll();
	}
}
