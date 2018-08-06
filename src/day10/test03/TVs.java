package day10.test03;

public class TVs extends Goods{

	@Override
	public void printPirce() {
		//输出所有产品的价格
		System.out.println("Tvs的价格是"+this.getPrice());
	}
	
}
