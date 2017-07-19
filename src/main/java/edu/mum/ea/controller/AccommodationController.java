package edu.mum.ea.controller;

import java.util.List;
import java.util.Random;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.mum.ea.domain.Accommodation;
import edu.mum.ea.domain.Address;
import edu.mum.ea.domain.Room;
import edu.mum.ea.service.AccommodationService;

@Controller
@RequestMapping("/accommodations")
public class AccommodationController {

	@Autowired
	private AccommodationService accommodationService;

	@RequestMapping({ "/", "/all" })
	public String list(Model model) {
		List<Accommodation> accommodations = accommodationService.findAll();
		for (Accommodation item : accommodations) {
			if (!item.getAddresses().isEmpty() && !item.getRooms().isEmpty())
				item.setValid(true);
		}
		model.addAttribute("accommodations", accommodations);
		return "accommodationList";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteAccommodation(@RequestParam("accommodationId") Long accommodationId) {
		accommodationService.delete(accommodationId);
		return "redirect:/accommodations/";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getAddNewAccommodationForm(@ModelAttribute("accommodation") Accommodation accommodation) {
		return "accommodationEntry";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewAccommodationForm(
			@ModelAttribute("accommodation") @Valid Accommodation accommodationToBeAdded, BindingResult result) {
		if (result.hasErrors()) {
			return "accommodationEntry";
		}

		try {
			int randomNum = new Random().nextInt((10 - 1) + 1) + 1;
			accommodationToBeAdded.setImage(String.format("g%d.jpg", randomNum));
			accommodationService.save(accommodationToBeAdded);
		} catch (Exception up) {
			System.out.println("Transaction Failed!!!" + up.getMessage());
		}
		return "redirect:/accommodations/";
	}

	// ---------------------------- ADDRESS ----------------------------

	@RequestMapping({ "/address", "/address/all" })
	public String listAddress(Model model, @RequestParam("accommodationId") Long accommodationId) {
		Accommodation accommodation = accommodationService.findById(accommodationId);
		model.addAttribute("accommodationId", accommodationId);
		model.addAttribute("accommodationName", accommodation.getName());
		model.addAttribute("addresses", accommodation.getAddresses());
		return "addressList";
	}

	@RequestMapping(value = "/address/add", method = RequestMethod.GET)
	public String setAddressById(Model model, @RequestParam("accommodationId") Long accommodationId,
			@ModelAttribute("address") Address address) {
		Accommodation accommodation = accommodationService.findOne(accommodationId);
		model.addAttribute("accommodationId", accommodation.getId());
		return "addressEntry";
	}

	@RequestMapping(value = "/address/add", method = RequestMethod.POST)
	public String processAddNewAddressForm(@RequestParam("accommodationId") Long accommodationId,
			@ModelAttribute("address") @Valid Address addressToBeAdded, BindingResult result) {
		if (result.hasErrors()) {
			return "addressEntry";
		}

		try {
			Accommodation accommodation = accommodationService.findOne(accommodationId);
			accommodation.setAddresses(addressToBeAdded);
			accommodationService.update(accommodation);
		} catch (Exception up) {
			System.out.println("Transaction Failed!!!:" + up.getMessage());
		}
		return "redirect:/accommodations/address/all?accommodationId=" + accommodationId;
	}

	// ---------------------------- ROOM ----------------------------

	@RequestMapping({ "/room", "/room/all" })
	public String listRoom(Model model, @RequestParam("accommodationId") Long accommodationId) {
		Accommodation accommodation = accommodationService.findById(accommodationId);
		model.addAttribute("accommodationId", accommodationId);
		model.addAttribute("accommodationName", accommodation.getName());
		model.addAttribute("rooms", accommodation.getRooms());
		return "roomList";
	}

	@RequestMapping(value = "/room/add", method = RequestMethod.GET)
	public String setRoomById(Model model, @RequestParam("accommodationId") Long accommodationId,
			@ModelAttribute("room") Room room) {
		Accommodation accommodation = accommodationService.findOne(accommodationId);
		model.addAttribute("accommodationId", accommodation.getId());
		return "roomEntry";
	}

	@RequestMapping(value = "/room/add", method = RequestMethod.POST)
	public String processAddNewRoomForm(@RequestParam("accommodationId") Long accommodationId,
			@ModelAttribute("room") @Valid Room roomToBeAdded, BindingResult result) {
		if (result.hasErrors()) {
			return "roomEntry";
		}

		try {
			int randomNum = new Random().nextInt((4 - 1) + 1) + 1;
			roomToBeAdded.setImage(String.format("r%d.jpg", randomNum));
			
			Accommodation accommodation = accommodationService.findOne(accommodationId);
			roomToBeAdded.setAccommodation(accommodation);
			accommodation.setRooms(roomToBeAdded);
			accommodationService.update(accommodation);
		} catch (Exception up) {
			System.out.println("Transaction Failed!!!:" + up.getMessage());
		}
		return "redirect:/accommodations/room/all?accommodationId=" + accommodationId;
	}
}