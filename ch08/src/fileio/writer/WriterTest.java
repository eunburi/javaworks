package fileio.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {

	public static void main(String[] args) throws IOException {
		
		Writer fw = new FileWriter("c:/file/newFile2.txt");
		
		fw.write("hello~\n");
		fw.write("안눙\n");
		fw.write(66); //정수는 아스키 코드값으로 인식 - >  B(아스키코드) 
		fw.write(66+1);
		// fw.write(2.54); - 실수 사용불가
		
		char[] buf = {'s','m','i','l','e'};
		fw.write(buf);
		fw.write(9); //줄바꿈(개행문자)
		fw.write(buf, 1, 4); // 1번 인덱스부터 4개 출력
		
		//String[] str = {"봄","여름"};
		fw.write("봄");
		fw.write("여름");
		
		fw.close();
		
		System.out.println("수행완료!!");

	}

}
