package by.sobol.hotel.dao.hbn;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import by.sobol.hotel.dao.OrderDao;
import by.sobol.hotel.domain.Order;

@Repository
@SuppressWarnings("unchecked")
public class OrderDaoHibernateImpl implements OrderDao {

	private SessionFactoryManager sessionFactory;

	public void setSessionFactory(SessionFactoryManager sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void create(Order order) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(order);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public Order read(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Order order = (Order) session.load(Order.class, id);
		return order;
	}

	@Override
	public List<Order> readAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Order.class);
		return criteria.list();
	}

	@Override
	public void update(Order order) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(order);
		session.getTransaction().commit();
	}

	@Override
	public void delete(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		Order order = (Order) session.load(Order.class, id);
		session.delete(order);
		session.getTransaction().commit();
		session.close();
	}

}
