package day11.abstractdemo;

public class TestDemo {

	 public static double toArea(Shape p){
		 //调用方法
		 return  p.getArea();
	 }
	
	
	 public static void main(String[] args) {
		//1.初始化两个对象
		 Circle cir=new Circle(5);
		 Rectangle rect=new Rectangle(10, 20); 
		//2.求面积 
		 System.out.println(toArea(cir));
		 System.out.println(toArea(rect));
		 
		// Shape shape=new Shape(); 抽象类不能被实例化
		 
		 
	 }
	
}
