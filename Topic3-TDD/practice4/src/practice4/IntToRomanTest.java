package practice4;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class IntToRomanTest {
	Map<Integer, String> romanUnit;
	Roman number = new Roman();
	String result = "";
	int resultA = 0;

	@Test
	public void unitIntToRomanTest() {
		result = number.toRoman(2);
		assertEquals(result, "II");
	}

	@Test
	public void roundNumberToRomanTest() {
		result = number.toRoman(3333);
		assertEquals(result, "MMMCCCXXXIII");
	}

	@Test
	public void NumberToRomanWithSubtractiveNotationTest() {
		result = number.toRoman(944);
		assertEquals(result, "DCDXLIV");
	}

	@Test
	public void simpleRomanToArabicTest() {
		resultA = number.toArabic("MMMCCCXXXIII");
		assertEquals(resultA, 3333);
	}

	@Test
	public void subtractiveNotationRomanToArabicTest() {
		resultA = number.toArabic("DCDXLIV");
		assertEquals(resultA, 944);
	}
	
}