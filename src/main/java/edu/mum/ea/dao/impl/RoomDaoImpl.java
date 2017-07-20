package edu.mum.ea.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.mum.ea.dao.RoomDao;
import edu.mum.ea.domain.Room;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Date;
import java.util.List;

@Repository
public class RoomDaoImpl extends GenericDaoImpl<Room> implements RoomDao {


	public RoomDaoImpl() {
		super.setDaoType(Room.class);
	}

	public List<Room> findRooms(Long accommodationId, boolean isAvailable) {
		Query query = entityManager.createQuery("from rooms r where r.accommodation.id = :accommodationId and r.isAvailable = :isAvailable");
		query.setParameter("accommodationId", accommodationId);
		query.setParameter("isAvailable", isAvailable);
		return query.getResultList();
    }

	public List<Room> findAllAvailable(String roomType, Date startDate, Date endDate) {
		String sql = "select distinct r from rooms r, accommodations a where r.isAvailable = :available";

		if(roomType != null && !roomType.isEmpty()) {
			sql += " and r.type = :roomType";
		}

		Query query = super.entityManager.createQuery(sql);
		query.setParameter("available", true);

		if(roomType != null && !roomType.isEmpty()) {
			query.setParameter("roomType", roomType);
		}


		return query.getResultList();
	}
}