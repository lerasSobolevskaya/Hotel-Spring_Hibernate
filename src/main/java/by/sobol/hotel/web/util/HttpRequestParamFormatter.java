package by.sobol.hotel.web.util;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

public class HttpRequestParamFormatter {

	private HttpRequestParamFormatter() {

	}

	public static int formatString(String param) {
		return Integer.parseInt(param);
	}

	public static int formatInt(String param) {
		return Integer.parseInt(param);
	}

	public static LocalDate getDate(HttpServletRequest req, String param) {
		String str = req.getParameter(param);
		return LocalDate.parse(str);
	}

	public static int getInt(HttpServletRequest request, String param) {
		String str = request.getParameter(param);
		return Integer.parseInt(str);

	}

	public static String getString(HttpServletRequest request, String param) {
		String str = request.getParameter(param);
		return str;
	}
}
