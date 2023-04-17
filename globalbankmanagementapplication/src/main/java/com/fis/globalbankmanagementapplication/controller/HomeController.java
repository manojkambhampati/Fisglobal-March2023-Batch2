package com.fis.globalbankmanagementapplication.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.fis.globalbankmanagementapplication.model.Users;
import com.fis.globalbankmanagementapplication.service.UsersService;

@Controller
public class HomeController {	
	@Autowired
	UsersService service;
	private String id;
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	@RequestMapping(value = "/test")
	public ModelAndView test(HttpServletRequest request) throws IOException {
		String uname = request.getParameter("lid");
		String passwd = request.getParameter("pwd");
		List<Users> users = service.getAllUsers();
		//System.out.println(users);
		boolean found = false;
		for (Users usr : users) {
			if (uname.equals(usr.getUsername()) && passwd.equals(usr.getPassword()) &&
					(usr.getRole()).equals("ROLE_USER")) {
				if(usr.getEnabled()==0)
					return new ModelAndView("not_enabled");
				found=true;
				return new ModelAndView("userlogin");
			}
			if (uname.equals(usr.getUsername()) && passwd.equals(usr.getPassword()) &&
					(usr.getRole()).equals("ROLE_ADMIN")) {
				if(usr.getEnabled()==0)
					return new ModelAndView("not_enabled");
				found=true;
				return new ModelAndView("adminlogin");
			}
		}
		return new ModelAndView("new_registration");
	
	}
	@RequestMapping(value = "/register")
	public void register(HttpServletRequest request) throws IOException {
		String idn=request.getParameter(id);
		String uname = request.getParameter("name");
		String passwd = request.getParameter("pwd");
		Users user = new Users(idn,uname, passwd,"ROLE_USER",1);
		service.register(user);
	}
}
