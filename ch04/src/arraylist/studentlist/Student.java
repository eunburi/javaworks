package arraylist.studentlist;

import java.util.ArrayList;
import arraylist.scorelist.Subject;

public class Student {
	// field 필드(멤버변수)
	int studentId;	//학번
	String studentName;	//이름
	ArrayList<Subject>subjectList;
	
	//생성자
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjectList = new ArrayList<>();
	}
	
	//과목추가
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); // 과목객체 생성
		subject.setSubjectName(name);	// 과목이름 입력
		subject.setscorePoint(score);	// 점수입력
		
		subjectList.add(subject);	//어레이리스트에 저장
		
	}
	// 학생정보출력
	public void showInfo() {
		int total = 0; //총점
		double avg;
		
		
		for(int i=0; i<subjectList.size(); i++) {
			Subject subject = subjectList.get(i);
			//총점계산 
			total += subject.getScorePoint();
			System.out.printf("학생 %s의 %s과목의 성적은 %d점입니다.\n",
					studentName, subject.getSubjectName(),subject.getScorePoint());
		}
		// 평균계산
		avg = (double)total / subjectList.size();
		System.out.printf("학생 %s의 총점은 %d점이고, 평균: %.2f점입니다.",studentName,total, avg);
		
	}
	
}
