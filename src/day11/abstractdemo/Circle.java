package day11.abstractdemo;

public class Circle extends Shape{
   //����
	private int r;//�뾶
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	//����� ���Ǹ���ķ���
	 @Override
     public double getArea() {
			// pi*r*r;
	    return Math.PI*Math.pow(this.r,2);
	 }
	
	 public Circle(int r){
		 this.r=r;
	 }	
}
