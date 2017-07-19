package edu.mum.ea.dao;

import edu.mum.ea.domain.Room;

import java.util.List;

public interface RoomDao extends GenericDao<Room>{

    List<Room> findRooms(Long accommodationId, boolean isAvailable);
}
