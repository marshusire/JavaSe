package day18.generics;


/**
 * ������
 * ���ඨ����﷨һ��
 * 
 * 
 * ���η� class ���� extends ����  implement �ӿ� <E,K,W>{
 *    //ʹ�÷���
 *    E ������;
 * 
 * 
 * }
 * 
 * 
 * @author Administrator
 *
 */


//����һ��������
public class Point<T> {	
   //����
	T x; //������һ�����ͳ�Ա
	T y; 
	
	public static void main(String[] args) {
	  /** //1.��ʼ��һ������ Point
		Point p=new Point();
		//����x y
	   	p.x=4;
		p.y=5;
	   //��ʼ��һ������
		Point p1=new Point();
		p1.x="2.1";
		p1.y="23.4";
		//ȥ�����ֵ
		int i=(int)p.x;
		double j=(double) p.y;
		System.out.println(i);
		*/
		//��ʼ��һ������  ָ�����͵���������(������������)
		 Point<String> p=new Point<String>();
		 p.x="mars";
		 p.y="ddd";
	   //ȡֵ
		 System.out.println(p.x);
		 System.out.println(p.y);
		 
		
		
		
		
		
	}
	
	
}
