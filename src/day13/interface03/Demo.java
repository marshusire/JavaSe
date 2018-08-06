package day13.interface03;

/**
 * Demo 同时实现三个接口
 * 
 * */
//当前类实现了三个接口
public class Demo implements FirstInterface,SecondInterface,ThirdInterface{
    @Override
    public void methodA() {
    	// TODO Auto-generated method stub
    	
    }
    @Override
    public void methodB() {
    	// TODO Auto-generated method stub
    	
    }
	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		
	}
}

//Demo01实现 FourInterface

class Demo01 implements FourInterface{
	
	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		
	}
}

/**
 * 
 * 抽象类实现一个接口后，可以不对接口中的方法进行重写。抽象类中可以包含抽象方法
 * 
 * 如果一个类 继承了这个抽象类,那么必须对接口中的方法进行重写
 *  
 * */

abstract class Demo02 implements FourInterface{

} 





