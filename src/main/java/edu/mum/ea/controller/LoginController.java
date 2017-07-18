package edu.mum.ea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import edu.mum.ea.domain.UserCredentials;
import edu.mum.ea.service.UserCredentialsService;

@Controller
@SessionAttributes("user")
public class LoginController {

	@Autowired
	UserCredentialsService credentialsService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/postLogin", method = RequestMethod.POST)
	public String PostLogin(UserCredentials credentials, Model model) {

		UserCredentials validCredentials;
		try {
			validCredentials = credentialsService.findByUserNamePassword(credentials.getUserName(),credentials.getPassword());
			if (validCredentials == null)
				return loginerror(model);
		} catch (Exception e) {
			return loginerror(model);
		}

		model.addAttribute("user", validCredentials.getUser());
		return "redirect:/welcome";
	}

	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	public String loginerror(Model model) {

		model.addAttribute("error", "true");
		return "login";

	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model, SessionStatus status) {
		status.setComplete();
		return "redirect:/welcome";
	}
}
