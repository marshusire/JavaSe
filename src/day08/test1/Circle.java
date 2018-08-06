package day08.test1;

//����һ���� �������
class Point {
	// ����
	private int x;// x��
	private int y;// y��

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

	// ���췽��
	public Point() {
	}

	public Point(int x, int y) {// ��x���y�ḳֵ
		this.x = x;
		this.y = y;
	}
}

public class Circle {
	// ����
	private int r;// �뾶
	private Point center;//���ĵ�

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
	//���췽��
	public Circle(){	
	}
	
	public Circle(Point center,int r){
		//�����Խ��и�ֵ
		this.center=center;
		this.r=r;
	}
	// ����
	// ��һ������Բ�Ĺ�ϵ
	public String relationshipFromPoint(Point p){
		//(x-x`)^2+(y-y`)^2 �� r^2���бȽ�
		int x=this.center.getX()-p.getX();//x-x`
		int y=this.center.getY()-p.getY();//y-y`
		int tmp=x*x+y*y;//(x-x`)^2+(y-y`)^2
		//�жϹ�ϵ
		if(tmp>r*r){
		  return "��Բ������";
		}else if(tmp<r*r){
		  return "��Բ���ڲ�";
		}
		  return "��Բ��";
	}
	

}
