package interfaceexam;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreanSubject("����", 100);
		studentLee.setMathSubject("����", 100);
		
		Student studentKim = new Student(101, "Lee");
		studentKim.setKoreanSubject("����", 80);
		studentKim.setMathSubject("����", 90);
		
		studentLee .showStudentScore();
		studentKim .showStudentScore();
		
	}

}
