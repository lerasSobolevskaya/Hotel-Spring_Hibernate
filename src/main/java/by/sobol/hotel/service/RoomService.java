package by.sobol.hotel.service;

import java.util.List;

import by.sobol.hotel.domain.Room;

public interface RoomService {

	List<Room> getRoomList();

	void updateRoom(Room room);

	void createRoom(Room room);

	Room readRoom(int id);

	void deleteRoom(int id);

}
