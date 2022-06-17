package by.sobol.hotel.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import by.sobol.hotel.dao.TypeDao;
import by.sobol.hotel.domain.Type;
import by.sobol.hotel.service.TypeService;

@Service("typeService")
public class TypeServiceImpl implements TypeService {
	
	private TypeDao typeDao;

	public void setTypeDao(TypeDao typeDao) {
		this.typeDao = typeDao;
	}

	@Override
	@Transactional
	public List<Type> getTypeList() {
		return typeDao.readAll();
	}

	@Override
	@Transactional
	public Type getTypeById(int id) {
		return typeDao.read(id);
	}

}
