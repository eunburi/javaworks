package shelf;

public class BookShelfTest {

	public static void main(String[] args) {
		//BookShelf의 객체생성
		BookShelf bookShelf = new BookShelf();
		
		//자료삽입
		bookShelf.enQueue("반응형 웹");  //책장 책 1권 넣음
		bookShelf.enQueue("혼공 Java");
		bookShelf.enQueue("스프링 부트");
		
		System.out.println(bookShelf.getSize() + "권");
		
		//자료출력 (맨 앞에서 삭제되고 출력됨)
		System.out.println(bookShelf.deQueue());
		System.out.println(bookShelf.deQueue());
		System.out.println(bookShelf.deQueue());

	}

}
