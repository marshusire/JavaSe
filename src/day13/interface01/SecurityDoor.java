package day13.interface01;

/**
 * 防盗门 
 *  具有门的特点
 *  锁的功能
 * 
 * */

/**
 *   实现类:实现某个接口的类
 *   如果类要实现某一个接口语法
 *   修饰符 class 类名  extends 父类  implements 接口1,接口2,...{
 *     //必须重写接口中所有方法
 *   }
 *   
 * 
 * 
 * */

//盼盼安全
public class SecurityDoor extends Door implements FirstInterface,SecondInterface,ThirdMyInterFace{
	@Override
	public void lock() {
       System.out.println("通过钥匙进行上锁");	
	}

	@Override
	public void unlock() {
		System.out.println("通过钥匙进行解锁");
	}

	@Override
	public void fireProof() {
		System.out.println("喷水 防烟雾");
	}
	
	@Override
	public void guardWang() {
        System.out.println("消息推送 房门打不开 录像  给老王媳妇打电话");	
	}
	
}
