package day15.randoms;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomDemo {

	public static void main(String[] args) {
		//ThreadLocalRandom 支持多线程
		  //如何获取random  通过当前线程获取一个random对象
   		   ThreadLocalRandom rand=ThreadLocalRandom.current();
          //可以调用random的方法
   		   System.out.println(rand.nextDouble(10.0,20.0));//生成一个[10.0,20.0);
   		   System.out.println(rand.nextInt(10,20));
   		 
	}

}
