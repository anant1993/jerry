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


import org.junit.Test;
//import org.springframework.util.Assert;

/**
 * @author Anant Gupta
 *
 */
public class CompressionUtilsTest {

	private static final String TEST_MESSAGE="this is one long message that we need to test as to how the deflater is working. test should pass here.";
	@Test
	public void testCompressString() {
		assertEquals(null, CompressionUtils.compress((String) null));
        assertEquals(null, CompressionUtils.compress(""));
        assertNotSame(TEST_MESSAGE, CompressionUtils.uncompress(CompressionUtils.compress(TEST_MESSAGE)));
				
	}

	/**
	 * Test method for {@link com.sangupta.jerry.util.CompressionUtils#compress(byte[])}.
	 */
	@Test
	public void testCompressByteArray() {
			
		byte[] abc = TEST_MESSAGE.getBytes();
        assertArrayEquals(abc, CompressionUtils.uncompress(CompressionUtils.compress(abc)));
		
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
		
	}

	/**
	 * Test method for {@link com.sangupta.jerry.util.CompressionUtils#uncompressToString(byte[])}.
	 */
	@Test
	public void testUncompressToStringByteArray() 
	{
		assertEquals(TEST_MESSAGE, CompressionUtils.uncompressToString(CompressionUtils.compress(TEST_MESSAGE)));
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
