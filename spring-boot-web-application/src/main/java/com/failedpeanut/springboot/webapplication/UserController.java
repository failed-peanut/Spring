package com.failedpeanut.springboot.webapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("/users")
	public String getAllusers(Model model) {
		model.addAttribute("users", userService.getAllUsers());
		return "users";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteUser(@RequestParam int userId) {
		UserEntity user = userService.getUser(userId);
		userService.deleteUser(user);

		return "redirect:/users";
	}

	@RequestMapping(value = "/edituser", method = RequestMethod.GET)
	public ModelAndView editUser(@RequestParam int userId) {
		ModelAndView model = new ModelAndView("/users");
		UserEntity user = userService.getUser(userId);
		model.addObject("editUser", user);
		model.addObject("users", userService.getAllUsers());
		return model;
	}

	@RequestMapping(value = "/edituser", method = RequestMethod.POST)
	public String edituser(UserEntity userEntity) {
		UserEntity user = userService.getUser(userEntity.getId());
		user.setName(userEntity.getName());
		userService.saveUser(user);
		return "redirect:/users";
	}

	@RequestMapping(value = "/adduser", method = RequestMethod.POST)
	public ModelAndView adduser(UserEntity userEntity) {
		ModelAndView model = new ModelAndView("/users");
		if (userEntity.getName().trim().equalsIgnoreCase("")) {
			model.addObject("errorMsg", "Name is Empty! Please Enter Valid Name!");
			model.addObject("users", userService.getAllUsers());
			return model;
		}
		userService.saveUser(userEntity);
		model.addObject("users", userService.getAllUsers());
		return model;
	}
}
