package day15.randoms;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomDemo {

	public static void main(String[] args) {
		//ThreadLocalRandom ֧�ֶ��߳�
		  //��λ�ȡrandom  ͨ����ǰ�̻߳�ȡһ��random����
   		   ThreadLocalRandom rand=ThreadLocalRandom.current();
          //���Ե���random�ķ���
   		   System.out.println(rand.nextDouble(10.0,20.0));//����һ��[10.0,20.0);
   		   System.out.println(rand.nextInt(10,20));
   		 
	}

}
