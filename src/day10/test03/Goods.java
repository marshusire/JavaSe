package day10.test03;

//����
public abstract class Goods {
	// ����
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

   //����һ�������ķ��� ����ķ���	
	public abstract void printPirce();
	
	
}
