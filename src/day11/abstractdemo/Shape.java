package day11.abstractdemo;

/**
 * 抽象类与一般类一样 可以拥有 构造方法,字段,方法都可以有
 * 抽象类不能被直接实例化，必须通过子类继承才能实例化
 * 如果一个类中包含抽象方法，那么这个类必须是一个抽象类
 * 抽象类 不能定义成最终类，不能使用final修饰符
 * 
 * */


public abstract class Shape {
	
   //公共的方法 定义成一个抽象方法
	/**
	 * 1.抽象方法 不能有方法体
	 * 2.抽象方法体必须在子类中实现（重写）,如果子类也是一个抽象类，那么子类可以不用实现
	 * 3.抽象方法不能使用 final private static 修饰符
	 * */
	public abstract double getArea();
	
}
