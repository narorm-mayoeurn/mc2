package edu.mum.ea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("user")
public class LoginController {

	@Autowired
	AuthenticationManager authenticationManager;

	@RequestMapping(value = "/postLogin", method = RequestMethod.POST)
	public String PostLogin(@RequestParam String userName, @RequestParam String password,  Model model) {
		
		try {
			Authentication req = new UsernamePasswordAuthenticationToken(userName, password);
			Authentication res = authenticationManager.authenticate(req);
			SecurityContextHolder.getContext().setAuthentication(res);
		} catch (AuthenticationException e) {
			model.addAttribute("error", "true");
			return "home";
		}
		model.addAttribute("user", userName);
		return "redirect:/booking-form";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model, SessionStatus status) {
		status.setComplete();
		return "redirect:/home";
	}
}
