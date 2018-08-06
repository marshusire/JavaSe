package day10.test04;

public class Business {

	public static double  toPay(Share share){
		//计算他们的总价
		 return share.getCount();
	}
	
	public static void main(String[] args) {
		//初始化一个单车对象
		 ShareBike bike=new ShareBike(0.6,61);
		 System.out.println(toPay(bike));
		 
		//初始化一个汽车对象
		  ShareCar car=new ShareCar(10, 15, 10);
		  System.out.println(toPay(car));
		 
		
		
	}
	
}
