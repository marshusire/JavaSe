package day11.box;

public class BoxDemo {	
  /**
   *  包装类：主要作用 将基本数据类型 转换成引用数据类型。
   *  每个基本数据类型 对应 一个包装类类型
   *  基本数据类型                    包装类类型
   *    byte  			   Byte
   *    short              Short
   *    int                Integer
   *    long               Long
   *    float              Float
   *    double             Double
   *    char               Character
   *    boolean            Boolean
   * */
	
	public static void main(String[] args) {
		//1.初始化一个数组 该数组只能存放引用数类型  object类型
		   Object[]arr=new Object[10];
		   arr[1]="";
		   arr[0]=1;
		//装箱 把基本数据类型 转换成对应的包装类类型  
		   //1.手动装箱 方式有两种
		      //通过构造方法
		        Integer i=new Integer(12);//将一个整形转换Integer对象
		      //通过静态方法  
		        Integer i1=Integer.valueOf(11);//通过静态方法
		        
		      //可以将String类型转换成Integer对象
		        Integer i2=new Integer("223");
		      //通过静态方法
		         Integer i3=Integer.valueOf("333");
		        
		//拆箱    把包装类型转换成基本数据类型
	          //手动进行拆箱
		         int j=i.intValue();
		         System.out.println(j);
		       //将String类型转换成int类型
	   	        int j1=Integer.parseInt("456");
		        System.out.println(j1);
		            
		
		     //自动进行装箱
		        Object []obj={12,4,4,5};
		        Integer a=10;//编译器进行了自动装箱
		        System.out.println(a);
		        //自动拆箱
		        int b=a;//将引用类型 赋值给int类型 自动拆箱
		        System.out.println(b);
		      
		      //十进制转换成其他进制
		        //转换成二进制
		         System.out.println( Integer.toBinaryString(4));
		        
		        //转换成16进制
		         System.out.println(Integer.toHexString(17));
		        
		        //转换成8进制
		         System.out.println(Integer.toOctalString(10));
		
	}
	
	
	
	
	
}
