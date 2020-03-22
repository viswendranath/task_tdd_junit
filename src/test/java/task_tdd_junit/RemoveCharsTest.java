package task_tdd_junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RemoveCharsTest {

	/** Test cases
	 * 1. “ABCD” => “BCD”
	 * 2. “AACD” => “CD”
	 * 3. “BACD” => “BCD”
	 * 4. “BBAA” => “BBAA”
	 * 5. “AABAA” => “BAA”
	 */
	
	RemoveAs ra;
	
	@Before
	public void setUp() {
		ra = new RemoveAs();
	}
	
	@Test
	public void testFirst1A() {
		assertEquals("BCD", ra.remove("ABCD"));
	}
	
	@Test
	public void testFirst2As() {
		assertEquals("CD", ra.remove("AACD"));
	}
	
	@Test
	public void testSecond1A() {
		assertEquals("BCD", ra.remove("BACD"));
	}

	@Test
	public void testNoAs() {
		assertEquals("BBAA", ra.remove("BBAA"));
	}
	
	@Test
	public void testAs() {
		assertEquals("BAA", ra.remove("AABAA"));
	}

}
