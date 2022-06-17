package by.sobol.hotel.dao.hbn;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import by.sobol.hotel.dao.RoomDao;
import by.sobol.hotel.domain.Room;

@Repository
@SuppressWarnings("unchecked")
public class RoomDaoHibernateImpl implements RoomDao {

	private SessionFactoryManager sessionFactory;

	public void setSessionFactory(SessionFactoryManager sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void create(Room room) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(room);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void update(Room room) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(room);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Room read(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		return (Room) session.load(Room.class, id);

	}

	@Override
	public List<Room> readAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Room.class);
		return criteria.list();

	}

	@Override
	public void delete(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		Room room = (Room) session.load(Room.class, id);
		session.delete(room);
		session.getTransaction().commit();
		session.close();
	}

}
