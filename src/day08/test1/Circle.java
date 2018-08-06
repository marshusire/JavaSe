package day08.test1;

//定义一个类 点这个类
class Point {
	// 属性
	private int x;// x轴
	private int y;// y轴

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 构造方法
	public Point() {
	}

	public Point(int x, int y) {// 给x轴和y轴赋值
		this.x = x;
		this.y = y;
	}
}

public class Circle {
	// 属性
	private int r;// 半径
	private Point center;//中心点

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	//构造方法
	public Circle(){	
	}
	
	public Circle(Point center,int r){
		//给属性进行赋值
		this.center=center;
		this.r=r;
	}
	// 方法
	// 求一个点与圆的关系
	public String relationshipFromPoint(Point p){
		//(x-x`)^2+(y-y`)^2 和 r^2进行比较
		int x=this.center.getX()-p.getX();//x-x`
		int y=this.center.getY()-p.getY();//y-y`
		int tmp=x*x+y*y;//(x-x`)^2+(y-y`)^2
		//判断关系
		if(tmp>r*r){
		  return "在圆的外面";
		}else if(tmp<r*r){
		  return "在圆的内部";
		}
		  return "在圆上";
	}
	

}
