package by.sobol.hotel.dao.hbn;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import by.sobol.hotel.dao.TypeDao;
import by.sobol.hotel.domain.Room;
import by.sobol.hotel.domain.Type;

@Repository
@SuppressWarnings("unchecked")
public class TypeDaoHibernateImpl implements TypeDao {

	private SessionFactoryManager sessionFactory;

	public void setSessionFactory(SessionFactoryManager sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void create(Type entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Type read(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Type type = (Type) session.get(Type.class, id);
		return type;
	}

	@Override
	public List<Type> readAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Criteria critera = session.createCriteria(Type.class);
		return critera.list();
	}

	@Override
	public void update(Type entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		Type type = (Type) session.load(Type.class, id);
		session.delete(type);
		session.getTransaction().commit();
		session.close();

	}

}
