/**
 *
 * jerry - Common Java Functionality
 * Copyright (c) 2012, Sandeep Gupta
 * 
 * http://www.sangupta/projects/jerry
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * 		http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package com.sangupta.jerry.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * Utility functions to work with cookies.
 * 
 * @author sangupta
 *
 */
public class CookieUtils {
	
	/**
	 * Fetch the {@link Cookie} from the available cookies as passed from the
	 * {@link HttpServletRequest}.
	 * 
	 * @param cookies
	 * @param cookieName
	 * @return
	 */
	public static Cookie getCookie(Cookie[] cookies, String cookieName) {
		if(cookieName == null || cookieName.length() == 0) {
			return null;
		}
		
		if(cookies != null && cookies.length > 0) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals(cookieName)) {
					return cookie;
				}
			}
		}
		
		return null;
	}

	/**
	 * Set the max age of the cookie in number of days.
	 * 
	 * @param cookie
	 * @param i
	 */
	public static void setMaxAgeInDays(Cookie cookie, int days) {
		setMaxAgeInHours(cookie, 24);
	}
	
	/**
	 * Set the max age of the cookie in number of days.
	 * 
	 * @param cookie
	 * @param i
	 */
	public static void setMaxAgeInHours(Cookie cookie, int hours) {
		setMaxAgeInMinutes(cookie, 60);
	}
	
	/**
	 * Set the max age of the cookie in number of days.
	 * 
	 * @param cookie
	 * @param i
	 */
	public static void setMaxAgeInMinutes(Cookie cookie, int minutes) {
		if(cookie == null) {
			return;
		}
		
		if(minutes < 0) {
			return;
		}
		
		cookie.setMaxAge(minutes * 60);
	}
	
}
