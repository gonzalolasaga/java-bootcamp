package practice4;
/**
 * this class converted a roman number to arabic number and vice versa.
 * does not validate the Roman numeral input.
 * no acepta n�meros igual o mayores a cuatro mil
 * @author GONZALO L
 *
 */
public class Roman {
	String result = "";
	String aux = "";
	String aux2 = "";
	int resultA = 0;
	int[] numbers = { 1000, 500, 100, 50, 10, 5, 1 };
	String[] letras = { "M", "D", "C", "L", "X", "V", "I" };

	public String toRoman(int digit) {
		for (int i = 0; digit >= 1; i++) {
			int x = digit / numbers[i];
			if (x < 4) {
				for (int j = 0; j < x; j++) {
					result += letras[i];
				}
			} else {
				for (int j = 0; j < 5 - x; j++) {
					result += letras[i];
				}
				result += letras[i - 1];
			}
			digit -= x * numbers[i];
		}
		return result;
	}

	public int convert (String letter){
		for (int j = 0; j < numbers.length; j++) {
			if (letter.equals(letras[j])) {
				return numbers[j];
			}
		}
		return 0;
	}
	public int toArabic(String romanNumber) {
		char ch;
		char ch2;
		String aux2="";
		for (int i = 0; i < romanNumber.length(); i++) {
			ch = romanNumber.charAt(i);
			if (i<romanNumber.length()-1){
				ch2=romanNumber.charAt(i+1);
				aux2 = "" + ch2;
			}
			aux = "" + ch;
			int number=convert(aux);
			if (number<convert(aux2)){
				resultA-=number;
			}else{
				resultA+=number;
			}
		}
		return resultA;
	}
}