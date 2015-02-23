package practice2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class WordWrappingTest {
	
	WordWrapping WordWrapping= new WordWrapping();
	List<String> result= new ArrayList<String>();
	
	@Test
	public void WordWrap5Test() {
		result=WordWrapping.Wrap("nala",50);
		assertEquals(result.get(0),"nala");
	}
	@Test
	public void WordWrap3Test() {
		result=WordWrapping.Wrap("nala",3);
		assertEquals(result.get(0),"nal");
		assertEquals(result.get(1),"a");
	}
	@Test
	public void WordWrapEmptyTest() {
		result=WordWrapping.Wrap("nala rocky",7);
		assertEquals(result.get(0),"nala ");
		assertEquals(result.get(1),"rocky");
	}
	@Test
	public void WordWrapTest() {
		result=WordWrapping.Wrap("nala rocky lala",50);
		assertEquals(result.get(0),"nala rocky lala");
	}
	
}