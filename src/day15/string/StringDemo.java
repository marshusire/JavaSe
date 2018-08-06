package day15.string;

public class StringDemo {

	public static void main(String[] args) {
	   //1.创建字符串两种方式
		 String str="ABCD"; //字面量
	    //2通过构造方法创建一个对象  //堆中分配的内存
		 String str1=new String("ABCD");
		//3.
		 String str2="ABC";
		//4.合并字符串 堆中分配内存
		 String str3=str2+"D";  //新的对象 只存在堆中
		//5.合并字符串
		 String str4="AB"+"CD";
		 
		//String 主要分配内存的地方在两个  1.堆区  2常量池
		 //常量池  存储的是常量 虚拟在编译的都已经将这些数据存储在常量池中
		 //堆区：new Sting的引用  拼接的新的字符
		 
		 //字符串进行比较的时候 == 比较的是引用地址 恒等
		 if(str4==str){
			 System.out.println("相等");
		 }else{
			 System.out.println("不相等");
		 }
		 //equals 比较比较的是字面是否相等 不必内存 
		 if(str.equals(str3)){
			 System.out.println("字面相等");
		 }
		 
		 //判断一个字符是否等于常量，一定要用常量和变量进行比较
		 String str5=null;
		 if("123".equals(str5))
		//判断地址是否为空
		 if(str5==null)
			 System.out.println("判断地址引用 是否为空");
        //判断内容是否为空
		 if("".equals(str5)){
			 System.out.println("判断内容是否为空");
		 }
		  System.out.println(str);

	}

}
