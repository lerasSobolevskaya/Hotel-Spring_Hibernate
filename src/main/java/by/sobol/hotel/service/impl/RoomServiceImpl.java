package by.sobol.hotel.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import by.sobol.hotel.dao.RoomDao;
import by.sobol.hotel.domain.Room;
import by.sobol.hotel.service.RoomService;

@Service("roomService")
public class RoomServiceImpl implements RoomService {

	private RoomDao roomDao;

	public void setRoomDao(RoomDao roomDao) {
		this.roomDao = roomDao;
	}

	@Override
	@Transactional
	public List<Room> getRoomList() {
		return roomDao.readAll();
	}

	@Override
	@Transactional
	public void updateRoom(Room room) {
		roomDao.update(room);
	}

	@Override
	@Transactional
	public void createRoom(Room room) {
		roomDao.create(room);
	}

	@Override
	@Transactional
	public Room readRoom(int id) {
		return roomDao.read(id);
	}

	@Override
	@Transactional
	public void deleteRoom(int id) {
		roomDao.delete(id);

	}

}
