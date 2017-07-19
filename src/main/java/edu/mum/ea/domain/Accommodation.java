package edu.mum.ea.domain;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import edu.mum.ea.domain.Address;
import edu.mum.ea.domain.Room;

import java.io.Serializable;
import java.util.List;

/**
 * Created by darith on 7/17/17.
 */

@Entity(name = "accommodations")
public class Accommodation implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "name", length = 100, nullable = false)
	private String name;

	@Email(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
	@Column(name = "email", nullable = false, unique = true)
	private String email;

	@Pattern(regexp = "\\d{10}")
	@Column(name = "phone", length = 10, nullable = false)
	private String phoneNumber;

	@NotEmpty
	@Column(name = "type", length = 20, nullable = false)
	private String type;

	@Column(name = "image")
	private String image;

	@Column(name = "logo")
	private String logo;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "accommodation_id")
	private List<Address> addresses;

	@OneToMany(mappedBy = "accommodation", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Room> rooms;

	@Transient
	private boolean isValid = false;

	public Accommodation() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public void setAddresses(Address address) {
		addresses.add(address);
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public void setRooms(Room room) {
		rooms.add(room);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean getIsValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
}