package day13.interface03;

/**
 * 语法：接口继承语法
 *   修饰符 Interface 接口 extends 接口1,接口2...{
 *   
 *   }
 *   
 *  特性：
 *     1.接口可以继承接口
 *     2.接口可以多继承，继承只能继承接口中的抽象方法
 *     3.接口只能继承接口,不能继承类
 *     
 * @author Administrator
 *
 */
interface  SecondInterface{
	public void methodC();
}

interface ThirdInterface{
	public void methodB();
}
//接口继承
interface FourInterface extends SecondInterface,ThirdInterface{
   
}

public interface FirstInterface {
	//定义一个方法
	public void methodA();
}
