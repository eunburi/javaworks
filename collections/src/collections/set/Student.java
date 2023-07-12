package collections.set;

public class Student {
	
	String name;
	int age;
	
	//생성자 - source - generate con~
	public Student(String name) {
		this.name = name;
	}
	
	//hashCode() 재정의
	@Override
	public int hashCode() { //hashCode() - > 십진수로 출력
		// TODO Auto-generated method stub
		return name.hashCode();
	}

	// equals() 재정의
	@Override
	public boolean equals(Object obj) {  //객체인지 확인 명령어 - instanceof
		if(obj instanceof Student) {
			Student std = (Student)obj; //객체 생성(저장)
			if(std.name.equals(name))
				return true;
		}
		return false;
	}

	//toString - 
	@Override
	public String toString() {
		return name;
	}
	
	
	
	
	
	
	

}
