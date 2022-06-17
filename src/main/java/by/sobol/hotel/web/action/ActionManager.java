//package by.sobol.hotel.web.action;
//
//import static by.sobol.hotel.web.util.WebControllerConstatntPool.*;
//
//import by.sobol.hotel.web.action.impl.CheckLoginImpl;
//import by.sobol.hotel.web.action.impl.LookRoomList;
//
//public class ActionManager {
//
//	public ActionManager() {
//	}
//
//	public static BaseAction determineAction(String action) {
//
//		BaseAction act = null;
//
//		switch (action) {
//		case REQUEST_PARAM_ROOM_LIST:
//			act = new LookRoomList();
//			break;
//		case REQUEST_PARAM_AUTH:
//			act = new CheckLoginImpl();
//		}
//		return act;
//	}
//}