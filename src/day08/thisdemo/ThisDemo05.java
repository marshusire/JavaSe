package day08.thisdemo;

public class ThisDemo05 {
 /**
  * 构造方法之间互调时候 可以使用
  * this([参数])
  * this 必须在构造方法第一行
  * 
  * 构造方法 只有在初始化对象的时候 才会被调用一次。
  * 构造方法重载，构造方法也是每次只能显示直接调用一个
  * 
  * */
	//构造方法重载
	 public ThisDemo05(){
		 this("dd",33);
		 System.out.println("默认构造方法");
	 }
	 
	 public ThisDemo05(String name){
	    // this();//调用默认
        System.out.println("1个参数的构造方法");
	 }	
	 
	 public ThisDemo05(String name,int age){
		//构造方法调用时 this() 而且必须在构造方法第一行 
		this(name);//一个参数
		System.out.println("两个参数构造方法");
	 }
	 
	 public static void main(String[] args) {
	    //1.初始化一个对象
		  //ThisDemo05 demo=new ThisDemo05();//会调用默认构造方法
	      //  ThisDemo05 demo=new ThisDemo05("mars"); 调用一个参数的构造方法
	       ThisDemo05 demo=new ThisDemo05("mars",28);
	 }
	 
	 
}
