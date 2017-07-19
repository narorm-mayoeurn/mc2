package edu.mum.ea.dao.impl;

import org.springframework.stereotype.Repository;

import edu.mum.ea.dao.RoomDao;
import edu.mum.ea.domain.Room;

import javax.persistence.Query;
import java.util.List;

@Repository
public class RoomDaoImpl extends GenericDaoImpl<Room> implements RoomDao {

	public RoomDaoImpl() {
		super.setDaoType(Room.class);
	}

	@Override
	public List<Room> findRooms(Long accommodationId, boolean isAvailable) {
		Query query = entityManager.createQuery("from rooms r where r.accommodation.id = :accommodationId and r.isAvailable = :isAvailable");
		query.setParameter("accommodationId", accommodationId);
		query.setParameter("isAvailable", isAvailable);
		return query.getResultList();
	}
}