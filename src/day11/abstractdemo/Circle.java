package day11.abstractdemo;

public class Circle extends Shape{
   //属性
	private int r;//半径
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	//求面积 覆盖父类的方法
	 @Override
     public double getArea() {
			// pi*r*r;
	    return Math.PI*Math.pow(this.r,2);
	 }
	
	 public Circle(int r){
		 this.r=r;
	 }	
}
