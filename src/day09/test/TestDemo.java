package day09.test;

public class TestDemo {

	public static void main(String[] args) {
	     //1.初始化一个Cat 对象
		   Cat cat=new Cat("Tom",1);
		   //设置sex
		   cat.setSex("男");
		  //获取 name 和 age的属性
		   System.out.println(cat.getName());//子类没有 找父类
		   System.out.println(cat.getAge()); //子类没有 找父类
		   System.out.println(cat.getSex());//子类
		  //调用公共的行为
		   cat.doEat();
		   cat.upATree();
		   
		  //2.初始化一个dog对象
		   Dog dog=new Dog("Lucy",8);
		   //dog特有的属性
		   dog.setWeight(12);
		   //获取dog 和 age 的属性
		   System.out.println(dog.getName());
		   System.out.println(dog.getAge());
		   System.out.println(dog.getWeight());
		   //执行公共行为
		   dog.doEat();
		   dog.swiming();

	}

}
