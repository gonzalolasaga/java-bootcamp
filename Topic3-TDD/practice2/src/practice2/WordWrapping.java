package practice2;
/**
 * this class word-wrapping in a string given as required by the topic
 */
import java.util.ArrayList;
import java.util.List;

public class WordWrapping {
	String aux = "";
	String aux2 = "";

	List<String> list = new ArrayList<String>();

	public List<String> Wrap(String s, int size) {
		for (int i = 0; i < s.length(); i++) {
			if (aux.length() + aux2.length() > size - 1) {
				if (aux2 == "") {
					list.add(aux);
					aux = "";
				} else {
					list.add(aux2);
					aux2 = "";
				}
			}
			aux += s.charAt(i);
			if ((s.charAt(i)) == ' ') {
				aux2 += aux;
				aux = "";
			}

		}
		if (aux2 != "") {
			aux2+=aux;
			list.add(aux2);
			aux="";
		}else if (aux != ""){
			list.add(aux);
		}
		return list;
	}
}