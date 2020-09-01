package refex;

public class Student {
	
	String studentName;
	int studentId;
	Subject math;
	Subject korean;
	
	public Student (int id, String name)
	{
		studentId = id;
		studentName = name;
		math = new Subject();
		korean = new Subject();
	}
	
	public void setKoreanSubject(String name, int score) {
		korean.score= score;
		korean.subjectName = name;
	}
	
	public void setMathSubject(String name, int score) {
		math.score= score;
		korean.subjectName = name;
	}
	
	
	public void showStudentScore() {
		System.out.println(math.score);
		System.out.println(korean.score);
	}
}
