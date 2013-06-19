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
 *   	http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package com.sangupta.jerry.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Anant Gupta
 *
 */
public class StringUtilsTest {

	
	/**
	 * Test method for {@link com.sangupta.jerry.util.StringUtils#getBoolean(java.lang.String, boolean)}.
	 */
	@Test
	public void testGetBooleanStringBoolean() {
		assertTrue(StringUtils.getBoolean("yes"));
		assertTrue(StringUtils.getBoolean("true"));
	}
	/**
	 * Test method for {@link com.sangupta.jerry.util.StringUtils#getIntValue(java.lang.String, int)}.
	 */
	@Test
	public void testGetIntValue() {
		assertEquals(69,StringUtils.getIntValue("69", 1) );
		assertEquals(9,StringUtils.getIntValue("9", 2) );
	}

	/**
	 * Test method for {@link com.sangupta.jerry.util.StringUtils#fromList(java.util.List, java.lang.String)}.
	 */
	@Test
	public void testFromList() {
	
	}

	/**
	 * Test method for {@link com.sangupta.jerry.util.StringUtils#contains(java.lang.String[], java.lang.String)}.
	 */
	@Test
	public void testContains() {
		assertEquals(false,StringUtils.contains(null,"abc" ));
		assertEquals(true,StringUtils.contains(new String[]{"abc","pqr","xyz","efg"},"abc" ));
	}

}
