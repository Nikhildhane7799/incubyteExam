package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}
	@Test
	public void testTwoNumbers(){
		assertEquals(3, Calculator.add("1,2"));
	}
	@Test
    public void testThreeNumbers(){
    	assertEquals(6, Calculator.add("1,2,3"));
    }
	@Test
    public void testNewLine(){
    	assertEquals(6, Calculator.add("1\n2,3"));
    }
	 @Test
	    public void testNegativeNumver(){
	    	try {
				Calculator.add("-1,2");
			}
			catch (IllegalArgumentException e){
				assertEquals(e.getMessage(), "Negatives not allowed: -1");
			}

			try {
				Calculator.add("2,-4,3,-5");
			}
			catch (IllegalArgumentException e){
				assertEquals(e.getMessage(), "Negatives not allowed: -4,-5");
			}
	    }
	 @Test
	    public void testOverThousand(){
	    	assertEquals(2, Calculator.add("1000,2"));
	    }
}
