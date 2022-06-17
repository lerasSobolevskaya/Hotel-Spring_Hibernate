package by.sobol.hotel.dao.hbn;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import by.sobol.hotel.dao.UserDao;
import by.sobol.hotel.dao.util.AbstractDBDao;
import by.sobol.hotel.domain.User;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
@SuppressWarnings("unchecked")
public class UserDaoHibernateImpl extends AbstractDBDao implements UserDao {

	private SessionFactoryManager sessionFactory;

	public void setSessionFactory(SessionFactoryManager sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public User readUser(User userInto) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("login", userInto.getLogin()));
		criteria.add(Restrictions.eq("pass", userInto.getPass()));
		User user = (User) criteria.uniqueResult();
		session.close();
		return user;
	}
	@Override
	public void create(User user) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public User read(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		return (User) session.load(User.class, id);
	}

	@Override
	public List<User> readAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(User.class);
		return criteria.list();

	}

	@Override
	public void update(User user) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(user);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public void delete(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		User user = (User) session.get(User.class, id);
		session.delete(user);
		session.getTransaction().commit();
		session.close();
	}

	
}
