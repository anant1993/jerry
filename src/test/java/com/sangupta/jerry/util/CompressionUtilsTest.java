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

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import org.springframework.util.Assert;

/**
 * @author Anant Gupta
 *
 */
public class CompressionUtilsTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.sangupta.jerry.util.CompressionUtils#compress(java.lang.String)}.
	 */
	@Test
	public void testCompressString() {
		assertEquals(null, CompressionUtils.compress((String) null));
		assertNotSame("message", CompressionUtils.uncompress(CompressionUtils.compress("message")));
				
	}

	/**
	 * Test method for {@link com.sangupta.jerry.util.CompressionUtils#compress(byte[])}.
	 */
	@Test
	public void testCompressByteArray() {
			
		byte[] abc = "Hello World".getBytes();
		assertEquals(abc, CompressionUtils.uncompress(CompressionUtils.compress("Hello World")));
		
	}

	/**
	 * Test method for {@link com.sangupta.jerry.util.CompressionUtils#uncompress(byte[])}.
	 */
	@Test
	public void testUncompressByteArray() {
		byte[] a2 = "Hello World".getBytes();
		byte[] a = CompressionUtils.uncompress(a2);
		assertArrayEquals(a2, a);
	}

	/**
	 * Test method for {@link com.sangupta.jerry.util.CompressionUtils#uncompress(byte[], int)}.
	 */
	@Test
	public void testUncompressByteArrayInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sangupta.jerry.util.CompressionUtils#uncompressToString(byte[])}.
	 */
	@Test
	public void testUncompressToStringByteArray() 
	{
		assertEquals("string", CompressionUtils.uncompressToString(CompressionUtils.compress("string")));
	}

	/**
	 * Test method for {@link com.sangupta.jerry.util.CompressionUtils#uncompressToString(byte[], int)}.
	 */
	@Test
	public void testUncompressToStringByteArrayInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sangupta.jerry.util.CompressionUtils#gzipByteArray(byte[])}.
	 */
	@Test
	public void testGzipByteArray() {
		fail("Not yet implemented");
	}

}
