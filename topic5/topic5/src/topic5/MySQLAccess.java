package topic5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLAccess {
	private Connection connect = null;
	private Statement state = null;
	private ResultSet resultSet = null;

	public MySQLAccess() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://localhost/highschool?"
							+ "user=sqluser&password=sqluserpw");
		} catch (SQLException e) {
			System.out.println("problem in the connection");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}

	public ResultSet getQuery(String query) {
		try {
			state = (Statement) connect.createStatement();
			resultSet = state.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultSet;
	}

	public void showStudents(int i) {
		ResultSet result;
		String s;
		result = getQuery("select c.name_course,t.last_name,t.first_name,s.last_name,s.first_name from course c inner join teacher t on c.assigned_teacher=t.id_teacher inner join assist a on c.id_course=a.course_number inner join student s on s.id_student=a.student_number where c.id_course="
				+ i + " order by s.last_name");
		try {
			if (resultSet.isBeforeFirst()) {
				resultSet.next();
				System.out.println("corse: " + (s = result.getString(1)));
				System.out.println("teacher: "
						+ (s = result.getString(2) + ","
								+ (s = result.getString(3))));
				System.out.println("students:");
				System.out.println("	" + (s = result.getString(4)) + ","
						+ (s = result.getString(5)));

			}
			while (result.next()) {
				System.out.println("	" + (s = result.getString(4)) + ","
						+ (s = result.getString(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}
			if (state != null) {
				state.close();
			}
			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {
		}
	}

	public void showFinalNote(int i) {
		ResultSet result;
		String s;
		result = getQuery("select c.name_course,s.last_name,s.first_name, a.final_note from course c inner join assist a on c.id_course=a.course_number inner join student s on s.id_student=a.student_number where s.reg_number="
				+ i + " order by a.final_note desc, c.name_course;");
		try {
			while (result.next()) {
				System.out.print(s=result.getString("c.name_course"));
				System.out.println(" : "+(s = result.getString("a.final_note")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void showFinalNote(String i) {
		ResultSet result;
		String s;
		result = getQuery("select c.name_course,s.last_name,s.first_name, a.final_note from course c inner join assist a on c.id_course=a.course_number inner join student s on s.id_student=a.student_number where s.last_name="
				+ i + " order by a.final_note desc, c.name_course;");
		try {
			while (result.next()) {
				System.out.print(s=result.getString("c.name_course"));
				System.out.println(" : "+(s = result.getString("a.final_note")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}