package day12.test;

public class Student {
   //成员变量
	 //类成员
	 static int number=0;
	 //实例成员
	 String  name;
	 int age;
	
   //成员方法	
	  //实例成员方法
	   public void study(){
		   
	   }
	  //静态成员方法
	   public static void method(){
		   //访问外部成员  外部成员必须是静态
		   int a=0;   
	   }
	   
	   public static void main(String[] args) {
		 Student stu=new Student();
		 stu.name="赵佳琪";
		 stu.number+=1;
		 
		 Student stu1=new Student();
		 stu1.name="杨雪";
		 stu1.number+=1;
		 
		 Student stu2=new Student();
		 stu2.name="李强";
		 stu2.number+=1;
		   
		 stu1.equals(stu2);
		// stu1==stu2;//
		 
		 
	   }
	   
	
}
