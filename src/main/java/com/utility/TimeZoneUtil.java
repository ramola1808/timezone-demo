package com.utility;

import net.iakovlev.timeshape.*;

public class TimeZoneUtil {
	
	public static String getTimeZone(double latitude, double longitude) {
		return TimeZoneEngine.initialize().queryAll(latitude, longitude).get(0).toString();
	}

}
