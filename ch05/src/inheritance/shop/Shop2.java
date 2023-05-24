package inheritance.shop;

public class Shop2 extends HeadShop{
	
	public Shop2() {
		System.out.println(" 이곳은 역세권 매장입니당~");
	}

	@Override
	public void sellDoenjangJJige() {
		System.out.println("된장찌게 : 7,000원");
	}

	@Override
	public void sellKimchiJJige() {
		// TODO Auto-generated method stub
		System.out.println("김치찌게 : 6,500원");
	}

	@Override
	public void sellBibimBap() {
		// TODO Auto-generated method stub
		System.out.println("비빔밥 : 8,000원");
	}
	
	
}
