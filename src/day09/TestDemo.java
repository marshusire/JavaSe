package day09;
//测试类
public class TestDemo {

	public static void main(String[] args) {
	   //入口方法
		//1.初始化一个Student对象  给对象进行赋值
		 /*   Student stu=new Student();
		    //给sid进行赋值
		    stu.sid="3456789";
		    //给name进行赋值
		    stu.name="mars";
		    stu.age=12;
		    //调用sleep
		    stu.sleep();
		    System.out.println(stu.sid);//学员id
		 
		 //2.初始化一个Teacher对象 给对象属性赋值
		     Teacher th=new Teacher();
		     //给属性赋值
		     th.name="李四";
		     th.age=12;
		     //th.sex='';//父类的私有成员是不能被继承的
		     th.level=3;
		     //调用方法
		     th.sleep();
		     stu.sleep();
		     */
		 //3.初始化一个员工对象 
		     Employee em=new Employee();
		     //属性赋值
		     em.name="夏雨";
		     em.age=13;
		     em.hireDate="20170809";
		     //调用方法
		     em.sleep();
		     
		     //员工类调用methodA
		     em.methodA();
		     
		     
	}
}
