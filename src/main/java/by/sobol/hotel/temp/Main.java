package by.sobol.hotel.temp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.sobol.hotel.dao.RoomDao;
import by.sobol.hotel.dao.TypeDao;
import by.sobol.hotel.dao.UserDao;
import by.sobol.hotel.dao.hbn.RoomDaoHibernateImpl;
import by.sobol.hotel.dao.hbn.TypeDaoHibernateImpl;
import by.sobol.hotel.domain.Room;
import by.sobol.hotel.domain.Type;
import by.sobol.hotel.domain.User;
import by.sobol.hotel.service.RoomService;
import by.sobol.hotel.service.TypeService;
import by.sobol.hotel.service.impl.RoomServiceImpl;
import by.sobol.hotel.service.impl.TypeServiceImpl;

public class Main {

	public static void main(String[] args) {

		RoomDao roomDao = new RoomDaoHibernateImpl();
		System.out.println(roomDao.readAll());

	}

}
