package day14.enums;

public class Employee {
	// 属性    7 休息日
	private int restday; // 某一天休息

	public int getRestday() {
		return restday;
	}
    /**
     * 
     * @param restday
     *   整数类型   1-7
     *    1 星期一
     *    2 星期二
     *    3 星期三
     *    4 星期四
     *    5 星期五
     *    6 星期六
     *    7 星期日
     */
	public void setRestday(int restday) {
		this.restday = restday;
	}

	//判断某一天是否是休息日
	public void dayOfRestDay(){
		switch(this.restday){
		  case 1:
		  case 2:
		  case 3:
		  case 4:
		  case 5:
		  case 6:
			System.out.println("你要搬砖");
		  break;
		  case 7:
			System.out.println("好好休息下");
		  break;
		  default:
			 System.out.println("请输入1-7");
		}
	}
	
	//入口方法
	public static void main(String[] args) {
		//1.初始化一个员工对象
		  Employee em=new Employee();
		//2.设置上班的日期
		  em.setRestday(1);
		//3.判断s
		  em.dayOfRestDay();
	}
	
	
}
