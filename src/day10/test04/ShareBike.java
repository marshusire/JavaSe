package day10.test04;

public class ShareBike extends Share{

	@Override
	public double getCount() {
	   //���г��ܼ۸����
		 //����ʱ��  ����һ��С����װһ��Сʱ����
		 int hour=this.getMinute()%60==0?this.getMinute()/60:this.getMinute()/60+1;
	     //�����ܼ�
		  return this.getPrice()*hour;
	}
	
	//���췽��
	 public ShareBike(){
		 
	 }
	 //�������Ĺ��췽��
	 public ShareBike(double price,int minute){
		 this.setPrice(price);
		 this.setMinute(minute);
	 }
	
	
	
}
