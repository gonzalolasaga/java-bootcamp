package topic5;

public class Main {
	public static void main(String[] args) throws Exception {
		MySQLAccess dao = new MySQLAccess();
		dao.showStudents(4);//courses:1=algorithms,2=database,3=mathematics,4=architecture,5=physical.
		System.out.println("--------------------------------------------");
		dao.showFinalNote(1002);//here insert a register number.
		System.out.println("--------------------------------------------");
		dao.showFinalNote("'Rodriguez'");//here a last name.
		dao.close();
	}
}