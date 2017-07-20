package edu.mum.ea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("user")
public class LoginController {

	@Autowired
	AuthenticationManager authenticationManager;

	@RequestMapping(value = "/postLogin", method = RequestMethod.POST)
	public @ResponseBody String PostLogin(@RequestParam String userName, @RequestParam String password, Model model) {
		
		try {
			Authentication req = new UsernamePasswordAuthenticationToken(userName, password);
			Authentication res = authenticationManager.authenticate(req);
			SecurityContextHolder.getContext().setAuthentication(res);
			for (GrantedAuthority authority: res.getAuthorities())
				if (authority.getAuthority().equals("ROLE_ADMIN")) return "admin";
			return "normal";
		} catch (AuthenticationException e) {
			SecurityContextHolder.getContext().setAuthentication(null);
			return "error";
		}
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model, SessionStatus status) {
		status.setComplete();
		return "home";
	}
}
