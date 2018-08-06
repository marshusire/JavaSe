package day14.enums;

/**
 * 当前这个类 
 *   最多只允许有 7个对象
 *   每个对象代表一个值
 * */
class WeekDay01{
	//初始化7个对象 设置为当前类静态常量
	/**
   public static final int MON=1;   //周一
   public static final int TUES=2;  //周二
   public static final int WEDNES=3;//周三
   public static final int THURS=4; //周四
   public static final int FRI=5;   //周五
   public static final int SATUR=6; //周六
   public static final int SUN=7;   //周日
	 */
	public static final WeekDay01 MON=new WeekDay01();
	public static final WeekDay01 TUES=new WeekDay01();
	public static final WeekDay01 WEDNES=new WeekDay01();
	public static final WeekDay01 THURS=new WeekDay01();
	public static final WeekDay01 FRI=new WeekDay01();
	public static final WeekDay01 SATUR=new WeekDay01();
	public static final WeekDay01 SUN=new WeekDay01();
	
	//构造方法私有化 对象只能在本类中实例化
	  private WeekDay01(){
		  
	  }
	
	
}


public class Employee02 {
	//属性
	private WeekDay01 restDay;

	public WeekDay01 getRestDay() {
		return restDay;
	}

	public void setRestDay(WeekDay01 restDay) {
		this.restDay = restDay;
	}
	
	//判断是否是休息日
	public void dayOfRestDay(){
		if(this.restDay==WeekDay01.SUN){
			System.out.println("休息一天");
		}else{
			System.out.println("我要搬砖");
		}
	}
	
	public static void main(String[] args) {
		//1.初始化一个员工对象
		  Employee02 em=new Employee02();
		//2.设置日期  对象 代码可阅读性 和约束性
		// WeekDay01 WEEK=new WeekDay01();
		  em.setRestDay(WeekDay01.SATUR);
		 //3.判断日期
		  em.dayOfRestDay();
		
		
	}
	

}
