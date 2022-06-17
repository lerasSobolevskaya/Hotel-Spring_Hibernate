package by.sobol.hotel.web.action.impl;

import static by.sobol.hotel.web.util.RequestParamValidator.validateUserLoginPass;
import static by.sobol.hotel.web.util.WebControllerConstatntPool.*;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import by.sobol.hotel.domain.User;
import by.sobol.hotel.service.RoomService;
import by.sobol.hotel.service.UserService;

@Controller
@RequestMapping(value = MAPPING_AUTHENTICATION)
public class CheckUserImpl {
	@Autowired
	private UserService userService;
	@Autowired
	private RoomService roomService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute(REQUEST_PARAM_ROOM_LIST, roomService.getRoomList());
		return PAGE_AUTHENTICATION;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView authentication(User user, Model model, HttpSession session) {
		validateUserLoginPass(user.getLogin(), user.getPass());
		user = userService.authorizeUser(user);
		if (user != null) {
			if (user.getRole().equals(ROLE_ADMIN)) {
				session.setAttribute(ATTRIBUTE_USER, user);
				model.addAttribute(REQUEST_PARAM_ROOM_LIST, roomService.getRoomList());
				return new ModelAndView(PAGE_ADMIN);
			} else if (user.getRole().equals(ROLE_USER)) {
				session.setAttribute(ATTRIBUTE_USER, user);
				model.addAttribute(REQUEST_PARAM_ROOM_LIST, roomService.getRoomList());
				return new ModelAndView(PAGE_USER);
			}
		} else {
			return new ModelAndView(PAGE_ERROR);
		}
		return new ModelAndView(PAGE_INDEX);

	}

}