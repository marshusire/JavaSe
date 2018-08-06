package day09.test02;

import java.sql.Array;

public class Student {

	//属性 
      String name;//
      int   age;
	
	
	  //重写toString
       @Override
       public String toString() {
    	return name+"  "+age;
      }
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		//1.创建一个student对象
		   Student stu=new Student();
		   Student stu1=new Student();
		   System.out.println(stu+"    "+stu1);
		//子类继承父类所有方法
		 //  Object stu2=stu.clone();
		  // System.out.println(stu+"  "+stu2);
		   
		   //判断两个对象是否相等   恒等== 内存引用是否相等
		   if(stu.equals(stu1)){
			   System.out.println("相等");
		   }else{
			   System.out.println("不相等");
		   }
		   String str=new String("123");
		   String str1=new String("123");
		   if(str1.equals(str)){
			  System.out.println("内容相等");
		   }
		   stu.name="mars";
		   stu.age=11;
		   String msg=stu.toString();
		   System.out.println(msg);
		   
		   if(stu instanceof Array){
			   System.out.println("是");
		   }
		
		
	}
}
