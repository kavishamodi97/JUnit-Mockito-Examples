package com.demo.mockitoExamples;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();

	/* Simple Written First JUnit test */
	@Test
	public void testTruncateAInFirst2Positions() {
		StringHelper helper = new StringHelper();
		String actual = helper.truncateAInFirst2Positions("AACD");
		String expected = "CD";
		assertEquals(expected, actual);
		assertEquals(expected, helper.truncateAInFirst2Positions("ACD"));
		// do with inline also
		// assertEquals(expected,helper.truncateAInFirst2Positions("AACD"));
	}

	/* Refactor First JUnit test */
	/*
	 * Test Method Name should be readable Test Method can't return any type it
	 * should be void Ideally same condition not to test in same test method
	 */
	@Test
	public void testtruncateAInFirst2Positions_AinFirstPositions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testtruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	/* Testcase will be failed due to return type */
	/*
	 * @Test public String
	 * testTruncateAInFirst2Positions_AinFirstPositionsReturnType() {
	 * assertEquals("CD", helper.truncateAInFirst2Positions("AACD")); }
	 */

}
