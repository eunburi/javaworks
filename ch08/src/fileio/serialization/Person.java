package fileio.serialization;

import java.io.Serializable;


public class Person implements Serializable{ //직렬화를 구현

	private static final long serialVersionUID = 10L;

	//필드 
	String name;
	String job;
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
		
		
	}

	@Override
	public String toString() {
		return name + ", " + job;
	}


	

}
