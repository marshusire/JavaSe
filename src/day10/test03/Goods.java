package day10.test03;

//父类
public abstract class Goods {
	// 单价
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

   //定义一个公共的方法 抽象的方法	
	public abstract void printPirce();
	
	
}
