package day11.abstractdemo;

public class Rectangle extends Shape{
    //����
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
    
	//��д����ķ���
	 @Override
	public double getArea() {
		//width *height �����
		return this.width*this.height;
	}
	 
	public Rectangle(int width,int height){
		this.width=width;
		this.height=height;
	} 
	 
	
}
