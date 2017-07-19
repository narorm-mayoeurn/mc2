package edu.mum.ea.dao.impl;

import org.springframework.stereotype.Repository;

import edu.mum.ea.dao.AccommodationDao;
import edu.mum.ea.domain.Accommodation;

@Repository
public class AccommodationDaoImpl extends GenericDaoImpl<Accommodation> implements AccommodationDao {

	public AccommodationDaoImpl() {
		super.setDaoType(Accommodation.class);
	}
}