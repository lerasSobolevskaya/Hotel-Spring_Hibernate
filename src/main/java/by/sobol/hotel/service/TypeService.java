package by.sobol.hotel.service;

import java.util.List;

import by.sobol.hotel.domain.Type;

public interface TypeService {

	List<Type> getTypeList();
	
	Type getTypeById(int id);
}
