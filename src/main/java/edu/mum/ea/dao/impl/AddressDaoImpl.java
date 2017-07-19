package edu.mum.ea.dao.impl;

import org.springframework.stereotype.Repository;

import edu.mum.ea.dao.AddressDao;
import edu.mum.ea.domain.Address;

@Repository
public class AddressDaoImpl extends GenericDaoImpl<Address> implements AddressDao {

	public AddressDaoImpl() {
		super.setDaoType(Address.class);
	}
}