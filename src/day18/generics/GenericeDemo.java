package day18.generics;

/**
 * 多个泛型
 * 
 * @author Administrator
 *
 *
 *
 */

public class GenericeDemo<T,E> {
   T key;
   E vlaue;
   
 
   public static void main(String[] args) {
	 //1.初始化一个对象Gennerice
	   GenericeDemo<String, Integer> demo=new GenericeDemo<String, Integer>();
	 //2.给属性进行赋值
	   demo.key="我是String";
	   demo.vlaue=23;
	 //3.访问成员
	   System.out.println(demo.key);
	   System.out.println(demo.vlaue);
	   
	   
	   
	   
	   
   }	
	
}
