package day10.test04;

public class ShareCar extends Share{
    private int mileage;//���    
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public double getCount() {
		//�����ܼ�  ÿ10���� 1Ԫ  ����10����� ÿ������Ҫ��1Ԫ
		  int m=this.getMinute()%10==0?this.getMinute()/10:this.getMinute()/10+1;
		//�ж�Ҫ��Ǯ�����
		  int mil=this.mileage-10;
		  int milPrice=0;
		  if(mil>0)
			milPrice=mil*1;

		 return m*this.getPrice()+milPrice;
	}
	
	//���췽��
	public ShareCar(){}
	//���췽�� ��ֵ
	public ShareCar(double price,int minute,int mileage){
		this.setMileage(mileage);
		this.setMinute(minute);
		this.setPrice(price);
	}
	
	
}
