package day12.test;

public class Student {
   //��Ա����
	 //���Ա
	 static int number=0;
	 //ʵ����Ա
	 String  name;
	 int age;
	
   //��Ա����	
	  //ʵ����Ա����
	   public void study(){
		   
	   }
	  //��̬��Ա����
	   public static void method(){
		   //�����ⲿ��Ա  �ⲿ��Ա�����Ǿ�̬
		   int a=0;   
	   }
	   
	   public static void main(String[] args) {
		 Student stu=new Student();
		 stu.name="�Լ���";
		 stu.number+=1;
		 
		 Student stu1=new Student();
		 stu1.name="��ѩ";
		 stu1.number+=1;
		 
		 Student stu2=new Student();
		 stu2.name="��ǿ";
		 stu2.number+=1;
		   
		 stu1.equals(stu2);
		// stu1==stu2;//
		 
		 
	   }
	   
	
}
