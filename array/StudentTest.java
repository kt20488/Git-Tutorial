package array;

public class StudentTest {

	public static void main(String[] args) {

		Student1 studentLee = new Student1(1001, "Lee");
		
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 90);
		
		Student1 studentKim = new Student1(1002, "Kim");
		studentKim.addSubject("����", 100);
		studentKim.addSubject("����", 90);
		studentKim.addSubject("����", 80);
		
		studentKim.showStudentInfo();
		System.out.println("=================================");
		studentLee.showStudentInfo();
		
	}

}
