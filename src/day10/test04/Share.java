package day10.test04;
//父类  公共的特性
public abstract class Share {
	// 单价
	private double price;// 单价
	private int minute;  // 时间

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
  	
	//公共的行为 计算总价
	public abstract double getCount();
	
	
	
	
}
