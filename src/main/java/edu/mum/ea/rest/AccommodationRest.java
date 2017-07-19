package edu.mum.ea.rest;

import edu.mum.ea.domain.Accommodation;
import edu.mum.ea.domain.Room;
import edu.mum.ea.service.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by nm on 19/7/17.
 */
@RestController
@RequestMapping("/api/accommodations")
public class AccommodationRest {

    @Autowired
    private AccommodationService accommodationService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Accommodation> getAccommodations() {
        return accommodationService.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Accommodation getAccommodation(@PathVariable Long id) {
        return accommodationService.findById(id);
    }

    @RequestMapping(value = "{id}/rooms", method = RequestMethod.GET)
    public List<Room> getRooms(@PathVariable Long id, @RequestParam(defaultValue = "true") boolean isAvailable) {
        return accommodationService.getRooms(id, isAvailable);
    }
}
