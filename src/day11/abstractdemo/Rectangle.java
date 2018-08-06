package day11.abstractdemo;

public class Rectangle extends Shape{
    //属性
	private int width;
	private int height;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
    
	//重写父类的方法
	 @Override
	public double getArea() {
		//width *height 求面积
		return this.width*this.height;
	}
	 
	public Rectangle(int width,int height){
		this.width=width;
		this.height=height;
	} 
	 
	
}
