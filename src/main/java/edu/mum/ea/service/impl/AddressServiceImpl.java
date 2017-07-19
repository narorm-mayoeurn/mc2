package edu.mum.ea.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.ea.dao.AddressDao;
import edu.mum.ea.domain.Address;

@Service
@Transactional
public class AddressServiceImpl implements edu.mum.ea.service.AddressService {

	@Autowired
	private AddressDao addressDao;

	public void save(Address address) {
		addressDao.save(address);
	}

	public void update(Address address) {
		addressDao.update(address);
	}

	public List<Address> findAll() {
		return (List<Address>) addressDao.findAll();
	}

	public Address findOne(Long id) {
		return addressDao.findOne(id);
	}

	public Address findById(Long id) {
		return addressDao.findById(id);
	}
}