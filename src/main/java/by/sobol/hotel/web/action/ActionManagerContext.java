package by.sobol.hotel.web.action;

import org.springframework.web.context.WebApplicationContext;

public class ActionManagerContext {

	public ActionManagerContext() {
	}

	public static BaseAction getAction(String action, WebApplicationContext webAppContext) {

		return (BaseAction) webAppContext.getBean(action);
	}

}
