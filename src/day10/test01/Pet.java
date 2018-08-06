package day10.test01;

/**
 * 1.抽象与一般类一样 可以拥有属性  方法  构造方法
 * 2.抽象类不能直接实例化，只允许子类继承实例化
 * 3.抽象类可以定义抽象方法,如果一个类中有抽象方法，那么该类必须是抽象类
 * 抽象类在类定义的时候必须使用abstract 关键字
 * 
 * 
 * 
 * */



//宠物类 
public abstract class Pet {
	private int health;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
  

	/**
	 * 
	 *  当前方法没有被调用子类 都对他进行啦重写
	 *  可以使用抽象方法定义 重新定义方法
	 *  抽象方法特点
	 *     1.必须使用abstract进行修饰  
	 *     2.不能有方法体
	 *     3.子类必须重写该方法,如果子类是一个抽象类，可以不用重写
	 *     4.抽象方法 不能 final static private 进行修饰
	 *  
	 * */
	
	//公共的行为看病
	   public abstract void toHospital();
	
}
