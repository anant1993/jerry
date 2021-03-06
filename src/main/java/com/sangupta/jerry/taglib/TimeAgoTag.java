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

package com.sangupta.jerry.taglib;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.sangupta.jerry.util.TimeDurationUtils;

/**
 * @author sangupta
 *
 */
public class TimeAgoTag extends SimpleTagSupport {
	
	private Date time;
	
	private long millis;
	
	/**
	 * @see javax.servlet.jsp.tagext.SimpleTagSupport#doTag()
	 */
	@Override
	public void doTag() throws JspException, IOException {
		final JspWriter out = getJspContext().getOut();
		
		if(this.time == null) {
			if(this.millis == 0) {
				out.print("right now");
				return;
			}
			
			// the time is given in millis
			out.write(TimeDurationUtils.ago(this.millis));
			return;
		}
		
		out.write(TimeDurationUtils.ago(this.time));
	}
	
	// Usual accessors follow

	/**
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * @return the millis
	 */
	public long getMillis() {
		return millis;
	}

	/**
	 * @param millis the millis to set
	 */
	public void setMillis(long millis) {
		this.millis = millis;
	}

}
