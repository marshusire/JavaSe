package day08.test1;

public class TestDemo {
	
	public static void main(String[] args) {
	  //1.构建一个圆   半径 和中心点  x y
		 Point center=new Point(0,0);
		 int r=5;//圆的半径
		//初始化一个圆对象 通过半径和中心点
		 Circle circle=new Circle(center, r);
		//初始化一个点对象
		  Point p=new Point(3,6);
		//执行判断和这个点的关系
		 String msg=circle.relationshipFromPoint(p);
		 System.out.println(msg);
		
	 }

}
