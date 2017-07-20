package edu.mum.ea.dao;

import edu.mum.ea.domain.Room;


import java.util.Date;
import java.util.List;

public interface RoomDao extends GenericDao<Room>{

    List<Room> findRooms(Long accommodationId, boolean isAvailable);
    public List<Room> findAllAvailable(String roomType, Date startDate, Date endDate);

}
