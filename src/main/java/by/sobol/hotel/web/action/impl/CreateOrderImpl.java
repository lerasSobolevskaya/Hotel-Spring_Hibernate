package by.sobol.hotel.web.action.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import by.sobol.hotel.domain.Order;
import by.sobol.hotel.domain.Room;
import by.sobol.hotel.domain.User;
import by.sobol.hotel.service.OrderService;
import by.sobol.hotel.service.RoomService;
import static by.sobol.hotel.web.util.WebControllerConstatntPool.*;

@Controller
@RequestMapping(MAPPING_ORDER)
public class CreateOrderImpl {

	@Autowired
	private RoomService roomService;

	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}

	@Autowired
	private OrderService orderService;

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main(Model model) {
		model.addAttribute(REQUEST_PARAM_ROOM_LIST, roomService.getRoomList());
		return PAGE_INFO_ABOUT_ROOMS;
	}

	@RequestMapping(MAPPING_USER_CREATE_ORDER)
	public ModelAndView chooseRoom(@PathVariable int id, Model model) {
		Room room = roomService.readRoom(id);
		return new ModelAndView(PAGE_USER_CREATE_ORDER, ACTION_COMMAND, room);
	}

	@RequestMapping(value = MAPPING_USER_ORDER_SAVE, method = RequestMethod.POST)
	public ModelAndView userOrderSave(@RequestParam(ATTRIBUTE_ID) int id, @ModelAttribute("order") Order order,
			Model model, HttpSession session, HttpServletRequest request) {
		User user = (User) session.getAttribute(ATTRIBUTE_USER);
		Room room = roomService.readRoom(id);
		orderService.createOrder(new Order(0, order.getStartDate(), order.getEndDate(), user, room));
		return new ModelAndView(REDIRECT_TO_ORDER);

	}
}
