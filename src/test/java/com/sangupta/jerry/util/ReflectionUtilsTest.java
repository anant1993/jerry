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

import org.junit.Test;

/**
 * @author Anant Gupta
 *
 */
public class ReflectionUtilsTest {

	/**
	 * Test method for {@link com.sangupta.jerry.util.ReflectionUtils#getGetterMethod(java.lang.String)}.
	 */
	@Test
	public void testGetGetterMethod() {
		assertEquals("getString", ReflectionUtils.getGetterMethod("string"));
	}
	/**
	 * Test method for {@link com.sangupta.jerry.util.ReflectionUtils#executeGetter(java.lang.Object, java.lang.String)}.
	 */
	@Test
	public void testExecuteGetter() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sangupta.jerry.util.ReflectionUtils#executeGetAttribute(java.lang.Object, java.lang.String)}.
	 */
	@Test
	public void testExecuteGetAttribute() {
		fail("Not yet implemented");
	}

}
