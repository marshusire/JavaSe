package day11.abstractdemo;

public class TestDemo {

	 public static double toArea(Shape p){
		 //���÷���
		 return  p.getArea();
	 }
	
	
	 public static void main(String[] args) {
		//1.��ʼ����������
		 Circle cir=new Circle(5);
		 Rectangle rect=new Rectangle(10, 20); 
		//2.����� 
		 System.out.println(toArea(cir));
		 System.out.println(toArea(rect));
		 
		// Shape shape=new Shape(); �����಻�ܱ�ʵ����
		 
		 
	 }
	
}
