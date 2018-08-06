package day08.thisdemo;

public class ThisDemo01 {
	// this 关键字可以解决 成员变量和局部变量(形参)二义性
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		//局部变量和成员变量的二义性
		this.name = name;
	}

	public static void main(String[] args) {
        //初始化一个对象
		 ThisDemo01 demo=new ThisDemo01();
		//给属性赋值
		  demo.setName("mars");
		//获取属性的值
		  System.out.println(demo.getName());
		 
		 
		
		
	}

}
