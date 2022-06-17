package by.sobol.hotel.web.action.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import by.sobol.hotel.domain.User;
import by.sobol.hotel.service.UserService;
import static by.sobol.hotel.web.util.WebControllerConstatntPool.*;

@Controller
@RequestMapping(MAPPING_CRUD_USER)
public class CrudUserImpl {

	@Autowired
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listUsers(Model model) {
		model.addAttribute(REQUEST_PARAM_USER_LIST, userService.getAllUsers());
		return PAGE_USER_OPERATIONS;
	}

	@RequestMapping(MAPPING_DELETE)
	public String deleteUser(@PathVariable int id, Model model) {
		userService.deleteUser(id);
		model.addAttribute(REQUEST_PARAM_USER_LIST, userService.getAllUsers());
		return REDIRECT_TO_CRUD_USER;
	}

	@RequestMapping(value = MAPPING_CREATE_USER)
	public ModelAndView createUser() {
		return new ModelAndView(PAGE_CREATE_USER, ACTION_COMMAND, new User());
	}

	@RequestMapping(value = MAPPING_USER_SAVE, method = RequestMethod.POST)
	public ModelAndView userSave(Model model, @ModelAttribute(ATTRIBUTE_USER) User user) {
		userService.createUser(user);
		return new ModelAndView(REDIRECT_TO_CRUD_USER);
	}

	@RequestMapping(value = MAPPING_UPDATE_USER)
	public ModelAndView updateUser(@PathVariable int id) {
		User user = userService.getUserById(id);
		return new ModelAndView(PAGE_FORM_UPDATE_USER, ACTION_COMMAND, user);
	}

	@RequestMapping(value = MAPPING_UPDATE_USER_SAVE, method = RequestMethod.POST)
	public ModelAndView updateSave(@ModelAttribute(ATTRIBUTE_USER) User user, Model model) {
		userService.updateUser(user);
		model.addAttribute(REQUEST_PARAM_USER_LIST, userService.getAllUsers());
		return new ModelAndView(REDIRECT_TO_CRUD_USER);
	}

	@RequestMapping(MAPPING_GET_USER)
	public ModelAndView getUser(@PathVariable int id, Model model) {
		model.addAttribute(ATTRIBUTE_USER, userService.getUserById(id));
		return new ModelAndView(PAGE_GET_USER);
	}
}
