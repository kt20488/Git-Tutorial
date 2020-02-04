package array;

public class StudentTest {

	public static void main(String[] args) {

		Student1 studentLee = new Student1(1001, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		
		Student1 studentKim = new Student1(1002, "Kim");
		studentKim.addSubject("국어", 100);
		studentKim.addSubject("수학", 90);
		studentKim.addSubject("영어", 80);
		
		studentKim.showStudentInfo();
		System.out.println("=================================");
		studentLee.showStudentInfo();
		
	}

}
