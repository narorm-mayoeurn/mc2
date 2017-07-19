package edu.mum.ea.service;

import java.util.Date;
import java.util.List;

import edu.mum.ea.domain.Room;

public interface RoomService {

	public void save(Room room);

	public void update(Room room);

	public List<Room> findAll();

	public Room findOne(Long id);

	public Room findById(Long id);

	public List<Room> findAllAvailable(String roomType, Date startDate, Date endDate);
}