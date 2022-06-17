package by.sobol.hotel.service;

import java.util.List;

import by.sobol.hotel.domain.Order;

public interface OrderService {

	void createOrder(Order order);

	List<Order> getListOrders();
	
	void deleteOrder(int id);
	
	void updateOrder(Order order);
	
	Order getOrderById(int id);

}
