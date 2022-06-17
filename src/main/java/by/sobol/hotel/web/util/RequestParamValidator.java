package by.sobol.hotel.web.util;

import by.sobol.hotel.web.controller.RequestParamValidationException;

public class RequestParamValidator {

	private RequestParamValidator() {
	}

	// public static void validateUserLoginPass(String login, String pass) {
	// if (login == null || pass == null) {
	// throw new RequestParamValidationException();
	//
	// }
	public static void validateUserLoginPass(String... str) {
		for (String s : str) {
			if ("".equals(s)) {
				throw new RequestParamValidationException();
			}
		}
	}

	public static void validateRequestParamNotNull(Object... object) {
		for (Object obj : object) {
			if (obj == null) {
				throw new RequestParamValidationException();

			}
		}
	}
	public static void validateRequestParamIdNotNull(int id) {
		if(id == 0) {
			throw new RequestParamValidationException();
		}
	}
	
}
