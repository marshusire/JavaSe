package day13.interface03;

/**
 * Demo ͬʱʵ�������ӿ�
 * 
 * */
//��ǰ��ʵ���������ӿ�
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

//Demo01ʵ�� FourInterface

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
 * ������ʵ��һ���ӿں󣬿��Բ��Խӿ��еķ���������д���������п��԰������󷽷�
 * 
 * ���һ���� �̳������������,��ô����Խӿ��еķ���������д
 *  
 * */

abstract class Demo02 implements FourInterface{

} 





