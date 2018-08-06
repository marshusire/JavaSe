package day11.block;

public class BlockDemo {
	/**
	 * 代码块 按照分类 可以划分为4大类
	 *    1.局部代码块
	 *    2.初始化代码块
	 *    3.构造代码块
	 *    4.静态代码块
	 * */
	 //局部代码块 
	 public void methodA(){
		 System.out.println("方法每调用一次会执行一次");
	 }
	 public static void methodB(){
		 System.out.println("方法每调用一次会执行一次");
		 
	 }
	 //初始化代码块
	 {
		System.out.println("初始化代码块优先于构造代码块,每创建一个对象的时候，会执行一次"); 	 
	 }
	 //构造代码块
	 public BlockDemo(){
		 System.out.println("构造代码块 每创建一个对象都是执行一次");
	 }
	 //静态代码块 当类加载到JVM中时， 会自动执行一次该代码块 只会执行一次 
	 static{
		System.out.println("静态代码块执行 "); 
	 }
	
	 public static void main(String[] args) {
		//1.初始化一个BlockDemo的对象
		 BlockDemo demo=new BlockDemo();
		 demo.methodA();
		 
		 BlockDemo  demo1=new BlockDemo();
		 
	
		 
	}
	

}
