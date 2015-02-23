package practice1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConverterTest {

	Converter converter = new Converter();
	String result;
	@Test
	public void number1ToOne() {
		result = converter.convert(1.0);
		assertEquals(result, "one ");
	}

	@Test
	public void unitToString() {
		result = converter.convert(7.0);
		assertEquals(result, "seven ");
	}

	@Test
	public void numberTo19ToString() {
		result = converter.convert(19.0);
		assertEquals(result, "nineteen ");
	}

	@Test
	public void checkingTheLenght() {
		result = converter.convert(12345.0);
		assertEquals(result, "number out of range");
	}

	@Test
	public void number72ToString() {
		result = converter.convert(72.0);
		assertEquals(result, "seventy two ");
	}

	@Test
	public void number30ToString() {
		result = converter.convert(30.0);
		assertEquals(result, "thirty ");
	}

	@Test
	public void number715ToString() {
		result = converter.convert(715.0);
		assertEquals(result, "seven hundred fifteen ");
	}

	@Test
	public void number3401ToString() {
		result = converter.convert(3401.0);
		assertEquals(result, "three thousand four hundred one ");
	}

	@Test
	public void number45whit05ToString() {
		result = converter.convert(45.05);
		assertEquals(result, "forty five and 05/100");
	}
	
	@Test
	public void number40whit25ToString() {
		result = converter.convert(100.25);
		assertEquals(result, "one hundred and 25/100");
	}
}