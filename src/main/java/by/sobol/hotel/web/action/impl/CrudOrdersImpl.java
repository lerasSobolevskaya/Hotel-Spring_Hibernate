package by.sobol.hotel.web.action.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import by.sobol.hotel.domain.Order;
import by.sobol.hotel.service.OrderService;
import by.sobol.hotel.service.RoomService;
import by.sobol.hotel.service.TypeService;
import by.sobol.hotel.service.UserService;
import static by.sobol.hotel.web.util.WebControllerConstatntPool.*;

@Controller
@RequestMapping(MAPPING_CRUD_ORDERS)
public class CrudOrdersImpl {

	@Autowired
	private OrderService orderService;

	@Autowired
	private TypeService typeService;

	@Autowired
	private RoomService roomService;

	@Autowired
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}

	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listOrders(Model model) {
		model.addAttribute(ATTRIBUTE_ORDER, new Order());
		model.addAttribute(REQUEST_PARAM_ORDER_LIST, orderService.getListOrders());
		model.addAttribute(REQUEST_PARAM_TYPES_LIST, typeService.getTypeList());
		model.addAttribute(REQUEST_PARAM_ROOM_LIST, roomService.getRoomList());
		model.addAttribute(REQUEST_PARAM_USER_LIST, userService.getAllUsers());
		return PAGE_ORDER_OPERATIONS;
	}

	@RequestMapping(MAPPING_DELETE)
	public String deleteOrder(@PathVariable int id, Model model) {
		orderService.deleteOrder(id);
		model.addAttribute(REQUEST_PARAM_ORDER_LIST, orderService.getListOrders());
		return REDIRECT_TO_CRUD_ORDERS;
	}

	@RequestMapping(value = MAPPING_CREATE_ORDER)
	public ModelAndView createOrder(Model model) {
		model.addAttribute(REQUEST_PARAM_TYPES_LIST, typeService.getTypeList());
		return new ModelAndView(PAGE_CREATE_ORDER, ACTION_COMMAND, new Order());
	}

	@RequestMapping(value = MAPPING_ORDER_SAVE, method = RequestMethod.POST)
	public ModelAndView orderSave(@ModelAttribute(ATTRIBUTE_ORDER) Order order, Model model) {
		orderService.createOrder(order);
		model.addAttribute(REQUEST_PARAM_ORDER_LIST, orderService.getListOrders());
		return new ModelAndView(REDIRECT_TO_CRUD_ORDERS);
	}

	@RequestMapping(value = MAPPING_UPDATE_ORDER)
	public ModelAndView updateOrder(@PathVariable int id) {
		Order order = orderService.getOrderById(id);
		return new ModelAndView(PAGE_FORM_UPDATE_ORDER, ACTION_COMMAND, order);
	}
	@RequestMapping(value = MAPPING_UPDATE_ORDER_SAVE, method = RequestMethod.POST)
	public ModelAndView updateSave(@ModelAttribute(ATTRIBUTE_ORDER) Order order, Model model) {
		orderService.updateOrder(order);
		model.addAttribute(REQUEST_PARAM_ORDER_LIST, orderService.getListOrders());
		return new ModelAndView(REDIRECT_TO_CRUD_ORDERS);
	}
	@RequestMapping(MAPPING_GET_ORDER)
	public ModelAndView getOrder(@PathVariable int id, Model model) {
		model.addAttribute(ATTRIBUTE_ORDER, orderService.getOrderById(id));
		return new ModelAndView(PAGE_GET_ORDER);
	}
}
