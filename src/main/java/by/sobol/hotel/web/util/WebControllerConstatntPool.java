package by.sobol.hotel.web.util;

public final class WebControllerConstatntPool {

	public WebControllerConstatntPool() {
	}

	public static final String ACTION_COMMAND = "command";
	
	public static final String REQUEST_PARAM_TYPES_LIST = "listType";
	public static final String REQUEST_PARAM_ROOM_LIST = "roomList";
	public static final String REQUEST_PARAM_ORDER_LIST = "listOrders";
	public static final String REQUEST_PARAM_USER_LIST = "userList";
	
	public static final String ATTRIBUTE_ROOM = "room";
	public static final String ATTRIBUTE_ORDER = "order";
	public static final String ATTRIBUTE_USER = "user";
	public static final String ATTRIBUTE_ID = "id";
	public static final String ATTRIBUTE_TYPES = "types";
	public static final String ATTRIBUTE_LIST = "list";

	public static final String MAPPING_CREATE = "/create";
	public static final String MAPPING_CREATE_ORDER = "createOrder";
	public static final String MAPPING_CREATE_ROOM = "createRoom";
	public static final String MAPPING_CREATE_USER = "createUser";
	public static final String MAPPING_DELETE = "/delete/{id}";
	public static final String MAPPING_ORDER_ROOM = "/orderRoom/{id}";
	public static final String MAPPING_AUTHENTICATION = "/authentication";
	public static final String MAPPING_LOOK_ORDERS = "/lookOrders";
	public static final String MAPPING_LOOK_ROOMS = "/lookRooms";
	public static final String MAPPING_USER_CREATE_ORDER = "/userCreateOrder/{id}";
	public static final String MAPPING_USER_ORDER_SAVE = "/userCreateOrder/userOrderSave";
	public static final String MAPPING_ORDER = "/order";
	public static final String MAPPING_ORDER_SAVE = "/orderSave";
	public static final String MAPPING_USER_SAVE = "/userSave";
	public static final String MAPPING_UPDATE_ORDER_SAVE = "/updateOrder/updateOrderSave";
	public static final String MAPPING_UPDATE_ORDER = "/updateOrder/{id}";
	public static final String MAPPING_CRUD_ORDERS = "/crudOrders";
	public static final String MAPPING_CRUD_ROOM = "/crudRoom";
	public static final String MAPPING_CRUD_USER = "/crudUser";
	public static final String MAPPING_GET_ORDER = "/getOrder/{id}";
	public static final String MAPPING_GET_USER = "/getUser/{id}";
	public static final String MAPPING_UPDATE_ROOM = "/updateRoom/{id}";
	public static final String MAPPING_UPDATE_ROOM_SAVE = "/updateRoom/saveRoom";
	public static final String MAPPING_GET_ROOM = "/getRoom/{id}";
	public static final String MAPPING_UPDATE_USER = "/updateUser/{id}";
	public static final String MAPPING_UPDATE_USER_SAVE = "/updateUser/updateSave";

	
	
	public static final String PAGE_ADMIN = "admin/admin";
	public static final String PAGE_USER = "user/userProfile";
	public static final String PAGE_ERROR = "error";
	public static final String PAGE_INDEX = "index";
	public static final String PAGE_FORM_UPDATE_ROOM = "updateRoom";
	public static final String PAGE_FORM_UPDATE_ORDER = "updateOrder";
	public static final String PAGE_FORM_UPDATE_USER = "updateUser";
	public static final String PAGE_ADD_NEW_ROOM = "addNewRoom";
	public static final String PAGE_AN_ACCOUNT = "createAnAccount";
	public static final String PAGE_CREATE_ROOM = "createRoom";
	public static final String PAGE_CREATE_ORDER = "createOrder";
	public static final String PAGE_CREATE_USER = "createUser";
	public static final String PAGE_AUTHENTICATION = "authentication";
	public static final String PAGE_ROOMS = "roomList";
	public static final String PAGE_GET_ROOM = "getRoom";
	public static final String PAGE_GET_ORDER = "getOrder";
	public static final String PAGE_GET_USER = "getUser";
	public static final String PAGE_LIST_ORDERS = "listOrders";
	public static final String PAGE_ROOM_OPERATIONS = "roomOperations";
	public static final String PAGE_USER_OPERATIONS = "userOperation";
	public static final String PAGE_ORDER_OPERATIONS = "orderOperations";
	public static final String PAGE_INFO_ABOUT_ROOMS = "infoAboutRooms";
	public static final String PAGE_USER_CREATE_ORDER = "userCreateOrder";
	
	public static final String ACTION_ROOM_ID = "room_id";
	public static final String ACTION_LOGIN = "login";
	public static final String ACTION_PASS = "password";
	public static final String ROLE_ADMIN = "admin";
	public static final String ROLE_USER = "user";
	
	public static final String REDIRECT_TO_MAIN_MENU = "redirect:/main";
	public static final String REDIRECT_TO_CRUD_ROOM = "redirect:/crudRoom/";
	public static final String REDIRECT_TO_ORDER = "redirect:/order/";
	public static final String REDIRECT_TO_CRUD_ORDERS = "redirect:/crudOrders/";
	public static final String REDIRECT_TO_CRUD_USER = "redirect:/crudUser/";
}
