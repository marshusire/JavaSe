package day15.randoms;

import java.util.Random;

public class RandomDemo {
    /***
     * Random 生成一个伪随机数，主要依靠于种子 
     *  类型：boolean true| false
     *       double   [0.0-1.0)
     *       float    [0.0 1.0)
     *       int     整数的范围     
     *       long    long类型的范围
     * 
     * @param args
     */
	
	public static void main(String[] args) {
	   //1.初始化一个随机数对象   
		// Random rand=new Random();//默认是以当前时间作为种子
		 Random rand=new Random(10);
	   //2.生成随机数据  boolean
		 System.out.println(rand.nextBoolean());
		 System.out.println(rand.nextDouble());//double类型
		 System.out.println(rand.nextFloat()); //float 类型
		 System.out.println(rand.nextInt()); //生成一个int类型的随机数
		 System.out.println(rand.nextInt(10));//[0-10)
		 //生成 [10-20)
		 // 10+rand.nextInt(10)
		 // double 如何获取区间的数字生成 [10-20)
		  //(int)(rand.nextDouble()*10)+10
	    //	 Math.random();  ==rand.nextDouble();
		 

	}

}
