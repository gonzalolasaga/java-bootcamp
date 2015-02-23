package practice3;

import static org.junit.Assert.*;
import org.junit.Test;

public class RecentFileTest {

	RecentFile rf = new RecentFile();

	@Test
	public void iniListEmptyTest() {
		assertEquals(rf.recentFile.isEmpty(), true);
	}

	@Test
	public void openOnefiletest() {
		rf.openFile("arch");
		assertEquals(rf.getListRecentFile().get(0), "arch");
	}

	@Test
	public void addInToptest() {
		rf.openFile("arch1");
		rf.openFile("arch2");
		assertEquals(rf.getListRecentFile().get(0), "arch2");
		assertEquals(rf.getListRecentFile().get(1), "arch1");
	}

	@Test
	public void addExistingTest() {
		rf.openFile("arch1");
		rf.openFile("arch2");
		rf.openFile("arch3");
		rf.openFile("arch1");
		assertEquals(rf.getListRecentFile().get(0), "arch1");
		assertEquals(rf.getListRecentFile().get(1), "arch3");
		assertEquals(rf.getListRecentFile().get(2), "arch2");
	}

	// the size of the historical is ten, can be modified.
	@Test
	public void sizeTest() {
		rf.openFile("arch1");
		rf.openFile("arch2");
		rf.openFile("arch3");
		rf.openFile("arch4");
		rf.openFile("arch5");
		rf.openFile("arch6");
		rf.openFile("arch7");
		rf.openFile("arch8");
		rf.openFile("arch9");
		rf.openFile("arch10");
		rf.openFile("arch11");
		rf.openFile("arch12");
		assertEquals(rf.getListRecentFile().get(0), "arch12");
		assertEquals(rf.getListRecentFile().get(1), "arch11");
		assertEquals(rf.getListRecentFile().get(2), "arch10");
		assertEquals(rf.getListRecentFile().get(3), "arch9");
		assertEquals(rf.getListRecentFile().get(4), "arch8");
		assertEquals(rf.getListRecentFile().get(5), "arch7");
		assertEquals(rf.getListRecentFile().get(6), "arch6");
		assertEquals(rf.getListRecentFile().get(7), "arch5");
		assertEquals(rf.getListRecentFile().get(8), "arch4");
		assertEquals(rf.getListRecentFile().get(9), "arch3");
		assertEquals(rf.recentFile.size(), rf.getSizeHistorical());
	}
}