package edu.mum.ea.service;

import java.util.List;

import edu.mum.ea.domain.Accommodation;
import edu.mum.ea.domain.Room;

public interface AccommodationService {

	public void save(Accommodation accommodation);

	public void update(Accommodation accommodation);

	public List<Accommodation> findAll();

	public Accommodation findOne(Long id);

	public Accommodation findById(Long id);

	public void delete(Long id);

	List<Room> getRooms(Long accommodationId, boolean isAvailable);
}