package by.sobol.hotel.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import by.sobol.hotel.dao.OrderDao;
import by.sobol.hotel.domain.Order;
import by.sobol.hotel.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	private OrderDao orderDao;

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	@Transactional
	public List<Order> getListOrders() {
		return orderDao.readAll();
	}

	@Override
	@Transactional
	public void createOrder(Order order) {
		orderDao.create(order);

	}

	@Override
	@Transactional
	public void deleteOrder(int id) {
		orderDao.delete(id);

	}

	@Override
	@Transactional
	public void updateOrder(Order order) {
		orderDao.update(order);

	}

	@Override
	@Transactional
	public Order getOrderById(int id) {
		return orderDao.read(id);
	}

}