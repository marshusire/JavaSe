package day18.generics;

/**
 * �������
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
	 //1.��ʼ��һ������Gennerice
	   GenericeDemo<String, Integer> demo=new GenericeDemo<String, Integer>();
	 //2.�����Խ��и�ֵ
	   demo.key="����String";
	   demo.vlaue=23;
	 //3.���ʳ�Ա
	   System.out.println(demo.key);
	   System.out.println(demo.vlaue);
	   
	   
	   
	   
	   
   }	
	
}
