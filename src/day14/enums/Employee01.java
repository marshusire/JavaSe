package day14.enums;

class WeekDay{
   /*
    * 星期一：Monday 星期二:Tuesday星期三：
    *  Wednesday星期四：Thursday星期五：Friday
    *  星期六：Saturda
    *  星期日：
    *  Sunday
    * */
  //该类是一个常量类
   public static final int MON=1;   //周一
   public static final int TUES=2;  //周二
   public static final int WEDNES=3;//周三
   public static final int THURS=4; //周四
   public static final int FRI=5;   //周五
   public static final int SATUR=6; //周六
   public static final int SUN=7;   //周日
	
	
}


public class Employee01 {
   //属性
	private int restDay;//休息日

	public int getRestDay() {
		return restDay;
	}

	public void setRestDay(int restDay) {
		this.restDay = restDay;
	}
	
   //设置方法
	public void dayOfRestDay(){
		switch (this.restDay) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		   System.out.println("我要搬砖");	
		 break;
		case 7:
		   System.out.println("休息一天");
		 break;
		default:
		   System.out.println("请输入正确日期 1-7");
		 break;
		}
	}
	
	 public static void main(String[] args) {
		//1.初始化一个对象
		 Employee01 em=new Employee01();
		//2.给属性进行赋值 1-7，提高代码可阅读性。
		 em.setRestDay(WeekDay.MON);
		//3.判断日期是否是可以休息日
		 em.dayOfRestDay();
		 
	 }
	
	
	
}
