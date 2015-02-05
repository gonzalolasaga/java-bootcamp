package practice3;

/**
 * This class manages the recently opened files according to the requirements of the topic.
 * its capacity is ten.
 */
import java.util.ArrayList;
import java.util.List;

public class RecentFile {
	List<String> recentFile = new ArrayList<String>();
	int sizeHistorical = 10;

	public void openFile(String namefile) {
		if (recentFile.contains(namefile)) {
			recentFile.remove(namefile);
		} else if (recentFile.size() == sizeHistorical) {
			recentFile.remove(sizeHistorical - 1);
		}
		recentFile.add(0, namefile);
	}

	public List<String> getListRecentFile() {
		return this.recentFile;
	}

	public void setSizeHistorical(int newSize) {
		this.sizeHistorical = newSize;
	}

	public int getSizeHistorical() {
		return this.sizeHistorical;
	}
}
