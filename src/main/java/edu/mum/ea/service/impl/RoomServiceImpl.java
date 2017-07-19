package edu.mum.ea.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.ea.dao.RoomDao;
import edu.mum.ea.domain.Room;

@Service
@Transactional
public class RoomServiceImpl implements edu.mum.ea.service.RoomService {

	@Autowired
	private RoomDao roomDao;

	public void save(Room room) {
		roomDao.save(room);
	}

	public void update(Room room) {
		roomDao.update(room);
	}

	public List<Room> findAll() {
		return (List<Room>) roomDao.findAll();
	}

	public Room findOne(Long id) {
		return roomDao.findOne(id);
	}

	public Room findById(Long id) {
		return roomDao.findById(id);
	}

	public List<Room> findAllAvailable(String roomType, Date startDate, Date endDate) {
		return roomDao.findAllAvailable(roomType, startDate, endDate);
	}
}