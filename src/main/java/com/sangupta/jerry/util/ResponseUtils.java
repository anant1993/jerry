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

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

/**
 * @author sangupta
 *
 */
public class ResponseUtils {

	/**
	 * @param response
	 * @param opml
	 * @param string
	 * @param string2
	 * @throws IOException 
	 */
	public static void pushForUserDownload(HttpServletResponse response, String data, String fileName, String mimeType) throws IOException {
		response.setContentType(mimeType + "; charset=UTF-8");
		response.addHeader("Content-Disposition", "attachment; filename="  + fileName);
		response.setCharacterEncoding("UTF-8");
		response.setStatus(HttpServletResponse.SC_OK);
		
		ServletOutputStream stream = response.getOutputStream();
		byte[] bytes = data.getBytes("UTF-8");
		response.setContentLength(bytes.length);
		stream.write(bytes);
		stream.flush();
		stream.close();
	}

}
