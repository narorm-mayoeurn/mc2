package edu.mum.ea.dao.impl;

import org.springframework.stereotype.Repository;

import edu.mum.ea.dao.RoomDao;
import edu.mum.ea.domain.Room;

@Repository
public class RoomDaoImpl extends GenericDaoImpl<Room> implements RoomDao {

	public RoomDaoImpl() {
		super.setDaoType(Room.class);
	}
}