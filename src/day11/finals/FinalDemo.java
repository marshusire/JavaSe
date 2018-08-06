package day11.finals;

/**
 *  final 是一个修饰符 可以修饰 类  变量  方法。
 * 
 *  final 如果和其他修饰符一起使用 可以没有先后顺序
 *  例如：
 *  public final  static
 *  final  public static 
 *  static final  public
 *  
 * 
 * 
 * @author Administrator
 *
 */

/**
 * 
 * final 修饰的类 叫做最终类  不能被继承
 * 
 * final 修饰符 不能修饰 抽象类 
 *       抽象类 必须被继承才能使用。
 * 
 * */
//用final修饰的类不能被继承
final class Demo{
		
}
//抽象类不能用final修饰
//final abstract class Demo01{
//	
//}

/**
 * 用final修饰的方法 ，叫做最终方法，只能使用, 不能重写
 * 
 * 如果是静态方法 ，父类用final修饰完毕后，子类不能在重新定义方法
 * 
 * final 不能修饰抽象方法，抽象方法必须要被重写。
 * 
 * 
 * */

abstract class Demo02{
  //定义	一个方法
   public final void methodA(){
	   System.out.println("努力努力");
   }
	
   //final 不能修饰抽象方法，抽象方法必须要被继承重写。
  // public final abstract methodc();
   
   public final static void methodB(){
	   
   }
}



public class FinalDemo extends Demo02{
	
	//如果父类的方法用final修饰了，子类不能重写final修饰的方法
	/*@Override  //重写方法
	public  void methodA() {
		super.methodA();
		//重新在定义方法
		System.out.println("好好学习");	
	}*/
	
	//可以使用父类final修饰的方法
//	   public static int  methodB(){
//		return 0;
//	   }

	
	/**
	 * final 修饰的字段 叫最终量，只能被赋一次值。不能在次改变
	 * final修饰的字段必须给赋上初始值
	 * */
	 //final修饰 基本数据类型
	 final static int age=0;
	 //final修饰引用数据类型 
	 final static int[]arr=new int[10];//0x1234
	 
	 //final修饰的变量 可以叫做常量 不可改变量 
	 //声明一个常量 用 public final static 修饰 ，变量名 全部用大写，多个单词之间要有个下划线进行连接
	 public final static int MAX_VALUE=123456;
	 
	 
	 //定义一个最终量
	 public static void main(String[] args) {
		//使用final修饰的变量
		 System.out.println(age);
		//final修饰的变量不能再次赋值
		   //age=1;
		   final int sex=111;
		   //sex=123;
		 
		  //更该arr引用还是内容
		   //arr=new int[9]; 引用数据类型不能更该引用的内存  0x3333
		   arr[0]=12;
		   arr[2]=999;  //引用数据类型的内容可以更该的，但是内存中的引用是不可以更该。
	 } 
	
}
