package day10.test04;
//����  ����������
public abstract class Share {
	// ����
	private double price;// ����
	private int minute;  // ʱ��

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
  	
	//��������Ϊ �����ܼ�
	public abstract double getCount();
	
	
	
	
}
