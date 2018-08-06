package day10.test04;

public class ShareBike extends Share{

	@Override
	public double getCount() {
	   //自行车总价格计算
		 //先算时间  不满一个小数安装一个小时计算
		 int hour=this.getMinute()%60==0?this.getMinute()/60:this.getMinute()/60+1;
	     //计算总价
		  return this.getPrice()*hour;
	}
	
	//构造方法
	 public ShareBike(){
		 
	 }
	 //带参数的构造方法
	 public ShareBike(double price,int minute){
		 this.setPrice(price);
		 this.setMinute(minute);
	 }
	
	
	
}
