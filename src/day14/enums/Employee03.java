package day14.enums;

/**
public static final int MON=1;   //周一
public static final int TUES=2;  //周二
public static final int WEDNES=3;//周三
public static final int THURS=4; //周四
public static final int FRI=5;   //周五
public static final int SATUR=6; //周六
public static final int SUN=7;   //周日
	 */
/**
 * 定义一个枚举类
 * 
 * @author Administrator
 */
enum Weekday02 {

	/***
	 * 默认继承 java.lang.enum 这个类
	 *
	 * 使用过程中 只用声明常量 多个常量之间用逗号隔开 常量必须放在第一行
	 * 
	 * 常量都是引用数据类型  都是当前枚举的对象
	 */
	MON, TUES, WEDNES, THURS, FRI, SATUR, SUN;

	int age;

	public void methodA() {
		System.out.println("还要搬砖");
	}

	// 可以有构造方法 ，但是构造方法必须是私有的成员
	private Weekday02() {

	}

	private Weekday02(String name) {

	}
	// public static final WeekDay02 MON=new WeekDay02(); 等价MON
	// 将构造方法也是进行私有化
	// 枚举类内部 ，可以声明 字段 方法 构造方法 内部类 必须放在常量之后
}

public class Employee03 {
	// 属性
	private Weekday02 restDay;

	public Weekday02 getRestDay() {
		return restDay;
	}

	public void setRestDay(Weekday02 restDay) {
		this.restDay = restDay;
	}
   //判断是否是休息日
	public void dayOfRestDay(){
	  switch (this.restDay) {
		case MON://周一
		case TUES:
		case WEDNES:
		case THURS:
		case FRI:
		case SATUR:
		   System.out.println("搬砖日");
		   break;
		case SUN:
		   System.out.println("休息日");
		}
		
	}
	
	public static void main(String[] args) {
		//1.初始化一个对象
		 Employee03 em=new Employee03();
		//2.设置属性的值 枚举
		 em.setRestDay(Weekday02.SUN);
		//3.判断是否休息
		 em.dayOfRestDay();
		
  	 //获取枚举对象的名称
		 String name=Weekday02.SUN.name();
		 System.out.println(name);
		 //获取枚举类型的名称
		 name=Weekday02.FRI.toString();
		 System.out.println(name);
		 
	 //获取枚举对象 常量 的序列号从0开始
		 int index=Weekday02.SUN.ordinal();
		 System.out.println(index);
		 
		 //获取所有枚举常量 返回一个数组
		 Weekday02[]arr=Weekday02.values();
		 for (Weekday02 weekday02 : arr) {
			System.out.println(weekday02);
		 }
		 //将String类型转换成枚举常量    要求String名称 必须和枚举类型常量名称一致
		  Weekday02 day=Weekday02.valueOf("SUN");
		  System.out.println(day);
		  System.out.println(day.ordinal());
	}
	
	
	

}
