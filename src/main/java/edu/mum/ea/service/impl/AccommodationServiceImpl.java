package edu.mum.ea.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.ea.dao.AccommodationDao;
import edu.mum.ea.domain.Accommodation;

@Service
@Transactional
public class AccommodationServiceImpl implements edu.mum.ea.service.AccommodationService {

	@Autowired
	private AccommodationDao accommodationDao;

	public void save(Accommodation accommodation) {
		accommodationDao.save(accommodation);
	}

	public void update(Accommodation accommodation) {
		accommodationDao.update(accommodation);
	}

	public List<Accommodation> findAll() {
		return (List<Accommodation>) accommodationDao.findAll();
	}

	public Accommodation findOne(Long id) {
		return accommodationDao.findOne(id);
	}

	public Accommodation findById(Long id) {
		return accommodationDao.findById(id);
	}

	public void delete(Long id) {
		accommodationDao.delete(id);
	}
}