package day08.test1;

public class TestDemo {
	
	public static void main(String[] args) {
	  //1.����һ��Բ   �뾶 �����ĵ�  x y
		 Point center=new Point(0,0);
		 int r=5;//Բ�İ뾶
		//��ʼ��һ��Բ���� ͨ���뾶�����ĵ�
		 Circle circle=new Circle(center, r);
		//��ʼ��һ�������
		  Point p=new Point(3,6);
		//ִ���жϺ������Ĺ�ϵ
		 String msg=circle.relationshipFromPoint(p);
		 System.out.println(msg);
		
	 }

}
