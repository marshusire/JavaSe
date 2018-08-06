package day10.test03;

public class TestDemo {

	//方法 将父类做为返回值返回
	 public static Goods getType(int type){
		 if(type==1){
		    //1.初始化一个Foods对象
			 Foods food=new Foods();
			 //设置属性的值
			 food.setPrice(100);
			//将对象返回
			 return food; 
		 }
		 
		 //创建一个TVs对象
		 TVs tv=new TVs();
		 //设置属性值
		 tv.setPrice(2000);
		 //将对象返回
		 return tv;
	 }
	
	
	
	public static void main(String[] args) {
		//调用方法 传入指定的类型
		 getType(1).printPirce();
         getType(2).printPirce();
	}

}
