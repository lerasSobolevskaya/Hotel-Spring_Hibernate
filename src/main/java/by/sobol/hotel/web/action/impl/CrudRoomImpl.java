package by.sobol.hotel.web.action.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomCollectionEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import static by.sobol.hotel.web.util.WebControllerConstatntPool.*;
import static by.sobol.hotel.web.util.HttpRequestParamFormatter.formatInt;
import by.sobol.hotel.domain.Room;
import by.sobol.hotel.service.RoomService;
import by.sobol.hotel.service.TypeService;

@Controller
@RequestMapping(MAPPING_CRUD_ROOM)
public class CrudRoomImpl {

	@Autowired
	private RoomService roomService;

	@Autowired
	private TypeService typeService;

	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}

	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main(Model model) {
		model.addAttribute(REQUEST_PARAM_TYPES_LIST, typeService.getTypeList());
		model.addAttribute(REQUEST_PARAM_ROOM_LIST, roomService.getRoomList());
		return PAGE_ROOM_OPERATIONS;
	}

	@RequestMapping(MAPPING_DELETE)
	public String deleteRoom(@PathVariable int id, Model model) {
		roomService.deleteRoom(id);
		model.addAttribute(REQUEST_PARAM_ROOM_LIST, roomService.getRoomList());
		return REDIRECT_TO_CRUD_ROOM;
	}

	@RequestMapping(value = MAPPING_CREATE_ROOM)
	public ModelAndView formCreate(Model model) {
		model.addAttribute(REQUEST_PARAM_TYPES_LIST, typeService.getTypeList());
		return new ModelAndView(PAGE_CREATE_ROOM, ACTION_COMMAND, new Room());
	}

	@RequestMapping(value = MAPPING_CREATE, method = RequestMethod.POST)
	public ModelAndView roomSave(@ModelAttribute(ATTRIBUTE_ROOM) Room room, Model model) {
		model.addAttribute(REQUEST_PARAM_ROOM_LIST, roomService.getRoomList());
		model.addAttribute(REQUEST_PARAM_TYPES_LIST, typeService.getTypeList());
		roomService.createRoom(room);
		return new ModelAndView(REDIRECT_TO_CRUD_ROOM);
	}

	@RequestMapping(value = MAPPING_UPDATE_ROOM)
	public ModelAndView updateRoom(@PathVariable int id, Model model) {
		model.addAttribute(REQUEST_PARAM_TYPES_LIST, typeService.getTypeList());
		Room room = roomService.readRoom(id);
		return new ModelAndView(PAGE_FORM_UPDATE_ROOM, ACTION_COMMAND, room);
	}

	@RequestMapping(value = MAPPING_UPDATE_ROOM_SAVE, method = RequestMethod.POST)
	public ModelAndView updateSave(@ModelAttribute(ATTRIBUTE_ROOM) Room room, Model model) {
		roomService.updateRoom(room);
		model.addAttribute(REQUEST_PARAM_ROOM_LIST, roomService.getRoomList());
		return new ModelAndView(REDIRECT_TO_CRUD_ROOM);
	}

	@RequestMapping(MAPPING_GET_ROOM)
	public ModelAndView getRoom(@PathVariable int id, Model model) {
		model.addAttribute(ATTRIBUTE_ROOM, roomService.readRoom(id));
		return new ModelAndView(PAGE_GET_ROOM);
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Set.class, ATTRIBUTE_TYPES, new CustomCollectionEditor(Set.class) {
			@Override
			protected Object convertElement(Object element) {
				String id = (String) element;
				if (id != null) {
					return typeService.getTypeById(formatInt(id));
				} else {
					return null;
				}
			}
		});

	}
}
