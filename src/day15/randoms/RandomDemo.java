package day15.randoms;

import java.util.Random;

public class RandomDemo {
    /***
     * Random ����һ��α���������Ҫ���������� 
     *  ���ͣ�boolean true| false
     *       double   [0.0-1.0)
     *       float    [0.0 1.0)
     *       int     �����ķ�Χ     
     *       long    long���͵ķ�Χ
     * 
     * @param args
     */
	
	public static void main(String[] args) {
	   //1.��ʼ��һ�����������   
		// Random rand=new Random();//Ĭ�����Ե�ǰʱ����Ϊ����
		 Random rand=new Random(10);
	   //2.�����������  boolean
		 System.out.println(rand.nextBoolean());
		 System.out.println(rand.nextDouble());//double����
		 System.out.println(rand.nextFloat()); //float ����
		 System.out.println(rand.nextInt()); //����һ��int���͵������
		 System.out.println(rand.nextInt(10));//[0-10)
		 //���� [10-20)
		 // 10+rand.nextInt(10)
		 // double ��λ�ȡ������������� [10-20)
		  //(int)(rand.nextDouble()*10)+10
	    //	 Math.random();  ==rand.nextDouble();
		 

	}

}
