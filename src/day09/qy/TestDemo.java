package day09.qy;

public class TestDemo {

	public static void main(String[] args) {
		//1.初始化一个worker对象
		   Worker worker=new Worker();
		//2.设置子类的属性
		   //worker.name="";//使用的是默认权限修饰符
		   //worker.tel; tel是protected修饰，在子类中使用
		/**   
         pirvate  本类
         default  同包
         protected 同包 不同包的子类
         public   所有
         **/
	}

}
