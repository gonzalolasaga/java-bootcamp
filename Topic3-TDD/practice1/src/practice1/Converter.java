package practice1;

import java.util.HashMap;
import java.util.Map;
/**
 *This class converts an amount in an appropriate text for a check.
 *accepts numbers less than one million.
 * @author GONZALO L
 *
 */
public class Converter {
	Map<Integer, String> trSimple;
	Map<Integer, String> trTens;

	public Converter() {
		trSimple = new HashMap<Integer, String>();
		trSimple.put(1, "one ");
		trSimple.put(2, "two ");
		trSimple.put(3, "three ");
		trSimple.put(4, "four ");
		trSimple.put(5, "five ");
		trSimple.put(6, "six ");
		trSimple.put(7, "seven ");
		trSimple.put(8, "eight ");
		trSimple.put(9, "nine ");
		trSimple.put(10, "ten ");
		trSimple.put(11, "eleven ");
		trSimple.put(12, "twelve ");
		trSimple.put(13, "thirteen ");
		trSimple.put(14, "fourteen ");
		trSimple.put(15, "fifteen ");
		trSimple.put(16, "sixteen ");
		trSimple.put(17, "seventeen ");
		trSimple.put(18, "eightenn ");
		trSimple.put(19, "nineteen ");
		trTens = new HashMap<Integer, String>();
		trTens.put(1, "ten ");
		trTens.put(2, "twenty ");
		trTens.put(3, "thirty ");
		trTens.put(4, "forty ");
		trTens.put(5, "fifty ");
		trTens.put(6, "sixty ");
		trTens.put(7, "seventy ");
		trTens.put(8, "eighty ");
		trTens.put(9, "ninety ");
	}

	public String convert(Double number) {
		String num = Double.toString(number);
		String aux="";
		String aux2="";
		int dig=0;
		while('.'!=(num.charAt(dig))){
			aux+=num.charAt(dig);
			dig++;
		}
		int len = aux.length();
		for(int ind=0;ind<2;ind++){
			dig++;
			aux2+=num.charAt(dig);
			if((num.length()-len)<3){
				aux2+=0;
				break;
			}
		}
		char ch;
		String result = "";
		if (len > 4) {
			result = "number out of range";
		} else {
			for (int c = 0; c < len; c++) {
				ch = aux.charAt(c);
				String s = "" + ch;
				if ((Integer.parseInt(s) != 0)) {
					if ((len - c) == 1) {
						result += (trSimple.get(Integer.parseInt(s)));
						break;
					}
					if ((len - c) == 2) {
						if ((Integer.parseInt(s) == 1)) {
							s += aux.charAt(c + 1);
							result += (trSimple.get(Integer.parseInt(s)));
							break;
						} else {
							result += (trTens.get(Integer.parseInt(s)));
						}
					}
					if ((len - c) == 3) {
						result += (trSimple.get(Integer.parseInt(s)) + "hundred ");
					}
					if ((len - c) == 4) {
						result += (trSimple.get(Integer.parseInt(s)) + "thousand ");
					}
				}
			}
		
			System.out.println(aux2);
			if (!aux2.equals("00")){
				System.out.println("entro ");
				result+=("and "+aux2+"/100");
				System.out.println(result);
			}
		}
		return result;
	}
}