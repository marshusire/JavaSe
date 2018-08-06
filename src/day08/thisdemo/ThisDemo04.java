package day08.thisdemo;

class Operation{
//接收一个对象 将对象的name的值赋值 "哆啦A梦";	
   public static void  setVales(ThisDemo04 demo){
	    demo.setName("哆啦A梦");//给属性进行赋值
   }	
}



public class ThisDemo04 {
   //属性
	private String name;//姓名
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
   //自定义一个方法
	public void methodA(){
		//获取到this 将this 作为参数 传递给另一个方法
		Operation.setVales(this);	
	}

	public static void main(String[] args) {
		//1.初始化一个对象
		   ThisDemo04 demo=new ThisDemo04();
		//2.调用methodA
		    demo.methodA();
		//3.取值
		    System.out.println(demo.getName());
		    

	}

}
