package day10.test04;

public class Business {

	public static double  toPay(Share share){
		//�������ǵ��ܼ�
		 return share.getCount();
	}
	
	public static void main(String[] args) {
		//��ʼ��һ����������
		 ShareBike bike=new ShareBike(0.6,61);
		 System.out.println(toPay(bike));
		 
		//��ʼ��һ����������
		  ShareCar car=new ShareCar(10, 15, 10);
		  System.out.println(toPay(car));
		 
		
		
	}
	
}
