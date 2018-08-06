package day08;
//在同包中使用类 ，不需要import
public class TestDemo {

	public static void main(String[] args) {
	  //测试在默认权限修饰符
		 //1.初始化一个SecondDemo对象
		     SecondDemo demo=new SecondDemo();
		 //2.设置属性
		    //demo.name="";//私有的
		     demo.like="吃";
		 //3.调用方法
		     demo.toEat();
		     
		 //4.初始化一个用默认权限修饰的类
		     SecondDemo01 demo01=new SecondDemo01();
		     System.out.println(demo01.toString());
		    

	}

}
