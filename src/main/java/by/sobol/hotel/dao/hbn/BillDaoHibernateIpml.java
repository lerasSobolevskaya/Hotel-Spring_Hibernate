package by.sobol.hotel.dao.hbn;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import by.sobol.hotel.dao.BillDao;
import by.sobol.hotel.domain.Bills;

@Repository
@SuppressWarnings("unchecked")
public class BillDaoHibernateIpml implements BillDao {
	
	private SessionFactoryManager sessionFactory;

	public void setSessionFactory(SessionFactoryManager sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void create(Bills bill) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(bill);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public Bills read(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Bills bills = (Bills) session.get(Bills.class, id);
		return bills;
	}

	@Override
	public List<Bills> readAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Bills.class);
		return criteria.list();
	}

	@Override
	public void update(Bills bill) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(bill);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		Bills bill = (Bills) session.load(Bills.class, id);
		session.delete(bill);
		session.getTransaction().commit();
		session.close();
	}

}
