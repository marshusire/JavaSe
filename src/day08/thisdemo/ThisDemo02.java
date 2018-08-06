package day08.thisdemo;

public class ThisDemo02 {
   //同一个类中，实例方法 直接互相调用的时候，可以省略this ,一般不要省略this
   public void methodA(){
	   System.out.println("讲真的 摩登兄弟");
	   this.methodB();//调用方法
   }
   public void methodB(){
	    System.out.println("王贰浪 往后余生");
	   this.methodC();//调用方法
   }
   public void methodC(){
	    System.out.println("张云雷 探水清河");
	   // methodA();
   }	
	
	public static void main(String[] args) {
		//1.初始化一个对象
		 ThisDemo02 demo=new ThisDemo02();
		//对用调用方法
		 demo.methodA();
		
		
	}
	
	
}
